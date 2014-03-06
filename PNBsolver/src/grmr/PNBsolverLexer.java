// $ANTLR 3.4 src/grmr/PNBsolver.g 2012-04-29 18:05:45
package grmr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class PNBsolverLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int COMMENT=4;
    public static final int EscapeSequence=5;
    public static final int HexDigit=6;
    public static final int IDENTIFIER=7;
    public static final int INTO=8;
    public static final int LETTER=9;
    public static final int LINE_COMMAND=10;
    public static final int LINE_COMMENT=11;
    public static final int NUMBER=12;
    public static final int OctalEscape=13;
    public static final int STRING=14;
    public static final int UnicodeEscape=15;
    public static final int WS=16;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public PNBsolverLexer() {} 
    public PNBsolverLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PNBsolverLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "src/grmr/PNBsolver.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:4:7: ( '(' )
            // src/grmr/PNBsolver.g:4:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:5:7: ( ')' )
            // src/grmr/PNBsolver.g:5:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:6:7: ( '*' )
            // src/grmr/PNBsolver.g:6:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:7:7: ( '+' )
            // src/grmr/PNBsolver.g:7:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:8:7: ( ',' )
            // src/grmr/PNBsolver.g:8:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:9:7: ( '-' )
            // src/grmr/PNBsolver.g:9:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:10:7: ( '.' )
            // src/grmr/PNBsolver.g:10:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:11:7: ( '/' )
            // src/grmr/PNBsolver.g:11:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:12:7: ( '=' )
            // src/grmr/PNBsolver.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:13:7: ( 'ACCURATE' )
            // src/grmr/PNBsolver.g:13:9: 'ACCURATE'
            {
            match("ACCURATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:14:7: ( 'AVERAGE' )
            // src/grmr/PNBsolver.g:14:9: 'AVERAGE'
            {
            match("AVERAGE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:15:7: ( 'CUDA' )
            // src/grmr/PNBsolver.g:15:9: 'CUDA'
            {
            match("CUDA"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:16:7: ( 'FAST' )
            // src/grmr/PNBsolver.g:16:9: 'FAST'
            {
            match("FAST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:17:7: ( 'MPI' )
            // src/grmr/PNBsolver.g:17:9: 'MPI'
            {
            match("MPI"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:18:7: ( 'OCL' )
            // src/grmr/PNBsolver.g:18:9: 'OCL'
            {
            match("OCL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:19:7: ( 'OMP' )
            // src/grmr/PNBsolver.g:19:9: 'OMP'
            {
            match("OMP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:20:7: ( 'SUM' )
            // src/grmr/PNBsolver.g:20:9: 'SUM'
            {
            match("SUM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:21:7: ( '[' )
            // src/grmr/PNBsolver.g:21:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:22:7: ( ']' )
            // src/grmr/PNBsolver.g:22:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:23:7: ( 'constant' )
            // src/grmr/PNBsolver.g:23:9: 'constant'
            {
            match("constant"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:24:7: ( 'endkernel' )
            // src/grmr/PNBsolver.g:24:9: 'endkernel'
            {
            match("endkernel"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:25:7: ( 'exp' )
            // src/grmr/PNBsolver.g:25:9: 'exp'
            {
            match("exp"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:26:7: ( 'generate' )
            // src/grmr/PNBsolver.g:26:9: 'generate'
            {
            match("generate"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:27:7: ( 'in' )
            // src/grmr/PNBsolver.g:27:9: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:28:7: ( 'kernel' )
            // src/grmr/PNBsolver.g:28:9: 'kernel'
            {
            match("kernel"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:29:7: ( 'pow' )
            // src/grmr/PNBsolver.g:29:9: 'pow'
            {
            match("pow"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:30:7: ( 'read' )
            // src/grmr/PNBsolver.g:30:9: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:31:7: ( 'scalar' )
            // src/grmr/PNBsolver.g:31:9: 'scalar'
            {
            match("scalar"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:32:7: ( 'vector' )
            // src/grmr/PNBsolver.g:32:9: 'vector'
            {
            match("vector"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:33:7: ( 'write' )
            // src/grmr/PNBsolver.g:33:9: 'write'
            {
            match("write"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:125:2: ( ( '0' .. '9' )+ )
            // src/grmr/PNBsolver.g:125:4: ( '0' .. '9' )+
            {
            // src/grmr/PNBsolver.g:125:4: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/grmr/PNBsolver.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:129:2: ( LETTER ( LETTER | '0' .. '9' )* )
            // src/grmr/PNBsolver.g:129:4: LETTER ( LETTER | '0' .. '9' )*
            {
            mLETTER(); 


            // src/grmr/PNBsolver.g:129:11: ( LETTER | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='$'||(LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/grmr/PNBsolver.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:133:2: ( '<-' )
            // src/grmr/PNBsolver.g:133:4: '<-'
            {
            match("<-"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:136:5: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
            // src/grmr/PNBsolver.g:136:8: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // src/grmr/PNBsolver.g:136:12: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '!')||(LA3_0 >= '#' && LA3_0 <= '[')||(LA3_0 >= ']' && LA3_0 <= '\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // src/grmr/PNBsolver.g:136:14: EscapeSequence
            	    {
            	    mEscapeSequence(); 


            	    }
            	    break;
            	case 2 :
            	    // src/grmr/PNBsolver.g:136:31: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // src/grmr/PNBsolver.g:141:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt4=1;
                    }
                    break;
                case 'u':
                    {
                    alt4=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // src/grmr/PNBsolver.g:141:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // src/grmr/PNBsolver.g:142:9: UnicodeEscape
                    {
                    mUnicodeEscape(); 


                    }
                    break;
                case 3 :
                    // src/grmr/PNBsolver.g:143:9: OctalEscape
                    {
                    mOctalEscape(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "OctalEscape"
    public final void mOctalEscape() throws RecognitionException {
        try {
            // src/grmr/PNBsolver.g:148:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\\') ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1 >= '0' && LA5_1 <= '3')) ) {
                    int LA5_2 = input.LA(3);

                    if ( ((LA5_2 >= '0' && LA5_2 <= '7')) ) {
                        int LA5_4 = input.LA(4);

                        if ( ((LA5_4 >= '0' && LA5_4 <= '7')) ) {
                            alt5=1;
                        }
                        else {
                            alt5=2;
                        }
                    }
                    else {
                        alt5=3;
                    }
                }
                else if ( ((LA5_1 >= '4' && LA5_1 <= '7')) ) {
                    int LA5_3 = input.LA(3);

                    if ( ((LA5_3 >= '0' && LA5_3 <= '7')) ) {
                        alt5=2;
                    }
                    else {
                        alt5=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // src/grmr/PNBsolver.g:148:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // src/grmr/PNBsolver.g:149:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // src/grmr/PNBsolver.g:150:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OctalEscape"

    // $ANTLR start "UnicodeEscape"
    public final void mUnicodeEscape() throws RecognitionException {
        try {
            // src/grmr/PNBsolver.g:155:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // src/grmr/PNBsolver.g:155:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('\\'); 

            match('u'); 

            mHexDigit(); 


            mHexDigit(); 


            mHexDigit(); 


            mHexDigit(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UnicodeEscape"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // src/grmr/PNBsolver.g:159:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // src/grmr/PNBsolver.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // src/grmr/PNBsolver.g:163:2: ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' )
            // src/grmr/PNBsolver.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:168:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // src/grmr/PNBsolver.g:168:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:172:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // src/grmr/PNBsolver.g:172:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // src/grmr/PNBsolver.g:172:14: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // src/grmr/PNBsolver.g:172:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match("*/"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:176:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // src/grmr/PNBsolver.g:176:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // src/grmr/PNBsolver.g:176:12: (~ ( '\\n' | '\\r' ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // src/grmr/PNBsolver.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // src/grmr/PNBsolver.g:176:26: ( '\\r' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // src/grmr/PNBsolver.g:176:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "LINE_COMMAND"
    public final void mLINE_COMMAND() throws RecognitionException {
        try {
            int _type = LINE_COMMAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grmr/PNBsolver.g:181:5: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // src/grmr/PNBsolver.g:181:7: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match('#'); 

            // src/grmr/PNBsolver.g:181:11: (~ ( '\\n' | '\\r' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // src/grmr/PNBsolver.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // src/grmr/PNBsolver.g:181:25: ( '\\r' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // src/grmr/PNBsolver.g:181:25: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMAND"

    public void mTokens() throws RecognitionException {
        // src/grmr/PNBsolver.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | NUMBER | IDENTIFIER | INTO | STRING | WS | COMMENT | LINE_COMMENT | LINE_COMMAND )
        int alt11=38;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // src/grmr/PNBsolver.g:1:10: T__17
                {
                mT__17(); 


                }
                break;
            case 2 :
                // src/grmr/PNBsolver.g:1:16: T__18
                {
                mT__18(); 


                }
                break;
            case 3 :
                // src/grmr/PNBsolver.g:1:22: T__19
                {
                mT__19(); 


                }
                break;
            case 4 :
                // src/grmr/PNBsolver.g:1:28: T__20
                {
                mT__20(); 


                }
                break;
            case 5 :
                // src/grmr/PNBsolver.g:1:34: T__21
                {
                mT__21(); 


                }
                break;
            case 6 :
                // src/grmr/PNBsolver.g:1:40: T__22
                {
                mT__22(); 


                }
                break;
            case 7 :
                // src/grmr/PNBsolver.g:1:46: T__23
                {
                mT__23(); 


                }
                break;
            case 8 :
                // src/grmr/PNBsolver.g:1:52: T__24
                {
                mT__24(); 


                }
                break;
            case 9 :
                // src/grmr/PNBsolver.g:1:58: T__25
                {
                mT__25(); 


                }
                break;
            case 10 :
                // src/grmr/PNBsolver.g:1:64: T__26
                {
                mT__26(); 


                }
                break;
            case 11 :
                // src/grmr/PNBsolver.g:1:70: T__27
                {
                mT__27(); 


                }
                break;
            case 12 :
                // src/grmr/PNBsolver.g:1:76: T__28
                {
                mT__28(); 


                }
                break;
            case 13 :
                // src/grmr/PNBsolver.g:1:82: T__29
                {
                mT__29(); 


                }
                break;
            case 14 :
                // src/grmr/PNBsolver.g:1:88: T__30
                {
                mT__30(); 


                }
                break;
            case 15 :
                // src/grmr/PNBsolver.g:1:94: T__31
                {
                mT__31(); 


                }
                break;
            case 16 :
                // src/grmr/PNBsolver.g:1:100: T__32
                {
                mT__32(); 


                }
                break;
            case 17 :
                // src/grmr/PNBsolver.g:1:106: T__33
                {
                mT__33(); 


                }
                break;
            case 18 :
                // src/grmr/PNBsolver.g:1:112: T__34
                {
                mT__34(); 


                }
                break;
            case 19 :
                // src/grmr/PNBsolver.g:1:118: T__35
                {
                mT__35(); 


                }
                break;
            case 20 :
                // src/grmr/PNBsolver.g:1:124: T__36
                {
                mT__36(); 


                }
                break;
            case 21 :
                // src/grmr/PNBsolver.g:1:130: T__37
                {
                mT__37(); 


                }
                break;
            case 22 :
                // src/grmr/PNBsolver.g:1:136: T__38
                {
                mT__38(); 


                }
                break;
            case 23 :
                // src/grmr/PNBsolver.g:1:142: T__39
                {
                mT__39(); 


                }
                break;
            case 24 :
                // src/grmr/PNBsolver.g:1:148: T__40
                {
                mT__40(); 


                }
                break;
            case 25 :
                // src/grmr/PNBsolver.g:1:154: T__41
                {
                mT__41(); 


                }
                break;
            case 26 :
                // src/grmr/PNBsolver.g:1:160: T__42
                {
                mT__42(); 


                }
                break;
            case 27 :
                // src/grmr/PNBsolver.g:1:166: T__43
                {
                mT__43(); 


                }
                break;
            case 28 :
                // src/grmr/PNBsolver.g:1:172: T__44
                {
                mT__44(); 


                }
                break;
            case 29 :
                // src/grmr/PNBsolver.g:1:178: T__45
                {
                mT__45(); 


                }
                break;
            case 30 :
                // src/grmr/PNBsolver.g:1:184: T__46
                {
                mT__46(); 


                }
                break;
            case 31 :
                // src/grmr/PNBsolver.g:1:190: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 32 :
                // src/grmr/PNBsolver.g:1:197: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 33 :
                // src/grmr/PNBsolver.g:1:208: INTO
                {
                mINTO(); 


                }
                break;
            case 34 :
                // src/grmr/PNBsolver.g:1:213: STRING
                {
                mSTRING(); 


                }
                break;
            case 35 :
                // src/grmr/PNBsolver.g:1:220: WS
                {
                mWS(); 


                }
                break;
            case 36 :
                // src/grmr/PNBsolver.g:1:223: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 37 :
                // src/grmr/PNBsolver.g:1:231: LINE_COMMENT
                {
                mLINE_COMMENT(); 


                }
                break;
            case 38 :
                // src/grmr/PNBsolver.g:1:244: LINE_COMMAND
                {
                mLINE_COMMAND(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\10\uffff\1\44\1\uffff\6\35\2\uffff\12\35\11\uffff\14\35\1\104\12"+
        "\35\1\117\1\120\1\121\1\122\2\35\1\125\1\35\1\uffff\1\35\1\130\6"+
        "\35\1\137\1\140\4\uffff\2\35\1\uffff\2\35\1\uffff\1\145\5\35\2\uffff"+
        "\4\35\1\uffff\2\35\1\161\5\35\1\167\1\170\1\171\1\uffff\1\35\1\173"+
        "\3\35\3\uffff\1\177\1\uffff\1\u0080\1\35\1\u0082\2\uffff\1\u0083"+
        "\2\uffff";
    static final String DFA11_eofS =
        "\u0084\uffff";
    static final String DFA11_minS =
        "\1\11\7\uffff\1\52\1\uffff\1\103\1\125\1\101\1\120\1\103\1\125\2"+
        "\uffff\1\157\1\156\1\145\1\156\1\145\1\157\1\145\1\143\1\145\1\162"+
        "\11\uffff\1\103\1\105\1\104\1\123\1\111\1\114\1\120\1\115\1\156"+
        "\1\144\1\160\1\156\1\44\1\162\1\167\2\141\1\143\1\151\1\125\1\122"+
        "\1\101\1\124\4\44\1\163\1\153\1\44\1\145\1\uffff\1\156\1\44\1\144"+
        "\1\154\2\164\1\122\1\101\2\44\4\uffff\1\164\1\145\1\uffff\1\162"+
        "\1\145\1\uffff\1\44\1\141\1\157\1\145\1\101\1\107\2\uffff\1\141"+
        "\1\162\1\141\1\154\1\uffff\2\162\1\44\1\124\1\105\2\156\1\164\3"+
        "\44\1\uffff\1\105\1\44\1\164\2\145\3\uffff\1\44\1\uffff\1\44\1\154"+
        "\1\44\2\uffff\1\44\2\uffff";
    static final String DFA11_maxS =
        "\1\172\7\uffff\1\57\1\uffff\1\126\1\125\1\101\1\120\1\115\1\125"+
        "\2\uffff\1\157\1\170\1\145\1\156\1\145\1\157\1\145\1\143\1\145\1"+
        "\162\11\uffff\1\103\1\105\1\104\1\123\1\111\1\114\1\120\1\115\1"+
        "\156\1\144\1\160\1\156\1\172\1\162\1\167\2\141\1\143\1\151\1\125"+
        "\1\122\1\101\1\124\4\172\1\163\1\153\1\172\1\145\1\uffff\1\156\1"+
        "\172\1\144\1\154\2\164\1\122\1\101\2\172\4\uffff\1\164\1\145\1\uffff"+
        "\1\162\1\145\1\uffff\1\172\1\141\1\157\1\145\1\101\1\107\2\uffff"+
        "\1\141\1\162\1\141\1\154\1\uffff\2\162\1\172\1\124\1\105\2\156\1"+
        "\164\3\172\1\uffff\1\105\1\172\1\164\2\145\3\uffff\1\172\1\uffff"+
        "\1\172\1\154\1\172\2\uffff\1\172\2\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\6\uffff\1\22\1"+
        "\23\12\uffff\1\37\1\40\1\41\1\42\1\43\1\46\1\44\1\45\1\10\37\uffff"+
        "\1\30\12\uffff\1\16\1\17\1\20\1\21\2\uffff\1\26\2\uffff\1\32\6\uffff"+
        "\1\14\1\15\4\uffff\1\33\13\uffff\1\36\5\uffff\1\31\1\34\1\35\1\uffff"+
        "\1\13\3\uffff\1\12\1\24\1\uffff\1\27\1\25";
    static final String DFA11_specialS =
        "\u0084\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\40\1\uffff\2\40\22\uffff\1\40\1\uffff\1\37\1\41\1\35\3\uffff"+
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\12\34\2\uffff\1\36\1\11\3"+
            "\uffff\1\12\1\35\1\13\2\35\1\14\6\35\1\15\1\35\1\16\3\35\1\17"+
            "\7\35\1\20\1\uffff\1\21\1\uffff\1\35\1\uffff\2\35\1\22\1\35"+
            "\1\23\1\35\1\24\1\35\1\25\1\35\1\26\4\35\1\27\1\35\1\30\1\31"+
            "\2\35\1\32\1\33\3\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42\4\uffff\1\43",
            "",
            "\1\45\22\uffff\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52\11\uffff\1\53",
            "\1\54",
            "",
            "",
            "\1\55",
            "\1\56\11\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\123",
            "\1\124",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\126",
            "",
            "\1\127",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "",
            "",
            "",
            "",
            "\1\141",
            "\1\142",
            "",
            "\1\143",
            "\1\144",
            "",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "",
            "\1\172",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "",
            "",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "\1\u0081",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "",
            "",
            "\1\35\13\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32"+
            "\35",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | NUMBER | IDENTIFIER | INTO | STRING | WS | COMMENT | LINE_COMMENT | LINE_COMMAND );";
        }
    }
 

}