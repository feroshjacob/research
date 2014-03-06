package cs.ua.edu.se.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import cs.ua.edu.se.services.MapRedoopGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMapRedoopParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'metaelements:'", "'mapreduce:'", "'loop'", "'program'", "'extend'", "'map'", "'('", "','", "')'", "'reduce'", "'int'", "'float'", "'double'", "'text'", "'long'", "'metaelement'", "';'", "'read'", "'write'", "'*'", "'['", "']'", "':'", "'after'", "'call'", "'before'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalMapRedoopParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g"; }



     	private MapRedoopGrammarAccess grammarAccess;
     	
        public InternalMapRedoopParser(TokenStream input, IAstFactory factory, MapRedoopGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MapRedoop";	
       	}
       	
       	@Override
       	protected MapRedoopGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleMapRedoop
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:77:1: entryRuleMapRedoop returns [EObject current=null] : iv_ruleMapRedoop= ruleMapRedoop EOF ;
    public final EObject entryRuleMapRedoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapRedoop = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:78:2: (iv_ruleMapRedoop= ruleMapRedoop EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:79:2: iv_ruleMapRedoop= ruleMapRedoop EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMapRedoopRule(), currentNode); 
            pushFollow(FOLLOW_ruleMapRedoop_in_entryRuleMapRedoop75);
            iv_ruleMapRedoop=ruleMapRedoop();
            _fsp--;

             current =iv_ruleMapRedoop; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapRedoop85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMapRedoop


    // $ANTLR start ruleMapRedoop
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:86:1: ruleMapRedoop returns [EObject current=null] : ( ( (lv_declaration_0_0= ruleDeclaration ) ) '{' ( (lv_content_2_0= ruleContent ) )* '}' ) ;
    public final EObject ruleMapRedoop() throws RecognitionException {
        EObject current = null;

        EObject lv_declaration_0_0 = null;

        EObject lv_content_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:91:6: ( ( ( (lv_declaration_0_0= ruleDeclaration ) ) '{' ( (lv_content_2_0= ruleContent ) )* '}' ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:92:1: ( ( (lv_declaration_0_0= ruleDeclaration ) ) '{' ( (lv_content_2_0= ruleContent ) )* '}' )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:92:1: ( ( (lv_declaration_0_0= ruleDeclaration ) ) '{' ( (lv_content_2_0= ruleContent ) )* '}' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:92:2: ( (lv_declaration_0_0= ruleDeclaration ) ) '{' ( (lv_content_2_0= ruleContent ) )* '}'
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:92:2: ( (lv_declaration_0_0= ruleDeclaration ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:93:1: (lv_declaration_0_0= ruleDeclaration )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:93:1: (lv_declaration_0_0= ruleDeclaration )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:94:3: lv_declaration_0_0= ruleDeclaration
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMapRedoopAccess().getDeclarationDeclarationParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDeclaration_in_ruleMapRedoop131);
            lv_declaration_0_0=ruleDeclaration();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMapRedoopRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"declaration",
            	        		lv_declaration_0_0, 
            	        		"Declaration", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,11,FOLLOW_11_in_ruleMapRedoop141); 

                    createLeafNode(grammarAccess.getMapRedoopAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:120:1: ( (lv_content_2_0= ruleContent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:121:1: (lv_content_2_0= ruleContent )
            	    {
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:121:1: (lv_content_2_0= ruleContent )
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:122:3: lv_content_2_0= ruleContent
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMapRedoopAccess().getContentContentParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleContent_in_ruleMapRedoop162);
            	    lv_content_2_0=ruleContent();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMapRedoopRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"content",
            	    	        		lv_content_2_0, 
            	    	        		"Content", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleMapRedoop173); 

                    createLeafNode(grammarAccess.getMapRedoopAccess().getRightCurlyBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMapRedoop


    // $ANTLR start entryRuleContent
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:156:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:157:2: (iv_ruleContent= ruleContent EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:158:2: iv_ruleContent= ruleContent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContentRule(), currentNode); 
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent209);
            iv_ruleContent=ruleContent();
            _fsp--;

             current =iv_ruleContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent219); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleContent


    // $ANTLR start ruleContent
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:165:1: ruleContent returns [EObject current=null] : ( ( (lv_entities_0_0= ruleListofEntities ) ) | ( (lv_mrBlocks_1_0= ruleMRBlock ) ) ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;

        EObject lv_mrBlocks_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:170:6: ( ( ( (lv_entities_0_0= ruleListofEntities ) ) | ( (lv_mrBlocks_1_0= ruleMRBlock ) ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:171:1: ( ( (lv_entities_0_0= ruleListofEntities ) ) | ( (lv_mrBlocks_1_0= ruleMRBlock ) ) )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:171:1: ( ( (lv_entities_0_0= ruleListofEntities ) ) | ( (lv_mrBlocks_1_0= ruleMRBlock ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("171:1: ( ( (lv_entities_0_0= ruleListofEntities ) ) | ( (lv_mrBlocks_1_0= ruleMRBlock ) ) )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:171:2: ( (lv_entities_0_0= ruleListofEntities ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:171:2: ( (lv_entities_0_0= ruleListofEntities ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:172:1: (lv_entities_0_0= ruleListofEntities )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:172:1: (lv_entities_0_0= ruleListofEntities )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:173:3: lv_entities_0_0= ruleListofEntities
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getContentAccess().getEntitiesListofEntitiesParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleListofEntities_in_ruleContent265);
                    lv_entities_0_0=ruleListofEntities();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"entities",
                    	        		lv_entities_0_0, 
                    	        		"ListofEntities", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:196:6: ( (lv_mrBlocks_1_0= ruleMRBlock ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:196:6: ( (lv_mrBlocks_1_0= ruleMRBlock ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:197:1: (lv_mrBlocks_1_0= ruleMRBlock )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:197:1: (lv_mrBlocks_1_0= ruleMRBlock )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:198:3: lv_mrBlocks_1_0= ruleMRBlock
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getContentAccess().getMrBlocksMRBlockParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleMRBlock_in_ruleContent292);
                    lv_mrBlocks_1_0=ruleMRBlock();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getContentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"mrBlocks",
                    	        		lv_mrBlocks_1_0, 
                    	        		"MRBlock", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleContent


    // $ANTLR start entryRuleListofEntities
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:228:1: entryRuleListofEntities returns [EObject current=null] : iv_ruleListofEntities= ruleListofEntities EOF ;
    public final EObject entryRuleListofEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListofEntities = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:229:2: (iv_ruleListofEntities= ruleListofEntities EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:230:2: iv_ruleListofEntities= ruleListofEntities EOF
            {
             currentNode = createCompositeNode(grammarAccess.getListofEntitiesRule(), currentNode); 
            pushFollow(FOLLOW_ruleListofEntities_in_entryRuleListofEntities328);
            iv_ruleListofEntities=ruleListofEntities();
            _fsp--;

             current =iv_ruleListofEntities; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListofEntities338); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleListofEntities


    // $ANTLR start ruleListofEntities
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:237:1: ruleListofEntities returns [EObject current=null] : ( () 'metaelements:' '{' ( (lv_entities_3_0= ruleEntity ) )* '}' ) ;
    public final EObject ruleListofEntities() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:242:6: ( ( () 'metaelements:' '{' ( (lv_entities_3_0= ruleEntity ) )* '}' ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:243:1: ( () 'metaelements:' '{' ( (lv_entities_3_0= ruleEntity ) )* '}' )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:243:1: ( () 'metaelements:' '{' ( (lv_entities_3_0= ruleEntity ) )* '}' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:243:2: () 'metaelements:' '{' ( (lv_entities_3_0= ruleEntity ) )* '}'
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:243:2: ()
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:244:5: 
            {
             
                    temp=factory.create(grammarAccess.getListofEntitiesAccess().getListofEntitiesAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getListofEntitiesAccess().getListofEntitiesAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,13,FOLLOW_13_in_ruleListofEntities382); 

                    createLeafNode(grammarAccess.getListofEntitiesAccess().getMetaelementsKeyword_1(), null); 
                
            match(input,11,FOLLOW_11_in_ruleListofEntities392); 

                    createLeafNode(grammarAccess.getListofEntitiesAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:262:1: ( (lv_entities_3_0= ruleEntity ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==28) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:263:1: (lv_entities_3_0= ruleEntity )
            	    {
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:263:1: (lv_entities_3_0= ruleEntity )
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:264:3: lv_entities_3_0= ruleEntity
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getListofEntitiesAccess().getEntitiesEntityParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleListofEntities413);
            	    lv_entities_3_0=ruleEntity();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getListofEntitiesRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"entities",
            	    	        		lv_entities_3_0, 
            	    	        		"Entity", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleListofEntities424); 

                    createLeafNode(grammarAccess.getListofEntitiesAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleListofEntities


    // $ANTLR start entryRuleMRBlock
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:298:1: entryRuleMRBlock returns [EObject current=null] : iv_ruleMRBlock= ruleMRBlock EOF ;
    public final EObject entryRuleMRBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMRBlock = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:299:2: (iv_ruleMRBlock= ruleMRBlock EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:300:2: iv_ruleMRBlock= ruleMRBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMRBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleMRBlock_in_entryRuleMRBlock460);
            iv_ruleMRBlock=ruleMRBlock();
            _fsp--;

             current =iv_ruleMRBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMRBlock470); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMRBlock


    // $ANTLR start ruleMRBlock
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:307:1: ruleMRBlock returns [EObject current=null] : ( 'mapreduce:' ( (lv_loop_1_0= 'loop' ) )? '{' ( (lv_mapper_3_0= ruleMapper ) ) ( (lv_reducer_4_0= ruleReducer ) ) '}' ) ;
    public final EObject ruleMRBlock() throws RecognitionException {
        EObject current = null;

        Token lv_loop_1_0=null;
        EObject lv_mapper_3_0 = null;

        EObject lv_reducer_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:312:6: ( ( 'mapreduce:' ( (lv_loop_1_0= 'loop' ) )? '{' ( (lv_mapper_3_0= ruleMapper ) ) ( (lv_reducer_4_0= ruleReducer ) ) '}' ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:313:1: ( 'mapreduce:' ( (lv_loop_1_0= 'loop' ) )? '{' ( (lv_mapper_3_0= ruleMapper ) ) ( (lv_reducer_4_0= ruleReducer ) ) '}' )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:313:1: ( 'mapreduce:' ( (lv_loop_1_0= 'loop' ) )? '{' ( (lv_mapper_3_0= ruleMapper ) ) ( (lv_reducer_4_0= ruleReducer ) ) '}' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:313:3: 'mapreduce:' ( (lv_loop_1_0= 'loop' ) )? '{' ( (lv_mapper_3_0= ruleMapper ) ) ( (lv_reducer_4_0= ruleReducer ) ) '}'
            {
            match(input,14,FOLLOW_14_in_ruleMRBlock505); 

                    createLeafNode(grammarAccess.getMRBlockAccess().getMapreduceKeyword_0(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:317:1: ( (lv_loop_1_0= 'loop' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:318:1: (lv_loop_1_0= 'loop' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:318:1: (lv_loop_1_0= 'loop' )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:319:3: lv_loop_1_0= 'loop'
                    {
                    lv_loop_1_0=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_ruleMRBlock523); 

                            createLeafNode(grammarAccess.getMRBlockAccess().getLoopLoopKeyword_1_0(), "loop"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMRBlockRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "loop", lv_loop_1_0, "loop", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleMRBlock547); 

                    createLeafNode(grammarAccess.getMRBlockAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:342:1: ( (lv_mapper_3_0= ruleMapper ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:343:1: (lv_mapper_3_0= ruleMapper )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:343:1: (lv_mapper_3_0= ruleMapper )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:344:3: lv_mapper_3_0= ruleMapper
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMRBlockAccess().getMapperMapperParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMapper_in_ruleMRBlock568);
            lv_mapper_3_0=ruleMapper();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMRBlockRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"mapper",
            	        		lv_mapper_3_0, 
            	        		"Mapper", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:366:2: ( (lv_reducer_4_0= ruleReducer ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:367:1: (lv_reducer_4_0= ruleReducer )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:367:1: (lv_reducer_4_0= ruleReducer )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:368:3: lv_reducer_4_0= ruleReducer
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMRBlockAccess().getReducerReducerParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReducer_in_ruleMRBlock589);
            lv_reducer_4_0=ruleReducer();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMRBlockRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"reducer",
            	        		lv_reducer_4_0, 
            	        		"Reducer", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleMRBlock599); 

                    createLeafNode(grammarAccess.getMRBlockAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMRBlock


    // $ANTLR start entryRuleDeclaration
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:402:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:403:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:404:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration635);
            iv_ruleDeclaration=ruleDeclaration();
            _fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration645); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDeclaration


    // $ANTLR start ruleDeclaration
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:411:1: ruleDeclaration returns [EObject current=null] : ( 'program' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( (lv_superName_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_superName_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:416:6: ( ( 'program' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( (lv_superName_3_0= RULE_ID ) ) )? ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:417:1: ( 'program' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( (lv_superName_3_0= RULE_ID ) ) )? )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:417:1: ( 'program' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( (lv_superName_3_0= RULE_ID ) ) )? )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:417:3: 'program' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( (lv_superName_3_0= RULE_ID ) ) )?
            {
            match(input,16,FOLLOW_16_in_ruleDeclaration680); 

                    createLeafNode(grammarAccess.getDeclarationAccess().getProgramKeyword_0(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:421:1: ( (lv_name_1_0= RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:422:1: (lv_name_1_0= RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:422:1: (lv_name_1_0= RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:423:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration697); 

            			createLeafNode(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:445:2: ( 'extend' ( (lv_superName_3_0= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:445:4: 'extend' ( (lv_superName_3_0= RULE_ID ) )
                    {
                    match(input,17,FOLLOW_17_in_ruleDeclaration713); 

                            createLeafNode(grammarAccess.getDeclarationAccess().getExtendKeyword_2_0(), null); 
                        
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:449:1: ( (lv_superName_3_0= RULE_ID ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:450:1: (lv_superName_3_0= RULE_ID )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:450:1: (lv_superName_3_0= RULE_ID )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:451:3: lv_superName_3_0= RULE_ID
                    {
                    lv_superName_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration730); 

                    			createLeafNode(grammarAccess.getDeclarationAccess().getSuperNameIDTerminalRuleCall_2_1_0(), "superName"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"superName",
                    	        		lv_superName_3_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDeclaration


    // $ANTLR start entryRuleMapper
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:481:1: entryRuleMapper returns [EObject current=null] : iv_ruleMapper= ruleMapper EOF ;
    public final EObject entryRuleMapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapper = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:482:2: (iv_ruleMapper= ruleMapper EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:483:2: iv_ruleMapper= ruleMapper EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMapperRule(), currentNode); 
            pushFollow(FOLLOW_ruleMapper_in_entryRuleMapper773);
            iv_ruleMapper=ruleMapper();
            _fsp--;

             current =iv_ruleMapper; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapper783); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMapper


    // $ANTLR start ruleMapper
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:490:1: ruleMapper returns [EObject current=null] : ( 'map' '(' ( (lv_inkey_2_0= ruleArgument ) ) ',' ( (lv_invalue_4_0= ruleArgument ) ) ',' ( (lv_outKeyType_6_0= RULE_STRING ) ) ',' ( (lv_outValueType_8_0= RULE_STRING ) ) ')' ( (lv_text_10_0= ruleBlock ) ) ) ;
    public final EObject ruleMapper() throws RecognitionException {
        EObject current = null;

        Token lv_outKeyType_6_0=null;
        Token lv_outValueType_8_0=null;
        EObject lv_inkey_2_0 = null;

        EObject lv_invalue_4_0 = null;

        EObject lv_text_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:495:6: ( ( 'map' '(' ( (lv_inkey_2_0= ruleArgument ) ) ',' ( (lv_invalue_4_0= ruleArgument ) ) ',' ( (lv_outKeyType_6_0= RULE_STRING ) ) ',' ( (lv_outValueType_8_0= RULE_STRING ) ) ')' ( (lv_text_10_0= ruleBlock ) ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:496:1: ( 'map' '(' ( (lv_inkey_2_0= ruleArgument ) ) ',' ( (lv_invalue_4_0= ruleArgument ) ) ',' ( (lv_outKeyType_6_0= RULE_STRING ) ) ',' ( (lv_outValueType_8_0= RULE_STRING ) ) ')' ( (lv_text_10_0= ruleBlock ) ) )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:496:1: ( 'map' '(' ( (lv_inkey_2_0= ruleArgument ) ) ',' ( (lv_invalue_4_0= ruleArgument ) ) ',' ( (lv_outKeyType_6_0= RULE_STRING ) ) ',' ( (lv_outValueType_8_0= RULE_STRING ) ) ')' ( (lv_text_10_0= ruleBlock ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:496:3: 'map' '(' ( (lv_inkey_2_0= ruleArgument ) ) ',' ( (lv_invalue_4_0= ruleArgument ) ) ',' ( (lv_outKeyType_6_0= RULE_STRING ) ) ',' ( (lv_outValueType_8_0= RULE_STRING ) ) ')' ( (lv_text_10_0= ruleBlock ) )
            {
            match(input,18,FOLLOW_18_in_ruleMapper818); 

                    createLeafNode(grammarAccess.getMapperAccess().getMapKeyword_0(), null); 
                
            match(input,19,FOLLOW_19_in_ruleMapper828); 

                    createLeafNode(grammarAccess.getMapperAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:504:1: ( (lv_inkey_2_0= ruleArgument ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:505:1: (lv_inkey_2_0= ruleArgument )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:505:1: (lv_inkey_2_0= ruleArgument )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:506:3: lv_inkey_2_0= ruleArgument
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMapperAccess().getInkeyArgumentParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleMapper849);
            lv_inkey_2_0=ruleArgument();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMapperRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"inkey",
            	        		lv_inkey_2_0, 
            	        		"Argument", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleMapper859); 

                    createLeafNode(grammarAccess.getMapperAccess().getCommaKeyword_3(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:532:1: ( (lv_invalue_4_0= ruleArgument ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:533:1: (lv_invalue_4_0= ruleArgument )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:533:1: (lv_invalue_4_0= ruleArgument )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:534:3: lv_invalue_4_0= ruleArgument
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMapperAccess().getInvalueArgumentParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleArgument_in_ruleMapper880);
            lv_invalue_4_0=ruleArgument();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMapperRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"invalue",
            	        		lv_invalue_4_0, 
            	        		"Argument", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleMapper890); 

                    createLeafNode(grammarAccess.getMapperAccess().getCommaKeyword_5(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:560:1: ( (lv_outKeyType_6_0= RULE_STRING ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:561:1: (lv_outKeyType_6_0= RULE_STRING )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:561:1: (lv_outKeyType_6_0= RULE_STRING )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:562:3: lv_outKeyType_6_0= RULE_STRING
            {
            lv_outKeyType_6_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMapper907); 

            			createLeafNode(grammarAccess.getMapperAccess().getOutKeyTypeSTRINGTerminalRuleCall_6_0(), "outKeyType"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMapperRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"outKeyType",
            	        		lv_outKeyType_6_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleMapper922); 

                    createLeafNode(grammarAccess.getMapperAccess().getCommaKeyword_7(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:588:1: ( (lv_outValueType_8_0= RULE_STRING ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:589:1: (lv_outValueType_8_0= RULE_STRING )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:589:1: (lv_outValueType_8_0= RULE_STRING )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:590:3: lv_outValueType_8_0= RULE_STRING
            {
            lv_outValueType_8_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMapper939); 

            			createLeafNode(grammarAccess.getMapperAccess().getOutValueTypeSTRINGTerminalRuleCall_8_0(), "outValueType"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMapperRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"outValueType",
            	        		lv_outValueType_8_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,21,FOLLOW_21_in_ruleMapper954); 

                    createLeafNode(grammarAccess.getMapperAccess().getRightParenthesisKeyword_9(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:616:1: ( (lv_text_10_0= ruleBlock ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:617:1: (lv_text_10_0= ruleBlock )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:617:1: (lv_text_10_0= ruleBlock )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:618:3: lv_text_10_0= ruleBlock
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMapperAccess().getTextBlockParserRuleCall_10_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleMapper975);
            lv_text_10_0=ruleBlock();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMapperRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"text",
            	        		lv_text_10_0, 
            	        		"Block", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMapper


    // $ANTLR start entryRuleArgument
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:648:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:649:2: (iv_ruleArgument= ruleArgument EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:650:2: iv_ruleArgument= ruleArgument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument1011);
            iv_ruleArgument=ruleArgument();
            _fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument1021); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArgument


    // $ANTLR start ruleArgument
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:657:1: ruleArgument returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_argname_1_0= RULE_ID ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_argname_1_0=null;
        EObject lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:662:6: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_argname_1_0= RULE_ID ) ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:663:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_argname_1_0= RULE_ID ) ) )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:663:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_argname_1_0= RULE_ID ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:663:2: ( (lv_type_0_0= ruleType ) ) ( (lv_argname_1_0= RULE_ID ) )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:663:2: ( (lv_type_0_0= ruleType ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:664:1: (lv_type_0_0= ruleType )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:664:1: (lv_type_0_0= ruleType )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:665:3: lv_type_0_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleArgument1067);
            lv_type_0_0=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_0_0, 
            	        		"Type", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:687:2: ( (lv_argname_1_0= RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:688:1: (lv_argname_1_0= RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:688:1: (lv_argname_1_0= RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:689:3: lv_argname_1_0= RULE_ID
            {
            lv_argname_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument1084); 

            			createLeafNode(grammarAccess.getArgumentAccess().getArgnameIDTerminalRuleCall_1_0(), "argname"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"argname",
            	        		lv_argname_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArgument


    // $ANTLR start entryRuleReducer
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:721:1: entryRuleReducer returns [EObject current=null] : iv_ruleReducer= ruleReducer EOF ;
    public final EObject entryRuleReducer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReducer = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:722:2: (iv_ruleReducer= ruleReducer EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:723:2: iv_ruleReducer= ruleReducer EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReducerRule(), currentNode); 
            pushFollow(FOLLOW_ruleReducer_in_entryRuleReducer1127);
            iv_ruleReducer=ruleReducer();
            _fsp--;

             current =iv_ruleReducer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReducer1137); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleReducer


    // $ANTLR start ruleReducer
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:730:1: ruleReducer returns [EObject current=null] : ( 'reduce' '(' ( (lv_inkey_2_0= RULE_STRING ) ) ',' ( (lv_invalue_4_0= RULE_STRING ) ) ',' ( (lv_outKeyType_6_0= RULE_STRING ) ) ',' ( (lv_outValueType_8_0= RULE_STRING ) ) ')' ( (lv_text_10_0= ruleBlock ) ) ) ;
    public final EObject ruleReducer() throws RecognitionException {
        EObject current = null;

        Token lv_inkey_2_0=null;
        Token lv_invalue_4_0=null;
        Token lv_outKeyType_6_0=null;
        Token lv_outValueType_8_0=null;
        EObject lv_text_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:735:6: ( ( 'reduce' '(' ( (lv_inkey_2_0= RULE_STRING ) ) ',' ( (lv_invalue_4_0= RULE_STRING ) ) ',' ( (lv_outKeyType_6_0= RULE_STRING ) ) ',' ( (lv_outValueType_8_0= RULE_STRING ) ) ')' ( (lv_text_10_0= ruleBlock ) ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:736:1: ( 'reduce' '(' ( (lv_inkey_2_0= RULE_STRING ) ) ',' ( (lv_invalue_4_0= RULE_STRING ) ) ',' ( (lv_outKeyType_6_0= RULE_STRING ) ) ',' ( (lv_outValueType_8_0= RULE_STRING ) ) ')' ( (lv_text_10_0= ruleBlock ) ) )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:736:1: ( 'reduce' '(' ( (lv_inkey_2_0= RULE_STRING ) ) ',' ( (lv_invalue_4_0= RULE_STRING ) ) ',' ( (lv_outKeyType_6_0= RULE_STRING ) ) ',' ( (lv_outValueType_8_0= RULE_STRING ) ) ')' ( (lv_text_10_0= ruleBlock ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:736:3: 'reduce' '(' ( (lv_inkey_2_0= RULE_STRING ) ) ',' ( (lv_invalue_4_0= RULE_STRING ) ) ',' ( (lv_outKeyType_6_0= RULE_STRING ) ) ',' ( (lv_outValueType_8_0= RULE_STRING ) ) ')' ( (lv_text_10_0= ruleBlock ) )
            {
            match(input,22,FOLLOW_22_in_ruleReducer1172); 

                    createLeafNode(grammarAccess.getReducerAccess().getReduceKeyword_0(), null); 
                
            match(input,19,FOLLOW_19_in_ruleReducer1182); 

                    createLeafNode(grammarAccess.getReducerAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:744:1: ( (lv_inkey_2_0= RULE_STRING ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:745:1: (lv_inkey_2_0= RULE_STRING )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:745:1: (lv_inkey_2_0= RULE_STRING )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:746:3: lv_inkey_2_0= RULE_STRING
            {
            lv_inkey_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleReducer1199); 

            			createLeafNode(grammarAccess.getReducerAccess().getInkeySTRINGTerminalRuleCall_2_0(), "inkey"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getReducerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"inkey",
            	        		lv_inkey_2_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleReducer1214); 

                    createLeafNode(grammarAccess.getReducerAccess().getCommaKeyword_3(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:772:1: ( (lv_invalue_4_0= RULE_STRING ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:773:1: (lv_invalue_4_0= RULE_STRING )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:773:1: (lv_invalue_4_0= RULE_STRING )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:774:3: lv_invalue_4_0= RULE_STRING
            {
            lv_invalue_4_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleReducer1231); 

            			createLeafNode(grammarAccess.getReducerAccess().getInvalueSTRINGTerminalRuleCall_4_0(), "invalue"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getReducerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"invalue",
            	        		lv_invalue_4_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleReducer1246); 

                    createLeafNode(grammarAccess.getReducerAccess().getCommaKeyword_5(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:800:1: ( (lv_outKeyType_6_0= RULE_STRING ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:801:1: (lv_outKeyType_6_0= RULE_STRING )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:801:1: (lv_outKeyType_6_0= RULE_STRING )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:802:3: lv_outKeyType_6_0= RULE_STRING
            {
            lv_outKeyType_6_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleReducer1263); 

            			createLeafNode(grammarAccess.getReducerAccess().getOutKeyTypeSTRINGTerminalRuleCall_6_0(), "outKeyType"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getReducerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"outKeyType",
            	        		lv_outKeyType_6_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleReducer1278); 

                    createLeafNode(grammarAccess.getReducerAccess().getCommaKeyword_7(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:828:1: ( (lv_outValueType_8_0= RULE_STRING ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:829:1: (lv_outValueType_8_0= RULE_STRING )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:829:1: (lv_outValueType_8_0= RULE_STRING )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:830:3: lv_outValueType_8_0= RULE_STRING
            {
            lv_outValueType_8_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleReducer1295); 

            			createLeafNode(grammarAccess.getReducerAccess().getOutValueTypeSTRINGTerminalRuleCall_8_0(), "outValueType"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getReducerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"outValueType",
            	        		lv_outValueType_8_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,21,FOLLOW_21_in_ruleReducer1310); 

                    createLeafNode(grammarAccess.getReducerAccess().getRightParenthesisKeyword_9(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:856:1: ( (lv_text_10_0= ruleBlock ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:857:1: (lv_text_10_0= ruleBlock )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:857:1: (lv_text_10_0= ruleBlock )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:858:3: lv_text_10_0= ruleBlock
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getReducerAccess().getTextBlockParserRuleCall_10_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleReducer1331);
            lv_text_10_0=ruleBlock();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getReducerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"text",
            	        		lv_text_10_0, 
            	        		"Block", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleReducer


    // $ANTLR start entryRuleType
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:888:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:889:2: (iv_ruleType= ruleType EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:890:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1367);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1377); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:897:1: ruleType returns [EObject current=null] : ( ( (lv_type_0_0= 'int' ) ) | ( (lv_type_1_0= 'float' ) ) | ( (lv_type_2_0= 'double' ) ) | ( (lv_type_3_0= 'text' ) ) | ( (lv_type_4_0= 'long' ) ) | ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_type_1_0=null;
        Token lv_type_2_0=null;
        Token lv_type_3_0=null;
        Token lv_type_4_0=null;
        Token lv_name_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:902:6: ( ( ( (lv_type_0_0= 'int' ) ) | ( (lv_type_1_0= 'float' ) ) | ( (lv_type_2_0= 'double' ) ) | ( (lv_type_3_0= 'text' ) ) | ( (lv_type_4_0= 'long' ) ) | ( (lv_name_5_0= RULE_ID ) ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:903:1: ( ( (lv_type_0_0= 'int' ) ) | ( (lv_type_1_0= 'float' ) ) | ( (lv_type_2_0= 'double' ) ) | ( (lv_type_3_0= 'text' ) ) | ( (lv_type_4_0= 'long' ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:903:1: ( ( (lv_type_0_0= 'int' ) ) | ( (lv_type_1_0= 'float' ) ) | ( (lv_type_2_0= 'double' ) ) | ( (lv_type_3_0= 'text' ) ) | ( (lv_type_4_0= 'long' ) ) | ( (lv_name_5_0= RULE_ID ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case 26:
                {
                alt6=4;
                }
                break;
            case 27:
                {
                alt6=5;
                }
                break;
            case RULE_ID:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("903:1: ( ( (lv_type_0_0= 'int' ) ) | ( (lv_type_1_0= 'float' ) ) | ( (lv_type_2_0= 'double' ) ) | ( (lv_type_3_0= 'text' ) ) | ( (lv_type_4_0= 'long' ) ) | ( (lv_name_5_0= RULE_ID ) ) )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:903:2: ( (lv_type_0_0= 'int' ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:903:2: ( (lv_type_0_0= 'int' ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:904:1: (lv_type_0_0= 'int' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:904:1: (lv_type_0_0= 'int' )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:905:3: lv_type_0_0= 'int'
                    {
                    lv_type_0_0=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_ruleType1420); 

                            createLeafNode(grammarAccess.getTypeAccess().getTypeIntKeyword_0_0(), "type"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_0_0, "int", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:925:6: ( (lv_type_1_0= 'float' ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:925:6: ( (lv_type_1_0= 'float' ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:926:1: (lv_type_1_0= 'float' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:926:1: (lv_type_1_0= 'float' )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:927:3: lv_type_1_0= 'float'
                    {
                    lv_type_1_0=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_ruleType1457); 

                            createLeafNode(grammarAccess.getTypeAccess().getTypeFloatKeyword_1_0(), "type"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_1_0, "float", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:947:6: ( (lv_type_2_0= 'double' ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:947:6: ( (lv_type_2_0= 'double' ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:948:1: (lv_type_2_0= 'double' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:948:1: (lv_type_2_0= 'double' )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:949:3: lv_type_2_0= 'double'
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,25,FOLLOW_25_in_ruleType1494); 

                            createLeafNode(grammarAccess.getTypeAccess().getTypeDoubleKeyword_2_0(), "type"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_2_0, "double", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:969:6: ( (lv_type_3_0= 'text' ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:969:6: ( (lv_type_3_0= 'text' ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:970:1: (lv_type_3_0= 'text' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:970:1: (lv_type_3_0= 'text' )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:971:3: lv_type_3_0= 'text'
                    {
                    lv_type_3_0=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleType1531); 

                            createLeafNode(grammarAccess.getTypeAccess().getTypeTextKeyword_3_0(), "type"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_3_0, "text", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:991:6: ( (lv_type_4_0= 'long' ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:991:6: ( (lv_type_4_0= 'long' ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:992:1: (lv_type_4_0= 'long' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:992:1: (lv_type_4_0= 'long' )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:993:3: lv_type_4_0= 'long'
                    {
                    lv_type_4_0=(Token)input.LT(1);
                    match(input,27,FOLLOW_27_in_ruleType1568); 

                            createLeafNode(grammarAccess.getTypeAccess().getTypeLongKeyword_4_0(), "type"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_4_0, "long", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1013:6: ( (lv_name_5_0= RULE_ID ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1013:6: ( (lv_name_5_0= RULE_ID ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1014:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1014:1: (lv_name_5_0= RULE_ID )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1015:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType1604); 

                    			createLeafNode(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_5_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_5_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleEntity
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1045:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1046:2: (iv_ruleEntity= ruleEntity EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1047:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1645);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1655); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1054:1: ruleEntity returns [EObject current=null] : ( 'metaelement' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( ( RULE_ID ) ) )? '{' ( (lv_features_5_0= ruleFeature ) )+ '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_features_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1059:6: ( ( 'metaelement' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( ( RULE_ID ) ) )? '{' ( (lv_features_5_0= ruleFeature ) )+ '}' ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1060:1: ( 'metaelement' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( ( RULE_ID ) ) )? '{' ( (lv_features_5_0= ruleFeature ) )+ '}' )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1060:1: ( 'metaelement' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( ( RULE_ID ) ) )? '{' ( (lv_features_5_0= ruleFeature ) )+ '}' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1060:3: 'metaelement' ( (lv_name_1_0= RULE_ID ) ) ( 'extend' ( ( RULE_ID ) ) )? '{' ( (lv_features_5_0= ruleFeature ) )+ '}'
            {
            match(input,28,FOLLOW_28_in_ruleEntity1690); 

                    createLeafNode(grammarAccess.getEntityAccess().getMetaelementKeyword_0(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1064:1: ( (lv_name_1_0= RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1065:1: (lv_name_1_0= RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1065:1: (lv_name_1_0= RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1066:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1707); 

            			createLeafNode(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1088:2: ( 'extend' ( ( RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1088:4: 'extend' ( ( RULE_ID ) )
                    {
                    match(input,17,FOLLOW_17_in_ruleEntity1723); 

                            createLeafNode(grammarAccess.getEntityAccess().getExtendKeyword_2_0(), null); 
                        
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1092:1: ( ( RULE_ID ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1093:1: ( RULE_ID )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1093:1: ( RULE_ID )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1094:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1741); 

                    		createLeafNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0(), "superType"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ruleEntity1753); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1110:1: ( (lv_features_5_0= ruleFeature ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=23 && LA8_0<=27)||(LA8_0>=30 && LA8_0<=31)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1111:1: (lv_features_5_0= ruleFeature )
            	    {
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1111:1: (lv_features_5_0= ruleFeature )
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1112:3: lv_features_5_0= ruleFeature
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity1774);
            	    lv_features_5_0=ruleFeature();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"features",
            	    	        		lv_features_5_0, 
            	    	        		"Feature", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            match(input,12,FOLLOW_12_in_ruleEntity1785); 

                    createLeafNode(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleFeature
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1146:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1147:2: (iv_ruleFeature= ruleFeature EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1148:2: iv_ruleFeature= ruleFeature EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFeatureRule(), currentNode); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1821);
            iv_ruleFeature=ruleFeature();
            _fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1831); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFeature


    // $ANTLR start ruleFeature
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1155:1: ruleFeature returns [EObject current=null] : ( ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';' ) | ( ( (lv_readorWrite_3_0= ruleReadorWrite ) ) ';' ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;

        EObject lv_readorWrite_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1160:6: ( ( ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';' ) | ( ( (lv_readorWrite_3_0= ruleReadorWrite ) ) ';' ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1161:1: ( ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';' ) | ( ( (lv_readorWrite_3_0= ruleReadorWrite ) ) ';' ) )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1161:1: ( ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';' ) | ( ( (lv_readorWrite_3_0= ruleReadorWrite ) ) ';' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||(LA9_0>=23 && LA9_0<=27)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=30 && LA9_0<=31)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1161:1: ( ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';' ) | ( ( (lv_readorWrite_3_0= ruleReadorWrite ) ) ';' ) )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1161:2: ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1161:2: ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';' )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1161:3: ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';'
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1161:3: ( (lv_type_0_0= ruleTypeRef ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1162:1: (lv_type_0_0= ruleTypeRef )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1162:1: (lv_type_0_0= ruleTypeRef )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1163:3: lv_type_0_0= ruleTypeRef
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTypeRef_in_ruleFeature1878);
                    lv_type_0_0=ruleTypeRef();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"type",
                    	        		lv_type_0_0, 
                    	        		"TypeRef", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1185:2: ( (lv_name_1_0= RULE_ID ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1186:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1186:1: (lv_name_1_0= RULE_ID )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1187:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature1895); 

                    			createLeafNode(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,29,FOLLOW_29_in_ruleFeature1910); 

                            createLeafNode(grammarAccess.getFeatureAccess().getSemicolonKeyword_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1214:6: ( ( (lv_readorWrite_3_0= ruleReadorWrite ) ) ';' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1214:6: ( ( (lv_readorWrite_3_0= ruleReadorWrite ) ) ';' )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1214:7: ( (lv_readorWrite_3_0= ruleReadorWrite ) ) ';'
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1214:7: ( (lv_readorWrite_3_0= ruleReadorWrite ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1215:1: (lv_readorWrite_3_0= ruleReadorWrite )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1215:1: (lv_readorWrite_3_0= ruleReadorWrite )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1216:3: lv_readorWrite_3_0= ruleReadorWrite
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFeatureAccess().getReadorWriteReadorWriteParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleReadorWrite_in_ruleFeature1939);
                    lv_readorWrite_3_0=ruleReadorWrite();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"readorWrite",
                    	        		lv_readorWrite_3_0, 
                    	        		"ReadorWrite", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,29,FOLLOW_29_in_ruleFeature1949); 

                            createLeafNode(grammarAccess.getFeatureAccess().getSemicolonKeyword_1_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFeature


    // $ANTLR start entryRuleReadorWrite
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1250:1: entryRuleReadorWrite returns [EObject current=null] : iv_ruleReadorWrite= ruleReadorWrite EOF ;
    public final EObject entryRuleReadorWrite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadorWrite = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1251:2: (iv_ruleReadorWrite= ruleReadorWrite EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1252:2: iv_ruleReadorWrite= ruleReadorWrite EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReadorWriteRule(), currentNode); 
            pushFollow(FOLLOW_ruleReadorWrite_in_entryRuleReadorWrite1986);
            iv_ruleReadorWrite=ruleReadorWrite();
            _fsp--;

             current =iv_ruleReadorWrite; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadorWrite1996); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleReadorWrite


    // $ANTLR start ruleReadorWrite
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1259:1: ruleReadorWrite returns [EObject current=null] : ( ( 'read' '(' ( (lv_token_2_0= RULE_STRING ) ) ',' ( (lv_readval_4_0= RULE_STRING ) ) ')' ) | ( 'write' '(' ( (lv_token_8_0= RULE_STRING ) ) ',' ( (lv_writeval_10_0= RULE_STRING ) ) ')' ) ) ;
    public final EObject ruleReadorWrite() throws RecognitionException {
        EObject current = null;

        Token lv_token_2_0=null;
        Token lv_readval_4_0=null;
        Token lv_token_8_0=null;
        Token lv_writeval_10_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1264:6: ( ( ( 'read' '(' ( (lv_token_2_0= RULE_STRING ) ) ',' ( (lv_readval_4_0= RULE_STRING ) ) ')' ) | ( 'write' '(' ( (lv_token_8_0= RULE_STRING ) ) ',' ( (lv_writeval_10_0= RULE_STRING ) ) ')' ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1265:1: ( ( 'read' '(' ( (lv_token_2_0= RULE_STRING ) ) ',' ( (lv_readval_4_0= RULE_STRING ) ) ')' ) | ( 'write' '(' ( (lv_token_8_0= RULE_STRING ) ) ',' ( (lv_writeval_10_0= RULE_STRING ) ) ')' ) )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1265:1: ( ( 'read' '(' ( (lv_token_2_0= RULE_STRING ) ) ',' ( (lv_readval_4_0= RULE_STRING ) ) ')' ) | ( 'write' '(' ( (lv_token_8_0= RULE_STRING ) ) ',' ( (lv_writeval_10_0= RULE_STRING ) ) ')' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            else if ( (LA10_0==31) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1265:1: ( ( 'read' '(' ( (lv_token_2_0= RULE_STRING ) ) ',' ( (lv_readval_4_0= RULE_STRING ) ) ')' ) | ( 'write' '(' ( (lv_token_8_0= RULE_STRING ) ) ',' ( (lv_writeval_10_0= RULE_STRING ) ) ')' ) )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1265:2: ( 'read' '(' ( (lv_token_2_0= RULE_STRING ) ) ',' ( (lv_readval_4_0= RULE_STRING ) ) ')' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1265:2: ( 'read' '(' ( (lv_token_2_0= RULE_STRING ) ) ',' ( (lv_readval_4_0= RULE_STRING ) ) ')' )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1265:4: 'read' '(' ( (lv_token_2_0= RULE_STRING ) ) ',' ( (lv_readval_4_0= RULE_STRING ) ) ')'
                    {
                    match(input,30,FOLLOW_30_in_ruleReadorWrite2032); 

                            createLeafNode(grammarAccess.getReadorWriteAccess().getReadKeyword_0_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleReadorWrite2042); 

                            createLeafNode(grammarAccess.getReadorWriteAccess().getLeftParenthesisKeyword_0_1(), null); 
                        
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1273:1: ( (lv_token_2_0= RULE_STRING ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1274:1: (lv_token_2_0= RULE_STRING )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1274:1: (lv_token_2_0= RULE_STRING )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1275:3: lv_token_2_0= RULE_STRING
                    {
                    lv_token_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleReadorWrite2059); 

                    			createLeafNode(grammarAccess.getReadorWriteAccess().getTokenSTRINGTerminalRuleCall_0_2_0(), "token"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getReadorWriteRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"token",
                    	        		lv_token_2_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,20,FOLLOW_20_in_ruleReadorWrite2074); 

                            createLeafNode(grammarAccess.getReadorWriteAccess().getCommaKeyword_0_3(), null); 
                        
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1301:1: ( (lv_readval_4_0= RULE_STRING ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1302:1: (lv_readval_4_0= RULE_STRING )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1302:1: (lv_readval_4_0= RULE_STRING )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1303:3: lv_readval_4_0= RULE_STRING
                    {
                    lv_readval_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleReadorWrite2091); 

                    			createLeafNode(grammarAccess.getReadorWriteAccess().getReadvalSTRINGTerminalRuleCall_0_4_0(), "readval"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getReadorWriteRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"readval",
                    	        		lv_readval_4_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,21,FOLLOW_21_in_ruleReadorWrite2106); 

                            createLeafNode(grammarAccess.getReadorWriteAccess().getRightParenthesisKeyword_0_5(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1330:6: ( 'write' '(' ( (lv_token_8_0= RULE_STRING ) ) ',' ( (lv_writeval_10_0= RULE_STRING ) ) ')' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1330:6: ( 'write' '(' ( (lv_token_8_0= RULE_STRING ) ) ',' ( (lv_writeval_10_0= RULE_STRING ) ) ')' )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1330:8: 'write' '(' ( (lv_token_8_0= RULE_STRING ) ) ',' ( (lv_writeval_10_0= RULE_STRING ) ) ')'
                    {
                    match(input,31,FOLLOW_31_in_ruleReadorWrite2124); 

                            createLeafNode(grammarAccess.getReadorWriteAccess().getWriteKeyword_1_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleReadorWrite2134); 

                            createLeafNode(grammarAccess.getReadorWriteAccess().getLeftParenthesisKeyword_1_1(), null); 
                        
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1338:1: ( (lv_token_8_0= RULE_STRING ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1339:1: (lv_token_8_0= RULE_STRING )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1339:1: (lv_token_8_0= RULE_STRING )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1340:3: lv_token_8_0= RULE_STRING
                    {
                    lv_token_8_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleReadorWrite2151); 

                    			createLeafNode(grammarAccess.getReadorWriteAccess().getTokenSTRINGTerminalRuleCall_1_2_0(), "token"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getReadorWriteRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"token",
                    	        		lv_token_8_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,20,FOLLOW_20_in_ruleReadorWrite2166); 

                            createLeafNode(grammarAccess.getReadorWriteAccess().getCommaKeyword_1_3(), null); 
                        
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1366:1: ( (lv_writeval_10_0= RULE_STRING ) )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1367:1: (lv_writeval_10_0= RULE_STRING )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1367:1: (lv_writeval_10_0= RULE_STRING )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1368:3: lv_writeval_10_0= RULE_STRING
                    {
                    lv_writeval_10_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleReadorWrite2183); 

                    			createLeafNode(grammarAccess.getReadorWriteAccess().getWritevalSTRINGTerminalRuleCall_1_4_0(), "writeval"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getReadorWriteRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"writeval",
                    	        		lv_writeval_10_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,21,FOLLOW_21_in_ruleReadorWrite2198); 

                            createLeafNode(grammarAccess.getReadorWriteAccess().getRightParenthesisKeyword_1_5(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleReadorWrite


    // $ANTLR start entryRuleTypeRef
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1402:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1403:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1404:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef2235);
            iv_ruleTypeRef=ruleTypeRef();
            _fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef2245); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeRef


    // $ANTLR start ruleTypeRef
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1411:1: ruleTypeRef returns [EObject current=null] : ( ( (lv_referenced_0_0= ruleType ) ) ( (lv_multi_1_0= '*' ) )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_multi_1_0=null;
        EObject lv_referenced_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1416:6: ( ( ( (lv_referenced_0_0= ruleType ) ) ( (lv_multi_1_0= '*' ) )? ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1417:1: ( ( (lv_referenced_0_0= ruleType ) ) ( (lv_multi_1_0= '*' ) )? )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1417:1: ( ( (lv_referenced_0_0= ruleType ) ) ( (lv_multi_1_0= '*' ) )? )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1417:2: ( (lv_referenced_0_0= ruleType ) ) ( (lv_multi_1_0= '*' ) )?
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1417:2: ( (lv_referenced_0_0= ruleType ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1418:1: (lv_referenced_0_0= ruleType )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1418:1: (lv_referenced_0_0= ruleType )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1419:3: lv_referenced_0_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTypeRef2291);
            lv_referenced_0_0=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"referenced",
            	        		lv_referenced_0_0, 
            	        		"Type", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1441:2: ( (lv_multi_1_0= '*' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1442:1: (lv_multi_1_0= '*' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1442:1: (lv_multi_1_0= '*' )
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1443:3: lv_multi_1_0= '*'
                    {
                    lv_multi_1_0=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleTypeRef2309); 

                            createLeafNode(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0(), "multi"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "multi", true, "*", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeRef


    // $ANTLR start entryRuleBlock
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1470:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1471:2: (iv_ruleBlock= ruleBlock EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1472:2: iv_ruleBlock= ruleBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock2359);
            iv_ruleBlock=ruleBlock();
            _fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock2369); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBlock


    // $ANTLR start ruleBlock
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1479:1: ruleBlock returns [EObject current=null] : ( ( (lv_block_0_0= '[' ) ) ( (lv_javafunctions_1_0= ruleJavaFunction ) )* ']' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token lv_block_0_0=null;
        EObject lv_javafunctions_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1484:6: ( ( ( (lv_block_0_0= '[' ) ) ( (lv_javafunctions_1_0= ruleJavaFunction ) )* ']' ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1485:1: ( ( (lv_block_0_0= '[' ) ) ( (lv_javafunctions_1_0= ruleJavaFunction ) )* ']' )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1485:1: ( ( (lv_block_0_0= '[' ) ) ( (lv_javafunctions_1_0= ruleJavaFunction ) )* ']' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1485:2: ( (lv_block_0_0= '[' ) ) ( (lv_javafunctions_1_0= ruleJavaFunction ) )* ']'
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1485:2: ( (lv_block_0_0= '[' ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1486:1: (lv_block_0_0= '[' )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1486:1: (lv_block_0_0= '[' )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1487:3: lv_block_0_0= '['
            {
            lv_block_0_0=(Token)input.LT(1);
            match(input,33,FOLLOW_33_in_ruleBlock2412); 

                    createLeafNode(grammarAccess.getBlockAccess().getBlockLeftSquareBracketKeyword_0_0(), "block"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBlockRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "block", lv_block_0_0, "[", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1506:2: ( (lv_javafunctions_1_0= ruleJavaFunction ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=36 && LA12_0<=38)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1507:1: (lv_javafunctions_1_0= ruleJavaFunction )
            	    {
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1507:1: (lv_javafunctions_1_0= ruleJavaFunction )
            	    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1508:3: lv_javafunctions_1_0= ruleJavaFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getJavafunctionsJavaFunctionParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleJavaFunction_in_ruleBlock2446);
            	    lv_javafunctions_1_0=ruleJavaFunction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBlockRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"javafunctions",
            	    	        		lv_javafunctions_1_0, 
            	    	        		"JavaFunction", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match(input,34,FOLLOW_34_in_ruleBlock2457); 

                    createLeafNode(grammarAccess.getBlockAccess().getRightSquareBracketKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBlock


    // $ANTLR start entryRuleJavaFunction
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1542:1: entryRuleJavaFunction returns [EObject current=null] : iv_ruleJavaFunction= ruleJavaFunction EOF ;
    public final EObject entryRuleJavaFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaFunction = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1543:2: (iv_ruleJavaFunction= ruleJavaFunction EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1544:2: iv_ruleJavaFunction= ruleJavaFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getJavaFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleJavaFunction_in_entryRuleJavaFunction2493);
            iv_ruleJavaFunction=ruleJavaFunction();
            _fsp--;

             current =iv_ruleJavaFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaFunction2503); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleJavaFunction


    // $ANTLR start ruleJavaFunction
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1551:1: ruleJavaFunction returns [EObject current=null] : ( ( (lv_timeofCall_0_0= ruleTimeOfCall ) ) ':' ( (lv_paramname_2_0= RULE_ID ) ) ) ;
    public final EObject ruleJavaFunction() throws RecognitionException {
        EObject current = null;

        Token lv_paramname_2_0=null;
        AntlrDatatypeRuleToken lv_timeofCall_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1556:6: ( ( ( (lv_timeofCall_0_0= ruleTimeOfCall ) ) ':' ( (lv_paramname_2_0= RULE_ID ) ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1557:1: ( ( (lv_timeofCall_0_0= ruleTimeOfCall ) ) ':' ( (lv_paramname_2_0= RULE_ID ) ) )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1557:1: ( ( (lv_timeofCall_0_0= ruleTimeOfCall ) ) ':' ( (lv_paramname_2_0= RULE_ID ) ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1557:2: ( (lv_timeofCall_0_0= ruleTimeOfCall ) ) ':' ( (lv_paramname_2_0= RULE_ID ) )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1557:2: ( (lv_timeofCall_0_0= ruleTimeOfCall ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1558:1: (lv_timeofCall_0_0= ruleTimeOfCall )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1558:1: (lv_timeofCall_0_0= ruleTimeOfCall )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1559:3: lv_timeofCall_0_0= ruleTimeOfCall
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getJavaFunctionAccess().getTimeofCallTimeOfCallParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTimeOfCall_in_ruleJavaFunction2549);
            lv_timeofCall_0_0=ruleTimeOfCall();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getJavaFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"timeofCall",
            	        		lv_timeofCall_0_0, 
            	        		"TimeOfCall", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,35,FOLLOW_35_in_ruleJavaFunction2559); 

                    createLeafNode(grammarAccess.getJavaFunctionAccess().getColonKeyword_1(), null); 
                
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1585:1: ( (lv_paramname_2_0= RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1586:1: (lv_paramname_2_0= RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1586:1: (lv_paramname_2_0= RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1587:3: lv_paramname_2_0= RULE_ID
            {
            lv_paramname_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJavaFunction2576); 

            			createLeafNode(grammarAccess.getJavaFunctionAccess().getParamnameIDTerminalRuleCall_2_0(), "paramname"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getJavaFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"paramname",
            	        		lv_paramname_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleJavaFunction


    // $ANTLR start entryRuleTimeOfCall
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1617:1: entryRuleTimeOfCall returns [String current=null] : iv_ruleTimeOfCall= ruleTimeOfCall EOF ;
    public final String entryRuleTimeOfCall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeOfCall = null;


        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1618:2: (iv_ruleTimeOfCall= ruleTimeOfCall EOF )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1619:2: iv_ruleTimeOfCall= ruleTimeOfCall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTimeOfCallRule(), currentNode); 
            pushFollow(FOLLOW_ruleTimeOfCall_in_entryRuleTimeOfCall2618);
            iv_ruleTimeOfCall=ruleTimeOfCall();
            _fsp--;

             current =iv_ruleTimeOfCall.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeOfCall2629); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTimeOfCall


    // $ANTLR start ruleTimeOfCall
    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1626:1: ruleTimeOfCall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'after' | kw= 'call' | kw= 'before' ) ;
    public final AntlrDatatypeRuleToken ruleTimeOfCall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1631:6: ( (kw= 'after' | kw= 'call' | kw= 'before' ) )
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1632:1: (kw= 'after' | kw= 'call' | kw= 'before' )
            {
            // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1632:1: (kw= 'after' | kw= 'call' | kw= 'before' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt13=1;
                }
                break;
            case 37:
                {
                alt13=2;
                }
                break;
            case 38:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1632:1: (kw= 'after' | kw= 'call' | kw= 'before' )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1633:2: kw= 'after'
                    {
                    kw=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_ruleTimeOfCall2667); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getTimeOfCallAccess().getAfterKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1640:2: kw= 'call'
                    {
                    kw=(Token)input.LT(1);
                    match(input,37,FOLLOW_37_in_ruleTimeOfCall2686); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getTimeOfCallAccess().getCallKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../cs.ua.edu.segroup.mapredoop/src-gen/cs/ua/edu/se/parser/antlr/internal/InternalMapRedoop.g:1647:2: kw= 'before'
                    {
                    kw=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_ruleTimeOfCall2705); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getTimeOfCallAccess().getBeforeKeyword_2(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTimeOfCall


 

    public static final BitSet FOLLOW_ruleMapRedoop_in_entryRuleMapRedoop75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapRedoop85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleMapRedoop131 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleMapRedoop141 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_ruleContent_in_ruleMapRedoop162 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_12_in_ruleMapRedoop173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListofEntities_in_ruleContent265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMRBlock_in_ruleContent292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListofEntities_in_entryRuleListofEntities328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListofEntities338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleListofEntities382 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleListofEntities392 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleListofEntities413 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_12_in_ruleListofEntities424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMRBlock_in_entryRuleMRBlock460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMRBlock470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMRBlock505 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_15_in_ruleMRBlock523 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleMRBlock547 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleMapper_in_ruleMRBlock568 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleReducer_in_ruleMRBlock589 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMRBlock599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDeclaration680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration697 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleDeclaration713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapper_in_entryRuleMapper773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapper783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMapper818 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMapper828 = new BitSet(new long[]{0x000000000F800010L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleMapper849 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMapper859 = new BitSet(new long[]{0x000000000F800010L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleMapper880 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMapper890 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMapper907 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMapper922 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMapper939 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMapper954 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleMapper975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument1011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleArgument1067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReducer_in_entryRuleReducer1127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReducer1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleReducer1172 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleReducer1182 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleReducer1199 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleReducer1214 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleReducer1231 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleReducer1246 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleReducer1263 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleReducer1278 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleReducer1295 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleReducer1310 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleReducer1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleType1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleType1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleType1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleType1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleType1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEntity1690 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1707 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_17_in_ruleEntity1723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1741 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleEntity1753 = new BitSet(new long[]{0x00000000CF800010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity1774 = new BitSet(new long[]{0x00000000CF801010L});
    public static final BitSet FOLLOW_12_in_ruleEntity1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleFeature1878 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature1895 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleFeature1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadorWrite_in_ruleFeature1939 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleFeature1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadorWrite_in_entryRuleReadorWrite1986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadorWrite1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleReadorWrite2032 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleReadorWrite2042 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleReadorWrite2059 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleReadorWrite2074 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleReadorWrite2091 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleReadorWrite2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleReadorWrite2124 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleReadorWrite2134 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleReadorWrite2151 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleReadorWrite2166 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleReadorWrite2183 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleReadorWrite2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef2235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeRef2291 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleTypeRef2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock2359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBlock2412 = new BitSet(new long[]{0x0000007400000000L});
    public static final BitSet FOLLOW_ruleJavaFunction_in_ruleBlock2446 = new BitSet(new long[]{0x0000007400000000L});
    public static final BitSet FOLLOW_34_in_ruleBlock2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaFunction_in_entryRuleJavaFunction2493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaFunction2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeOfCall_in_ruleJavaFunction2549 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleJavaFunction2559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJavaFunction2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeOfCall_in_entryRuleTimeOfCall2618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeOfCall2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleTimeOfCall2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTimeOfCall2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTimeOfCall2705 = new BitSet(new long[]{0x0000000000000002L});

}