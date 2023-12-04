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
    public Object obtenirValeur(String nom) {
        for (Fonction entry : fonction) {
            if (entry.getNom().equals(nom)) {
                return entry.getValeur();
            }
        }
        return null;
    }

    // Vérifier si un symbole existe dans la table
    public boolean existeSymbole(String nom) {
        for (Fonction entry : fonction) {
            if (entry.getNom().equals(nom)) {
                return true;
            }
            TableSymbole symbole = entry.getSymbole();
            if (symbole != null){
                symbole.existeSymbole(nom);;
            }
        }
        return false;
    }

    // Afficher tous les symboles de la table
    public void afficherTable() {
        System.out.println("Table des Symboles:");
        for (Fonction entry : fonction) {
            TableSymbole symbole = entry.getSymbole();
            if (symbole != null){
                symbole.afficherTable();
            }
            System.out.println(entry.getNom() + " : " + entry.getValeur());
        }
    }
}