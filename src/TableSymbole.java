import java.util.ArrayList;
import java.util.List;

public class TableSymbole {
    private List<TableDesSymbolesEntry> symboles;
    private TableSymbole contexteEnglobant;

    public TableSymbole() {
        symboles = new ArrayList<>();
        contexteEnglobant = null;
    }

    public TableSymbole(TableSymbole contexteEnglobant) {
        symboles = new ArrayList<>();
        this.contexteEnglobant = contexteEnglobant;
    }

    // Ajouter un symbole à la table
    public void ajouterSymbole(String nom, Object valeur) {
        symboles.add(new TableDesSymbolesEntry(nom, valeur));
    }

    // Récupérer la valeur associée à un symbole
    public Object obtenirValeur(String nom) {
        for (TableDesSymbolesEntry entry : symboles) {
            if (entry.getNom().equals(nom)) {
                return entry.getValeur();
            }
        }
        if (contexteEnglobant != null) {
            // Chercher dans le contexte englobant si le symbole n'est pas trouvé ici
            return contexteEnglobant.obtenirValeur(nom);
        }
        return null;
    }

    // Vérifier si un symbole existe dans la table
    public boolean existeSymbole(String nom) {
        for (TableDesSymbolesEntry entry : symboles) {
            if (entry.getNom().equals(nom)) {
                return true;
            }
        }
        return (contexteEnglobant != null && contexteEnglobant.existeSymbole(nom));
    }

    // Afficher tous les symboles de la table
    public void afficherTable() {
        System.out.println("Table des Symboles:");
        for (TableDesSymbolesEntry entry : symboles) {
            System.out.println(entry.getNom() + " : " + entry.getValeur());
        }
        if (contexteEnglobant != null) {
            System.out.println("Contexte Englobant:");
            contexteEnglobant.afficherTable();
        }
    }
}