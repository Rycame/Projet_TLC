import org.antlr.runtime.tree.CommonTree;

import java.util.ArrayList;
import java.util.List;

public class Fonction extends Symbole {
    private List<Symbole> parametres;
    private List<Symbole> variables;

    public Fonction(String nom, CommonTree arbre) {
        super(nom, arbre);
        parametres = new ArrayList<Symbole>();
        variables = new ArrayList<Symbole>();
    }

    public List<Symbole> getVariables() {
        return variables;
    }

    public List<Symbole> getParametres() {
        return parametres;
    }

    public void addVariable(Symbole var) {
        variables.add(var);
    }

    public void addParametre(Symbole param) {
        parametres.add(param);
    }


    public boolean existsParametre(String name) {
        for (Symbole parameter : this.parametres) {
            if (parameter.getNom().equals(name)) {
                return true;
            }
        }

        return false;
    }

    public boolean existsVariable(String name) {
        for (Symbole variable : this.variables) {
            if (variable.getNom().equals(name)) {
                return true;
            }
        }

        return false;
    }
}