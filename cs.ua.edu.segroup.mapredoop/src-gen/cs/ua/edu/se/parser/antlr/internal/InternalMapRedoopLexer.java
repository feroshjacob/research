package cs.ua.edu.se.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMapRedoopLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=39;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=5;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T11=11;
    public static final int T37=37;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T34=34;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T36=36;
    public static final int T17=17;
    public static final int T35=35;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;
    public InternalMapRedoopLexer() {;} 
    public InternalMapRedoopLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:10:5: ( '{' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:10:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:11:5: ( '}' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:11:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:12:5: ( 'metaelements:' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:12:7: 'metaelements:'
            {
            match("metaelements:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:13:5: ( 'mapreduce:' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:13:7: 'mapreduce:'
            {
            match("mapreduce:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:14:5: ( 'loop' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:14:7: 'loop'
            {
            match("loop"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:15:5: ( 'program' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:15:7: 'program'
            {
            match("program"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:16:5: ( 'extend' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:16:7: 'extend'
            {
            match("extend"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:17:5: ( 'map' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:17:7: 'map'
            {
            match("map"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:18:5: ( '(' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:18:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:19:5: ( ',' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:19:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:20:5: ( ')' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:20:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:21:5: ( 'reduce' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:21:7: 'reduce'
            {
            match("reduce"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:22:5: ( 'int' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:22:7: 'int'
            {
            match("int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:23:5: ( 'float' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:23:7: 'float'
            {
            match("float"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:24:5: ( 'double' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:24:7: 'double'
            {
            match("double"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:25:5: ( 'text' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:25:7: 'text'
            {
            match("text"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:26:5: ( 'long' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:26:7: 'long'
            {
            match("long"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:27:5: ( 'metaelement' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:27:7: 'metaelement'
            {
            match("metaelement"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:28:5: ( ';' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:28:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:29:5: ( 'read' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:29:7: 'read'
            {
            match("read"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:30:5: ( 'write' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:30:7: 'write'
            {
            match("write"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:31:5: ( '*' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:31:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:32:5: ( '[' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:32:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:33:5: ( ']' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:33:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:34:5: ( ':' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:34:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:35:5: ( 'after' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:35:7: 'after'
            {
            match("after"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:36:5: ( 'call' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:36:7: 'call'
            {
            match("call"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:37:5: ( 'before' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:37:7: 'before'
            {
            match("before"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1659:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1659:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1659:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1659:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1659:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1661:10: ( ( '0' .. '9' )+ )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1661:12: ( '0' .. '9' )+
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1661:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1661:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1663:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1663:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1663:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1663:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1663:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1663:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1663:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1663:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1663:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1663:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1663:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1663:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1665:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1665:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1665:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1665:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1667:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1667:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1667:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1667:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1667:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1667:41: ( '\\r' )? '\\n'
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1667:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1667:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1669:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1669:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1669:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1671:16: ( . )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1671:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=35;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='{') ) {
            alt12=1;
        }
        else if ( (LA12_0=='}') ) {
            alt12=2;
        }
        else if ( (LA12_0=='m') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='t') ) {
                    int LA12_62 = input.LA(4);

                    if ( (LA12_62=='a') ) {
                        int LA12_78 = input.LA(5);

                        if ( (LA12_78=='e') ) {
                            int LA12_95 = input.LA(6);

                            if ( (LA12_95=='l') ) {
                                int LA12_110 = input.LA(7);

                                if ( (LA12_110=='e') ) {
                                    int LA12_120 = input.LA(8);

                                    if ( (LA12_120=='m') ) {
                                        int LA12_127 = input.LA(9);

                                        if ( (LA12_127=='e') ) {
                                            int LA12_130 = input.LA(10);

                                            if ( (LA12_130=='n') ) {
                                                int LA12_132 = input.LA(11);

                                                if ( (LA12_132=='t') ) {
                                                    switch ( input.LA(12) ) {
                                                    case 's':
                                                        {
                                                        int LA12_135 = input.LA(13);

                                                        if ( (LA12_135==':') ) {
                                                            alt12=3;
                                                        }
                                                        else {
                                                            alt12=29;}
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
                                                    case '8':
                                                    case '9':
                                                    case 'A':
                                                    case 'B':
                                                    case 'C':
                                                    case 'D':
                                                    case 'E':
                                                    case 'F':
                                                    case 'G':
                                                    case 'H':
                                                    case 'I':
                                                    case 'J':
                                                    case 'K':
                                                    case 'L':
                                                    case 'M':
                                                    case 'N':
                                                    case 'O':
                                                    case 'P':
                                                    case 'Q':
                                                    case 'R':
                                                    case 'S':
                                                    case 'T':
                                                    case 'U':
                                                    case 'V':
                                                    case 'W':
                                                    case 'X':
                                                    case 'Y':
                                                    case 'Z':
                                                    case '_':
                                                    case 'a':
                                                    case 'b':
                                                    case 'c':
                                                    case 'd':
                                                    case 'e':
                                                    case 'f':
                                                    case 'g':
                                                    case 'h':
                                                    case 'i':
                                                    case 'j':
                                                    case 'k':
                                                    case 'l':
                                                    case 'm':
                                                    case 'n':
                                                    case 'o':
                                                    case 'p':
                                                    case 'q':
                                                    case 'r':
                                                    case 't':
                                                    case 'u':
                                                    case 'v':
                                                    case 'w':
                                                    case 'x':
                                                    case 'y':
                                                    case 'z':
                                                        {
                                                        alt12=29;
                                                        }
                                                        break;
                                                    default:
                                                        alt12=18;}

                                                }
                                                else {
                                                    alt12=29;}
                                            }
                                            else {
                                                alt12=29;}
                                        }
                                        else {
                                            alt12=29;}
                                    }
                                    else {
                                        alt12=29;}
                                }
                                else {
                                    alt12=29;}
                            }
                            else {
                                alt12=29;}
                        }
                        else {
                            alt12=29;}
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
                }
                break;
            case 'a':
                {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='p') ) {
                    switch ( input.LA(4) ) {
                    case 'r':
                        {
                        int LA12_79 = input.LA(5);

                        if ( (LA12_79=='e') ) {
                            int LA12_96 = input.LA(6);

                            if ( (LA12_96=='d') ) {
                                int LA12_111 = input.LA(7);

                                if ( (LA12_111=='u') ) {
                                    int LA12_121 = input.LA(8);

                                    if ( (LA12_121=='c') ) {
                                        int LA12_128 = input.LA(9);

                                        if ( (LA12_128=='e') ) {
                                            int LA12_131 = input.LA(10);

                                            if ( (LA12_131==':') ) {
                                                alt12=4;
                                            }
                                            else {
                                                alt12=29;}
                                        }
                                        else {
                                            alt12=29;}
                                    }
                                    else {
                                        alt12=29;}
                                }
                                else {
                                    alt12=29;}
                            }
                            else {
                                alt12=29;}
                        }
                        else {
                            alt12=29;}
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
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt12=29;
                        }
                        break;
                    default:
                        alt12=8;}

                }
                else {
                    alt12=29;}
                }
                break;
            default:
                alt12=29;}

        }
        else if ( (LA12_0=='l') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='o') ) {
                switch ( input.LA(3) ) {
                case 'n':
                    {
                    int LA12_64 = input.LA(4);

                    if ( (LA12_64=='g') ) {
                        int LA12_81 = input.LA(5);

                        if ( ((LA12_81>='0' && LA12_81<='9')||(LA12_81>='A' && LA12_81<='Z')||LA12_81=='_'||(LA12_81>='a' && LA12_81<='z')) ) {
                            alt12=29;
                        }
                        else {
                            alt12=17;}
                    }
                    else {
                        alt12=29;}
                    }
                    break;
                case 'o':
                    {
                    int LA12_65 = input.LA(4);

                    if ( (LA12_65=='p') ) {
                        int LA12_82 = input.LA(5);

                        if ( ((LA12_82>='0' && LA12_82<='9')||(LA12_82>='A' && LA12_82<='Z')||LA12_82=='_'||(LA12_82>='a' && LA12_82<='z')) ) {
                            alt12=29;
                        }
                        else {
                            alt12=5;}
                    }
                    else {
                        alt12=29;}
                    }
                    break;
                default:
                    alt12=29;}

            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='p') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='r') ) {
                int LA12_38 = input.LA(3);

                if ( (LA12_38=='o') ) {
                    int LA12_66 = input.LA(4);

                    if ( (LA12_66=='g') ) {
                        int LA12_83 = input.LA(5);

                        if ( (LA12_83=='r') ) {
                            int LA12_99 = input.LA(6);

                            if ( (LA12_99=='a') ) {
                                int LA12_112 = input.LA(7);

                                if ( (LA12_112=='m') ) {
                                    int LA12_122 = input.LA(8);

                                    if ( ((LA12_122>='0' && LA12_122<='9')||(LA12_122>='A' && LA12_122<='Z')||LA12_122=='_'||(LA12_122>='a' && LA12_122<='z')) ) {
                                        alt12=29;
                                    }
                                    else {
                                        alt12=6;}
                                }
                                else {
                                    alt12=29;}
                            }
                            else {
                                alt12=29;}
                        }
                        else {
                            alt12=29;}
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='e') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='x') ) {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='t') ) {
                    int LA12_67 = input.LA(4);

                    if ( (LA12_67=='e') ) {
                        int LA12_84 = input.LA(5);

                        if ( (LA12_84=='n') ) {
                            int LA12_100 = input.LA(6);

                            if ( (LA12_100=='d') ) {
                                int LA12_113 = input.LA(7);

                                if ( ((LA12_113>='0' && LA12_113<='9')||(LA12_113>='A' && LA12_113<='Z')||LA12_113=='_'||(LA12_113>='a' && LA12_113<='z')) ) {
                                    alt12=29;
                                }
                                else {
                                    alt12=7;}
                            }
                            else {
                                alt12=29;}
                        }
                        else {
                            alt12=29;}
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='(') ) {
            alt12=9;
        }
        else if ( (LA12_0==',') ) {
            alt12=10;
        }
        else if ( (LA12_0==')') ) {
            alt12=11;
        }
        else if ( (LA12_0=='r') ) {
            int LA12_10 = input.LA(2);

            if ( (LA12_10=='e') ) {
                switch ( input.LA(3) ) {
                case 'a':
                    {
                    int LA12_68 = input.LA(4);

                    if ( (LA12_68=='d') ) {
                        int LA12_85 = input.LA(5);

                        if ( ((LA12_85>='0' && LA12_85<='9')||(LA12_85>='A' && LA12_85<='Z')||LA12_85=='_'||(LA12_85>='a' && LA12_85<='z')) ) {
                            alt12=29;
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=29;}
                    }
                    break;
                case 'd':
                    {
                    int LA12_69 = input.LA(4);

                    if ( (LA12_69=='u') ) {
                        int LA12_86 = input.LA(5);

                        if ( (LA12_86=='c') ) {
                            int LA12_102 = input.LA(6);

                            if ( (LA12_102=='e') ) {
                                int LA12_114 = input.LA(7);

                                if ( ((LA12_114>='0' && LA12_114<='9')||(LA12_114>='A' && LA12_114<='Z')||LA12_114=='_'||(LA12_114>='a' && LA12_114<='z')) ) {
                                    alt12=29;
                                }
                                else {
                                    alt12=12;}
                            }
                            else {
                                alt12=29;}
                        }
                        else {
                            alt12=29;}
                    }
                    else {
                        alt12=29;}
                    }
                    break;
                default:
                    alt12=29;}

            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='i') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='n') ) {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='t') ) {
                    int LA12_70 = input.LA(4);

                    if ( ((LA12_70>='0' && LA12_70<='9')||(LA12_70>='A' && LA12_70<='Z')||LA12_70=='_'||(LA12_70>='a' && LA12_70<='z')) ) {
                        alt12=29;
                    }
                    else {
                        alt12=13;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='f') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='l') ) {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='o') ) {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='a') ) {
                        int LA12_88 = input.LA(5);

                        if ( (LA12_88=='t') ) {
                            int LA12_103 = input.LA(6);

                            if ( ((LA12_103>='0' && LA12_103<='9')||(LA12_103>='A' && LA12_103<='Z')||LA12_103=='_'||(LA12_103>='a' && LA12_103<='z')) ) {
                                alt12=29;
                            }
                            else {
                                alt12=14;}
                        }
                        else {
                            alt12=29;}
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='d') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='o') ) {
                int LA12_46 = input.LA(3);

                if ( (LA12_46=='u') ) {
                    int LA12_72 = input.LA(4);

                    if ( (LA12_72=='b') ) {
                        int LA12_89 = input.LA(5);

                        if ( (LA12_89=='l') ) {
                            int LA12_104 = input.LA(6);

                            if ( (LA12_104=='e') ) {
                                int LA12_116 = input.LA(7);

                                if ( ((LA12_116>='0' && LA12_116<='9')||(LA12_116>='A' && LA12_116<='Z')||LA12_116=='_'||(LA12_116>='a' && LA12_116<='z')) ) {
                                    alt12=29;
                                }
                                else {
                                    alt12=15;}
                            }
                            else {
                                alt12=29;}
                        }
                        else {
                            alt12=29;}
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='t') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='e') ) {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='x') ) {
                    int LA12_73 = input.LA(4);

                    if ( (LA12_73=='t') ) {
                        int LA12_90 = input.LA(5);

                        if ( ((LA12_90>='0' && LA12_90<='9')||(LA12_90>='A' && LA12_90<='Z')||LA12_90=='_'||(LA12_90>='a' && LA12_90<='z')) ) {
                            alt12=29;
                        }
                        else {
                            alt12=16;}
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0==';') ) {
            alt12=19;
        }
        else if ( (LA12_0=='w') ) {
            int LA12_16 = input.LA(2);

            if ( (LA12_16=='r') ) {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='i') ) {
                    int LA12_74 = input.LA(4);

                    if ( (LA12_74=='t') ) {
                        int LA12_91 = input.LA(5);

                        if ( (LA12_91=='e') ) {
                            int LA12_106 = input.LA(6);

                            if ( ((LA12_106>='0' && LA12_106<='9')||(LA12_106>='A' && LA12_106<='Z')||LA12_106=='_'||(LA12_106>='a' && LA12_106<='z')) ) {
                                alt12=29;
                            }
                            else {
                                alt12=21;}
                        }
                        else {
                            alt12=29;}
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='*') ) {
            alt12=22;
        }
        else if ( (LA12_0=='[') ) {
            alt12=23;
        }
        else if ( (LA12_0==']') ) {
            alt12=24;
        }
        else if ( (LA12_0==':') ) {
            alt12=25;
        }
        else if ( (LA12_0=='a') ) {
            int LA12_21 = input.LA(2);

            if ( (LA12_21=='f') ) {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='t') ) {
                    int LA12_75 = input.LA(4);

                    if ( (LA12_75=='e') ) {
                        int LA12_92 = input.LA(5);

                        if ( (LA12_92=='r') ) {
                            int LA12_107 = input.LA(6);

                            if ( ((LA12_107>='0' && LA12_107<='9')||(LA12_107>='A' && LA12_107<='Z')||LA12_107=='_'||(LA12_107>='a' && LA12_107<='z')) ) {
                                alt12=29;
                            }
                            else {
                                alt12=26;}
                        }
                        else {
                            alt12=29;}
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='c') ) {
            int LA12_22 = input.LA(2);

            if ( (LA12_22=='a') ) {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='l') ) {
                    int LA12_76 = input.LA(4);

                    if ( (LA12_76=='l') ) {
                        int LA12_93 = input.LA(5);

                        if ( ((LA12_93>='0' && LA12_93<='9')||(LA12_93>='A' && LA12_93<='Z')||LA12_93=='_'||(LA12_93>='a' && LA12_93<='z')) ) {
                            alt12=29;
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='b') ) {
            int LA12_23 = input.LA(2);

            if ( (LA12_23=='e') ) {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='f') ) {
                    int LA12_77 = input.LA(4);

                    if ( (LA12_77=='o') ) {
                        int LA12_94 = input.LA(5);

                        if ( (LA12_94=='r') ) {
                            int LA12_109 = input.LA(6);

                            if ( (LA12_109=='e') ) {
                                int LA12_119 = input.LA(7);

                                if ( ((LA12_119>='0' && LA12_119<='9')||(LA12_119>='A' && LA12_119<='Z')||LA12_119=='_'||(LA12_119>='a' && LA12_119<='z')) ) {
                                    alt12=29;
                                }
                                else {
                                    alt12=28;}
                            }
                            else {
                                alt12=29;}
                        }
                        else {
                            alt12=29;}
                    }
                    else {
                        alt12=29;}
                }
                else {
                    alt12=29;}
            }
            else {
                alt12=29;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_24 = input.LA(2);

            if ( ((LA12_24>='A' && LA12_24<='Z')||LA12_24=='_'||(LA12_24>='a' && LA12_24<='z')) ) {
                alt12=29;
            }
            else {
                alt12=35;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='n' && LA12_0<='o')||LA12_0=='q'||LA12_0=='s'||(LA12_0>='u' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {
            alt12=29;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=30;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_27 = input.LA(2);

            if ( ((LA12_27>='\u0000' && LA12_27<='\uFFFE')) ) {
                alt12=31;
            }
            else {
                alt12=35;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_28 = input.LA(2);

            if ( ((LA12_28>='\u0000' && LA12_28<='\uFFFE')) ) {
                alt12=31;
            }
            else {
                alt12=35;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=33;
                }
                break;
            case '*':
                {
                alt12=32;
                }
                break;
            default:
                alt12=35;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=34;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||LA12_0=='+'||(LA12_0>='-' && LA12_0<='.')||(LA12_0>='<' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=35;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:122: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 30 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:130: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 31 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:139: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 32 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:151: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 33 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:167: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 34 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:183: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 35 :
                // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1:191: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}