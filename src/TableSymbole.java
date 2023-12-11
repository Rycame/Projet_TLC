import org.antlr.runtime.tree.CommonTree;

import java.util.ArrayList;
import java.util.List;

public class TableSymbole {
    private List<Fonction> fonctions;


    public TableSymbole() {
        fonctions = new ArrayList<>();
    }

    public TableSymbole(CommonTree ast) throws Exception {
        this.fonctions = new ArrayList<>();

        if (ast != null) {
            this.parcoursFonctions(ast);
        }
    }

    public List<Fonction> get() {
        return fonctions;
    }

    public void addFonction(Fonction fonction) {
        fonctions.add(fonction);
    }

    public Fonction getFonction(String nom) {
        for (Fonction entry : fonctions) {
            if (entry.getNom().equals(nom)) {
                return entry;
            }
        }
        return null;
    }

    // Récupérer la valeur associée à un symbole
    public CommonTree obtenirArbreFonction(String nom) {
        for (Fonction entry : fonctions) {
            if (entry.getNom().equals(nom)) {
                return entry.getArbre();
            }
        }
        return null;
    }

    public CommonTree obtenirArbreSymbole(String nom) {
        for (Fonction entry : fonctions) {
            List<Symbole> parametre = entry.getParametres();
            for (Symbole param : parametre) {
                if (param.getNom().equals(nom)) {
                    return param.getArbre();
                }
            }
            List<Symbole> variable = entry.getVariables();
            for (Symbole var : variable) {
                if (var.getNom().equals(nom)) {
                    return var.getArbre();
                }
            }
        }
        return null;
    }

    public boolean existeFonction(String nom) {
        for (Fonction entry : fonctions) {
            if (entry.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    // Vérifier si un symbole existe dans la table
    public boolean existeSymbole(String nom) {
        for (Fonction fonction : fonctions) {
            List<Symbole> parametres = fonction.getParametres();
            for (Symbole parametre : parametres) {
                if (parametre.getNom().equals(nom)) {
                    return true;
                }
            }
            List<Symbole> variables = fonction.getVariables();
            for (Symbole variable : variables) {
                if (variable.getNom().equals(nom)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Afficher tous les symboles de la table
    public void afficherTable() {
        System.out.println("Table des Symboles:");
        for (Fonction entry : fonctions) {
            System.out.println("++++++++++");
            System.out.println("Fonction:");
            System.out.println(" Nom: " + entry.getNom());
            System.out.print(" Paramètres: ");
            List<Symbole> parametres = entry.getParametres();
            for (Symbole parametre : parametres) {
                System.out.print(parametre.getNom() + ", ");
            }
            System.out.print("\n Variables: ");
            List<Symbole> variables = entry.getVariables();
            for (Symbole variable : variables) {
                System.out.print(variable.getNom() + ", ");
            }
            System.out.print("\n Outputs: ");
            List<Symbole> outputs = entry.getOutputs();
            for (Symbole output : outputs) {
                System.out.print(output.getNom() + ", ");
            }
            System.out.println("\n++++++++++");
        }
    }


    /*
    Il faut créer une table des symboles vide.
    On parcourt l'AST.
    On cherche les définitions de fonctions.
        À chaque fonction, on l'ajoute à la table des symboles. (TableSymbole.addFonction(fonction))
            On parcourt l'AST de la fonction.
                À chaque paramètre, on l'ajoute à la liste des paramètres de la fonction (Fonction.addParametre(parametre))
                À chaque variable, on l'ajoute à la liste des variables de la fonction (Fonction.addVariable(variable))
 */

    /*
        Parcours l'AST complet, identifie uniquement les fonctions
        et les ajoute à la table des symboles.
     */
    private void parcoursFonctions(CommonTree ast) throws Exception {
        if (ast != null) {
            for (int i = 0; i < ast.getChildCount(); i++) {
                CommonTree child = (CommonTree) ast.getChild(i);
                if (child.getType() == WhileParser.FUNCTION) {
                    Fonction fonction = new Fonction(getNomFromFonctionArbre(child), child);
                    this.addFonction(fonction);

                    parcoursParametres(child, fonction);
                    parcoursVariables(child, fonction);
                    parcoursOutputs(child, fonction);
                }
            }
        }
    }

    /*
        Parcours l'AST d'une fonction, identifie uniquement les paramètres
        et les ajoute à la fonction.
     */
    private void parcoursParametres(CommonTree ast, Fonction fonction) throws Exception {
        if (ast != null) {
            for (int i = 0; i < ast.getChildCount(); i++) {
                CommonTree child = (CommonTree) ast.getChild(i);
                if (child.getType() == WhileParser.INPUTS) {
                    for (int j = 0; j < child.getChildCount(); j++) {
                        Symbole symbole = new Symbole(child.getChild(j).getText(), null);
                        if (!fonction.existsParametre(symbole.getNom())) {
                            fonction.addParametre(symbole);
                        } else {
                            throw new Exception("Fonction " + fonction.getNom() + ": Deux paramètres ont le même nom.");
                        }
                    }
                }
            }
        }
    }

    /*
        Parcours l'AST d'une fonction, identifie les variables contenus
        dans le bloc commandes et les variables de sorties et les ajoute à la fonction.
     */
    private void parcoursVariables(CommonTree ast, Fonction fonction) {
        if (ast != null) {
            for (int i = 0; i < ast.getChildCount(); i++) {
                CommonTree child = (CommonTree) ast.getChild(i);
                if (child.getType() == WhileParser.COMMANDS) {
                    List<String> variables = this.getVarsFromArbre(child);
                    for (String variable : variables) {
                        Symbole symbole = new Symbole(variable, null);
                        if (!fonction.existsParametre(symbole.getNom()) && !fonction.existsVariable(symbole.getNom())) {
                            fonction.addVariable(symbole);
                        }
                    }
                }
            }
        }
    }

    /*
       Parcours l'AST d'une fonction, identifie les variables de sorties et les ajoute à la fonction.
    */
    private void parcoursOutputs(CommonTree ast, Fonction fonction) {
        if (ast != null) {
            for (int i = 0; i < ast.getChildCount(); i++) {
                CommonTree child = (CommonTree) ast.getChild(i);
                if (child.getType() == WhileParser.OUTPUTS) {
                    for (int j = 0; j < child.getChildCount(); j++) {
                        Symbole symbole = new Symbole(child.getChild(j).getText(), null);
                        fonction.addOutput(symbole);
                    }
                }
            }
        }
    }

    /*
        Parcours récursivement un AST et retourne une liste des variables
        rencontrées dans les blocs VARS.
     */
    private List<String> getVarsFromArbre(CommonTree ast) {
        List<String> variables = new ArrayList<>();

        if (ast != null) {
            for (int i = 0; i < ast.getChildCount(); i++) {
                CommonTree child = (CommonTree) ast.getChild(i);
                if (child.getType() == WhileParser.VARS) {
                    for (int j = 0; j < child.getChildCount(); j++) {
                        variables.add(child.getChild(j).getText());
                    }
                }
                variables.addAll(getVarsFromArbre(child));
            }
        }

        return variables;
    }

    private String getNomFromFonctionArbre(CommonTree ast) {
        String name = "";
        if (ast != null) {
            int j = 0;
            while (j < ast.getChildCount() && name.isEmpty()) {
                if (ast.getChild(j).getType() == WhileParser.NOM) {
                    name = ast.getChild(j).getChild(0).getText();
                }
                j++;
            }
        }

        return name;
    }
}