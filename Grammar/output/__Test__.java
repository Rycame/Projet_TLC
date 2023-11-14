import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        WhileLexer lex = new WhileLexer(new ANTLRFileStream("C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        WhileParser g = new WhileParser(tokens, 49100, null);
        try {
            g.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}