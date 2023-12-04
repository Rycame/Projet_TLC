import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Specify the input file containing your While program
        ANTLRFileStream input = new ANTLRFileStream("Projet_TLC/Grammar/output/__Test___input.txt");

        // Create the lexer and parser
        WhileLexer lexer = new WhileLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WhileParser parser = new WhileParser(tokens);

        // Call the starting rule of your grammar (in this case, "program")
        WhileParser.program_return result = parser.program();

        // Get the AST from the parser result
        CommonTree tree = (CommonTree) result.getTree();

        // Print the AST
        System.out.println(tree.toStringTree());

        // Traverse the AST
        traverseAST(tree);
    }

    // Simple AST traversal function
    private static void traverseAST(CommonTree tree) {
        if (tree != null) {
            for (int i = 0; i < tree.getChildCount(); i++) {
                traverseAST((CommonTree) tree.getChild(i));
            }
        }
    }
}
