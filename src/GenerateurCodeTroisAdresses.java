import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

public class GenerateurCodeTroisAdresses {
    private int tempVarCount = 0;
    CommonTree ast;

    GenerateurCodeTroisAdresses(CommonTree input_ast){
        this.ast = input_ast;
    }

    public List<String> generateCode() {
        List<String> code = new ArrayList<>();
        traverseAST(this.ast, code);
        return code;
    }

    private void traverseAST(CommonTree tree, List<String> code) {
        if (tree == null) {
            return;
        }

        // Exemple : traitement d'une addition
        if (tree.getText().equals("+")) {
            String leftOperand = tree.getChild(0).getText();
            String rightOperand = tree.getChild(1).getText();
            String tempVar = "t" + tempVarCount++;
            code.add(tempVar + " = " + leftOperand + " + " + rightOperand);
        }

        // Traitement récursif des enfants
        for (int i = 0; i < tree.getChildCount(); i++) {
            traverseAST((CommonTree) tree.getChild(i), code);
        }
    }

}

