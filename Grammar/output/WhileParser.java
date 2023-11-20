// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g 2023-11-20 16:04:42

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class WhileParser extends Parser {
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


        public WhileParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public WhileParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return WhileParser.tokenNames; }
    public String getGrammarFileName() { return "/home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g"; }



    // $ANTLR start "program"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:9:1: program : function ( program )? ;
    public final void program() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:10:2: ( function ( program )? )
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:10:4: function ( program )?
            {
            pushFollow(FOLLOW_function_in_program77);
            function();

            state._fsp--;

            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:10:13: ( program )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==6) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:10:13: program
                    {
                    pushFollow(FOLLOW_program_in_program79);
                    program();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "function"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:12:1: function : 'function' Symbol ':' definition ;
    public final void function() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:13:2: ( 'function' Symbol ':' definition )
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:13:4: 'function' Symbol ':' definition
            {
            match(input,6,FOLLOW_6_in_function90); 
            match(input,Symbol,FOLLOW_Symbol_in_function92); 
            match(input,7,FOLLOW_7_in_function94); 
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
        return ;
    }
    // $ANTLR end "function"


    // $ANTLR start "definition"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:15:1: definition : 'read' input '%' commands '%' 'write' output ;
    public final void definition() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:16:2: ( 'read' input '%' commands '%' 'write' output )
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:16:4: 'read' input '%' commands '%' 'write' output
            {
            match(input,8,FOLLOW_8_in_definition106); 
            pushFollow(FOLLOW_input_in_definition108);
            input();

            state._fsp--;

            match(input,9,FOLLOW_9_in_definition110); 
            pushFollow(FOLLOW_commands_in_definition112);
            commands();

            state._fsp--;

            match(input,9,FOLLOW_9_in_definition114); 
            match(input,10,FOLLOW_10_in_definition116); 
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
        return ;
    }
    // $ANTLR end "definition"


    // $ANTLR start "input"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:18:1: input : ( inputSub | );
    public final void input() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:19:2: ( inputSub | )
            int alt2=2;
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

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:19:4: inputSub
                    {
                    pushFollow(FOLLOW_inputSub_in_input129);
                    inputSub();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:19:15: 
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
        return ;
    }
    // $ANTLR end "input"


    // $ANTLR start "inputSub"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:21:1: inputSub : Variable ( ',' inputSub )? ;
    public final void inputSub() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:22:2: ( Variable ( ',' inputSub )? )
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:22:4: Variable ( ',' inputSub )?
            {
            match(input,Variable,FOLLOW_Variable_in_inputSub142); 
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:22:13: ( ',' inputSub )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:22:14: ',' inputSub
                    {
                    match(input,11,FOLLOW_11_in_inputSub145); 
                    pushFollow(FOLLOW_inputSub_in_inputSub147);
                    inputSub();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "inputSub"


    // $ANTLR start "output"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:24:1: output : Variable ( ',' output )? ;
    public final void output() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:25:2: ( Variable ( ',' output )? )
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:25:4: Variable ( ',' output )?
            {
            match(input,Variable,FOLLOW_Variable_in_output160); 
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:25:13: ( ',' output )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:25:14: ',' output
                    {
                    match(input,11,FOLLOW_11_in_output163); 
                    pushFollow(FOLLOW_output_in_output165);
                    output();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "output"


    // $ANTLR start "commands"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:27:1: commands : command ( ';' commands )? ;
    public final void commands() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:28:2: ( command ( ';' commands )? )
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:28:4: command ( ';' commands )?
            {
            pushFollow(FOLLOW_command_in_commands177);
            command();

            state._fsp--;

            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:28:12: ( ';' commands )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:28:13: ';' commands
                    {
                    match(input,12,FOLLOW_12_in_commands180); 
                    pushFollow(FOLLOW_commands_in_commands182);
                    commands();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "commands"


    // $ANTLR start "commandNop"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:30:1: commandNop : 'nop' ;
    public final void commandNop() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:31:2: ( 'nop' )
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:31:4: 'nop'
            {
            match(input,13,FOLLOW_13_in_commandNop195); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "commandNop"


    // $ANTLR start "commandEqual"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:33:1: commandEqual : vars ':=' exprs ;
    public final void commandEqual() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:34:2: ( vars ':=' exprs )
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:34:4: vars ':=' exprs
            {
            pushFollow(FOLLOW_vars_in_commandEqual205);
            vars();

            state._fsp--;

            match(input,14,FOLLOW_14_in_commandEqual207); 
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
        return ;
    }
    // $ANTLR end "commandEqual"


    // $ANTLR start "commandIf"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:36:1: commandIf : 'if' expression 'then' commands ( 'else' commands )? 'fi' ;
    public final void commandIf() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:37:2: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:37:4: 'if' expression 'then' commands ( 'else' commands )? 'fi'
            {
            match(input,15,FOLLOW_15_in_commandIf219); 
            pushFollow(FOLLOW_expression_in_commandIf221);
            expression();

            state._fsp--;

            match(input,16,FOLLOW_16_in_commandIf223); 
            pushFollow(FOLLOW_commands_in_commandIf225);
            commands();

            state._fsp--;

            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:37:36: ( 'else' commands )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:37:37: 'else' commands
                    {
                    match(input,17,FOLLOW_17_in_commandIf228); 
                    pushFollow(FOLLOW_commands_in_commandIf230);
                    commands();

                    state._fsp--;


                    }
                    break;

            }

            match(input,18,FOLLOW_18_in_commandIf234); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "commandIf"


    // $ANTLR start "commandWhile"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:39:1: commandWhile : 'while' expression 'do' commands 'od' ;
    public final void commandWhile() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:40:2: ( 'while' expression 'do' commands 'od' )
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:40:4: 'while' expression 'do' commands 'od'
            {
            match(input,19,FOLLOW_19_in_commandWhile244); 
            pushFollow(FOLLOW_expression_in_commandWhile246);
            expression();

            state._fsp--;

            match(input,20,FOLLOW_20_in_commandWhile248); 
            pushFollow(FOLLOW_commands_in_commandWhile250);
            commands();

            state._fsp--;

            match(input,21,FOLLOW_21_in_commandWhile252); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "commandWhile"


    // $ANTLR start "commandFor"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:42:1: commandFor : 'for' expression 'do' commands 'od' ;
    public final void commandFor() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:43:2: ( 'for' expression 'do' commands 'od' )
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:43:4: 'for' expression 'do' commands 'od'
            {
            match(input,22,FOLLOW_22_in_commandFor262); 
            pushFollow(FOLLOW_expression_in_commandFor264);
            expression();

            state._fsp--;

            match(input,20,FOLLOW_20_in_commandFor266); 
            pushFollow(FOLLOW_commands_in_commandFor268);
            commands();

            state._fsp--;

            match(input,21,FOLLOW_21_in_commandFor270); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "commandFor"


    // $ANTLR start "commandForeach"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:45:1: commandForeach : 'foreach' Variable 'in' expression 'do' commands 'od' ;
    public final void commandForeach() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:46:2: ( 'foreach' Variable 'in' expression 'do' commands 'od' )
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:46:4: 'foreach' Variable 'in' expression 'do' commands 'od'
            {
            match(input,23,FOLLOW_23_in_commandForeach280); 
            match(input,Variable,FOLLOW_Variable_in_commandForeach282); 
            match(input,24,FOLLOW_24_in_commandForeach284); 
            pushFollow(FOLLOW_expression_in_commandForeach286);
            expression();

            state._fsp--;

            match(input,20,FOLLOW_20_in_commandForeach288); 
            pushFollow(FOLLOW_commands_in_commandForeach290);
            commands();

            state._fsp--;

            match(input,21,FOLLOW_21_in_commandForeach292); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "commandForeach"


    // $ANTLR start "command"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:48:1: command : ( commandNop | commandEqual | commandIf | commandWhile | commandFor | commandForeach );
    public final void command() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:49:2: ( commandNop | commandEqual | commandIf | commandWhile | commandFor | commandForeach )
            int alt7=6;
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

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:49:4: commandNop
                    {
                    pushFollow(FOLLOW_commandNop_in_command302);
                    commandNop();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:49:17: commandEqual
                    {
                    pushFollow(FOLLOW_commandEqual_in_command306);
                    commandEqual();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:49:32: commandIf
                    {
                    pushFollow(FOLLOW_commandIf_in_command310);
                    commandIf();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:49:44: commandWhile
                    {
                    pushFollow(FOLLOW_commandWhile_in_command314);
                    commandWhile();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:49:59: commandFor
                    {
                    pushFollow(FOLLOW_commandFor_in_command318);
                    commandFor();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:49:72: commandForeach
                    {
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
        return ;
    }
    // $ANTLR end "command"


    // $ANTLR start "vars"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:51:1: vars : Variable ( ',' vars )? ;
    public final void vars() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:52:2: ( Variable ( ',' vars )? )
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:52:4: Variable ( ',' vars )?
            {
            match(input,Variable,FOLLOW_Variable_in_vars332); 
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:52:13: ( ',' vars )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:52:14: ',' vars
                    {
                    match(input,11,FOLLOW_11_in_vars335); 
                    pushFollow(FOLLOW_vars_in_vars337);
                    vars();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "vars"


    // $ANTLR start "exprs"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:54:1: exprs : expression ( ',' exprs )? ;
    public final void exprs() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:55:2: ( expression ( ',' exprs )? )
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:55:4: expression ( ',' exprs )?
            {
            pushFollow(FOLLOW_expression_in_exprs349);
            expression();

            state._fsp--;

            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:55:15: ( ',' exprs )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:55:16: ',' exprs
                    {
                    match(input,11,FOLLOW_11_in_exprs352); 
                    pushFollow(FOLLOW_exprs_in_exprs354);
                    exprs();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "exprs"


    // $ANTLR start "exprBase1"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:57:1: exprBase1 : ( 'nil' | Variable | Symbol );
    public final void exprBase1() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:58:2: ( 'nil' | Variable | Symbol )
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:
            {
            if ( (input.LA(1)>=Variable && input.LA(1)<=Symbol)||input.LA(1)==25 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return ;
    }
    // $ANTLR end "exprBase1"


    // $ANTLR start "exprBase2"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:60:1: exprBase2 : ( '(' 'cons' lexpr ')' | '(' 'list' lexpr ')' );
    public final void exprBase2() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:61:2: ( '(' 'cons' lexpr ')' | '(' 'list' lexpr ')' )
            int alt10=2;
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

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:61:4: '(' 'cons' lexpr ')'
                    {
                    match(input,26,FOLLOW_26_in_exprBase2384); 
                    match(input,27,FOLLOW_27_in_exprBase2386); 
                    pushFollow(FOLLOW_lexpr_in_exprBase2388);
                    lexpr();

                    state._fsp--;

                    match(input,28,FOLLOW_28_in_exprBase2390); 

                    }
                    break;
                case 2 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:61:27: '(' 'list' lexpr ')'
                    {
                    match(input,26,FOLLOW_26_in_exprBase2394); 
                    match(input,29,FOLLOW_29_in_exprBase2396); 
                    pushFollow(FOLLOW_lexpr_in_exprBase2398);
                    lexpr();

                    state._fsp--;

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
        return ;
    }
    // $ANTLR end "exprBase2"


    // $ANTLR start "exprBase3"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:63:1: exprBase3 : ( '(' 'hd' exprBase ')' | '(' 'tl' exprBase ')' );
    public final void exprBase3() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:64:2: ( '(' 'hd' exprBase ')' | '(' 'tl' exprBase ')' )
            int alt11=2;
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
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:64:4: '(' 'hd' exprBase ')'
                    {
                    match(input,26,FOLLOW_26_in_exprBase3410); 
                    match(input,30,FOLLOW_30_in_exprBase3412); 
                    pushFollow(FOLLOW_exprBase_in_exprBase3414);
                    exprBase();

                    state._fsp--;

                    match(input,28,FOLLOW_28_in_exprBase3416); 

                    }
                    break;
                case 2 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:64:28: '(' 'tl' exprBase ')'
                    {
                    match(input,26,FOLLOW_26_in_exprBase3420); 
                    match(input,31,FOLLOW_31_in_exprBase3422); 
                    pushFollow(FOLLOW_exprBase_in_exprBase3424);
                    exprBase();

                    state._fsp--;

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
        return ;
    }
    // $ANTLR end "exprBase3"


    // $ANTLR start "exprBase4"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:66:1: exprBase4 : '(' Symbol lexpr ')' ;
    public final void exprBase4() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:67:2: ( '(' Symbol lexpr ')' )
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:67:4: '(' Symbol lexpr ')'
            {
            match(input,26,FOLLOW_26_in_exprBase4436); 
            match(input,Symbol,FOLLOW_Symbol_in_exprBase4438); 
            pushFollow(FOLLOW_lexpr_in_exprBase4440);
            lexpr();

            state._fsp--;

            match(input,28,FOLLOW_28_in_exprBase4442); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "exprBase4"


    // $ANTLR start "exprBase"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:69:1: exprBase : ( exprBase1 | exprBase2 | exprBase3 | exprBase4 );
    public final void exprBase() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:70:2: ( exprBase1 | exprBase2 | exprBase3 | exprBase4 )
            int alt12=4;
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
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:70:4: exprBase1
                    {
                    pushFollow(FOLLOW_exprBase1_in_exprBase452);
                    exprBase1();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:70:16: exprBase2
                    {
                    pushFollow(FOLLOW_exprBase2_in_exprBase456);
                    exprBase2();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:70:28: exprBase3
                    {
                    pushFollow(FOLLOW_exprBase3_in_exprBase460);
                    exprBase3();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:70:40: exprBase4
                    {
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
        return ;
    }
    // $ANTLR end "exprBase"


    // $ANTLR start "expression"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:72:1: expression : exprBase ( '=?' exprBase )? ;
    public final void expression() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:73:2: ( exprBase ( '=?' exprBase )? )
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:73:4: exprBase ( '=?' exprBase )?
            {
            pushFollow(FOLLOW_exprBase_in_expression474);
            exprBase();

            state._fsp--;

            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:73:13: ( '=?' exprBase )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:73:14: '=?' exprBase
                    {
                    match(input,32,FOLLOW_32_in_expression477); 
                    pushFollow(FOLLOW_exprBase_in_expression479);
                    exprBase();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expression"


    // $ANTLR start "lexpr"
    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:75:1: lexpr : ( exprBase lexpr | );
    public final void lexpr() throws RecognitionException {
        try {
            // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:76:2: ( exprBase lexpr | )
            int alt14=2;
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

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:76:4: exprBase lexpr
                    {
                    pushFollow(FOLLOW_exprBase_in_lexpr491);
                    exprBase();

                    state._fsp--;

                    pushFollow(FOLLOW_lexpr_in_lexpr493);
                    lexpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/rycam/Documents/TLC/Projet_TLC/Grammar/While.g:76:21: 
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