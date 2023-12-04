import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.tree.CommonTree;

public class TableSymbole {
    private List<Fonction> fonction;
    

    public TableSymbole() {
        fonction = new ArrayList<>();
    }

    // Ajouter un symbole à la table
    public void ajouterSymbole(String nom,CommonTree arbre) {
        fonction.add(new Fonction(nom, arbre));
    }

    // Récupérer la valeur associée à un symbole
    public CommonTree obtenirArbreFonction(String nom) {
        for (Fonction entry : fonction) {
            if (entry.getNom().equals(nom)) {
                return entry.getArbre();
            }
        }
        return null;
    }

    public CommonTree obtenirArbreSymbole(String nom) {
        for (Fonction entry : fonction) {
            List<Symbole> parametre = entry.getParametre();
            for (Symbole param : parametre){
                if (param.getNom() == nom){
                    return param.getArbre();
                }
            }
            List<Symbole> variable = entry.getVariable();
            for (Symbole var : variable){
                if (var.getNom() == nom){
                    return var.getArbre();
                }
            }
        }
        return null;
    }

    public boolean existeFonction(String nom) {
        for (Fonction entry : fonction) {
            if (entry.getNom() == nom){
                return true;
            }
        }
        return false;
    }

    // Vérifier si un symbole existe dans la table
    public boolean existeSymbole(String nom) {
        for (Fonction entry : fonction) {
            List<Symbole> parametre = entry.getParametre();
            for (Symbole param : parametre){
                if (param.getNom() == nom){
                    return true;
                }
            }
            List<Symbole> variable = entry.getVariable();
            for (Symbole var : variable){
                if (var.getNom() == nom){
                    return true;
                }
            }
        }
        return false;
    }

    // Afficher tous les symboles de la table
    public void afficherTable() {
        System.out.println("Table des Symboles:");
        for (Fonction entry : fonction) {
            System.out.println(entry.getNom());
            System.out.println("parametre :");
            List<Symbole> parametre = entry.getParametre();
            for (Symbole param : parametre){
                System.out.println(param.getNom());
            }
            System.out.println("variable : ");
            List<Symbole> variable = entry.getVariable();
            for (Symbole var : variable){
                System.out.println(var.getNom());
            }
        }
    }
}