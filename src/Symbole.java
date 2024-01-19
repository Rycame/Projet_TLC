import org.antlr.runtime.tree.CommonTree;

public class Symbole {
    private CommonTree arbre;
    private String nom;

    public Symbole(String nom, CommonTree arbre) {
        this.nom = nom;
        this.arbre = arbre;
    }

    public String getNom() {
        return nom;
    }

    public CommonTree getArbre() {
        return arbre;
    }
}
