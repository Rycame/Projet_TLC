import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;

class Fonction extends Symbole{
    private List<Symbole> parametre;
    private List<Symbole> variable;

    public Fonction(String nom,CommonTree arbre) {
        super(nom,arbre);
        parametre = new ArrayList<Symbole>();
        variable = new ArrayList<Symbole>();
    }

    public List<Symbole> getVariable() {
        return variable;
    }

    public List<Symbole> getParametre() {
        return parametre;
    }

    public void addVariable(Symbole var){
        variable.add(var);
    }

    public void addParametre(Symbole param){
        parametre.add(param);
    }
}