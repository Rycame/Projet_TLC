// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g 2023-11-27 15:15:30

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class WhileParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EQUAL", "FUNCTION", "PROGRAM", "INPUTS", "OUTPUTS", "COMMANDS", "IF", "WHILE", "FOR", "FOREACH", "NOP", "NIL", "CONS", "LIST", "HD", "TL", "SYMB", "VARS", "EXPRS", "CONDITION", "NOM", "THEN", "ELSE", "Variable", "Symbol", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'if'", "'then'", "'else'", "'fi'", "'while'", "'do'", "'od'", "'for'", "'foreach'", "'in'", "'nil'", "'('", "'cons'", "')'", "'list'", "'hd'", "'tl'", "'=?'"
    };
    public static final int EOF=-1;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int EQUAL=4;
    public static final int FUNCTION=5;
    public static final int PROGRAM=6;
    public static final int INPUTS=7;
    public static final int OUTPUTS=8;
    public static final int COMMANDS=9;
    public static final int IF=10;
    public static final int WHILE=11;
    public static final int FOR=12;
    public static final int FOREACH=13;
    public static final int NOP=14;
    public static final int NIL=15;
    public static final int CONS=16;
    public static final int LIST=17;
    public static final int HD=18;
    public static final int TL=19;
    public static final int SYMB=20;
    public static final int VARS=21;
    public static final int EXPRS=22;
    public static final int CONDITION=23;
    public static final int NOM=24;
    public static final int THEN=25;
    public static final int ELSE=26;
    public static final int Variable=27;
    public static final int Symbol=28;

    // delegates
    // delegators


        public WhileParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public WhileParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return WhileParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:39:1: program : function ( program )? -> ^( PROGRAM ( function )+ ) ;
    public final WhileParser.program_return program() throws RecognitionException {
        WhileParser.program_return retval = new WhileParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        WhileParser.function_return function1 = null;

        WhileParser.program_return program2 = null;


        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");
        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:40:2: ( function ( program )? -> ^( PROGRAM ( function )+ ) )
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:40:4: function ( program )?
            {
            pushFollow(FOLLOW_function_in_program188);
            function1=function();

            state._fsp--;

            stream_function.add(function1.getTree());
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:40:13: ( program )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==29) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:40:13: program
                    {
                    pushFollow(FOLLOW_program_in_program190);
                    program2=program();

                    state._fsp--;

                    stream_program.add(program2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: function
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 40:22: -> ^( PROGRAM ( function )+ )
            {
                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:40:25: ^( PROGRAM ( function )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                if ( !(stream_function.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_function.hasNext() ) {
                    adaptor.addChild(root_1, stream_function.nextTree());

                }
                stream_function.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:42:1: function : 'function' Symbol ':' definition -> ^( FUNCTION ^( NOM Symbol ) definition ) ;
    public final WhileParser.function_return function() throws RecognitionException {
        WhileParser.function_return retval = new WhileParser.function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal3=null;
        Token Symbol4=null;
        Token char_literal5=null;
        WhileParser.definition_return definition6 = null;


        Object string_literal3_tree=null;
        Object Symbol4_tree=null;
        Object char_literal5_tree=null;
        RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:43:2: ( 'function' Symbol ':' definition -> ^( FUNCTION ^( NOM Symbol ) definition ) )
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:43:4: 'function' Symbol ':' definition
            {
            string_literal3=(Token)match(input,29,FOLLOW_29_in_function210);  
            stream_29.add(string_literal3);

            Symbol4=(Token)match(input,Symbol,FOLLOW_Symbol_in_function212);  
            stream_Symbol.add(Symbol4);

            char_literal5=(Token)match(input,30,FOLLOW_30_in_function214);  
            stream_30.add(char_literal5);

            pushFollow(FOLLOW_definition_in_function216);
            definition6=definition();

            state._fsp--;

            stream_definition.add(definition6.getTree());


            // AST REWRITE
            // elements: Symbol, definition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 43:37: -> ^( FUNCTION ^( NOM Symbol ) definition )
            {
                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:43:40: ^( FUNCTION ^( NOM Symbol ) definition )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:43:51: ^( NOM Symbol )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOM, "NOM"), root_2);

                adaptor.addChild(root_2, stream_Symbol.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_definition.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function"

    public static class definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:45:1: definition : 'read' input '%' commands '%' 'write' output -> input commands output ;
    public final WhileParser.definition_return definition() throws RecognitionException {
        WhileParser.definition_return retval = new WhileParser.definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal7=null;
        Token char_literal9=null;
        Token char_literal11=null;
        Token string_literal12=null;
        WhileParser.input_return input8 = null;

        WhileParser.commands_return commands10 = null;

        WhileParser.output_return output13 = null;


        Object string_literal7_tree=null;
        Object char_literal9_tree=null;
        Object char_literal11_tree=null;
        Object string_literal12_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
        RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:46:2: ( 'read' input '%' commands '%' 'write' output -> input commands output )
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:46:4: 'read' input '%' commands '%' 'write' output
            {
            string_literal7=(Token)match(input,31,FOLLOW_31_in_definition240);  
            stream_31.add(string_literal7);

            pushFollow(FOLLOW_input_in_definition242);
            input8=input();

            state._fsp--;

            stream_input.add(input8.getTree());
            char_literal9=(Token)match(input,32,FOLLOW_32_in_definition244);  
            stream_32.add(char_literal9);

            pushFollow(FOLLOW_commands_in_definition246);
            commands10=commands();

            state._fsp--;

            stream_commands.add(commands10.getTree());
            char_literal11=(Token)match(input,32,FOLLOW_32_in_definition248);  
            stream_32.add(char_literal11);

            string_literal12=(Token)match(input,33,FOLLOW_33_in_definition250);  
            stream_33.add(string_literal12);

            pushFollow(FOLLOW_output_in_definition252);
            output13=output();

            state._fsp--;

            stream_output.add(output13.getTree());


            // AST REWRITE
            // elements: output, input, commands
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 46:49: -> input commands output
            {
                adaptor.addChild(root_0, stream_input.nextTree());
                adaptor.addChild(root_0, stream_commands.nextTree());
                adaptor.addChild(root_0, stream_output.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "definition"

    public static class input_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "input"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:48:1: input : ( inputSub -> inputSub | -> ^( INPUTS ) );
    public final WhileParser.input_return input() throws RecognitionException {
        WhileParser.input_return retval = new WhileParser.input_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        WhileParser.inputSub_return inputSub14 = null;


        RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");
        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:49:2: ( inputSub -> inputSub | -> ^( INPUTS ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Variable) ) {
                alt2=1;
            }
            else if ( (LA2_0==32) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:49:4: inputSub
                    {
                    pushFollow(FOLLOW_inputSub_in_input271);
                    inputSub14=inputSub();

                    state._fsp--;

                    stream_inputSub.add(inputSub14.getTree());


                    // AST REWRITE
                    // elements: inputSub
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 49:13: -> inputSub
                    {
                        adaptor.addChild(root_0, stream_inputSub.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:49:27: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 49:27: -> ^( INPUTS )
                    {
                        // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:49:30: ^( INPUTS )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUTS, "INPUTS"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "input"

    public static class inputSub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inputSub"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:52:1: inputSub : Variable ( ',' inputSub )? -> ^( INPUTS ( Variable )* ) ;
    public final WhileParser.inputSub_return inputSub() throws RecognitionException {
        WhileParser.inputSub_return retval = new WhileParser.inputSub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Variable15=null;
        Token char_literal16=null;
        WhileParser.inputSub_return inputSub17 = null;


        Object Variable15_tree=null;
        Object char_literal16_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
        RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");
        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:53:2: ( Variable ( ',' inputSub )? -> ^( INPUTS ( Variable )* ) )
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:53:4: Variable ( ',' inputSub )?
            {
            Variable15=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub294);  
            stream_Variable.add(Variable15);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:53:13: ( ',' inputSub )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==34) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:53:14: ',' inputSub
                    {
                    char_literal16=(Token)match(input,34,FOLLOW_34_in_inputSub297);  
                    stream_34.add(char_literal16);

                    pushFollow(FOLLOW_inputSub_in_inputSub299);
                    inputSub17=inputSub();

                    state._fsp--;

                    stream_inputSub.add(inputSub17.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: Variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 53:29: -> ^( INPUTS ( Variable )* )
            {
                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:53:32: ^( INPUTS ( Variable )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUTS, "INPUTS"), root_1);

                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:53:41: ( Variable )*
                while ( stream_Variable.hasNext() ) {
                    adaptor.addChild(root_1, stream_Variable.nextNode());

                }
                stream_Variable.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "inputSub"

    public static class output_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "output"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:55:1: output : Variable ( ',' output )? -> ^( OUTPUTS ( Variable )+ ) ;
    public final WhileParser.output_return output() throws RecognitionException {
        WhileParser.output_return retval = new WhileParser.output_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Variable18=null;
        Token char_literal19=null;
        WhileParser.output_return output20 = null;


        Object Variable18_tree=null;
        Object char_literal19_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
        RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:56:2: ( Variable ( ',' output )? -> ^( OUTPUTS ( Variable )+ ) )
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:56:4: Variable ( ',' output )?
            {
            Variable18=(Token)match(input,Variable,FOLLOW_Variable_in_output321);  
            stream_Variable.add(Variable18);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:56:13: ( ',' output )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:56:14: ',' output
                    {
                    char_literal19=(Token)match(input,34,FOLLOW_34_in_output324);  
                    stream_34.add(char_literal19);

                    pushFollow(FOLLOW_output_in_output326);
                    output20=output();

                    state._fsp--;

                    stream_output.add(output20.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: Variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 56:27: -> ^( OUTPUTS ( Variable )+ )
            {
                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:56:30: ^( OUTPUTS ( Variable )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUTS, "OUTPUTS"), root_1);

                if ( !(stream_Variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Variable.hasNext() ) {
                    adaptor.addChild(root_1, stream_Variable.nextNode());

                }
                stream_Variable.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "output"

    public static class commands_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commands"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:58:1: commands : command ( ';' command )* -> ^( COMMANDS ( command )+ ) ;
    public final WhileParser.commands_return commands() throws RecognitionException {
        WhileParser.commands_return retval = new WhileParser.commands_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal22=null;
        WhileParser.command_return command21 = null;

        WhileParser.command_return command23 = null;


        Object char_literal22_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:59:2: ( command ( ';' command )* -> ^( COMMANDS ( command )+ ) )
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:59:4: command ( ';' command )*
            {
            pushFollow(FOLLOW_command_in_commands347);
            command21=command();

            state._fsp--;

            stream_command.add(command21.getTree());
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:59:12: ( ';' command )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==35) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:59:13: ';' command
            	    {
            	    char_literal22=(Token)match(input,35,FOLLOW_35_in_commands350);  
            	    stream_35.add(char_literal22);

            	    pushFollow(FOLLOW_command_in_commands352);
            	    command23=command();

            	    state._fsp--;

            	    stream_command.add(command23.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);



            // AST REWRITE
            // elements: command
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 59:27: -> ^( COMMANDS ( command )+ )
            {
                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:59:30: ^( COMMANDS ( command )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_1);

                if ( !(stream_command.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_command.hasNext() ) {
                    adaptor.addChild(root_1, stream_command.nextTree());

                }
                stream_command.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "commands"

    public static class commandNop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commandNop"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:61:1: commandNop : 'nop' -> NOP ;
    public final WhileParser.commandNop_return commandNop() throws RecognitionException {
        WhileParser.commandNop_return retval = new WhileParser.commandNop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal24=null;

        Object string_literal24_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:62:2: ( 'nop' -> NOP )
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:62:4: 'nop'
            {
            string_literal24=(Token)match(input,36,FOLLOW_36_in_commandNop374);  
            stream_36.add(string_literal24);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 62:10: -> NOP
            {
                adaptor.addChild(root_0, (Object)adaptor.create(NOP, "NOP"));

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "commandNop"

    public static class commandEqual_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commandEqual"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:64:1: commandEqual : vars ':=' exprs -> ^( EQUAL vars exprs ) ;
    public final WhileParser.commandEqual_return commandEqual() throws RecognitionException {
        WhileParser.commandEqual_return retval = new WhileParser.commandEqual_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal26=null;
        WhileParser.vars_return vars25 = null;

        WhileParser.exprs_return exprs27 = null;


        Object string_literal26_tree=null;
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
        RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:65:2: ( vars ':=' exprs -> ^( EQUAL vars exprs ) )
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:65:4: vars ':=' exprs
            {
            pushFollow(FOLLOW_vars_in_commandEqual388);
            vars25=vars();

            state._fsp--;

            stream_vars.add(vars25.getTree());
            string_literal26=(Token)match(input,37,FOLLOW_37_in_commandEqual390);  
            stream_37.add(string_literal26);

            pushFollow(FOLLOW_exprs_in_commandEqual392);
            exprs27=exprs();

            state._fsp--;

            stream_exprs.add(exprs27.getTree());


            // AST REWRITE
            // elements: exprs, vars
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 65:20: -> ^( EQUAL vars exprs )
            {
                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:65:23: ^( EQUAL vars exprs )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQUAL, "EQUAL"), root_1);

                adaptor.addChild(root_1, stream_vars.nextTree());
                adaptor.addChild(root_1, stream_exprs.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "commandEqual"

    public static class commandIf_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commandIf"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:67:1: commandIf : 'if' expression 'then' c1= commands ( 'else' c2= commands )? 'fi' -> ^( IF ^( CONDITION expression ) ^( THEN $c1) ( ^( ELSE $c2) )? ) ;
    public final WhileParser.commandIf_return commandIf() throws RecognitionException {
        WhileParser.commandIf_return retval = new WhileParser.commandIf_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal28=null;
        Token string_literal30=null;
        Token string_literal31=null;
        Token string_literal32=null;
        WhileParser.commands_return c1 = null;

        WhileParser.commands_return c2 = null;

        WhileParser.expression_return expression29 = null;


        Object string_literal28_tree=null;
        Object string_literal30_tree=null;
        Object string_literal31_tree=null;
        Object string_literal32_tree=null;
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:69:2: ( 'if' expression 'then' c1= commands ( 'else' c2= commands )? 'fi' -> ^( IF ^( CONDITION expression ) ^( THEN $c1) ( ^( ELSE $c2) )? ) )
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:69:4: 'if' expression 'then' c1= commands ( 'else' c2= commands )? 'fi'
            {
            string_literal28=(Token)match(input,38,FOLLOW_38_in_commandIf414);  
            stream_38.add(string_literal28);

            pushFollow(FOLLOW_expression_in_commandIf416);
            expression29=expression();

            state._fsp--;

            stream_expression.add(expression29.getTree());
            string_literal30=(Token)match(input,39,FOLLOW_39_in_commandIf418);  
            stream_39.add(string_literal30);

            pushFollow(FOLLOW_commands_in_commandIf422);
            c1=commands();

            state._fsp--;

            stream_commands.add(c1.getTree());
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:69:39: ( 'else' c2= commands )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==40) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:69:40: 'else' c2= commands
                    {
                    string_literal31=(Token)match(input,40,FOLLOW_40_in_commandIf425);  
                    stream_40.add(string_literal31);

                    pushFollow(FOLLOW_commands_in_commandIf429);
                    c2=commands();

                    state._fsp--;

                    stream_commands.add(c2.getTree());

                    }
                    break;

            }

            string_literal32=(Token)match(input,41,FOLLOW_41_in_commandIf433);  
            stream_41.add(string_literal32);



            // AST REWRITE
            // elements: c2, c1, expression
            // token labels: 
            // rule labels: c1, retval, c2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 69:66: -> ^( IF ^( CONDITION expression ) ^( THEN $c1) ( ^( ELSE $c2) )? )
            {
                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:69:69: ^( IF ^( CONDITION expression ) ^( THEN $c1) ( ^( ELSE $c2) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:69:74: ^( CONDITION expression )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:69:98: ^( THEN $c1)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);

                adaptor.addChild(root_2, stream_c1.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:69:110: ( ^( ELSE $c2) )?
                if ( stream_c2.hasNext() ) {
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:69:110: ^( ELSE $c2)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_2);

                    adaptor.addChild(root_2, stream_c2.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_c2.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "commandIf"

    public static class commandWhile_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commandWhile"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:72:1: commandWhile : 'while' expression 'do' commands 'od' -> ^( WHILE expression commands ) ;
    public final WhileParser.commandWhile_return commandWhile() throws RecognitionException {
        WhileParser.commandWhile_return retval = new WhileParser.commandWhile_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal33=null;
        Token string_literal35=null;
        Token string_literal37=null;
        WhileParser.expression_return expression34 = null;

        WhileParser.commands_return commands36 = null;


        Object string_literal33_tree=null;
        Object string_literal35_tree=null;
        Object string_literal37_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:73:2: ( 'while' expression 'do' commands 'od' -> ^( WHILE expression commands ) )
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:73:4: 'while' expression 'do' commands 'od'
            {
            string_literal33=(Token)match(input,42,FOLLOW_42_in_commandWhile470);  
            stream_42.add(string_literal33);

            pushFollow(FOLLOW_expression_in_commandWhile472);
            expression34=expression();

            state._fsp--;

            stream_expression.add(expression34.getTree());
            string_literal35=(Token)match(input,43,FOLLOW_43_in_commandWhile474);  
            stream_43.add(string_literal35);

            pushFollow(FOLLOW_commands_in_commandWhile476);
            commands36=commands();

            state._fsp--;

            stream_commands.add(commands36.getTree());
            string_literal37=(Token)match(input,44,FOLLOW_44_in_commandWhile478);  
            stream_44.add(string_literal37);



            // AST REWRITE
            // elements: commands, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 73:42: -> ^( WHILE expression commands )
            {
                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:73:45: ^( WHILE expression commands )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_commands.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "commandWhile"

    public static class commandFor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commandFor"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:75:1: commandFor : 'for' expression 'do' commands 'od' -> ^( FOR expression commands ) ;
    public final WhileParser.commandFor_return commandFor() throws RecognitionException {
        WhileParser.commandFor_return retval = new WhileParser.commandFor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal38=null;
        Token string_literal40=null;
        Token string_literal42=null;
        WhileParser.expression_return expression39 = null;

        WhileParser.commands_return commands41 = null;


        Object string_literal38_tree=null;
        Object string_literal40_tree=null;
        Object string_literal42_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:76:2: ( 'for' expression 'do' commands 'od' -> ^( FOR expression commands ) )
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:76:4: 'for' expression 'do' commands 'od'
            {
            string_literal38=(Token)match(input,45,FOLLOW_45_in_commandFor498);  
            stream_45.add(string_literal38);

            pushFollow(FOLLOW_expression_in_commandFor500);
            expression39=expression();

            state._fsp--;

            stream_expression.add(expression39.getTree());
            string_literal40=(Token)match(input,43,FOLLOW_43_in_commandFor502);  
            stream_43.add(string_literal40);

            pushFollow(FOLLOW_commands_in_commandFor504);
            commands41=commands();

            state._fsp--;

            stream_commands.add(commands41.getTree());
            string_literal42=(Token)match(input,44,FOLLOW_44_in_commandFor506);  
            stream_44.add(string_literal42);



            // AST REWRITE
            // elements: expression, commands
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 76:40: -> ^( FOR expression commands )
            {
                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:76:43: ^( FOR expression commands )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_commands.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "commandFor"

    public static class commandForeach_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commandForeach"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:78:1: commandForeach : 'foreach' Variable 'in' expression 'do' commands 'od' -> ^( FOREACH Variable expression commands ) ;
    public final WhileParser.commandForeach_return commandForeach() throws RecognitionException {
        WhileParser.commandForeach_return retval = new WhileParser.commandForeach_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal43=null;
        Token Variable44=null;
        Token string_literal45=null;
        Token string_literal47=null;
        Token string_literal49=null;
        WhileParser.expression_return expression46 = null;

        WhileParser.commands_return commands48 = null;


        Object string_literal43_tree=null;
        Object Variable44_tree=null;
        Object string_literal45_tree=null;
        Object string_literal47_tree=null;
        Object string_literal49_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");
        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:79:2: ( 'foreach' Variable 'in' expression 'do' commands 'od' -> ^( FOREACH Variable expression commands ) )
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:79:4: 'foreach' Variable 'in' expression 'do' commands 'od'
            {
            string_literal43=(Token)match(input,46,FOLLOW_46_in_commandForeach526);  
            stream_46.add(string_literal43);

            Variable44=(Token)match(input,Variable,FOLLOW_Variable_in_commandForeach528);  
            stream_Variable.add(Variable44);

            string_literal45=(Token)match(input,47,FOLLOW_47_in_commandForeach530);  
            stream_47.add(string_literal45);

            pushFollow(FOLLOW_expression_in_commandForeach532);
            expression46=expression();

            state._fsp--;

            stream_expression.add(expression46.getTree());
            string_literal47=(Token)match(input,43,FOLLOW_43_in_commandForeach534);  
            stream_43.add(string_literal47);

            pushFollow(FOLLOW_commands_in_commandForeach536);
            commands48=commands();

            state._fsp--;

            stream_commands.add(commands48.getTree());
            string_literal49=(Token)match(input,44,FOLLOW_44_in_commandForeach538);  
            stream_44.add(string_literal49);



            // AST REWRITE
            // elements: Variable, expression, commands
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 79:58: -> ^( FOREACH Variable expression commands )
            {
                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:79:61: ^( FOREACH Variable expression commands )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);

                adaptor.addChild(root_1, stream_Variable.nextNode());
                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_commands.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "commandForeach"

    public static class command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:81:1: command : ( commandNop | commandEqual | commandIf | commandWhile | commandFor | commandForeach );
    public final WhileParser.command_return command() throws RecognitionException {
        WhileParser.command_return retval = new WhileParser.command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        WhileParser.commandNop_return commandNop50 = null;

        WhileParser.commandEqual_return commandEqual51 = null;

        WhileParser.commandIf_return commandIf52 = null;

        WhileParser.commandWhile_return commandWhile53 = null;

        WhileParser.commandFor_return commandFor54 = null;

        WhileParser.commandForeach_return commandForeach55 = null;



        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:82:2: ( commandNop | commandEqual | commandIf | commandWhile | commandFor | commandForeach )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt7=1;
                }
                break;
            case Variable:
                {
                alt7=2;
                }
                break;
            case 38:
                {
                alt7=3;
                }
                break;
            case 42:
                {
                alt7=4;
                }
                break;
            case 45:
                {
                alt7=5;
                }
                break;
            case 46:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:82:4: commandNop
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commandNop_in_command560);
                    commandNop50=commandNop();

                    state._fsp--;

                    adaptor.addChild(root_0, commandNop50.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:82:17: commandEqual
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commandEqual_in_command564);
                    commandEqual51=commandEqual();

                    state._fsp--;

                    adaptor.addChild(root_0, commandEqual51.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:82:32: commandIf
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commandIf_in_command568);
                    commandIf52=commandIf();

                    state._fsp--;

                    adaptor.addChild(root_0, commandIf52.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:82:44: commandWhile
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commandWhile_in_command572);
                    commandWhile53=commandWhile();

                    state._fsp--;

                    adaptor.addChild(root_0, commandWhile53.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:82:59: commandFor
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commandFor_in_command576);
                    commandFor54=commandFor();

                    state._fsp--;

                    adaptor.addChild(root_0, commandFor54.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:82:72: commandForeach
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commandForeach_in_command580);
                    commandForeach55=commandForeach();

                    state._fsp--;

                    adaptor.addChild(root_0, commandForeach55.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "command"

    public static class vars_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vars"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:84:1: vars : Variable ( ',' Variable )* -> ^( VARS ( Variable )+ ) ;
    public final WhileParser.vars_return vars() throws RecognitionException {
        WhileParser.vars_return retval = new WhileParser.vars_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Variable56=null;
        Token char_literal57=null;
        Token Variable58=null;

        Object Variable56_tree=null;
        Object char_literal57_tree=null;
        Object Variable58_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:85:2: ( Variable ( ',' Variable )* -> ^( VARS ( Variable )+ ) )
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:85:4: Variable ( ',' Variable )*
            {
            Variable56=(Token)match(input,Variable,FOLLOW_Variable_in_vars590);  
            stream_Variable.add(Variable56);

            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:85:13: ( ',' Variable )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:85:14: ',' Variable
            	    {
            	    char_literal57=(Token)match(input,34,FOLLOW_34_in_vars593);  
            	    stream_34.add(char_literal57);

            	    Variable58=(Token)match(input,Variable,FOLLOW_Variable_in_vars595);  
            	    stream_Variable.add(Variable58);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);



            // AST REWRITE
            // elements: Variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 85:29: -> ^( VARS ( Variable )+ )
            {
                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:85:32: ^( VARS ( Variable )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARS, "VARS"), root_1);

                if ( !(stream_Variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Variable.hasNext() ) {
                    adaptor.addChild(root_1, stream_Variable.nextNode());

                }
                stream_Variable.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "vars"

    public static class exprs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprs"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:87:1: exprs : expression ( ',' expression )* -> ^( EXPRS ( expression )+ ) ;
    public final WhileParser.exprs_return exprs() throws RecognitionException {
        WhileParser.exprs_return retval = new WhileParser.exprs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal60=null;
        WhileParser.expression_return expression59 = null;

        WhileParser.expression_return expression61 = null;


        Object char_literal60_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:88:2: ( expression ( ',' expression )* -> ^( EXPRS ( expression )+ ) )
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:88:4: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_exprs616);
            expression59=expression();

            state._fsp--;

            stream_expression.add(expression59.getTree());
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:88:15: ( ',' expression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==34) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:88:16: ',' expression
            	    {
            	    char_literal60=(Token)match(input,34,FOLLOW_34_in_exprs619);  
            	    stream_34.add(char_literal60);

            	    pushFollow(FOLLOW_expression_in_exprs621);
            	    expression61=expression();

            	    state._fsp--;

            	    stream_expression.add(expression61.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 88:33: -> ^( EXPRS ( expression )+ )
            {
                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:88:36: ^( EXPRS ( expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRS, "EXPRS"), root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprs"

    public static class exprBase1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprBase1"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:90:1: exprBase1 : ( 'nil' -> NIL | Variable | Symbol );
    public final WhileParser.exprBase1_return exprBase1() throws RecognitionException {
        WhileParser.exprBase1_return retval = new WhileParser.exprBase1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal62=null;
        Token Variable63=null;
        Token Symbol64=null;

        Object string_literal62_tree=null;
        Object Variable63_tree=null;
        Object Symbol64_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");

        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:91:2: ( 'nil' -> NIL | Variable | Symbol )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt10=1;
                }
                break;
            case Variable:
                {
                alt10=2;
                }
                break;
            case Symbol:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:91:4: 'nil'
                    {
                    string_literal62=(Token)match(input,48,FOLLOW_48_in_exprBase1642);  
                    stream_48.add(string_literal62);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 91:10: -> NIL
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:91:19: Variable
                    {
                    root_0 = (Object)adaptor.nil();

                    Variable63=(Token)match(input,Variable,FOLLOW_Variable_in_exprBase1650); 
                    Variable63_tree = (Object)adaptor.create(Variable63);
                    adaptor.addChild(root_0, Variable63_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:91:30: Symbol
                    {
                    root_0 = (Object)adaptor.nil();

                    Symbol64=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase1654); 
                    Symbol64_tree = (Object)adaptor.create(Symbol64);
                    adaptor.addChild(root_0, Symbol64_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprBase1"

    public static class exprBase2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprBase2"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:93:1: exprBase2 : ( '(' 'cons' lexpr ')' -> ^( CONS ( lexpr )? ) | '(' 'list' lexpr ')' -> ^( LIST ( lexpr )? ) );
    public final WhileParser.exprBase2_return exprBase2() throws RecognitionException {
        WhileParser.exprBase2_return retval = new WhileParser.exprBase2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal65=null;
        Token string_literal66=null;
        Token char_literal68=null;
        Token char_literal69=null;
        Token string_literal70=null;
        Token char_literal72=null;
        WhileParser.lexpr_return lexpr67 = null;

        WhileParser.lexpr_return lexpr71 = null;


        Object char_literal65_tree=null;
        Object string_literal66_tree=null;
        Object char_literal68_tree=null;
        Object char_literal69_tree=null;
        Object string_literal70_tree=null;
        Object char_literal72_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:94:2: ( '(' 'cons' lexpr ')' -> ^( CONS ( lexpr )? ) | '(' 'list' lexpr ')' -> ^( LIST ( lexpr )? ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==49) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==50) ) {
                    alt11=1;
                }
                else if ( (LA11_1==52) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:94:4: '(' 'cons' lexpr ')'
                    {
                    char_literal65=(Token)match(input,49,FOLLOW_49_in_exprBase2664);  
                    stream_49.add(char_literal65);

                    string_literal66=(Token)match(input,50,FOLLOW_50_in_exprBase2666);  
                    stream_50.add(string_literal66);

                    pushFollow(FOLLOW_lexpr_in_exprBase2668);
                    lexpr67=lexpr();

                    state._fsp--;

                    stream_lexpr.add(lexpr67.getTree());
                    char_literal68=(Token)match(input,51,FOLLOW_51_in_exprBase2670);  
                    stream_51.add(char_literal68);



                    // AST REWRITE
                    // elements: lexpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 94:25: -> ^( CONS ( lexpr )? )
                    {
                        // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:94:28: ^( CONS ( lexpr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONS, "CONS"), root_1);

                        // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:94:35: ( lexpr )?
                        if ( stream_lexpr.hasNext() ) {
                            adaptor.addChild(root_1, stream_lexpr.nextTree());

                        }
                        stream_lexpr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:94:45: '(' 'list' lexpr ')'
                    {
                    char_literal69=(Token)match(input,49,FOLLOW_49_in_exprBase2683);  
                    stream_49.add(char_literal69);

                    string_literal70=(Token)match(input,52,FOLLOW_52_in_exprBase2685);  
                    stream_52.add(string_literal70);

                    pushFollow(FOLLOW_lexpr_in_exprBase2687);
                    lexpr71=lexpr();

                    state._fsp--;

                    stream_lexpr.add(lexpr71.getTree());
                    char_literal72=(Token)match(input,51,FOLLOW_51_in_exprBase2689);  
                    stream_51.add(char_literal72);



                    // AST REWRITE
                    // elements: lexpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 94:66: -> ^( LIST ( lexpr )? )
                    {
                        // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:94:69: ^( LIST ( lexpr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

                        // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:94:76: ( lexpr )?
                        if ( stream_lexpr.hasNext() ) {
                            adaptor.addChild(root_1, stream_lexpr.nextTree());

                        }
                        stream_lexpr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprBase2"

    public static class exprBase3_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprBase3"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:96:1: exprBase3 : ( '(' 'hd' exprBase ')' -> ^( HD exprBase ) | '(' 'tl' exprBase ')' -> ^( TL exprBase ) );
    public final WhileParser.exprBase3_return exprBase3() throws RecognitionException {
        WhileParser.exprBase3_return retval = new WhileParser.exprBase3_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal73=null;
        Token string_literal74=null;
        Token char_literal76=null;
        Token char_literal77=null;
        Token string_literal78=null;
        Token char_literal80=null;
        WhileParser.exprBase_return exprBase75 = null;

        WhileParser.exprBase_return exprBase79 = null;


        Object char_literal73_tree=null;
        Object string_literal74_tree=null;
        Object char_literal76_tree=null;
        Object char_literal77_tree=null;
        Object string_literal78_tree=null;
        Object char_literal80_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:97:2: ( '(' 'hd' exprBase ')' -> ^( HD exprBase ) | '(' 'tl' exprBase ')' -> ^( TL exprBase ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==49) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==53) ) {
                    alt12=1;
                }
                else if ( (LA12_1==54) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:97:4: '(' 'hd' exprBase ')'
                    {
                    char_literal73=(Token)match(input,49,FOLLOW_49_in_exprBase3708);  
                    stream_49.add(char_literal73);

                    string_literal74=(Token)match(input,53,FOLLOW_53_in_exprBase3710);  
                    stream_53.add(string_literal74);

                    pushFollow(FOLLOW_exprBase_in_exprBase3712);
                    exprBase75=exprBase();

                    state._fsp--;

                    stream_exprBase.add(exprBase75.getTree());
                    char_literal76=(Token)match(input,51,FOLLOW_51_in_exprBase3714);  
                    stream_51.add(char_literal76);



                    // AST REWRITE
                    // elements: exprBase
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 97:26: -> ^( HD exprBase )
                    {
                        // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:97:29: ^( HD exprBase )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HD, "HD"), root_1);

                        adaptor.addChild(root_1, stream_exprBase.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:97:46: '(' 'tl' exprBase ')'
                    {
                    char_literal77=(Token)match(input,49,FOLLOW_49_in_exprBase3726);  
                    stream_49.add(char_literal77);

                    string_literal78=(Token)match(input,54,FOLLOW_54_in_exprBase3728);  
                    stream_54.add(string_literal78);

                    pushFollow(FOLLOW_exprBase_in_exprBase3730);
                    exprBase79=exprBase();

                    state._fsp--;

                    stream_exprBase.add(exprBase79.getTree());
                    char_literal80=(Token)match(input,51,FOLLOW_51_in_exprBase3732);  
                    stream_51.add(char_literal80);



                    // AST REWRITE
                    // elements: exprBase
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 97:68: -> ^( TL exprBase )
                    {
                        // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:97:71: ^( TL exprBase )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TL, "TL"), root_1);

                        adaptor.addChild(root_1, stream_exprBase.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprBase3"

    public static class exprBase4_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprBase4"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:99:1: exprBase4 : '(' Symbol lexpr ')' -> ^( SYMB Symbol ( lexpr )? ) ;
    public final WhileParser.exprBase4_return exprBase4() throws RecognitionException {
        WhileParser.exprBase4_return retval = new WhileParser.exprBase4_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal81=null;
        Token Symbol82=null;
        Token char_literal84=null;
        WhileParser.lexpr_return lexpr83 = null;


        Object char_literal81_tree=null;
        Object Symbol82_tree=null;
        Object char_literal84_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:100:2: ( '(' Symbol lexpr ')' -> ^( SYMB Symbol ( lexpr )? ) )
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:100:4: '(' Symbol lexpr ')'
            {
            char_literal81=(Token)match(input,49,FOLLOW_49_in_exprBase4750);  
            stream_49.add(char_literal81);

            Symbol82=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase4752);  
            stream_Symbol.add(Symbol82);

            pushFollow(FOLLOW_lexpr_in_exprBase4754);
            lexpr83=lexpr();

            state._fsp--;

            stream_lexpr.add(lexpr83.getTree());
            char_literal84=(Token)match(input,51,FOLLOW_51_in_exprBase4756);  
            stream_51.add(char_literal84);



            // AST REWRITE
            // elements: lexpr, Symbol
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 100:25: -> ^( SYMB Symbol ( lexpr )? )
            {
                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:100:28: ^( SYMB Symbol ( lexpr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SYMB, "SYMB"), root_1);

                adaptor.addChild(root_1, stream_Symbol.nextNode());
                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:100:42: ( lexpr )?
                if ( stream_lexpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_lexpr.nextTree());

                }
                stream_lexpr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprBase4"

    public static class exprBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprBase"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:102:1: exprBase : ( exprBase1 | exprBase2 | exprBase3 | exprBase4 );
    public final WhileParser.exprBase_return exprBase() throws RecognitionException {
        WhileParser.exprBase_return retval = new WhileParser.exprBase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        WhileParser.exprBase1_return exprBase185 = null;

        WhileParser.exprBase2_return exprBase286 = null;

        WhileParser.exprBase3_return exprBase387 = null;

        WhileParser.exprBase4_return exprBase488 = null;



        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:103:2: ( exprBase1 | exprBase2 | exprBase3 | exprBase4 )
            int alt13=4;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=Variable && LA13_0<=Symbol)||LA13_0==48) ) {
                alt13=1;
            }
            else if ( (LA13_0==49) ) {
                switch ( input.LA(2) ) {
                case 50:
                case 52:
                    {
                    alt13=2;
                    }
                    break;
                case 53:
                case 54:
                    {
                    alt13=3;
                    }
                    break;
                case Symbol:
                    {
                    alt13=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:103:4: exprBase1
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprBase1_in_exprBase777);
                    exprBase185=exprBase1();

                    state._fsp--;

                    adaptor.addChild(root_0, exprBase185.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:103:16: exprBase2
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprBase2_in_exprBase781);
                    exprBase286=exprBase2();

                    state._fsp--;

                    adaptor.addChild(root_0, exprBase286.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:103:28: exprBase3
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprBase3_in_exprBase785);
                    exprBase387=exprBase3();

                    state._fsp--;

                    adaptor.addChild(root_0, exprBase387.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:103:40: exprBase4
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprBase4_in_exprBase789);
                    exprBase488=exprBase4();

                    state._fsp--;

                    adaptor.addChild(root_0, exprBase488.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprBase"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:105:1: expression : exprBase ( '=?' exprBase )? -> ( exprBase )+ ;
    public final WhileParser.expression_return expression() throws RecognitionException {
        WhileParser.expression_return retval = new WhileParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal90=null;
        WhileParser.exprBase_return exprBase89 = null;

        WhileParser.exprBase_return exprBase91 = null;


        Object string_literal90_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:106:2: ( exprBase ( '=?' exprBase )? -> ( exprBase )+ )
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:106:4: exprBase ( '=?' exprBase )?
            {
            pushFollow(FOLLOW_exprBase_in_expression799);
            exprBase89=exprBase();

            state._fsp--;

            stream_exprBase.add(exprBase89.getTree());
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:106:13: ( '=?' exprBase )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==55) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:106:14: '=?' exprBase
                    {
                    string_literal90=(Token)match(input,55,FOLLOW_55_in_expression802);  
                    stream_55.add(string_literal90);

                    pushFollow(FOLLOW_exprBase_in_expression804);
                    exprBase91=exprBase();

                    state._fsp--;

                    stream_exprBase.add(exprBase91.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: exprBase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 106:30: -> ( exprBase )+
            {
                if ( !(stream_exprBase.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_exprBase.hasNext() ) {
                    adaptor.addChild(root_0, stream_exprBase.nextTree());

                }
                stream_exprBase.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class lexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lexpr"
    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:108:1: lexpr : ( exprBase lexpr )? -> ( exprBase )? ;
    public final WhileParser.lexpr_return lexpr() throws RecognitionException {
        WhileParser.lexpr_return retval = new WhileParser.lexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        WhileParser.exprBase_return exprBase92 = null;

        WhileParser.lexpr_return lexpr93 = null;


        RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
        RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
        try {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:109:2: ( ( exprBase lexpr )? -> ( exprBase )? )
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:109:4: ( exprBase lexpr )?
            {
            // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:109:4: ( exprBase lexpr )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=Variable && LA15_0<=Symbol)||(LA15_0>=48 && LA15_0<=49)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:109:5: exprBase lexpr
                    {
                    pushFollow(FOLLOW_exprBase_in_lexpr823);
                    exprBase92=exprBase();

                    state._fsp--;

                    stream_exprBase.add(exprBase92.getTree());
                    pushFollow(FOLLOW_lexpr_in_lexpr825);
                    lexpr93=lexpr();

                    state._fsp--;

                    stream_lexpr.add(lexpr93.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: exprBase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 109:22: -> ( exprBase )?
            {
                // C:\\Users\\erwan\\Documents\\Cours\\4-ESIR\\4A\\S7\\TLC\\TP\\Projet\\Projet_TLC\\Grammar\\While.g:109:25: ( exprBase )?
                if ( stream_exprBase.hasNext() ) {
                    adaptor.addChild(root_0, stream_exprBase.nextTree());

                }
                stream_exprBase.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lexpr"

    // Delegated rules


 

    public static final BitSet FOLLOW_function_in_program188 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_program_in_program190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_function210 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_Symbol_in_function212 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_function214 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_definition_in_function216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_definition240 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_input_in_definition242 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_definition244 = new BitSet(new long[]{0x0000645008000000L});
    public static final BitSet FOLLOW_commands_in_definition246 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_definition248 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_definition250 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_output_in_definition252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputSub_in_input271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_inputSub294 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_inputSub297 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_inputSub_in_inputSub299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_output321 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_output324 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_output_in_output326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_commands347 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_commands350 = new BitSet(new long[]{0x0000645008000000L});
    public static final BitSet FOLLOW_command_in_commands352 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_36_in_commandNop374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vars_in_commandEqual388 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_commandEqual390 = new BitSet(new long[]{0x0003000018000000L});
    public static final BitSet FOLLOW_exprs_in_commandEqual392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_commandIf414 = new BitSet(new long[]{0x0003000018000000L});
    public static final BitSet FOLLOW_expression_in_commandIf416 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_commandIf418 = new BitSet(new long[]{0x0000645008000000L});
    public static final BitSet FOLLOW_commands_in_commandIf422 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_40_in_commandIf425 = new BitSet(new long[]{0x0000645008000000L});
    public static final BitSet FOLLOW_commands_in_commandIf429 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_commandIf433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_commandWhile470 = new BitSet(new long[]{0x0003000018000000L});
    public static final BitSet FOLLOW_expression_in_commandWhile472 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_commandWhile474 = new BitSet(new long[]{0x0000645008000000L});
    public static final BitSet FOLLOW_commands_in_commandWhile476 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_commandWhile478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_commandFor498 = new BitSet(new long[]{0x0003000018000000L});
    public static final BitSet FOLLOW_expression_in_commandFor500 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_commandFor502 = new BitSet(new long[]{0x0000645008000000L});
    public static final BitSet FOLLOW_commands_in_commandFor504 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_commandFor506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_commandForeach526 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_Variable_in_commandForeach528 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_commandForeach530 = new BitSet(new long[]{0x0003000018000000L});
    public static final BitSet FOLLOW_expression_in_commandForeach532 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_commandForeach534 = new BitSet(new long[]{0x0000645008000000L});
    public static final BitSet FOLLOW_commands_in_commandForeach536 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_commandForeach538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandNop_in_command560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandEqual_in_command564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandIf_in_command568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandWhile_in_command572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandFor_in_command576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commandForeach_in_command580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_vars590 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_vars593 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_Variable_in_vars595 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_expression_in_exprs616 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_exprs619 = new BitSet(new long[]{0x0003000018000000L});
    public static final BitSet FOLLOW_expression_in_exprs621 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_48_in_exprBase1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Variable_in_exprBase1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Symbol_in_exprBase1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_exprBase2664 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_exprBase2666 = new BitSet(new long[]{0x000B000018000000L});
    public static final BitSet FOLLOW_lexpr_in_exprBase2668 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_exprBase2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_exprBase2683 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_exprBase2685 = new BitSet(new long[]{0x000B000018000000L});
    public static final BitSet FOLLOW_lexpr_in_exprBase2687 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_exprBase2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_exprBase3708 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_exprBase3710 = new BitSet(new long[]{0x0003000018000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase3712 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_exprBase3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_exprBase3726 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_exprBase3728 = new BitSet(new long[]{0x0003000018000000L});
    public static final BitSet FOLLOW_exprBase_in_exprBase3730 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_exprBase3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_exprBase4750 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_Symbol_in_exprBase4752 = new BitSet(new long[]{0x000B000018000000L});
    public static final BitSet FOLLOW_lexpr_in_exprBase4754 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_exprBase4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase1_in_exprBase777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase2_in_exprBase781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase3_in_exprBase785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase4_in_exprBase789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_expression799 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_expression802 = new BitSet(new long[]{0x0003000018000000L});
    public static final BitSet FOLLOW_exprBase_in_expression804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprBase_in_lexpr823 = new BitSet(new long[]{0x0003000018000000L});
    public static final BitSet FOLLOW_lexpr_in_lexpr825 = new BitSet(new long[]{0x0000000000000002L});

}