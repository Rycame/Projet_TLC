// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g 2023-11-14 10:26:30

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class WhileParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Variable", "Symbol", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'if'", "'then'", "'else'", "'fi'", "'while'", "'do'", "'od'", "'for'", "'foreach'", "'in'", "'nil'", "'('", "'cons'", "')'", "'list'", "'hd'", "'tl'", "'=?'"
    };
    public static final int EOF=-1;
    public static final int T__6=6;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int Variable=4;
    public static final int Symbol=5;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "exprBase2", "exprBase4", "commandWhile", "output", 
        "exprBase", "commandEqual", "exprs", "commandForeach", "vars", "commands", 
        "exprBase3", "input", "commandNop", "command", "program", "definition", 
        "commandFor", "exprBase1", "expression", "function", "inputSub", 
        "commandIf", "lexpr"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false, false, false, false, false, false, false, false, false, 
            false, false, false, false, false
    };

     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public WhileParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public WhileParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public WhileParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return WhileParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g"; }



    // $ANTLR start "program"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:9:1: program : function ( program )? ;
    public final void program() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(9, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:10:2: ( function ( program )? )
            dbg.enterAlt(1);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:10:4: function ( program )?
            {
            dbg.location(10,4);
            pushFollow(FOLLOW_function_in_program77);
            function();

            state._fsp--;

            dbg.location(10,13);
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:10:13: ( program )?
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==6) ) {
                alt1=1;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:10:13: program
                    {
                    dbg.location(10,13);
                    pushFollow(FOLLOW_program_in_program79);
                    program();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(10, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "function"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:12:1: function : 'function' Symbol ':' definition ;
    public final void function() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(12, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:13:2: ( 'function' Symbol ':' definition )
            dbg.enterAlt(1);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:13:4: 'function' Symbol ':' definition
            {
            dbg.location(13,4);
            match(input,6,FOLLOW_6_in_function90); 
            dbg.location(13,15);
            match(input,Symbol,FOLLOW_Symbol_in_function92); 
            dbg.location(13,22);
            match(input,7,FOLLOW_7_in_function94); 
            dbg.location(13,26);
            pushFollow(FOLLOW_definition_in_function96);
            definition();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(13, 36);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "function"


    // $ANTLR start "definition"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:15:1: definition : 'read' input '%' commands '%' 'write' output ;
    public final void definition() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:16:2: ( 'read' input '%' commands '%' 'write' output )
            dbg.enterAlt(1);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:16:4: 'read' input '%' commands '%' 'write' output
            {
            dbg.location(16,4);
            match(input,8,FOLLOW_8_in_definition106); 
            dbg.location(16,11);
            pushFollow(FOLLOW_input_in_definition108);
            input();

            state._fsp--;

            dbg.location(16,17);
            match(input,9,FOLLOW_9_in_definition110); 
            dbg.location(16,21);
            pushFollow(FOLLOW_commands_in_definition112);
            commands();

            state._fsp--;

            dbg.location(16,30);
            match(input,9,FOLLOW_9_in_definition114); 
            dbg.location(16,34);
            match(input,10,FOLLOW_10_in_definition116); 
            dbg.location(16,42);
            pushFollow(FOLLOW_output_in_definition118);
            output();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(16, 48);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "definition"


    // $ANTLR start "input"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:18:1: input : ( inputSub | );
    public final void input() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "input");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:19:2: ( inputSub | )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==Variable) ) {
                alt2=1;
            }
            else if ( (LA2_0==9) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:19:4: inputSub
                    {
                    dbg.location(19,4);
                    pushFollow(FOLLOW_inputSub_in_input129);
                    inputSub();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:19:15: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(19, 15);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "input");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "input"


    // $ANTLR start "inputSub"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:21:1: inputSub : Variable ( ',' inputSub )? ;
    public final void inputSub() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "inputSub");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:22:2: ( Variable ( ',' inputSub )? )
            dbg.enterAlt(1);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:22:4: Variable ( ',' inputSub )?
            {
            dbg.location(22,4);
            match(input,Variable,FOLLOW_Variable_in_inputSub142); 
            dbg.location(22,13);
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:22:13: ( ',' inputSub )?
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:22:14: ',' inputSub
                    {
                    dbg.location(22,14);
                    match(input,11,FOLLOW_11_in_inputSub145); 
                    dbg.location(22,18);
                    pushFollow(FOLLOW_inputSub_in_inputSub147);
                    inputSub();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(22, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inputSub");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inputSub"


    // $ANTLR start "output"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:24:1: output : Variable ( ',' output )? ;
    public final void output() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "output");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:25:2: ( Variable ( ',' output )? )
            dbg.enterAlt(1);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:25:4: Variable ( ',' output )?
            {
            dbg.location(25,4);
            match(input,Variable,FOLLOW_Variable_in_output160); 
            dbg.location(25,13);
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:25:13: ( ',' output )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:25:14: ',' output
                    {
                    dbg.location(25,14);
                    match(input,11,FOLLOW_11_in_output163); 
                    dbg.location(25,18);
                    pushFollow(FOLLOW_output_in_output165);
                    output();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(25, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "output");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "output"


    // $ANTLR start "commands"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:27:1: commands : command ( ';' commands )? ;
    public final void commands() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "commands");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:28:2: ( command ( ';' commands )? )
            dbg.enterAlt(1);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:28:4: command ( ';' commands )?
            {
            dbg.location(28,4);
            pushFollow(FOLLOW_command_in_commands177);
            command();

            state._fsp--;

            dbg.location(28,12);
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:28:12: ( ';' commands )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:28:13: ';' commands
                    {
                    dbg.location(28,13);
                    match(input,12,FOLLOW_12_in_commands180); 
                    dbg.location(28,17);
                    pushFollow(FOLLOW_commands_in_commands182);
                    commands();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(28, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "commands");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "commands"


    // $ANTLR start "commandNop"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:30:1: commandNop : 'nop' ;
    public final void commandNop() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "commandNop");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:31:2: ( 'nop' )
            dbg.enterAlt(1);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:31:4: 'nop'
            {
            dbg.location(31,4);
            match(input,13,FOLLOW_13_in_commandNop195); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(31, 9);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "commandNop");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "commandNop"


    // $ANTLR start "commandEqual"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:33:1: commandEqual : vars ':=' exprs ;
    public final void commandEqual() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "commandEqual");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:34:2: ( vars ':=' exprs )
            dbg.enterAlt(1);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:34:4: vars ':=' exprs
            {
            dbg.location(34,4);
            pushFollow(FOLLOW_vars_in_commandEqual205);
            vars();

            state._fsp--;

            dbg.location(34,9);
            match(input,14,FOLLOW_14_in_commandEqual207); 
            dbg.location(34,14);
            pushFollow(FOLLOW_exprs_in_commandEqual209);
            exprs();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(34, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "commandEqual");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "commandEqual"


    // $ANTLR start "commandIf"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:36:1: commandIf : 'if' expression 'then' commands ( 'else' commands )? 'fi' ;
    public final void commandIf() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "commandIf");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(36, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:37:2: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
            dbg.enterAlt(1);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:37:4: 'if' expression 'then' commands ( 'else' commands )? 'fi'
            {
            dbg.location(37,4);
            match(input,15,FOLLOW_15_in_commandIf219); 
            dbg.location(37,9);
            pushFollow(FOLLOW_expression_in_commandIf221);
            expression();

            state._fsp--;

            dbg.location(37,20);
            match(input,16,FOLLOW_16_in_commandIf223); 
            dbg.location(37,27);
            pushFollow(FOLLOW_commands_in_commandIf225);
            commands();

            state._fsp--;

            dbg.location(37,36);
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:37:36: ( 'else' commands )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:37:37: 'else' commands
                    {
                    dbg.location(37,37);
                    match(input,17,FOLLOW_17_in_commandIf228); 
                    dbg.location(37,44);
                    pushFollow(FOLLOW_commands_in_commandIf230);
                    commands();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(37,55);
            match(input,18,FOLLOW_18_in_commandIf234); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(37, 59);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "commandIf");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "commandIf"


    // $ANTLR start "commandWhile"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:39:1: commandWhile : 'while' expression 'do' commands 'od' ;
    public final void commandWhile() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "commandWhile");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:40:2: ( 'while' expression 'do' commands 'od' )
            dbg.enterAlt(1);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:40:4: 'while' expression 'do' commands 'od'
            {
            dbg.location(40,4);
            match(input,19,FOLLOW_19_in_commandWhile244); 
            dbg.location(40,12);
            pushFollow(FOLLOW_expression_in_commandWhile246);
            expression();

            state._fsp--;

            dbg.location(40,23);
            match(input,20,FOLLOW_20_in_commandWhile248); 
            dbg.location(40,28);
            pushFollow(FOLLOW_commands_in_commandWhile250);
            commands();

            state._fsp--;

            dbg.location(40,37);
            match(input,21,FOLLOW_21_in_commandWhile252); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(40, 41);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "commandWhile");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "commandWhile"


    // $ANTLR start "commandFor"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:42:1: commandFor : 'for' expression 'do' commands 'od' ;
    public final void commandFor() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "commandFor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:43:2: ( 'for' expression 'do' commands 'od' )
            dbg.enterAlt(1);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:43:4: 'for' expression 'do' commands 'od'
            {
            dbg.location(43,4);
            match(input,22,FOLLOW_22_in_commandFor262); 
            dbg.location(43,10);
            pushFollow(FOLLOW_expression_in_commandFor264);
            expression();

            state._fsp--;

            dbg.location(43,21);
            match(input,20,FOLLOW_20_in_commandFor266); 
            dbg.location(43,26);
            pushFollow(FOLLOW_commands_in_commandFor268);
            commands();

            state._fsp--;

            dbg.location(43,35);
            match(input,21,FOLLOW_21_in_commandFor270); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(43, 39);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "commandFor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "commandFor"


    // $ANTLR start "commandForeach"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:45:1: commandForeach : 'foreach' Variable 'in' expression 'do' commands 'od' ;
    public final void commandForeach() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "commandForeach");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(45, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:46:2: ( 'foreach' Variable 'in' expression 'do' commands 'od' )
            dbg.enterAlt(1);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:46:4: 'foreach' Variable 'in' expression 'do' commands 'od'
            {
            dbg.location(46,4);
            match(input,23,FOLLOW_23_in_commandForeach280); 
            dbg.location(46,14);
            match(input,Variable,FOLLOW_Variable_in_commandForeach282); 
            dbg.location(46,23);
            match(input,24,FOLLOW_24_in_commandForeach284); 
            dbg.location(46,28);
            pushFollow(FOLLOW_expression_in_commandForeach286);
            expression();

            state._fsp--;

            dbg.location(46,39);
            match(input,20,FOLLOW_20_in_commandForeach288); 
            dbg.location(46,44);
            pushFollow(FOLLOW_commands_in_commandForeach290);
            commands();

            state._fsp--;

            dbg.location(46,53);
            match(input,21,FOLLOW_21_in_commandForeach292); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(46, 57);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "commandForeach");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "commandForeach"


    // $ANTLR start "command"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:48:1: command : ( commandNop | commandEqual | commandIf | commandWhile | commandFor | commandForeach );
    public final void command() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "command");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:49:2: ( commandNop | commandEqual | commandIf | commandWhile | commandFor | commandForeach )
            int alt7=6;
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case Variable:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 22:
                {
                alt7=5;
                }
                break;
            case 23:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:49:4: commandNop
                    {
                    dbg.location(49,4);
                    pushFollow(FOLLOW_commandNop_in_command302);
                    commandNop();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:49:17: commandEqual
                    {
                    dbg.location(49,17);
                    pushFollow(FOLLOW_commandEqual_in_command306);
                    commandEqual();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:49:32: commandIf
                    {
                    dbg.location(49,32);
                    pushFollow(FOLLOW_commandIf_in_command310);
                    commandIf();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:49:44: commandWhile
                    {
                    dbg.location(49,44);
                    pushFollow(FOLLOW_commandWhile_in_command314);
                    commandWhile();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:49:59: commandFor
                    {
                    dbg.location(49,59);
                    pushFollow(FOLLOW_commandFor_in_command318);
                    commandFor();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:49:72: commandForeach
                    {
                    dbg.location(49,72);
                    pushFollow(FOLLOW_commandForeach_in_command322);
                    commandForeach();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(49, 86);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "command");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "command"


    // $ANTLR start "vars"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:51:1: vars : Variable ( ',' vars )? ;
    public final void vars() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "vars");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:52:2: ( Variable ( ',' vars )? )
            dbg.enterAlt(1);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:52:4: Variable ( ',' vars )?
            {
            dbg.location(52,4);
            match(input,Variable,FOLLOW_Variable_in_vars332); 
            dbg.location(52,13);
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:52:13: ( ',' vars )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:52:14: ',' vars
                    {
                    dbg.location(52,14);
                    match(input,11,FOLLOW_11_in_vars335); 
                    dbg.location(52,18);
                    pushFollow(FOLLOW_vars_in_vars337);
                    vars();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(52, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vars");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vars"


    // $ANTLR start "exprs"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:54:1: exprs : expression ( ',' exprs )? ;
    public final void exprs() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "exprs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(54, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:55:2: ( expression ( ',' exprs )? )
            dbg.enterAlt(1);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:55:4: expression ( ',' exprs )?
            {
            dbg.location(55,4);
            pushFollow(FOLLOW_expression_in_exprs349);
            expression();

            state._fsp--;

            dbg.location(55,15);
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:55:15: ( ',' exprs )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:55:16: ',' exprs
                    {
                    dbg.location(55,16);
                    match(input,11,FOLLOW_11_in_exprs352); 
                    dbg.location(55,20);
                    pushFollow(FOLLOW_exprs_in_exprs354);
                    exprs();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(55, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "exprs"


    // $ANTLR start "exprBase1"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:57:1: exprBase1 : ( 'nil' | Variable | Symbol );
    public final void exprBase1() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "exprBase1");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(57, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:58:2: ( 'nil' | Variable | Symbol )
            dbg.enterAlt(1);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:
            {
            dbg.location(58,2);
            if ( (input.LA(1)>=Variable && input.LA(1)<=Symbol)||input.LA(1)==25 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(58, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprBase1");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "exprBase1"


    // $ANTLR start "exprBase2"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:60:1: exprBase2 : ( '(' 'cons' lexpr ')' | '(' 'list' lexpr ')' );
    public final void exprBase2() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "exprBase2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:61:2: ( '(' 'cons' lexpr ')' | '(' 'list' lexpr ')' )
            int alt10=2;
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==27) ) {
                    alt10=1;
                }
                else if ( (LA10_1==29) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:61:4: '(' 'cons' lexpr ')'
                    {
                    dbg.location(61,4);
                    match(input,26,FOLLOW_26_in_exprBase2384); 
                    dbg.location(61,8);
                    match(input,27,FOLLOW_27_in_exprBase2386); 
                    dbg.location(61,15);
                    pushFollow(FOLLOW_lexpr_in_exprBase2388);
                    lexpr();

                    state._fsp--;

                    dbg.location(61,21);
                    match(input,28,FOLLOW_28_in_exprBase2390); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:61:27: '(' 'list' lexpr ')'
                    {
                    dbg.location(61,27);
                    match(input,26,FOLLOW_26_in_exprBase2394); 
                    dbg.location(61,31);
                    match(input,29,FOLLOW_29_in_exprBase2396); 
                    dbg.location(61,38);
                    pushFollow(FOLLOW_lexpr_in_exprBase2398);
                    lexpr();

                    state._fsp--;

                    dbg.location(61,44);
                    match(input,28,FOLLOW_28_in_exprBase2400); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(61, 47);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprBase2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "exprBase2"


    // $ANTLR start "exprBase3"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:63:1: exprBase3 : ( '(' 'hd' exprBase ')' | '(' 'tl' exprBase ')' );
    public final void exprBase3() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "exprBase3");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(63, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:64:2: ( '(' 'hd' exprBase ')' | '(' 'tl' exprBase ')' )
            int alt11=2;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==30) ) {
                    alt11=1;
                }
                else if ( (LA11_1==31) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:64:4: '(' 'hd' exprBase ')'
                    {
                    dbg.location(64,4);
                    match(input,26,FOLLOW_26_in_exprBase3410); 
                    dbg.location(64,8);
                    match(input,30,FOLLOW_30_in_exprBase3412); 
                    dbg.location(64,13);
                    pushFollow(FOLLOW_exprBase_in_exprBase3414);
                    exprBase();

                    state._fsp--;

                    dbg.location(64,22);
                    match(input,28,FOLLOW_28_in_exprBase3416); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:64:28: '(' 'tl' exprBase ')'
                    {
                    dbg.location(64,28);
                    match(input,26,FOLLOW_26_in_exprBase3420); 
                    dbg.location(64,32);
                    match(input,31,FOLLOW_31_in_exprBase3422); 
                    dbg.location(64,37);
                    pushFollow(FOLLOW_exprBase_in_exprBase3424);
                    exprBase();

                    state._fsp--;

                    dbg.location(64,46);
                    match(input,28,FOLLOW_28_in_exprBase3426); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(64, 49);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprBase3");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "exprBase3"


    // $ANTLR start "exprBase4"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:66:1: exprBase4 : '(' Symbol lexpr ')' ;
    public final void exprBase4() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "exprBase4");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(66, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:67:2: ( '(' Symbol lexpr ')' )
            dbg.enterAlt(1);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:67:4: '(' Symbol lexpr ')'
            {
            dbg.location(67,4);
            match(input,26,FOLLOW_26_in_exprBase4436); 
            dbg.location(67,8);
            match(input,Symbol,FOLLOW_Symbol_in_exprBase4438); 
            dbg.location(67,15);
            pushFollow(FOLLOW_lexpr_in_exprBase4440);
            lexpr();

            state._fsp--;

            dbg.location(67,21);
            match(input,28,FOLLOW_28_in_exprBase4442); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(67, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprBase4");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "exprBase4"


    // $ANTLR start "exprBase"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:69:1: exprBase : ( exprBase1 | exprBase2 | exprBase3 | exprBase4 );
    public final void exprBase() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "exprBase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(69, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:70:2: ( exprBase1 | exprBase2 | exprBase3 | exprBase4 )
            int alt12=4;
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=Variable && LA12_0<=Symbol)||LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                switch ( input.LA(2) ) {
                case 27:
                case 29:
                    {
                    alt12=2;
                    }
                    break;
                case 30:
                case 31:
                    {
                    alt12=3;
                    }
                    break;
                case Symbol:
                    {
                    alt12=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:70:4: exprBase1
                    {
                    dbg.location(70,4);
                    pushFollow(FOLLOW_exprBase1_in_exprBase452);
                    exprBase1();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:70:16: exprBase2
                    {
                    dbg.location(70,16);
                    pushFollow(FOLLOW_exprBase2_in_exprBase456);
                    exprBase2();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:70:28: exprBase3
                    {
                    dbg.location(70,28);
                    pushFollow(FOLLOW_exprBase3_in_exprBase460);
                    exprBase3();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:70:40: exprBase4
                    {
                    dbg.location(70,40);
                    pushFollow(FOLLOW_exprBase4_in_exprBase464);
                    exprBase4();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(70, 49);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprBase");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "exprBase"


    // $ANTLR start "expression"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:72:1: expression : exprBase ( '=?' exprBase )? ;
    public final void expression() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(72, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:73:2: ( exprBase ( '=?' exprBase )? )
            dbg.enterAlt(1);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:73:4: exprBase ( '=?' exprBase )?
            {
            dbg.location(73,4);
            pushFollow(FOLLOW_exprBase_in_expression474);
            exprBase();

            state._fsp--;

            dbg.location(73,13);
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:73:13: ( '=?' exprBase )?
            int alt13=2;
            try { dbg.enterSubRule(13);
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:73:14: '=?' exprBase
                    {
                    dbg.location(73,14);
                    match(input,32,FOLLOW_32_in_expression477); 
                    dbg.location(73,19);
                    pushFollow(FOLLOW_exprBase_in_expression479);
                    exprBase();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(13);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(73, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expression"


    // $ANTLR start "lexpr"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:75:1: lexpr : ( exprBase lexpr | );
    public final void lexpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "lexpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 1);

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:76:2: ( exprBase lexpr | )
            int alt14=2;
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=Variable && LA14_0<=Symbol)||(LA14_0>=25 && LA14_0<=26)) ) {
                alt14=1;
            }
            else if ( (LA14_0==28) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:76:4: exprBase lexpr
                    {
                    dbg.location(76,4);
                    pushFollow(FOLLOW_exprBase_in_lexpr491);
                    exprBase();

                    state._fsp--;

                    dbg.location(76,13);
                    pushFollow(FOLLOW_lexpr_in_lexpr493);
                    lexpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\git\\Projet_TLC\\Grammar\\While.g:76:21: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(76, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "lexpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "lexpr"

    // Delegated rules


 

    public static final BitSet FOLLOW_function_in_program77 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_program_in_program79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_6_in_function90 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Symbol_in_function92 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_function94 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_definition_in_function96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_definition106 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_input_in_definition108 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_definition110 = new BitSet(new long[]{0x0000000000C8A010L});
    public static final BitSet FOLLOW_commands_in_definition112 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_definition114 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_definition116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_output_in_definition118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputSub_in_input129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_inputSub142 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_inputSub145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_inputSub_in_inputSub147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_output160 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_output163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_output_in_output165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_commands177 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_commands180 = new BitSet(new long[]{0x0000000000C8A010L});
    public static final BitSet FOLLOW_commands_in_commands182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_commandNop195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vars_in_commandEqual205 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_commandEqual207 = new BitSet(new long[]{0x0000000006000030L});
    public static final BitSet FOLLOW_exprs_in_commandEqual209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_commandIf219 = new BitSet(new long[]{0x0000000006000030L});
    public static final BitSet FOLLOW_expression_in_commandIf221 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_commandIf223 = new BitSet(new long[]{0x0000000000C8A010L});
    public static final BitSet FOLLOW_commands_in_commandIf225 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_commandIf228 = new BitSet(new long[]{0x0000000000C8A010L});
    public static final BitSet FOLLOW_commands_in_commandIf230 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_commandIf234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_commandWhile244 = new BitSet(new long[]{0x0000000006000030L});
    public static final BitSet FOLLOW_expression_in_commandWhile246 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_commandWhile248 = new BitSet(new long[]{0x0000000000C8A010L});
    public static final BitSet FOLLOW_commands_in_commandWhile250 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_commandWhile252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_commandFor262 = new BitSet(new long[]{0x0000000006000030L});
    public static final BitSet FOLLOW_expression_in_commandFor264 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_commandFor266 = new BitSet(new long[]{0x0000000000C8A010L});
    public static final BitSet FOLLOW_commands_in_commandFor268 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_commandFor270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_commandForeach280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Variable_in_commandForeach282 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_commandForeach284 = new BitSet(new long[]{0x0000000006000030L});
    public static final BitSet FOLLOW_expression_in_commandForeach286 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_commandForeach288 = new BitSet(new long[]{0x0000000000C8A010L});
    public static final BitSet FOLLOW_commands_in_commandForeach290 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_commandForeach292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandNop_in_command302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandEqual_in_command306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandIf_in_command310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandWhile_in_command314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandFor_in_command318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandForeach_in_command322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_vars332 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_vars335 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_vars_in_vars337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_exprs349 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_exprs352 = new BitSet(new long[]{0x0000000006000030L});
    public static final BitSet FOLLOW_exprs_in_exprs354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_exprBase10 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_exprBase2384 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_exprBase2386 = new BitSet(new long[]{0x0000000016000030L});
    public static final BitSet FOLLOW_lexpr_in_exprBase2388 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_exprBase2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_exprBase2394 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_exprBase2396 = new BitSet(new long[]{0x0000000016000030L});
    public static final BitSet FOLLOW_lexpr_in_exprBase2398 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_exprBase2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_exprBase3410 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_exprBase3412 = new BitSet(new long[]{0x0000000006000030L});
    public static final BitSet FOLLOW_exprBase_in_exprBase3414 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_exprBase3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_exprBase3420 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_exprBase3422 = new BitSet(new long[]{0x0000000006000030L});
    public static final BitSet FOLLOW_exprBase_in_exprBase3424 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_exprBase3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_exprBase4436 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Symbol_in_exprBase4438 = new BitSet(new long[]{0x0000000016000030L});
    public static final BitSet FOLLOW_lexpr_in_exprBase4440 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_exprBase4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase1_in_exprBase452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase2_in_exprBase456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase3_in_exprBase460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase4_in_exprBase464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_expression474 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_expression477 = new BitSet(new long[]{0x0000000006000030L});
    public static final BitSet FOLLOW_exprBase_in_expression479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_lexpr491 = new BitSet(new long[]{0x0000000006000030L});
    public static final BitSet FOLLOW_lexpr_in_lexpr493 = new BitSet(new long[]{0x0000000000000002L});

}