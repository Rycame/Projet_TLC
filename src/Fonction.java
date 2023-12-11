import org.antlr.runtime.tree.CommonTree;

import java.util.ArrayList;
import java.util.List;

public class Fonction extends Symbole {
    private List<Symbole> parametres;
    private List<Symbole> variables;
    private List<Symbole> outputs;

    public Fonction(String nom, CommonTree arbre) {
        super(nom, arbre);
        parametres = new ArrayList<Symbole>();
        variables = new ArrayList<Symbole>();
        outputs = new ArrayList<Symbole>();
    }

    public List<Symbole> getVariables() {
        return variables;
    }

    public List<Symbole> getParametres() {
        return parametres;
    }

    public List<Symbole> getOutputs() {
        return outputs;
    }

    public void addVariable(Symbole var) {
        variables.add(var);
    }

    public void addParametre(Symbole param) {
        parametres.add(param);
    }

    public void addOutput(Symbole output) {
        outputs.add(output);
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