import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

public class Main {
    public static void main(String[] args) throws Exception {
        // Le fichier contenant le programme While
        ANTLRFileStream input = new ANTLRFileStream("test/Test.while");

        // Créer le Lexer et le Parser
        WhileLexer lexer = new WhileLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WhileParser parser = new WhileParser(tokens);

        // Appel la règle de départ du programme (ici "program")
        WhileParser.program_return result = parser.program();

        // Récupère l'AST depuis le résultat du Parser
        CommonTree tree = (CommonTree) result.getTree();

        // Print the AST
        System.out.println(tree.toStringTree());

        TableSymbole tableSymbole = new TableSymbole(tree);
        tableSymbole.afficherTable();
    }
}