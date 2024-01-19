import org.antlr.runtime.tree.CommonTree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TroisAdresses {
    int nbFonctions;
    int nbEquals;
    int nbFor;
    int nbWhile;
    int nbIf;
    int nbForeach;
    final String fileName = "code.3addr";

    public TroisAdresses() {
        this.nbFonctions = 0;
        this.nbEquals = 0;
        this.nbFor = 0;
        this.nbWhile = 0;
        this.nbIf = 0;
        this.nbForeach = 0;

        this.creerFichier();
    }

    private void creerFichier() {
        try {
            File fichier = new File(this.fileName);

            if (fichier.exists()) {
                fichier.delete();
            }

            fichier.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void ajouterTexte(String texte) {
        try {
            FileWriter fileWriter = new FileWriter(this.fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(texte);
            bufferedWriter.newLine();

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void generate(CommonTree ast) {
        this.parcoursAst(ast);

        System.out.println(this.nbFonctions + " fonctions.");
        System.out.println(this.nbEquals + " equals.");
        System.out.println(this.nbIf + " if statements.");
        System.out.println(this.nbFor + " for loop.");
        System.out.println(this.nbWhile + " while loop.");
        System.out.println("Le code trois adresses a été généré avec succès.");
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

        String name = function.getChild(0).getChild(0).getText();
        this.ajouterTexte("func begin " + name);

        List<String> inputs = new ArrayList<>();
        for (int i = 0; i < function.getChild(1).getChildCount(); i++) {
            inputs.add(function.getChild(1).getChild(i).getText());
        }

        for (String input : inputs) {
            this.ajouterTexte("param " + input);
        }

        this.parcoursCommands((CommonTree) function.getChild(2));

        List<String> outputs = new ArrayList<>();
        for (int i = 0; i < function.getChild(3).getChildCount(); i++) {
            outputs.add(function.getChild(3).getChild(i).getText());
        }
        for (String output : outputs) {
            this.ajouterTexte("return " + output);
        }

        this.ajouterTexte("func end");
    }

    private void parcoursCommands(CommonTree commands) {
        for (int i = 0; i < commands.getChildCount(); i++) {
            if (commands.getChild(i).getType() == WhileParser.EQUAL) {
                this.parcoursEqual((CommonTree) commands.getChild(i));
            } else if (commands.getChild(i).getType() == WhileParser.FOR) {
                this.parcoursFor((CommonTree) commands.getChild(i));
            } else if (commands.getChild(i).getType() == WhileParser.WHILE) {
                this.parcoursWhile((CommonTree) commands.getChild(i));
            } else if (commands.getChild(i).getType() == WhileParser.IF) {
                this.parcoursIf((CommonTree) commands.getChild(i));
            } else if (commands.getChild(i).getType() == WhileParser.FOREACH) {
                this.parcoursForeach((CommonTree) commands.getChild(i));
            }
        }
    }

    private void parcoursEqual(CommonTree equal) {
        this.nbEquals += 1;

        String var = equal.getChild(0).getChild(0).getText();

        if (equal.getChild(1).getChild(0).getType() == WhileParser.Variable) {
            String expr = equal.getChild(1).getChild(0).getText();
            this.ajouterTexte(var + "=" + expr);
        } else if (equal.getChild(1).getChild(0).getType() == WhileParser.SYMB) {
            CommonTree symb = (CommonTree) equal.getChild(1).getChild(0);
            StringBuilder callFonction = new StringBuilder("call");
            for (int i = 0; i < symb.getChildCount(); i++) {
                callFonction.append(" ").append(symb.getChild(i).getText());
            }
            this.ajouterTexte(var + "=" + callFonction.toString());
        } else {
            this.ajouterTexte("Var=" + equal.getChild(1).getChild(0).getText() + " n'est pas encore implémenté.");
        }
    }

    private void parcoursFor(CommonTree forLoop) {
        this.nbFor += 1;

        String condition = forLoop.getChild(0).getText();
        this.ajouterTexte("for_" + this.nbFor + "_debut:");
        this.ajouterTexte("if " + condition + " goto for_" + this.nbFor + "_loop");
        this.ajouterTexte("goto for_" + this.nbFor + "_fin");
        this.ajouterTexte("for_" + this.nbFor + "_loop:");
        parcoursCommands((CommonTree) forLoop.getChild(1));
        this.ajouterTexte("goto for_" + this.nbFor + "_debut");
        this.ajouterTexte("for_" + this.nbFor + "_fin:");
    }

    private void parcoursWhile(CommonTree whileLoop) {
        this.nbWhile += 1;

        String condition = whileLoop.getChild(0).getText();
        this.ajouterTexte("while_" + this.nbWhile + "_debut:");
        this.ajouterTexte("if " + condition + " goto while_" + this.nbWhile + "_loop");
        this.ajouterTexte("goto while_" + this.nbWhile + "_fin");
        this.ajouterTexte("while_" + this.nbWhile + "_loop:");
        parcoursCommands((CommonTree) whileLoop.getChild(1));
        this.ajouterTexte("goto while_" + this.nbWhile + "_debut");
        this.ajouterTexte("while_" + this.nbWhile + "_fin:");
    }

    private void parcoursIf(CommonTree ifStmnt) {
        this.nbIf += 1;

        String condition = ifStmnt.getChild(0).getChild(0).getText();
        this.ajouterTexte("if " + condition + " goto if_" + this.nbIf + "_debut");
        if (ifStmnt.getChildCount() >= 3) {
            this.ajouterTexte("goto else_" + this.nbIf + "_debut");
        }
        this.ajouterTexte("if_" + this.nbIf + "_debut:");
        this.parcoursCommands((CommonTree) ifStmnt.getChild(1).getChild(0));
        this.ajouterTexte("goto if_" + this.nbIf + "_fin");
        if (ifStmnt.getChildCount() >= 3) {
            this.ajouterTexte("else_" + this.nbIf + "_debut:");
            this.parcoursCommands((CommonTree) ifStmnt.getChild(2).getChild(0));
            this.ajouterTexte("goto if_" + this.nbIf + "_fin");
        }
        this.ajouterTexte("if_" + this.nbIf + "_fin:");
    }

    private void parcoursForeach(CommonTree foreach) {
        this.nbForeach += 1;

        this.ajouterTexte("Le foreach n'a pas encore été implémenté.");
    }
}
