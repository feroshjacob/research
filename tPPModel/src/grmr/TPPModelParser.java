// $ANTLR 3.4 src/grmr/TPPModel.g 2011-08-06 06:29:13

package grmr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TPPModelParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "IDENTIFIER", "INTO", "LETTER", "LINE_COMMAND", "LINE_COMMENT", "WS", "','", "'.'", "'CUDA'", "'MPI'", "'OCL'", "'OMP'", "'['", "']'", "'declare'", "'execute'", "'in'", "'map'", "'out'", "'{'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int COMMENT=4;
    public static final int IDENTIFIER=5;
    public static final int INTO=6;
    public static final int LETTER=7;
    public static final int LINE_COMMAND=8;
    public static final int LINE_COMMENT=9;
    public static final int WS=10;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public TPPModelParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public TPPModelParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[16+1];
         

    }

    public String[] getTokenNames() { return TPPModelParser.tokenNames; }
    public String getGrammarFileName() { return "src/grmr/TPPModel.g"; }



    // $ANTLR start "content"
    // src/grmr/TPPModel.g:12:1: content returns [ Content cont] : l_decls= declarations mps= mappings vrs= execute '.' EOF ;
    public final Content content() throws RecognitionException {
        Content cont = null;

        int content_StartIndex = input.index();

        List<Declaration> l_decls =null;

        Map<String, List<NameTypeAndFile>> mps =null;

        Execution vrs =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return cont; }

            // src/grmr/TPPModel.g:13:5: (l_decls= declarations mps= mappings vrs= execute '.' EOF )
            // src/grmr/TPPModel.g:13:8: l_decls= declarations mps= mappings vrs= execute '.' EOF
            {
            pushFollow(FOLLOW_declarations_in_content69);
            l_decls=declarations();

            state._fsp--;
            if (state.failed) return cont;

            pushFollow(FOLLOW_mappings_in_content73);
            mps=mappings();

            state._fsp--;
            if (state.failed) return cont;

            pushFollow(FOLLOW_execute_in_content77);
            vrs=execute();

            state._fsp--;
            if (state.failed) return cont;

            match(input,12,FOLLOW_12_in_content79); if (state.failed) return cont;

            match(input,EOF,FOLLOW_EOF_in_content81); if (state.failed) return cont;

            if ( state.backtracking==0 ) {cont = new Content(l_decls,mps,vrs);}

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



    // $ANTLR start "declarations"
    // src/grmr/TPPModel.g:17:1: declarations returns [ List<Declaration> listofdecls] : ( 'declare' nf= nameandfile '{' 'in' in= variables 'out' out= variables '}' )+ ;
    public final List<Declaration> declarations() throws RecognitionException {
        List<Declaration> listofdecls = null;

        int declarations_StartIndex = input.index();

        NameAndFile nf =null;

        List<String> in =null;

        List<String> out =null;



            	listofdecls = new ArrayList<Declaration>();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return listofdecls; }

            // src/grmr/TPPModel.g:22:5: ( ( 'declare' nf= nameandfile '{' 'in' in= variables 'out' out= variables '}' )+ )
            // src/grmr/TPPModel.g:22:7: ( 'declare' nf= nameandfile '{' 'in' in= variables 'out' out= variables '}' )+
            {
            // src/grmr/TPPModel.g:22:7: ( 'declare' nf= nameandfile '{' 'in' in= variables 'out' out= variables '}' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/grmr/TPPModel.g:22:8: 'declare' nf= nameandfile '{' 'in' in= variables 'out' out= variables '}'
            	    {
            	    match(input,19,FOLLOW_19_in_declarations119); if (state.failed) return listofdecls;

            	    pushFollow(FOLLOW_nameandfile_in_declarations124);
            	    nf=nameandfile();

            	    state._fsp--;
            	    if (state.failed) return listofdecls;

            	    match(input,24,FOLLOW_24_in_declarations126); if (state.failed) return listofdecls;

            	    match(input,21,FOLLOW_21_in_declarations128); if (state.failed) return listofdecls;

            	    pushFollow(FOLLOW_variables_in_declarations132);
            	    in=variables();

            	    state._fsp--;
            	    if (state.failed) return listofdecls;

            	    match(input,23,FOLLOW_23_in_declarations134); if (state.failed) return listofdecls;

            	    pushFollow(FOLLOW_variables_in_declarations138);
            	    out=variables();

            	    state._fsp--;
            	    if (state.failed) return listofdecls;

            	    match(input,25,FOLLOW_25_in_declarations139); if (state.failed) return listofdecls;

            	    if ( state.backtracking==0 ) {listofdecls.add(new Declaration(nf,in,out));}

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return listofdecls;}
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
            if ( state.backtracking>0 ) { memoize(input, 2, declarations_StartIndex); }

        }
        return listofdecls;
    }
    // $ANTLR end "declarations"



    // $ANTLR start "mappings"
    // src/grmr/TPPModel.g:26:1: mappings returns [ Map<String, List<NameTypeAndFile>> maps] : ( 'map' id1= IDENTIFIER INTO lfs= listofnameTfile )+ ;
    public final Map<String, List<NameTypeAndFile>> mappings() throws RecognitionException {
        Map<String, List<NameTypeAndFile>> maps = null;

        int mappings_StartIndex = input.index();

        Token id1=null;
        List<NameTypeAndFile> lfs =null;



            	maps = new HashMap<String, List<NameTypeAndFile>>();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return maps; }

            // src/grmr/TPPModel.g:31:5: ( ( 'map' id1= IDENTIFIER INTO lfs= listofnameTfile )+ )
            // src/grmr/TPPModel.g:31:7: ( 'map' id1= IDENTIFIER INTO lfs= listofnameTfile )+
            {
            // src/grmr/TPPModel.g:31:7: ( 'map' id1= IDENTIFIER INTO lfs= listofnameTfile )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/grmr/TPPModel.g:31:8: 'map' id1= IDENTIFIER INTO lfs= listofnameTfile
            	    {
            	    match(input,22,FOLLOW_22_in_mappings182); if (state.failed) return maps;

            	    id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_mappings186); if (state.failed) return maps;

            	    match(input,INTO,FOLLOW_INTO_in_mappings188); if (state.failed) return maps;

            	    pushFollow(FOLLOW_listofnameTfile_in_mappings193);
            	    lfs=listofnameTfile();

            	    state._fsp--;
            	    if (state.failed) return maps;

            	    if ( state.backtracking==0 ) {maps.put((id1!=null?id1.getText():null),lfs);}

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return maps;}
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
            if ( state.backtracking>0 ) { memoize(input, 3, mappings_StartIndex); }

        }
        return maps;
    }
    // $ANTLR end "mappings"



    // $ANTLR start "execute"
    // src/grmr/TPPModel.g:35:1: execute returns [ Execution execution] : 'execute' id= IDENTIFIER vars= variables ;
    public final Execution execute() throws RecognitionException {
        Execution execution = null;

        int execute_StartIndex = input.index();

        Token id=null;
        List<String> vars =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return execution; }

            // src/grmr/TPPModel.g:36:5: ( 'execute' id= IDENTIFIER vars= variables )
            // src/grmr/TPPModel.g:36:7: 'execute' id= IDENTIFIER vars= variables
            {
            match(input,20,FOLLOW_20_in_execute227); if (state.failed) return execution;

            id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_execute230); if (state.failed) return execution;

            pushFollow(FOLLOW_variables_in_execute234);
            vars=variables();

            state._fsp--;
            if (state.failed) return execution;

            if ( state.backtracking==0 ) {execution =new Execution((id!=null?id.getText():null),vars);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, execute_StartIndex); }

        }
        return execution;
    }
    // $ANTLR end "execute"



    // $ANTLR start "listofnameTfile"
    // src/grmr/TPPModel.g:40:1: listofnameTfile returns [ List<NameTypeAndFile> namefiles] : p_t1= platform nf1= nameandfile ( ',' p_t2= platform nf2= nameandfile )* ;
    public final List<NameTypeAndFile> listofnameTfile() throws RecognitionException {
        List<NameTypeAndFile> namefiles = null;

        int listofnameTfile_StartIndex = input.index();

        String p_t1 =null;

        NameAndFile nf1 =null;

        String p_t2 =null;

        NameAndFile nf2 =null;



            	namefiles = new ArrayList<NameTypeAndFile>();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return namefiles; }

            // src/grmr/TPPModel.g:45:2: (p_t1= platform nf1= nameandfile ( ',' p_t2= platform nf2= nameandfile )* )
            // src/grmr/TPPModel.g:45:3: p_t1= platform nf1= nameandfile ( ',' p_t2= platform nf2= nameandfile )*
            {
            pushFollow(FOLLOW_platform_in_listofnameTfile268);
            p_t1=platform();

            state._fsp--;
            if (state.failed) return namefiles;

            pushFollow(FOLLOW_nameandfile_in_listofnameTfile272);
            nf1=nameandfile();

            state._fsp--;
            if (state.failed) return namefiles;

            if ( state.backtracking==0 ) {namefiles.add(new NameTypeAndFile(p_t1, nf1));}

            // src/grmr/TPPModel.g:47:2: ( ',' p_t2= platform nf2= nameandfile )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/grmr/TPPModel.g:47:3: ',' p_t2= platform nf2= nameandfile
            	    {
            	    match(input,11,FOLLOW_11_in_listofnameTfile280); if (state.failed) return namefiles;

            	    pushFollow(FOLLOW_platform_in_listofnameTfile284);
            	    p_t2=platform();

            	    state._fsp--;
            	    if (state.failed) return namefiles;

            	    pushFollow(FOLLOW_nameandfile_in_listofnameTfile288);
            	    nf2=nameandfile();

            	    state._fsp--;
            	    if (state.failed) return namefiles;

            	    if ( state.backtracking==0 ) {namefiles.add(new NameTypeAndFile(p_t2, nf2));}

            	    }
            	    break;

            	default :
            	    break loop3;
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
            if ( state.backtracking>0 ) { memoize(input, 5, listofnameTfile_StartIndex); }

        }
        return namefiles;
    }
    // $ANTLR end "listofnameTfile"



    // $ANTLR start "variables"
    // src/grmr/TPPModel.g:50:1: variables returns [ List<String> variables] : id1= IDENTIFIER ( ',' id2= IDENTIFIER )* ;
    public final List<String> variables() throws RecognitionException {
        List<String> variables = null;

        int variables_StartIndex = input.index();

        Token id1=null;
        Token id2=null;


            	variables = new ArrayList<String>();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return variables; }

            // src/grmr/TPPModel.g:55:2: (id1= IDENTIFIER ( ',' id2= IDENTIFIER )* )
            // src/grmr/TPPModel.g:55:4: id1= IDENTIFIER ( ',' id2= IDENTIFIER )*
            {
            id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variables317); if (state.failed) return variables;

            if ( state.backtracking==0 ) {variables.add((id1!=null?id1.getText():null));}

            // src/grmr/TPPModel.g:55:49: ( ',' id2= IDENTIFIER )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/grmr/TPPModel.g:55:50: ',' id2= IDENTIFIER
            	    {
            	    match(input,11,FOLLOW_11_in_variables323); if (state.failed) return variables;

            	    id2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variables327); if (state.failed) return variables;

            	    if ( state.backtracking==0 ) {variables.add((id2!=null?id2.getText():null));}

            	    }
            	    break;

            	default :
            	    break loop4;
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
            if ( state.backtracking>0 ) { memoize(input, 6, variables_StartIndex); }

        }
        return variables;
    }
    // $ANTLR end "variables"



    // $ANTLR start "nameandfile"
    // src/grmr/TPPModel.g:59:1: nameandfile returns [NameAndFile namefile] : id= IDENTIFIER f1= file ;
    public final NameAndFile nameandfile() throws RecognitionException {
        NameAndFile namefile = null;

        int nameandfile_StartIndex = input.index();

        Token id=null;
        String f1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return namefile; }

            // src/grmr/TPPModel.g:60:2: (id= IDENTIFIER f1= file )
            // src/grmr/TPPModel.g:60:4: id= IDENTIFIER f1= file
            {
            id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_nameandfile353); if (state.failed) return namefile;

            pushFollow(FOLLOW_file_in_nameandfile357);
            f1=file();

            state._fsp--;
            if (state.failed) return namefile;

            if ( state.backtracking==0 ) {namefile =new NameAndFile((id!=null?id.getText():null),f1);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, nameandfile_StartIndex); }

        }
        return namefile;
    }
    // $ANTLR end "nameandfile"



    // $ANTLR start "file"
    // src/grmr/TPPModel.g:63:1: file returns [ String fileName] : '[' id1= IDENTIFIER '.' id2= IDENTIFIER ']' ;
    public final String file() throws RecognitionException {
        String fileName = null;

        int file_StartIndex = input.index();

        Token id1=null;
        Token id2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return fileName; }

            // src/grmr/TPPModel.g:64:2: ( '[' id1= IDENTIFIER '.' id2= IDENTIFIER ']' )
            // src/grmr/TPPModel.g:64:4: '[' id1= IDENTIFIER '.' id2= IDENTIFIER ']'
            {
            match(input,17,FOLLOW_17_in_file378); if (state.failed) return fileName;

            id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_file382); if (state.failed) return fileName;

            match(input,12,FOLLOW_12_in_file384); if (state.failed) return fileName;

            id2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_file388); if (state.failed) return fileName;

            match(input,18,FOLLOW_18_in_file389); if (state.failed) return fileName;

            if ( state.backtracking==0 ) {fileName =(id1!=null?id1.getText():null) +"."+ (id2!=null?id2.getText():null);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, file_StartIndex); }

        }
        return fileName;
    }
    // $ANTLR end "file"



    // $ANTLR start "platform"
    // src/grmr/TPPModel.g:67:1: platform returns [ String platName ] : ( 'CUDA' | 'OMP' | 'MPI' | 'OCL' );
    public final String platform() throws RecognitionException {
        String platName = null;

        int platform_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return platName; }

            // src/grmr/TPPModel.g:68:2: ( 'CUDA' | 'OMP' | 'MPI' | 'OCL' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            case 15:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return platName;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // src/grmr/TPPModel.g:68:4: 'CUDA'
                    {
                    match(input,13,FOLLOW_13_in_platform407); if (state.failed) return platName;

                    if ( state.backtracking==0 ) {platName ="CUDA";}

                    }
                    break;
                case 2 :
                    // src/grmr/TPPModel.g:68:30: 'OMP'
                    {
                    match(input,16,FOLLOW_16_in_platform410); if (state.failed) return platName;

                    if ( state.backtracking==0 ) {platName ="OMP";}

                    }
                    break;
                case 3 :
                    // src/grmr/TPPModel.g:68:54: 'MPI'
                    {
                    match(input,14,FOLLOW_14_in_platform413); if (state.failed) return platName;

                    if ( state.backtracking==0 ) {platName ="MPI";}

                    }
                    break;
                case 4 :
                    // src/grmr/TPPModel.g:68:78: 'OCL'
                    {
                    match(input,15,FOLLOW_15_in_platform416); if (state.failed) return platName;

                    if ( state.backtracking==0 ) {platName ="OCL";}

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
            if ( state.backtracking>0 ) { memoize(input, 9, platform_StartIndex); }

        }
        return platName;
    }
    // $ANTLR end "platform"

    // Delegated rules


 

    public static final BitSet FOLLOW_declarations_in_content69 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_mappings_in_content73 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_execute_in_content77 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_content79 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_content81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_declarations119 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_nameandfile_in_declarations124 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_declarations126 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_declarations128 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variables_in_declarations132 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_declarations134 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variables_in_declarations138 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_declarations139 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_22_in_mappings182 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_mappings186 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INTO_in_mappings188 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_listofnameTfile_in_mappings193 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_20_in_execute227 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_execute230 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variables_in_execute234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_platform_in_listofnameTfile268 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_nameandfile_in_listofnameTfile272 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_listofnameTfile280 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_platform_in_listofnameTfile284 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_nameandfile_in_listofnameTfile288 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variables317 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_variables323 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variables327 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_IDENTIFIER_in_nameandfile353 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_file_in_nameandfile357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_file378 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_file382 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_file384 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_file388 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_file389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_platform407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_platform410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_platform413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_platform416 = new BitSet(new long[]{0x0000000000000002L});

}