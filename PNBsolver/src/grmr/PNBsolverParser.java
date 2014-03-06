// $ANTLR 3.4 src/grmr/PNBsolver.g 2012-04-29 18:05:44

package grmr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class PNBsolverParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "EscapeSequence", "HexDigit", "IDENTIFIER", "INTO", "LETTER", "LINE_COMMAND", "LINE_COMMENT", "NUMBER", "OctalEscape", "STRING", "UnicodeEscape", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'='", "'ACCURATE'", "'AVERAGE'", "'CUDA'", "'FAST'", "'MPI'", "'OCL'", "'OMP'", "'SUM'", "'['", "']'", "'constant'", "'endkernel'", "'exp'", "'generate'", "'in'", "'kernel'", "'pow'", "'read'", "'scalar'", "'vector'", "'write'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public PNBsolverParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public PNBsolverParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[44+1];
         

    }

    public String[] getTokenNames() { return PNBsolverParser.tokenNames; }
    public String getGrammarFileName() { return "src/grmr/PNBsolver.g"; }



    // $ANTLR start "content"
    // src/grmr/PNBsolver.g:12:1: content returns [ Content cont] : l_decls= kernels vrs= execute '.' EOF ;
    public final Content content() throws RecognitionException {
        Content cont = null;

        int content_StartIndex = input.index();

        List<Kernel> l_decls =null;

        Execution vrs =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return cont; }

            // src/grmr/PNBsolver.g:13:5: (l_decls= kernels vrs= execute '.' EOF )
            // src/grmr/PNBsolver.g:13:8: l_decls= kernels vrs= execute '.' EOF
            {
            pushFollow(FOLLOW_kernels_in_content69);
            l_decls=kernels();

            state._fsp--;
            if (state.failed) return cont;

            pushFollow(FOLLOW_execute_in_content74);
            vrs=execute();

            state._fsp--;
            if (state.failed) return cont;

            match(input,23,FOLLOW_23_in_content76); if (state.failed) return cont;

            match(input,EOF,FOLLOW_EOF_in_content78); if (state.failed) return cont;

            if ( state.backtracking==0 ) {cont = new Content(l_decls,vrs);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, content_StartIndex); }

        }
        return cont;
    }
    // $ANTLR end "content"



    // $ANTLR start "kernels"
    // src/grmr/PNBsolver.g:17:1: kernels returns [ List<Kernel> listofkernels] : ( 'kernel' nf= IDENTIFIER 'in' id2= IDENTIFIER decls= declarations stmts= readstmts stmt= expressionstmt wstmts= writestmts 'endkernel' )+ ;
    public final List<Kernel> kernels() throws RecognitionException {
        List<Kernel> listofkernels = null;

        int kernels_StartIndex = input.index();

        Token nf=null;
        Token id2=null;
        List<Statement> decls =null;

        List<Statement> stmts =null;

        Statement stmt =null;

        List<Statement> wstmts =null;



            	listofkernels = new ArrayList<Kernel>();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return listofkernels; }

            // src/grmr/PNBsolver.g:22:5: ( ( 'kernel' nf= IDENTIFIER 'in' id2= IDENTIFIER decls= declarations stmts= readstmts stmt= expressionstmt wstmts= writestmts 'endkernel' )+ )
            // src/grmr/PNBsolver.g:22:7: ( 'kernel' nf= IDENTIFIER 'in' id2= IDENTIFIER decls= declarations stmts= readstmts stmt= expressionstmt wstmts= writestmts 'endkernel' )+
            {
            // src/grmr/PNBsolver.g:22:7: ( 'kernel' nf= IDENTIFIER 'in' id2= IDENTIFIER decls= declarations stmts= readstmts stmt= expressionstmt wstmts= writestmts 'endkernel' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==41) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/grmr/PNBsolver.g:22:8: 'kernel' nf= IDENTIFIER 'in' id2= IDENTIFIER decls= declarations stmts= readstmts stmt= expressionstmt wstmts= writestmts 'endkernel'
            	    {
            	    match(input,41,FOLLOW_41_in_kernels116); if (state.failed) return listofkernels;

            	    nf=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_kernels121); if (state.failed) return listofkernels;

            	    match(input,40,FOLLOW_40_in_kernels123); if (state.failed) return listofkernels;

            	    id2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_kernels127); if (state.failed) return listofkernels;

            	    pushFollow(FOLLOW_declarations_in_kernels131);
            	    decls=declarations();

            	    state._fsp--;
            	    if (state.failed) return listofkernels;

            	    pushFollow(FOLLOW_readstmts_in_kernels135);
            	    stmts=readstmts();

            	    state._fsp--;
            	    if (state.failed) return listofkernels;

            	    pushFollow(FOLLOW_expressionstmt_in_kernels139);
            	    stmt=expressionstmt();

            	    state._fsp--;
            	    if (state.failed) return listofkernels;

            	    pushFollow(FOLLOW_writestmts_in_kernels143);
            	    wstmts=writestmts();

            	    state._fsp--;
            	    if (state.failed) return listofkernels;

            	    match(input,37,FOLLOW_37_in_kernels145); if (state.failed) return listofkernels;

            	    if ( state.backtracking==0 ) {listofkernels.add(new Kernel((nf!=null?nf.getText():null),stmts,stmt,decls));}

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return listofkernels;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, kernels_StartIndex); }

        }
        return listofkernels;
    }
    // $ANTLR end "kernels"



    // $ANTLR start "declarations"
    // src/grmr/PNBsolver.g:26:1: declarations returns [ List<Statement> stmts] : (op= vectorscalarnumber vars= variables )+ ;
    public final List<Statement> declarations() throws RecognitionException {
        List<Statement> stmts = null;

        int declarations_StartIndex = input.index();

        int op =0;

        List<String> vars =null;



            	stmts = new ArrayList<Statement>();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return stmts; }

            // src/grmr/PNBsolver.g:31:5: ( (op= vectorscalarnumber vars= variables )+ )
            // src/grmr/PNBsolver.g:31:7: (op= vectorscalarnumber vars= variables )+
            {
            // src/grmr/PNBsolver.g:31:7: (op= vectorscalarnumber vars= variables )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==36||(LA2_0 >= 44 && LA2_0 <= 45)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/grmr/PNBsolver.g:31:8: op= vectorscalarnumber vars= variables
            	    {
            	    pushFollow(FOLLOW_vectorscalarnumber_in_declarations186);
            	    op=vectorscalarnumber();

            	    state._fsp--;
            	    if (state.failed) return stmts;

            	    pushFollow(FOLLOW_variables_in_declarations190);
            	    vars=variables();

            	    state._fsp--;
            	    if (state.failed) return stmts;

            	    if ( state.backtracking==0 ) {Statement stmt= new Statement(op,vars);stmts.add(stmt);}

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return stmts;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, declarations_StartIndex); }

        }
        return stmts;
    }
    // $ANTLR end "declarations"



    // $ANTLR start "expressionstmt"
    // src/grmr/PNBsolver.g:34:1: expressionstmt returns [ Statement stmt] : id1= IDENTIFIER '=' (expr1= expression )? 'SUM' expr2= expression ;
    public final Statement expressionstmt() throws RecognitionException {
        Statement stmt = null;

        int expressionstmt_StartIndex = input.index();

        Token id1=null;
        Expression expr1 =null;

        Expression expr2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return stmt; }

            // src/grmr/PNBsolver.g:35:5: (id1= IDENTIFIER '=' (expr1= expression )? 'SUM' expr2= expression )
            // src/grmr/PNBsolver.g:35:7: id1= IDENTIFIER '=' (expr1= expression )? 'SUM' expr2= expression
            {
            id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expressionstmt229); if (state.failed) return stmt;

            match(input,25,FOLLOW_25_in_expressionstmt231); if (state.failed) return stmt;

            // src/grmr/PNBsolver.g:35:26: (expr1= expression )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENTIFIER||LA3_0==17||LA3_0==38||LA3_0==42) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // src/grmr/PNBsolver.g:35:27: expr1= expression
                    {
                    pushFollow(FOLLOW_expression_in_expressionstmt236);
                    expr1=expression();

                    state._fsp--;
                    if (state.failed) return stmt;

                    }
                    break;

            }


            match(input,33,FOLLOW_33_in_expressionstmt240); if (state.failed) return stmt;

            pushFollow(FOLLOW_expression_in_expressionstmt244);
            expr2=expression();

            state._fsp--;
            if (state.failed) return stmt;

            if ( state.backtracking==0 ) {stmt= new Statement((id1!=null?id1.getText():null),expr1,expr2);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, expressionstmt_StartIndex); }

        }
        return stmt;
    }
    // $ANTLR end "expressionstmt"



    // $ANTLR start "expression"
    // src/grmr/PNBsolver.g:38:1: expression returns [Expression value] : e1= multidiv ( '+' e2= multidiv | '-' e2= multidiv )* ;
    public final Expression expression() throws RecognitionException {
        Expression value = null;

        int expression_StartIndex = input.index();

        Expression e1 =null;

        Expression e2 =null;



                 List<Expression> exprlist = new ArrayList<Expression>();
                 List<String> opslist = new ArrayList<String>();         
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return value; }

            // src/grmr/PNBsolver.g:44:5: (e1= multidiv ( '+' e2= multidiv | '-' e2= multidiv )* )
            // src/grmr/PNBsolver.g:44:9: e1= multidiv ( '+' e2= multidiv | '-' e2= multidiv )*
            {
            pushFollow(FOLLOW_multidiv_in_expression280);
            e1=multidiv();

            state._fsp--;
            if (state.failed) return value;

            // src/grmr/PNBsolver.g:45:9: ( '+' e2= multidiv | '-' e2= multidiv )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    int LA4_7 = input.LA(2);

                    if ( (synpred4_PNBsolver()) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==22) ) {
                    int LA4_8 = input.LA(2);

                    if ( (synpred5_PNBsolver()) ) {
                        alt4=2;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // src/grmr/PNBsolver.g:45:13: '+' e2= multidiv
            	    {
            	    match(input,20,FOLLOW_20_in_expression295); if (state.failed) return value;

            	    pushFollow(FOLLOW_multidiv_in_expression299);
            	    e2=multidiv();

            	    state._fsp--;
            	    if (state.failed) return value;

            	    if ( state.backtracking==0 ) {exprlist.add(e2);opslist.add("+");}

            	    }
            	    break;
            	case 2 :
            	    // src/grmr/PNBsolver.g:46:13: '-' e2= multidiv
            	    {
            	    match(input,22,FOLLOW_22_in_expression315); if (state.failed) return value;

            	    pushFollow(FOLLOW_multidiv_in_expression319);
            	    e2=multidiv();

            	    state._fsp--;
            	    if (state.failed) return value;

            	    if ( state.backtracking==0 ) {exprlist.add(e2);opslist.add("-");}

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            if ( state.backtracking==0 ) {if(exprlist.size()<1)value =e1; else value = new Expression(e1,exprlist,opslist); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, expression_StartIndex); }

        }
        return value;
    }
    // $ANTLR end "expression"



    // $ANTLR start "multidiv"
    // src/grmr/PNBsolver.g:50:1: multidiv returns [Expression value] : e1= atom ( '*' e2= atom | '/' e2= atom )* ;
    public final Expression multidiv() throws RecognitionException {
        Expression value = null;

        int multidiv_StartIndex = input.index();

        Expression e1 =null;

        Expression e2 =null;



                 List<Expression> exprlist = new ArrayList<Expression>();
                 List<String> opslist = new ArrayList<String>();         
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return value; }

            // src/grmr/PNBsolver.g:56:5: (e1= atom ( '*' e2= atom | '/' e2= atom )* )
            // src/grmr/PNBsolver.g:56:9: e1= atom ( '*' e2= atom | '/' e2= atom )*
            {
            pushFollow(FOLLOW_atom_in_multidiv368);
            e1=atom();

            state._fsp--;
            if (state.failed) return value;

            // src/grmr/PNBsolver.g:57:5: ( '*' e2= atom | '/' e2= atom )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    int LA5_7 = input.LA(2);

                    if ( (synpred6_PNBsolver()) ) {
                        alt5=1;
                    }


                }
                else if ( (LA5_0==24) ) {
                    int LA5_8 = input.LA(2);

                    if ( (synpred7_PNBsolver()) ) {
                        alt5=2;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // src/grmr/PNBsolver.g:57:6: '*' e2= atom
            	    {
            	    match(input,19,FOLLOW_19_in_multidiv376); if (state.failed) return value;

            	    pushFollow(FOLLOW_atom_in_multidiv380);
            	    e2=atom();

            	    state._fsp--;
            	    if (state.failed) return value;

            	    if ( state.backtracking==0 ) {exprlist.add(e2);opslist.add("*");}

            	    }
            	    break;
            	case 2 :
            	    // src/grmr/PNBsolver.g:58:6: '/' e2= atom
            	    {
            	    match(input,24,FOLLOW_24_in_multidiv389); if (state.failed) return value;

            	    pushFollow(FOLLOW_atom_in_multidiv393);
            	    e2=atom();

            	    state._fsp--;
            	    if (state.failed) return value;

            	    if ( state.backtracking==0 ) {exprlist.add(e2);opslist.add("/");}

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            if ( state.backtracking==0 ) {if(exprlist.size()<1)value =e1; else value = new Expression(e1,exprlist,opslist); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, multidiv_StartIndex); }

        }
        return value;
    }
    // $ANTLR end "multidiv"



    // $ANTLR start "atom"
    // src/grmr/PNBsolver.g:61:1: atom returns [Expression value] : (id= IDENTIFIER | '(' expr= expression ')' | 'exp' expr= expression | 'pow' '(' expr= expression ',' num= NUMBER ')' );
    public final Expression atom() throws RecognitionException {
        Expression value = null;

        int atom_StartIndex = input.index();

        Token id=null;
        Token num=null;
        Expression expr =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return value; }

            // src/grmr/PNBsolver.g:62:5: (id= IDENTIFIER | '(' expr= expression ')' | 'exp' expr= expression | 'pow' '(' expr= expression ',' num= NUMBER ')' )
            int alt6=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 38:
                {
                alt6=3;
                }
                break;
            case 42:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // src/grmr/PNBsolver.g:62:9: id= IDENTIFIER
                    {
                    id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_atom425); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value=new Expression((id!=null?id.getText():null));}

                    }
                    break;
                case 2 :
                    // src/grmr/PNBsolver.g:63:9: '(' expr= expression ')'
                    {
                    match(input,17,FOLLOW_17_in_atom436); if (state.failed) return value;

                    pushFollow(FOLLOW_expression_in_atom440);
                    expr=expression();

                    state._fsp--;
                    if (state.failed) return value;

                    match(input,18,FOLLOW_18_in_atom442); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = expr;}

                    }
                    break;
                case 3 :
                    // src/grmr/PNBsolver.g:64:9: 'exp' expr= expression
                    {
                    match(input,38,FOLLOW_38_in_atom454); if (state.failed) return value;

                    pushFollow(FOLLOW_expression_in_atom458);
                    expr=expression();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = new Expression(expr,"exp");}

                    }
                    break;
                case 4 :
                    // src/grmr/PNBsolver.g:65:10: 'pow' '(' expr= expression ',' num= NUMBER ')'
                    {
                    match(input,42,FOLLOW_42_in_atom471); if (state.failed) return value;

                    match(input,17,FOLLOW_17_in_atom473); if (state.failed) return value;

                    pushFollow(FOLLOW_expression_in_atom476);
                    expr=expression();

                    state._fsp--;
                    if (state.failed) return value;

                    match(input,21,FOLLOW_21_in_atom478); if (state.failed) return value;

                    num=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom482); if (state.failed) return value;

                    match(input,18,FOLLOW_18_in_atom484); if (state.failed) return value;

                    if ( state.backtracking==0 ) {int n= Integer.parseInt((num!=null?num.getText():null));value =new Expression(expr,n);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, atom_StartIndex); }

        }
        return value;
    }
    // $ANTLR end "atom"



    // $ANTLR start "readstmts"
    // src/grmr/PNBsolver.g:68:1: readstmts returns [ List<Statement> stmts] : ( 'read' id1= STRING ',' id2= STRING )* ;
    public final List<Statement> readstmts() throws RecognitionException {
        List<Statement> stmts = null;

        int readstmts_StartIndex = input.index();

        Token id1=null;
        Token id2=null;


            	stmts = new ArrayList<Statement>();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return stmts; }

            // src/grmr/PNBsolver.g:73:5: ( ( 'read' id1= STRING ',' id2= STRING )* )
            // src/grmr/PNBsolver.g:73:7: ( 'read' id1= STRING ',' id2= STRING )*
            {
            // src/grmr/PNBsolver.g:73:7: ( 'read' id1= STRING ',' id2= STRING )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==43) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // src/grmr/PNBsolver.g:73:8: 'read' id1= STRING ',' id2= STRING
            	    {
            	    match(input,43,FOLLOW_43_in_readstmts529); if (state.failed) return stmts;

            	    id1=(Token)match(input,STRING,FOLLOW_STRING_in_readstmts533); if (state.failed) return stmts;

            	    match(input,21,FOLLOW_21_in_readstmts535); if (state.failed) return stmts;

            	    id2=(Token)match(input,STRING,FOLLOW_STRING_in_readstmts539); if (state.failed) return stmts;

            	    if ( state.backtracking==0 ) {Statement stmt= new Statement((id1!=null?id1.getText():null),(id2!=null?id2.getText():null),0);stmts.add(stmt);}

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, readstmts_StartIndex); }

        }
        return stmts;
    }
    // $ANTLR end "readstmts"



    // $ANTLR start "writestmts"
    // src/grmr/PNBsolver.g:76:1: writestmts returns [ List<Statement> stmts] : ( 'write' id1= STRING ',' id2= STRING )* ;
    public final List<Statement> writestmts() throws RecognitionException {
        List<Statement> stmts = null;

        int writestmts_StartIndex = input.index();

        Token id1=null;
        Token id2=null;


            	stmts = new ArrayList<Statement>();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return stmts; }

            // src/grmr/PNBsolver.g:81:5: ( ( 'write' id1= STRING ',' id2= STRING )* )
            // src/grmr/PNBsolver.g:81:7: ( 'write' id1= STRING ',' id2= STRING )*
            {
            // src/grmr/PNBsolver.g:81:7: ( 'write' id1= STRING ',' id2= STRING )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==46) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // src/grmr/PNBsolver.g:81:8: 'write' id1= STRING ',' id2= STRING
            	    {
            	    match(input,46,FOLLOW_46_in_writestmts579); if (state.failed) return stmts;

            	    id1=(Token)match(input,STRING,FOLLOW_STRING_in_writestmts583); if (state.failed) return stmts;

            	    match(input,21,FOLLOW_21_in_writestmts585); if (state.failed) return stmts;

            	    id2=(Token)match(input,STRING,FOLLOW_STRING_in_writestmts589); if (state.failed) return stmts;

            	    if ( state.backtracking==0 ) {Statement stmt= new Statement((id1!=null?id1.getText():null),(id2!=null?id2.getText():null),1);stmts.add(stmt);}

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, writestmts_StartIndex); }

        }
        return stmts;
    }
    // $ANTLR end "writestmts"



    // $ANTLR start "execute"
    // src/grmr/PNBsolver.g:84:1: execute returns [ Execution execution] : 'generate' p_t1= platform ( '[' parameters ']' )? md= mode id= IDENTIFIER ;
    public final Execution execute() throws RecognitionException {
        Execution execution = null;

        int execute_StartIndex = input.index();

        Token id=null;
        int p_t1 =0;

        int md =0;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return execution; }

            // src/grmr/PNBsolver.g:85:5: ( 'generate' p_t1= platform ( '[' parameters ']' )? md= mode id= IDENTIFIER )
            // src/grmr/PNBsolver.g:85:7: 'generate' p_t1= platform ( '[' parameters ']' )? md= mode id= IDENTIFIER
            {
            match(input,39,FOLLOW_39_in_execute618); if (state.failed) return execution;

            pushFollow(FOLLOW_platform_in_execute622);
            p_t1=platform();

            state._fsp--;
            if (state.failed) return execution;

            // src/grmr/PNBsolver.g:85:32: ( '[' parameters ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // src/grmr/PNBsolver.g:85:33: '[' parameters ']'
                    {
                    match(input,34,FOLLOW_34_in_execute625); if (state.failed) return execution;

                    pushFollow(FOLLOW_parameters_in_execute627);
                    parameters();

                    state._fsp--;
                    if (state.failed) return execution;

                    match(input,35,FOLLOW_35_in_execute629); if (state.failed) return execution;

                    }
                    break;

            }


            pushFollow(FOLLOW_mode_in_execute635);
            md=mode();

            state._fsp--;
            if (state.failed) return execution;

            id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_execute639); if (state.failed) return execution;

            if ( state.backtracking==0 ) {execution =new Execution((id!=null?id.getText():null),p_t1,md);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, execute_StartIndex); }

        }
        return execution;
    }
    // $ANTLR end "execute"



    // $ANTLR start "variables"
    // src/grmr/PNBsolver.g:89:1: variables returns [ List<String> variables] : id1= IDENTIFIER ( initialization )? ( ',' id2= IDENTIFIER ( initialization )? )* ;
    public final List<String> variables() throws RecognitionException {
        List<String> variables = null;

        int variables_StartIndex = input.index();

        Token id1=null;
        Token id2=null;


            	variables = new ArrayList<String>();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return variables; }

            // src/grmr/PNBsolver.g:94:2: (id1= IDENTIFIER ( initialization )? ( ',' id2= IDENTIFIER ( initialization )? )* )
            // src/grmr/PNBsolver.g:94:4: id1= IDENTIFIER ( initialization )? ( ',' id2= IDENTIFIER ( initialization )? )*
            {
            id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variables674); if (state.failed) return variables;

            if ( state.backtracking==0 ) {variables.add((id1!=null?id1.getText():null));}

            // src/grmr/PNBsolver.g:94:48: ( initialization )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // src/grmr/PNBsolver.g:94:49: initialization
                    {
                    pushFollow(FOLLOW_initialization_in_variables679);
                    initialization();

                    state._fsp--;
                    if (state.failed) return variables;

                    }
                    break;

            }


            // src/grmr/PNBsolver.g:94:66: ( ',' id2= IDENTIFIER ( initialization )? )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/grmr/PNBsolver.g:94:67: ',' id2= IDENTIFIER ( initialization )?
            	    {
            	    match(input,21,FOLLOW_21_in_variables684); if (state.failed) return variables;

            	    id2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variables688); if (state.failed) return variables;

            	    if ( state.backtracking==0 ) {variables.add((id2!=null?id2.getText():null));}

            	    // src/grmr/PNBsolver.g:94:114: ( initialization )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==25) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // src/grmr/PNBsolver.g:94:115: initialization
            	            {
            	            pushFollow(FOLLOW_initialization_in_variables692);
            	            initialization();

            	            state._fsp--;
            	            if (state.failed) return variables;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, variables_StartIndex); }

        }
        return variables;
    }
    // $ANTLR end "variables"



    // $ANTLR start "initialization"
    // src/grmr/PNBsolver.g:98:1: initialization : '=' NUMBER ( '.' NUMBER )? ;
    public final void initialization() throws RecognitionException {
        int initialization_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }

            // src/grmr/PNBsolver.g:99:2: ( '=' NUMBER ( '.' NUMBER )? )
            // src/grmr/PNBsolver.g:99:4: '=' NUMBER ( '.' NUMBER )?
            {
            match(input,25,FOLLOW_25_in_initialization709); if (state.failed) return ;

            match(input,NUMBER,FOLLOW_NUMBER_in_initialization711); if (state.failed) return ;

            // src/grmr/PNBsolver.g:99:15: ( '.' NUMBER )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // src/grmr/PNBsolver.g:99:16: '.' NUMBER
                    {
                    match(input,23,FOLLOW_23_in_initialization714); if (state.failed) return ;

                    match(input,NUMBER,FOLLOW_NUMBER_in_initialization716); if (state.failed) return ;

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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, initialization_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "initialization"



    // $ANTLR start "platform"
    // src/grmr/PNBsolver.g:102:1: platform returns [ int platName ] : ( 'CUDA' | 'OMP' | 'MPI' | 'OCL' );
    public final int platform() throws RecognitionException {
        int platName = 0;

        int platform_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return platName; }

            // src/grmr/PNBsolver.g:103:2: ( 'CUDA' | 'OMP' | 'MPI' | 'OCL' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt14=1;
                }
                break;
            case 32:
                {
                alt14=2;
                }
                break;
            case 30:
                {
                alt14=3;
                }
                break;
            case 31:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return platName;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // src/grmr/PNBsolver.g:103:4: 'CUDA'
                    {
                    match(input,28,FOLLOW_28_in_platform733); if (state.failed) return platName;

                    if ( state.backtracking==0 ) {platName =0;}

                    }
                    break;
                case 2 :
                    // src/grmr/PNBsolver.g:103:25: 'OMP'
                    {
                    match(input,32,FOLLOW_32_in_platform736); if (state.failed) return platName;

                    if ( state.backtracking==0 ) {platName =1;}

                    }
                    break;
                case 3 :
                    // src/grmr/PNBsolver.g:103:46: 'MPI'
                    {
                    match(input,30,FOLLOW_30_in_platform740); if (state.failed) return platName;

                    if ( state.backtracking==0 ) {platName =2;}

                    }
                    break;
                case 4 :
                    // src/grmr/PNBsolver.g:103:66: 'OCL'
                    {
                    match(input,31,FOLLOW_31_in_platform743); if (state.failed) return platName;

                    if ( state.backtracking==0 ) {platName =3;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, platform_StartIndex); }

        }
        return platName;
    }
    // $ANTLR end "platform"



    // $ANTLR start "parameters"
    // src/grmr/PNBsolver.g:106:1: parameters : IDENTIFIER '=' parameter ( ',' IDENTIFIER '=' parameter )* ;
    public final void parameters() throws RecognitionException {
        int parameters_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }

            // src/grmr/PNBsolver.g:107:5: ( IDENTIFIER '=' parameter ( ',' IDENTIFIER '=' parameter )* )
            // src/grmr/PNBsolver.g:107:7: IDENTIFIER '=' parameter ( ',' IDENTIFIER '=' parameter )*
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameters759); if (state.failed) return ;

            match(input,25,FOLLOW_25_in_parameters761); if (state.failed) return ;

            pushFollow(FOLLOW_parameter_in_parameters763);
            parameter();

            state._fsp--;
            if (state.failed) return ;

            // src/grmr/PNBsolver.g:107:33: ( ',' IDENTIFIER '=' parameter )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // src/grmr/PNBsolver.g:107:34: ',' IDENTIFIER '=' parameter
            	    {
            	    match(input,21,FOLLOW_21_in_parameters767); if (state.failed) return ;

            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameters769); if (state.failed) return ;

            	    match(input,25,FOLLOW_25_in_parameters771); if (state.failed) return ;

            	    pushFollow(FOLLOW_parameter_in_parameters773);
            	    parameter();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, parameters_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "parameters"



    // $ANTLR start "parameter"
    // src/grmr/PNBsolver.g:110:1: parameter : ( IDENTIFIER | NUMBER ( '.' NUMBER )? );
    public final void parameter() throws RecognitionException {
        int parameter_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }

            // src/grmr/PNBsolver.g:111:2: ( IDENTIFIER | NUMBER ( '.' NUMBER )? )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENTIFIER) ) {
                alt17=1;
            }
            else if ( (LA17_0==NUMBER) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // src/grmr/PNBsolver.g:111:3: IDENTIFIER
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameter792); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/grmr/PNBsolver.g:112:3: NUMBER ( '.' NUMBER )?
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_parameter796); if (state.failed) return ;

                    // src/grmr/PNBsolver.g:112:10: ( '.' NUMBER )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==23) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // src/grmr/PNBsolver.g:112:11: '.' NUMBER
                            {
                            match(input,23,FOLLOW_23_in_parameter799); if (state.failed) return ;

                            match(input,NUMBER,FOLLOW_NUMBER_in_parameter801); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, parameter_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "parameter"



    // $ANTLR start "mode"
    // src/grmr/PNBsolver.g:115:1: mode returns [ int md ] : ( 'ACCURATE' | 'AVERAGE' | 'FAST' );
    public final int mode() throws RecognitionException {
        int md = 0;

        int mode_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return md; }

            // src/grmr/PNBsolver.g:116:2: ( 'ACCURATE' | 'AVERAGE' | 'FAST' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt18=1;
                }
                break;
            case 27:
                {
                alt18=2;
                }
                break;
            case 29:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return md;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // src/grmr/PNBsolver.g:116:4: 'ACCURATE'
                    {
                    match(input,26,FOLLOW_26_in_mode818); if (state.failed) return md;

                    if ( state.backtracking==0 ) {md =0;}

                    }
                    break;
                case 2 :
                    // src/grmr/PNBsolver.g:116:23: 'AVERAGE'
                    {
                    match(input,27,FOLLOW_27_in_mode821); if (state.failed) return md;

                    if ( state.backtracking==0 ) {md =1;}

                    }
                    break;
                case 3 :
                    // src/grmr/PNBsolver.g:116:41: 'FAST'
                    {
                    match(input,29,FOLLOW_29_in_mode824); if (state.failed) return md;

                    if ( state.backtracking==0 ) {md =2;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, mode_StartIndex); }

        }
        return md;
    }
    // $ANTLR end "mode"



    // $ANTLR start "vectorscalarnumber"
    // src/grmr/PNBsolver.g:120:1: vectorscalarnumber returns [ int vec_sca_num ] : ( 'vector' | 'scalar' | 'constant' );
    public final int vectorscalarnumber() throws RecognitionException {
        int vec_sca_num = 0;

        int vectorscalarnumber_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return vec_sca_num; }

            // src/grmr/PNBsolver.g:121:2: ( 'vector' | 'scalar' | 'constant' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt19=1;
                }
                break;
            case 44:
                {
                alt19=2;
                }
                break;
            case 36:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return vec_sca_num;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // src/grmr/PNBsolver.g:121:4: 'vector'
                    {
                    match(input,45,FOLLOW_45_in_vectorscalarnumber843); if (state.failed) return vec_sca_num;

                    if ( state.backtracking==0 ) {vec_sca_num =0;}

                    }
                    break;
                case 2 :
                    // src/grmr/PNBsolver.g:121:30: 'scalar'
                    {
                    match(input,44,FOLLOW_44_in_vectorscalarnumber846); if (state.failed) return vec_sca_num;

                    if ( state.backtracking==0 ) {vec_sca_num =1;}

                    }
                    break;
                case 3 :
                    // src/grmr/PNBsolver.g:121:56: 'constant'
                    {
                    match(input,36,FOLLOW_36_in_vectorscalarnumber849); if (state.failed) return vec_sca_num;

                    if ( state.backtracking==0 ) {vec_sca_num =2;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, vectorscalarnumber_StartIndex); }

        }
        return vec_sca_num;
    }
    // $ANTLR end "vectorscalarnumber"

    // $ANTLR start synpred4_PNBsolver
    public final void synpred4_PNBsolver_fragment() throws RecognitionException {
        Expression e2 =null;


        // src/grmr/PNBsolver.g:45:13: ( '+' e2= multidiv )
        // src/grmr/PNBsolver.g:45:13: '+' e2= multidiv
        {
        match(input,20,FOLLOW_20_in_synpred4_PNBsolver295); if (state.failed) return ;

        pushFollow(FOLLOW_multidiv_in_synpred4_PNBsolver299);
        e2=multidiv();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_PNBsolver

    // $ANTLR start synpred5_PNBsolver
    public final void synpred5_PNBsolver_fragment() throws RecognitionException {
        Expression e2 =null;


        // src/grmr/PNBsolver.g:46:13: ( '-' e2= multidiv )
        // src/grmr/PNBsolver.g:46:13: '-' e2= multidiv
        {
        match(input,22,FOLLOW_22_in_synpred5_PNBsolver315); if (state.failed) return ;

        pushFollow(FOLLOW_multidiv_in_synpred5_PNBsolver319);
        e2=multidiv();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_PNBsolver

    // $ANTLR start synpred6_PNBsolver
    public final void synpred6_PNBsolver_fragment() throws RecognitionException {
        Expression e2 =null;


        // src/grmr/PNBsolver.g:57:6: ( '*' e2= atom )
        // src/grmr/PNBsolver.g:57:6: '*' e2= atom
        {
        match(input,19,FOLLOW_19_in_synpred6_PNBsolver376); if (state.failed) return ;

        pushFollow(FOLLOW_atom_in_synpred6_PNBsolver380);
        e2=atom();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_PNBsolver

    // $ANTLR start synpred7_PNBsolver
    public final void synpred7_PNBsolver_fragment() throws RecognitionException {
        Expression e2 =null;


        // src/grmr/PNBsolver.g:58:6: ( '/' e2= atom )
        // src/grmr/PNBsolver.g:58:6: '/' e2= atom
        {
        match(input,24,FOLLOW_24_in_synpred7_PNBsolver389); if (state.failed) return ;

        pushFollow(FOLLOW_atom_in_synpred7_PNBsolver393);
        e2=atom();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_PNBsolver

    // Delegated rules

    public final boolean synpred7_PNBsolver() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_PNBsolver_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_PNBsolver() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_PNBsolver_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_PNBsolver() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_PNBsolver_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_PNBsolver() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_PNBsolver_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_kernels_in_content69 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_execute_in_content74 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_content76 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_content78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_kernels116 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_kernels121 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_kernels123 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_kernels127 = new BitSet(new long[]{0x0000301000000000L});
    public static final BitSet FOLLOW_declarations_in_kernels131 = new BitSet(new long[]{0x0000080000000080L});
    public static final BitSet FOLLOW_readstmts_in_kernels135 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_expressionstmt_in_kernels139 = new BitSet(new long[]{0x0000402000000000L});
    public static final BitSet FOLLOW_writestmts_in_kernels143 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_kernels145 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_vectorscalarnumber_in_declarations186 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_variables_in_declarations190 = new BitSet(new long[]{0x0000301000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_expressionstmt229 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_expressionstmt231 = new BitSet(new long[]{0x0000044200020080L});
    public static final BitSet FOLLOW_expression_in_expressionstmt236 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_expressionstmt240 = new BitSet(new long[]{0x0000044000020080L});
    public static final BitSet FOLLOW_expression_in_expressionstmt244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multidiv_in_expression280 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_20_in_expression295 = new BitSet(new long[]{0x0000044000020080L});
    public static final BitSet FOLLOW_multidiv_in_expression299 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_22_in_expression315 = new BitSet(new long[]{0x0000044000020080L});
    public static final BitSet FOLLOW_multidiv_in_expression319 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_atom_in_multidiv368 = new BitSet(new long[]{0x0000000001080002L});
    public static final BitSet FOLLOW_19_in_multidiv376 = new BitSet(new long[]{0x0000044000020080L});
    public static final BitSet FOLLOW_atom_in_multidiv380 = new BitSet(new long[]{0x0000000001080002L});
    public static final BitSet FOLLOW_24_in_multidiv389 = new BitSet(new long[]{0x0000044000020080L});
    public static final BitSet FOLLOW_atom_in_multidiv393 = new BitSet(new long[]{0x0000000001080002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_atom425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_atom436 = new BitSet(new long[]{0x0000044000020080L});
    public static final BitSet FOLLOW_expression_in_atom440 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_atom442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_atom454 = new BitSet(new long[]{0x0000044000020080L});
    public static final BitSet FOLLOW_expression_in_atom458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_atom471 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_atom473 = new BitSet(new long[]{0x0000044000020080L});
    public static final BitSet FOLLOW_expression_in_atom476 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_atom478 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NUMBER_in_atom482 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_atom484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_readstmts529 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_readstmts533 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_readstmts535 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_readstmts539 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_46_in_writestmts579 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_writestmts583 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_writestmts585 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_writestmts589 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_39_in_execute618 = new BitSet(new long[]{0x00000001D0000000L});
    public static final BitSet FOLLOW_platform_in_execute622 = new BitSet(new long[]{0x000000042C000000L});
    public static final BitSet FOLLOW_34_in_execute625 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parameters_in_execute627 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_execute629 = new BitSet(new long[]{0x000000002C000000L});
    public static final BitSet FOLLOW_mode_in_execute635 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_execute639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variables674 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_initialization_in_variables679 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_variables684 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variables688 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_initialization_in_variables692 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_25_in_initialization709 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NUMBER_in_initialization711 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_initialization714 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NUMBER_in_initialization716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_platform733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_platform736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_platform740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_platform743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameters759 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parameters761 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_parameter_in_parameters763 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_parameters767 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameters769 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parameters771 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_parameter_in_parameters773 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameter792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_parameter796 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_parameter799 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NUMBER_in_parameter801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_mode818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_mode821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_mode824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_vectorscalarnumber843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_vectorscalarnumber846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_vectorscalarnumber849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_synpred4_PNBsolver295 = new BitSet(new long[]{0x0000044000020080L});
    public static final BitSet FOLLOW_multidiv_in_synpred4_PNBsolver299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred5_PNBsolver315 = new BitSet(new long[]{0x0000044000020080L});
    public static final BitSet FOLLOW_multidiv_in_synpred5_PNBsolver319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred6_PNBsolver376 = new BitSet(new long[]{0x0000044000020080L});
    public static final BitSet FOLLOW_atom_in_synpred6_PNBsolver380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred7_PNBsolver389 = new BitSet(new long[]{0x0000044000020080L});
    public static final BitSet FOLLOW_atom_in_synpred7_PNBsolver393 = new BitSet(new long[]{0x0000000000000002L});

}