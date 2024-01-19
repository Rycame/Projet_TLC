import org.antlr.runtime.tree.CommonTree;

import java.util.ArrayList;
import java.util.List;

public class TroisAdresses {
    int nbFonctions;
    int nbEquals;
    int nbFor;
    int nbWhile;

    public TroisAdresses() {
        this.nbFonctions = 0;
        this.nbEquals = 0;
        this.nbFor = 0;
        this.nbWhile = 0;
    }

    public void generate(CommonTree ast) {
        this.parcoursAst(ast);

        System.out.println(this.nbFonctions + " fonctions.");
        System.out.println(this.nbEquals + " equals.");
        System.out.println(this.nbFor + " for loop.");
        System.out.println(this.nbWhile + " while loop.");
    }

    private void parcoursAst(CommonTree ast) {
        if (ast == null) return;

        for (int i = 0; i < ast.getChildCount(); i++) {
            if (ast.getChild(i).getType() == WhileParser.FUNCTION) {
                this.parcoursFunction((CommonTree) ast.getChild(i));
            } else {
                this.parcoursAst((CommonTree) ast.getChild(i));
            }
        }
    }

    private void parcoursFunction(CommonTree function) {
        this.nbFonctions += 1;
        System.out.println("\n");

        String name = function.getChild(0).getChild(0).getText();
        System.out.println("func begin " + name);


        List<String> inputs = new ArrayList<>();
        for (int i = 0; i < function.getChild(1).getChildCount(); i++) {
            inputs.add(function.getChild(1).getChild(i).getText());
        }

        for (String input : inputs) {
            System.out.println("param " + input);
        }

        this.parcoursCommands((CommonTree) function.getChild(2));

        List<String> outputs = new ArrayList<>();
        for (int i = 0; i < function.getChild(3).getChildCount(); i++) {
            outputs.add(function.getChild(3).getChild(i).getText());
        }
        for (String output : outputs) {
            System.out.println("return " + output);
        }


        System.out.println("func end");
    }

    private void parcoursCommands(CommonTree commands) {
        for (int i = 0; i < commands.getChildCount(); i++) {
            if (commands.getChild(i).getType() == WhileParser.EQUAL) {
                this.parcoursEqual((CommonTree) commands.getChild(i));
            } else if (commands.getChild(i).getType() == WhileParser.FOR) {
                this.parcoursFor((CommonTree) commands.getChild(i));
            } else if (commands.getChild(i).getType() == WhileParser.WHILE) {
                this.parcoursWhile((CommonTree) commands.getChild(i));
            }
        }
    }

    private void parcoursEqual(CommonTree equal) {
        this.nbEquals += 1;

        String var = equal.getChild(0).getChild(0).getText();

        if (equal.getChild(1).getChild(0).getType() == WhileParser.Variable) {
            String expr = equal.getChild(1).getChild(0).getText();
            System.out.println(var + "=" + expr);
        } else if (equal.getChild(1).getChild(0).getType() == WhileParser.SYMB) {
            CommonTree symb = (CommonTree) equal.getChild(1).getChild(0);
            StringBuilder callFonction = new StringBuilder("call");
            for (int i = 0; i < symb.getChildCount(); i++) {
                callFonction.append(" ").append(symb.getChild(i).getText());
            }
            System.out.println(var + "=" + callFonction.toString());
        } else {
            System.out.println("Var=" + equal.getChild(1).getChild(0).getText() + " n'est pas encore implémenté.");
        }
    }

    private void parcoursFor(CommonTree forLoop) {
        this.nbFor += 1;

        String condition = forLoop.getChild(0).getText();
        System.out.println("for_" + this.nbFor + "_debut:");
        System.out.println("if " + condition + " goto for_" + this.nbFor + "_loop");
        System.out.println("goto for_" + this.nbFor + "_fin");
        System.out.println("for_" + this.nbFor + "_loop:");
        parcoursCommands((CommonTree) forLoop.getChild(1));
        System.out.println("goto for_" + this.nbFor + "_debut");
        System.out.println("for_" + this.nbFor + "_fin:");
    }

    private void parcoursWhile(CommonTree whileLoop) {
        this.nbWhile += 1;

        String condition = whileLoop.getChild(0).getText();
        System.out.println("while_" + this.nbWhile + "_debut:");
        System.out.println("if " + condition + " goto while_" + this.nbWhile + "_loop");
        System.out.println("goto while_" + this.nbWhile + "_fin");
        System.out.println("while_" + this.nbWhile + "_loop:");
        parcoursCommands((CommonTree) whileLoop.getChild(1));
        System.out.println("goto while_" + this.nbWhile + "_debut");
        System.out.println("while_" + this.nbWhile + "_fin:");
    }

    private void parcoursIf(CommonTree ifStmnt){

    }
}
