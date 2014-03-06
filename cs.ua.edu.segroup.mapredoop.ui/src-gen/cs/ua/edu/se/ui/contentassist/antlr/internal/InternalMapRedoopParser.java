package cs.ua.edu.se.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import cs.ua.edu.se.services.MapRedoopGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMapRedoopParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'after'", "'call'", "'before'", "'{'", "'}'", "'metaelements:'", "'mapreduce:'", "'program'", "'extend'", "'map'", "'('", "','", "')'", "'reduce'", "'metaelement'", "';'", "'read'", "'write'", "']'", "':'", "'loop'", "'int'", "'float'", "'double'", "'text'", "'long'", "'*'", "'['"
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
    public String getGrammarFileName() { return "../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g"; }


     
     	private MapRedoopGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MapRedoopGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleMapRedoop
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:61:1: entryRuleMapRedoop : ruleMapRedoop EOF ;
    public final void entryRuleMapRedoop() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:62:1: ( ruleMapRedoop EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:63:1: ruleMapRedoop EOF
            {
             before(grammarAccess.getMapRedoopRule()); 
            pushFollow(FOLLOW_ruleMapRedoop_in_entryRuleMapRedoop61);
            ruleMapRedoop();
            _fsp--;

             after(grammarAccess.getMapRedoopRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapRedoop68); 

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
    // $ANTLR end entryRuleMapRedoop


    // $ANTLR start ruleMapRedoop
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:70:1: ruleMapRedoop : ( ( rule__MapRedoop__Group__0 ) ) ;
    public final void ruleMapRedoop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:74:2: ( ( ( rule__MapRedoop__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:75:1: ( ( rule__MapRedoop__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:75:1: ( ( rule__MapRedoop__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:76:1: ( rule__MapRedoop__Group__0 )
            {
             before(grammarAccess.getMapRedoopAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:77:1: ( rule__MapRedoop__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:77:2: rule__MapRedoop__Group__0
            {
            pushFollow(FOLLOW_rule__MapRedoop__Group__0_in_ruleMapRedoop94);
            rule__MapRedoop__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMapRedoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMapRedoop


    // $ANTLR start entryRuleContent
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:89:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:90:1: ( ruleContent EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:91:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent121);
            ruleContent();
            _fsp--;

             after(grammarAccess.getContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent128); 

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
    // $ANTLR end entryRuleContent


    // $ANTLR start ruleContent
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:98:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:102:2: ( ( ( rule__Content__Alternatives ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:103:1: ( ( rule__Content__Alternatives ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:103:1: ( ( rule__Content__Alternatives ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:104:1: ( rule__Content__Alternatives )
            {
             before(grammarAccess.getContentAccess().getAlternatives()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:105:1: ( rule__Content__Alternatives )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:105:2: rule__Content__Alternatives
            {
            pushFollow(FOLLOW_rule__Content__Alternatives_in_ruleContent154);
            rule__Content__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getContentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleContent


    // $ANTLR start entryRuleListofEntities
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:117:1: entryRuleListofEntities : ruleListofEntities EOF ;
    public final void entryRuleListofEntities() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:118:1: ( ruleListofEntities EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:119:1: ruleListofEntities EOF
            {
             before(grammarAccess.getListofEntitiesRule()); 
            pushFollow(FOLLOW_ruleListofEntities_in_entryRuleListofEntities181);
            ruleListofEntities();
            _fsp--;

             after(grammarAccess.getListofEntitiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListofEntities188); 

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
    // $ANTLR end entryRuleListofEntities


    // $ANTLR start ruleListofEntities
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:126:1: ruleListofEntities : ( ( rule__ListofEntities__Group__0 ) ) ;
    public final void ruleListofEntities() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:130:2: ( ( ( rule__ListofEntities__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:131:1: ( ( rule__ListofEntities__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:131:1: ( ( rule__ListofEntities__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:132:1: ( rule__ListofEntities__Group__0 )
            {
             before(grammarAccess.getListofEntitiesAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:133:1: ( rule__ListofEntities__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:133:2: rule__ListofEntities__Group__0
            {
            pushFollow(FOLLOW_rule__ListofEntities__Group__0_in_ruleListofEntities214);
            rule__ListofEntities__Group__0();
            _fsp--;


            }

             after(grammarAccess.getListofEntitiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleListofEntities


    // $ANTLR start entryRuleMRBlock
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:145:1: entryRuleMRBlock : ruleMRBlock EOF ;
    public final void entryRuleMRBlock() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:146:1: ( ruleMRBlock EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:147:1: ruleMRBlock EOF
            {
             before(grammarAccess.getMRBlockRule()); 
            pushFollow(FOLLOW_ruleMRBlock_in_entryRuleMRBlock241);
            ruleMRBlock();
            _fsp--;

             after(grammarAccess.getMRBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMRBlock248); 

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
    // $ANTLR end entryRuleMRBlock


    // $ANTLR start ruleMRBlock
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:154:1: ruleMRBlock : ( ( rule__MRBlock__Group__0 ) ) ;
    public final void ruleMRBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:158:2: ( ( ( rule__MRBlock__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:159:1: ( ( rule__MRBlock__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:159:1: ( ( rule__MRBlock__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:160:1: ( rule__MRBlock__Group__0 )
            {
             before(grammarAccess.getMRBlockAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:161:1: ( rule__MRBlock__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:161:2: rule__MRBlock__Group__0
            {
            pushFollow(FOLLOW_rule__MRBlock__Group__0_in_ruleMRBlock274);
            rule__MRBlock__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMRBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMRBlock


    // $ANTLR start entryRuleDeclaration
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:173:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:174:1: ( ruleDeclaration EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:175:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration301);
            ruleDeclaration();
            _fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration308); 

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
    // $ANTLR end entryRuleDeclaration


    // $ANTLR start ruleDeclaration
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:182:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:186:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:187:1: ( ( rule__Declaration__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:187:1: ( ( rule__Declaration__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:188:1: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:189:1: ( rule__Declaration__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:189:2: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration334);
            rule__Declaration__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDeclaration


    // $ANTLR start entryRuleMapper
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:201:1: entryRuleMapper : ruleMapper EOF ;
    public final void entryRuleMapper() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:202:1: ( ruleMapper EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:203:1: ruleMapper EOF
            {
             before(grammarAccess.getMapperRule()); 
            pushFollow(FOLLOW_ruleMapper_in_entryRuleMapper361);
            ruleMapper();
            _fsp--;

             after(grammarAccess.getMapperRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapper368); 

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
    // $ANTLR end entryRuleMapper


    // $ANTLR start ruleMapper
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:210:1: ruleMapper : ( ( rule__Mapper__Group__0 ) ) ;
    public final void ruleMapper() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:214:2: ( ( ( rule__Mapper__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:215:1: ( ( rule__Mapper__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:215:1: ( ( rule__Mapper__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:216:1: ( rule__Mapper__Group__0 )
            {
             before(grammarAccess.getMapperAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:217:1: ( rule__Mapper__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:217:2: rule__Mapper__Group__0
            {
            pushFollow(FOLLOW_rule__Mapper__Group__0_in_ruleMapper394);
            rule__Mapper__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMapperAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMapper


    // $ANTLR start entryRuleArgument
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:229:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:230:1: ( ruleArgument EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:231:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument421);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument428); 

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
    // $ANTLR end entryRuleArgument


    // $ANTLR start ruleArgument
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:238:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:242:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:243:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:243:1: ( ( rule__Argument__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:244:1: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:245:1: ( rule__Argument__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:245:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument454);
            rule__Argument__Group__0();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleArgument


    // $ANTLR start entryRuleReducer
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:259:1: entryRuleReducer : ruleReducer EOF ;
    public final void entryRuleReducer() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:260:1: ( ruleReducer EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:261:1: ruleReducer EOF
            {
             before(grammarAccess.getReducerRule()); 
            pushFollow(FOLLOW_ruleReducer_in_entryRuleReducer483);
            ruleReducer();
            _fsp--;

             after(grammarAccess.getReducerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReducer490); 

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
    // $ANTLR end entryRuleReducer


    // $ANTLR start ruleReducer
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:268:1: ruleReducer : ( ( rule__Reducer__Group__0 ) ) ;
    public final void ruleReducer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:272:2: ( ( ( rule__Reducer__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:273:1: ( ( rule__Reducer__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:273:1: ( ( rule__Reducer__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:274:1: ( rule__Reducer__Group__0 )
            {
             before(grammarAccess.getReducerAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:275:1: ( rule__Reducer__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:275:2: rule__Reducer__Group__0
            {
            pushFollow(FOLLOW_rule__Reducer__Group__0_in_ruleReducer516);
            rule__Reducer__Group__0();
            _fsp--;


            }

             after(grammarAccess.getReducerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleReducer


    // $ANTLR start entryRuleType
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:287:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:288:1: ( ruleType EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:289:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType543);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType550); 

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
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:296:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:300:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:301:1: ( ( rule__Type__Alternatives ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:301:1: ( ( rule__Type__Alternatives ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:302:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:303:1: ( rule__Type__Alternatives )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:303:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType576);
            rule__Type__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleEntity
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:315:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:316:1: ( ruleEntity EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:317:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity603);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity610); 

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
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:324:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:328:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:329:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:329:1: ( ( rule__Entity__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:330:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:331:1: ( rule__Entity__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:331:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity636);
            rule__Entity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleFeature
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:343:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:344:1: ( ruleFeature EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:345:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature663);
            ruleFeature();
            _fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature670); 

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
    // $ANTLR end entryRuleFeature


    // $ANTLR start ruleFeature
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:352:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:356:2: ( ( ( rule__Feature__Alternatives ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:357:1: ( ( rule__Feature__Alternatives ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:357:1: ( ( rule__Feature__Alternatives ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:358:1: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:359:1: ( rule__Feature__Alternatives )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:359:2: rule__Feature__Alternatives
            {
            pushFollow(FOLLOW_rule__Feature__Alternatives_in_ruleFeature696);
            rule__Feature__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFeature


    // $ANTLR start entryRuleReadorWrite
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:371:1: entryRuleReadorWrite : ruleReadorWrite EOF ;
    public final void entryRuleReadorWrite() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:372:1: ( ruleReadorWrite EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:373:1: ruleReadorWrite EOF
            {
             before(grammarAccess.getReadorWriteRule()); 
            pushFollow(FOLLOW_ruleReadorWrite_in_entryRuleReadorWrite723);
            ruleReadorWrite();
            _fsp--;

             after(grammarAccess.getReadorWriteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadorWrite730); 

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
    // $ANTLR end entryRuleReadorWrite


    // $ANTLR start ruleReadorWrite
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:380:1: ruleReadorWrite : ( ( rule__ReadorWrite__Alternatives ) ) ;
    public final void ruleReadorWrite() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:384:2: ( ( ( rule__ReadorWrite__Alternatives ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:385:1: ( ( rule__ReadorWrite__Alternatives ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:385:1: ( ( rule__ReadorWrite__Alternatives ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:386:1: ( rule__ReadorWrite__Alternatives )
            {
             before(grammarAccess.getReadorWriteAccess().getAlternatives()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:387:1: ( rule__ReadorWrite__Alternatives )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:387:2: rule__ReadorWrite__Alternatives
            {
            pushFollow(FOLLOW_rule__ReadorWrite__Alternatives_in_ruleReadorWrite756);
            rule__ReadorWrite__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getReadorWriteAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleReadorWrite


    // $ANTLR start entryRuleTypeRef
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:399:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:400:1: ( ruleTypeRef EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:401:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef783);
            ruleTypeRef();
            _fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef790); 

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
    // $ANTLR end entryRuleTypeRef


    // $ANTLR start ruleTypeRef
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:408:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:412:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:413:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:413:1: ( ( rule__TypeRef__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:414:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:415:1: ( rule__TypeRef__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:415:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef816);
            rule__TypeRef__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTypeRef


    // $ANTLR start entryRuleBlock
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:427:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:428:1: ( ruleBlock EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:429:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock843);
            ruleBlock();
            _fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock850); 

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
    // $ANTLR end entryRuleBlock


    // $ANTLR start ruleBlock
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:436:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:440:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:441:1: ( ( rule__Block__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:441:1: ( ( rule__Block__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:442:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:443:1: ( rule__Block__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:443:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleBlock876);
            rule__Block__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBlock


    // $ANTLR start entryRuleJavaFunction
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:455:1: entryRuleJavaFunction : ruleJavaFunction EOF ;
    public final void entryRuleJavaFunction() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:456:1: ( ruleJavaFunction EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:457:1: ruleJavaFunction EOF
            {
             before(grammarAccess.getJavaFunctionRule()); 
            pushFollow(FOLLOW_ruleJavaFunction_in_entryRuleJavaFunction903);
            ruleJavaFunction();
            _fsp--;

             after(grammarAccess.getJavaFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaFunction910); 

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
    // $ANTLR end entryRuleJavaFunction


    // $ANTLR start ruleJavaFunction
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:464:1: ruleJavaFunction : ( ( rule__JavaFunction__Group__0 ) ) ;
    public final void ruleJavaFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:468:2: ( ( ( rule__JavaFunction__Group__0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:469:1: ( ( rule__JavaFunction__Group__0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:469:1: ( ( rule__JavaFunction__Group__0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:470:1: ( rule__JavaFunction__Group__0 )
            {
             before(grammarAccess.getJavaFunctionAccess().getGroup()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:471:1: ( rule__JavaFunction__Group__0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:471:2: rule__JavaFunction__Group__0
            {
            pushFollow(FOLLOW_rule__JavaFunction__Group__0_in_ruleJavaFunction936);
            rule__JavaFunction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getJavaFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleJavaFunction


    // $ANTLR start entryRuleTimeOfCall
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:483:1: entryRuleTimeOfCall : ruleTimeOfCall EOF ;
    public final void entryRuleTimeOfCall() throws RecognitionException {
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:484:1: ( ruleTimeOfCall EOF )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:485:1: ruleTimeOfCall EOF
            {
             before(grammarAccess.getTimeOfCallRule()); 
            pushFollow(FOLLOW_ruleTimeOfCall_in_entryRuleTimeOfCall963);
            ruleTimeOfCall();
            _fsp--;

             after(grammarAccess.getTimeOfCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeOfCall970); 

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
    // $ANTLR end entryRuleTimeOfCall


    // $ANTLR start ruleTimeOfCall
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:492:1: ruleTimeOfCall : ( ( rule__TimeOfCall__Alternatives ) ) ;
    public final void ruleTimeOfCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:496:2: ( ( ( rule__TimeOfCall__Alternatives ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:497:1: ( ( rule__TimeOfCall__Alternatives ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:497:1: ( ( rule__TimeOfCall__Alternatives ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:498:1: ( rule__TimeOfCall__Alternatives )
            {
             before(grammarAccess.getTimeOfCallAccess().getAlternatives()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:499:1: ( rule__TimeOfCall__Alternatives )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:499:2: rule__TimeOfCall__Alternatives
            {
            pushFollow(FOLLOW_rule__TimeOfCall__Alternatives_in_ruleTimeOfCall996);
            rule__TimeOfCall__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTimeOfCallAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTimeOfCall


    // $ANTLR start rule__Content__Alternatives
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:511:1: rule__Content__Alternatives : ( ( ( rule__Content__EntitiesAssignment_0 ) ) | ( ( rule__Content__MrBlocksAssignment_1 ) ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:515:1: ( ( ( rule__Content__EntitiesAssignment_0 ) ) | ( ( rule__Content__MrBlocksAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("511:1: rule__Content__Alternatives : ( ( ( rule__Content__EntitiesAssignment_0 ) ) | ( ( rule__Content__MrBlocksAssignment_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:516:1: ( ( rule__Content__EntitiesAssignment_0 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:516:1: ( ( rule__Content__EntitiesAssignment_0 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:517:1: ( rule__Content__EntitiesAssignment_0 )
                    {
                     before(grammarAccess.getContentAccess().getEntitiesAssignment_0()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:518:1: ( rule__Content__EntitiesAssignment_0 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:518:2: rule__Content__EntitiesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Content__EntitiesAssignment_0_in_rule__Content__Alternatives1032);
                    rule__Content__EntitiesAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getContentAccess().getEntitiesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:522:6: ( ( rule__Content__MrBlocksAssignment_1 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:522:6: ( ( rule__Content__MrBlocksAssignment_1 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:523:1: ( rule__Content__MrBlocksAssignment_1 )
                    {
                     before(grammarAccess.getContentAccess().getMrBlocksAssignment_1()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:524:1: ( rule__Content__MrBlocksAssignment_1 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:524:2: rule__Content__MrBlocksAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Content__MrBlocksAssignment_1_in_rule__Content__Alternatives1050);
                    rule__Content__MrBlocksAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getContentAccess().getMrBlocksAssignment_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Content__Alternatives


    // $ANTLR start rule__Type__Alternatives
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:533:1: rule__Type__Alternatives : ( ( ( rule__Type__TypeAssignment_0 ) ) | ( ( rule__Type__TypeAssignment_1 ) ) | ( ( rule__Type__TypeAssignment_2 ) ) | ( ( rule__Type__TypeAssignment_3 ) ) | ( ( rule__Type__TypeAssignment_4 ) ) | ( ( rule__Type__NameAssignment_5 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:537:1: ( ( ( rule__Type__TypeAssignment_0 ) ) | ( ( rule__Type__TypeAssignment_1 ) ) | ( ( rule__Type__TypeAssignment_2 ) ) | ( ( rule__Type__TypeAssignment_3 ) ) | ( ( rule__Type__TypeAssignment_4 ) ) | ( ( rule__Type__NameAssignment_5 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=3;
                }
                break;
            case 35:
                {
                alt2=4;
                }
                break;
            case 36:
                {
                alt2=5;
                }
                break;
            case RULE_ID:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("533:1: rule__Type__Alternatives : ( ( ( rule__Type__TypeAssignment_0 ) ) | ( ( rule__Type__TypeAssignment_1 ) ) | ( ( rule__Type__TypeAssignment_2 ) ) | ( ( rule__Type__TypeAssignment_3 ) ) | ( ( rule__Type__TypeAssignment_4 ) ) | ( ( rule__Type__NameAssignment_5 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:538:1: ( ( rule__Type__TypeAssignment_0 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:538:1: ( ( rule__Type__TypeAssignment_0 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:539:1: ( rule__Type__TypeAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeAssignment_0()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:540:1: ( rule__Type__TypeAssignment_0 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:540:2: rule__Type__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type__TypeAssignment_0_in_rule__Type__Alternatives1083);
                    rule__Type__TypeAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:544:6: ( ( rule__Type__TypeAssignment_1 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:544:6: ( ( rule__Type__TypeAssignment_1 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:545:1: ( rule__Type__TypeAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeAssignment_1()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:546:1: ( rule__Type__TypeAssignment_1 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:546:2: rule__Type__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Type__TypeAssignment_1_in_rule__Type__Alternatives1101);
                    rule__Type__TypeAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:550:6: ( ( rule__Type__TypeAssignment_2 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:550:6: ( ( rule__Type__TypeAssignment_2 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:551:1: ( rule__Type__TypeAssignment_2 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeAssignment_2()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:552:1: ( rule__Type__TypeAssignment_2 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:552:2: rule__Type__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Type__TypeAssignment_2_in_rule__Type__Alternatives1119);
                    rule__Type__TypeAssignment_2();
                    _fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:556:6: ( ( rule__Type__TypeAssignment_3 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:556:6: ( ( rule__Type__TypeAssignment_3 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:557:1: ( rule__Type__TypeAssignment_3 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeAssignment_3()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:558:1: ( rule__Type__TypeAssignment_3 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:558:2: rule__Type__TypeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Type__TypeAssignment_3_in_rule__Type__Alternatives1137);
                    rule__Type__TypeAssignment_3();
                    _fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:562:6: ( ( rule__Type__TypeAssignment_4 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:562:6: ( ( rule__Type__TypeAssignment_4 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:563:1: ( rule__Type__TypeAssignment_4 )
                    {
                     before(grammarAccess.getTypeAccess().getTypeAssignment_4()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:564:1: ( rule__Type__TypeAssignment_4 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:564:2: rule__Type__TypeAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Type__TypeAssignment_4_in_rule__Type__Alternatives1155);
                    rule__Type__TypeAssignment_4();
                    _fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTypeAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:568:6: ( ( rule__Type__NameAssignment_5 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:568:6: ( ( rule__Type__NameAssignment_5 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:569:1: ( rule__Type__NameAssignment_5 )
                    {
                     before(grammarAccess.getTypeAccess().getNameAssignment_5()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:570:1: ( rule__Type__NameAssignment_5 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:570:2: rule__Type__NameAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Type__NameAssignment_5_in_rule__Type__Alternatives1173);
                    rule__Type__NameAssignment_5();
                    _fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getNameAssignment_5()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__Alternatives


    // $ANTLR start rule__Feature__Alternatives
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:579:1: rule__Feature__Alternatives : ( ( ( rule__Feature__Group_0__0 ) ) | ( ( rule__Feature__Group_1__0 ) ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:583:1: ( ( ( rule__Feature__Group_0__0 ) ) | ( ( rule__Feature__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||(LA3_0>=32 && LA3_0<=36)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=27 && LA3_0<=28)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("579:1: rule__Feature__Alternatives : ( ( ( rule__Feature__Group_0__0 ) ) | ( ( rule__Feature__Group_1__0 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:584:1: ( ( rule__Feature__Group_0__0 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:584:1: ( ( rule__Feature__Group_0__0 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:585:1: ( rule__Feature__Group_0__0 )
                    {
                     before(grammarAccess.getFeatureAccess().getGroup_0()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:586:1: ( rule__Feature__Group_0__0 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:586:2: rule__Feature__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_0__0_in_rule__Feature__Alternatives1206);
                    rule__Feature__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFeatureAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:590:6: ( ( rule__Feature__Group_1__0 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:590:6: ( ( rule__Feature__Group_1__0 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:591:1: ( rule__Feature__Group_1__0 )
                    {
                     before(grammarAccess.getFeatureAccess().getGroup_1()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:592:1: ( rule__Feature__Group_1__0 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:592:2: rule__Feature__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_1__0_in_rule__Feature__Alternatives1224);
                    rule__Feature__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFeatureAccess().getGroup_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Alternatives


    // $ANTLR start rule__ReadorWrite__Alternatives
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:601:1: rule__ReadorWrite__Alternatives : ( ( ( rule__ReadorWrite__Group_0__0 ) ) | ( ( rule__ReadorWrite__Group_1__0 ) ) );
    public final void rule__ReadorWrite__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:605:1: ( ( ( rule__ReadorWrite__Group_0__0 ) ) | ( ( rule__ReadorWrite__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            else if ( (LA4_0==28) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("601:1: rule__ReadorWrite__Alternatives : ( ( ( rule__ReadorWrite__Group_0__0 ) ) | ( ( rule__ReadorWrite__Group_1__0 ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:606:1: ( ( rule__ReadorWrite__Group_0__0 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:606:1: ( ( rule__ReadorWrite__Group_0__0 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:607:1: ( rule__ReadorWrite__Group_0__0 )
                    {
                     before(grammarAccess.getReadorWriteAccess().getGroup_0()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:608:1: ( rule__ReadorWrite__Group_0__0 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:608:2: rule__ReadorWrite__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ReadorWrite__Group_0__0_in_rule__ReadorWrite__Alternatives1257);
                    rule__ReadorWrite__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getReadorWriteAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:612:6: ( ( rule__ReadorWrite__Group_1__0 ) )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:612:6: ( ( rule__ReadorWrite__Group_1__0 ) )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:613:1: ( rule__ReadorWrite__Group_1__0 )
                    {
                     before(grammarAccess.getReadorWriteAccess().getGroup_1()); 
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:614:1: ( rule__ReadorWrite__Group_1__0 )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:614:2: rule__ReadorWrite__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ReadorWrite__Group_1__0_in_rule__ReadorWrite__Alternatives1275);
                    rule__ReadorWrite__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getReadorWriteAccess().getGroup_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Alternatives


    // $ANTLR start rule__TimeOfCall__Alternatives
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:623:1: rule__TimeOfCall__Alternatives : ( ( 'after' ) | ( 'call' ) | ( 'before' ) );
    public final void rule__TimeOfCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:627:1: ( ( 'after' ) | ( 'call' ) | ( 'before' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("623:1: rule__TimeOfCall__Alternatives : ( ( 'after' ) | ( 'call' ) | ( 'before' ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:628:1: ( 'after' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:628:1: ( 'after' )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:629:1: 'after'
                    {
                     before(grammarAccess.getTimeOfCallAccess().getAfterKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__TimeOfCall__Alternatives1309); 
                     after(grammarAccess.getTimeOfCallAccess().getAfterKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:636:6: ( 'call' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:636:6: ( 'call' )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:637:1: 'call'
                    {
                     before(grammarAccess.getTimeOfCallAccess().getCallKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__TimeOfCall__Alternatives1329); 
                     after(grammarAccess.getTimeOfCallAccess().getCallKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:644:6: ( 'before' )
                    {
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:644:6: ( 'before' )
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:645:1: 'before'
                    {
                     before(grammarAccess.getTimeOfCallAccess().getBeforeKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__TimeOfCall__Alternatives1349); 
                     after(grammarAccess.getTimeOfCallAccess().getBeforeKeyword_2()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TimeOfCall__Alternatives


    // $ANTLR start rule__MapRedoop__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:659:1: rule__MapRedoop__Group__0 : rule__MapRedoop__Group__0__Impl rule__MapRedoop__Group__1 ;
    public final void rule__MapRedoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:663:1: ( rule__MapRedoop__Group__0__Impl rule__MapRedoop__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:664:2: rule__MapRedoop__Group__0__Impl rule__MapRedoop__Group__1
            {
            pushFollow(FOLLOW_rule__MapRedoop__Group__0__Impl_in_rule__MapRedoop__Group__01381);
            rule__MapRedoop__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MapRedoop__Group__1_in_rule__MapRedoop__Group__01384);
            rule__MapRedoop__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__Group__0


    // $ANTLR start rule__MapRedoop__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:671:1: rule__MapRedoop__Group__0__Impl : ( ( rule__MapRedoop__DeclarationAssignment_0 ) ) ;
    public final void rule__MapRedoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:675:1: ( ( ( rule__MapRedoop__DeclarationAssignment_0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:676:1: ( ( rule__MapRedoop__DeclarationAssignment_0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:676:1: ( ( rule__MapRedoop__DeclarationAssignment_0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:677:1: ( rule__MapRedoop__DeclarationAssignment_0 )
            {
             before(grammarAccess.getMapRedoopAccess().getDeclarationAssignment_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:678:1: ( rule__MapRedoop__DeclarationAssignment_0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:678:2: rule__MapRedoop__DeclarationAssignment_0
            {
            pushFollow(FOLLOW_rule__MapRedoop__DeclarationAssignment_0_in_rule__MapRedoop__Group__0__Impl1411);
            rule__MapRedoop__DeclarationAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMapRedoopAccess().getDeclarationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__Group__0__Impl


    // $ANTLR start rule__MapRedoop__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:688:1: rule__MapRedoop__Group__1 : rule__MapRedoop__Group__1__Impl rule__MapRedoop__Group__2 ;
    public final void rule__MapRedoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:692:1: ( rule__MapRedoop__Group__1__Impl rule__MapRedoop__Group__2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:693:2: rule__MapRedoop__Group__1__Impl rule__MapRedoop__Group__2
            {
            pushFollow(FOLLOW_rule__MapRedoop__Group__1__Impl_in_rule__MapRedoop__Group__11441);
            rule__MapRedoop__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MapRedoop__Group__2_in_rule__MapRedoop__Group__11444);
            rule__MapRedoop__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__Group__1


    // $ANTLR start rule__MapRedoop__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:700:1: rule__MapRedoop__Group__1__Impl : ( '{' ) ;
    public final void rule__MapRedoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:704:1: ( ( '{' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:705:1: ( '{' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:705:1: ( '{' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:706:1: '{'
            {
             before(grammarAccess.getMapRedoopAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__MapRedoop__Group__1__Impl1472); 
             after(grammarAccess.getMapRedoopAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__Group__1__Impl


    // $ANTLR start rule__MapRedoop__Group__2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:719:1: rule__MapRedoop__Group__2 : rule__MapRedoop__Group__2__Impl rule__MapRedoop__Group__3 ;
    public final void rule__MapRedoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:723:1: ( rule__MapRedoop__Group__2__Impl rule__MapRedoop__Group__3 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:724:2: rule__MapRedoop__Group__2__Impl rule__MapRedoop__Group__3
            {
            pushFollow(FOLLOW_rule__MapRedoop__Group__2__Impl_in_rule__MapRedoop__Group__21503);
            rule__MapRedoop__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MapRedoop__Group__3_in_rule__MapRedoop__Group__21506);
            rule__MapRedoop__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__Group__2


    // $ANTLR start rule__MapRedoop__Group__2__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:731:1: rule__MapRedoop__Group__2__Impl : ( ( rule__MapRedoop__ContentAssignment_2 )* ) ;
    public final void rule__MapRedoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:735:1: ( ( ( rule__MapRedoop__ContentAssignment_2 )* ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:736:1: ( ( rule__MapRedoop__ContentAssignment_2 )* )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:736:1: ( ( rule__MapRedoop__ContentAssignment_2 )* )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:737:1: ( rule__MapRedoop__ContentAssignment_2 )*
            {
             before(grammarAccess.getMapRedoopAccess().getContentAssignment_2()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:738:1: ( rule__MapRedoop__ContentAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=16 && LA6_0<=17)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:738:2: rule__MapRedoop__ContentAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__MapRedoop__ContentAssignment_2_in_rule__MapRedoop__Group__2__Impl1533);
            	    rule__MapRedoop__ContentAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMapRedoopAccess().getContentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__Group__2__Impl


    // $ANTLR start rule__MapRedoop__Group__3
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:748:1: rule__MapRedoop__Group__3 : rule__MapRedoop__Group__3__Impl ;
    public final void rule__MapRedoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:752:1: ( rule__MapRedoop__Group__3__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:753:2: rule__MapRedoop__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MapRedoop__Group__3__Impl_in_rule__MapRedoop__Group__31564);
            rule__MapRedoop__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__Group__3


    // $ANTLR start rule__MapRedoop__Group__3__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:759:1: rule__MapRedoop__Group__3__Impl : ( '}' ) ;
    public final void rule__MapRedoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:763:1: ( ( '}' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:764:1: ( '}' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:764:1: ( '}' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:765:1: '}'
            {
             before(grammarAccess.getMapRedoopAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__MapRedoop__Group__3__Impl1592); 
             after(grammarAccess.getMapRedoopAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__Group__3__Impl


    // $ANTLR start rule__ListofEntities__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:786:1: rule__ListofEntities__Group__0 : rule__ListofEntities__Group__0__Impl rule__ListofEntities__Group__1 ;
    public final void rule__ListofEntities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:790:1: ( rule__ListofEntities__Group__0__Impl rule__ListofEntities__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:791:2: rule__ListofEntities__Group__0__Impl rule__ListofEntities__Group__1
            {
            pushFollow(FOLLOW_rule__ListofEntities__Group__0__Impl_in_rule__ListofEntities__Group__01631);
            rule__ListofEntities__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListofEntities__Group__1_in_rule__ListofEntities__Group__01634);
            rule__ListofEntities__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__Group__0


    // $ANTLR start rule__ListofEntities__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:798:1: rule__ListofEntities__Group__0__Impl : ( () ) ;
    public final void rule__ListofEntities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:802:1: ( ( () ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:803:1: ( () )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:803:1: ( () )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:804:1: ()
            {
             before(grammarAccess.getListofEntitiesAccess().getListofEntitiesAction_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:805:1: ()
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:807:1: 
            {
            }

             after(grammarAccess.getListofEntitiesAccess().getListofEntitiesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__Group__0__Impl


    // $ANTLR start rule__ListofEntities__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:817:1: rule__ListofEntities__Group__1 : rule__ListofEntities__Group__1__Impl rule__ListofEntities__Group__2 ;
    public final void rule__ListofEntities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:821:1: ( rule__ListofEntities__Group__1__Impl rule__ListofEntities__Group__2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:822:2: rule__ListofEntities__Group__1__Impl rule__ListofEntities__Group__2
            {
            pushFollow(FOLLOW_rule__ListofEntities__Group__1__Impl_in_rule__ListofEntities__Group__11692);
            rule__ListofEntities__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListofEntities__Group__2_in_rule__ListofEntities__Group__11695);
            rule__ListofEntities__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__Group__1


    // $ANTLR start rule__ListofEntities__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:829:1: rule__ListofEntities__Group__1__Impl : ( 'metaelements:' ) ;
    public final void rule__ListofEntities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:833:1: ( ( 'metaelements:' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:834:1: ( 'metaelements:' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:834:1: ( 'metaelements:' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:835:1: 'metaelements:'
            {
             before(grammarAccess.getListofEntitiesAccess().getMetaelementsKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__ListofEntities__Group__1__Impl1723); 
             after(grammarAccess.getListofEntitiesAccess().getMetaelementsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__Group__1__Impl


    // $ANTLR start rule__ListofEntities__Group__2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:848:1: rule__ListofEntities__Group__2 : rule__ListofEntities__Group__2__Impl rule__ListofEntities__Group__3 ;
    public final void rule__ListofEntities__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:852:1: ( rule__ListofEntities__Group__2__Impl rule__ListofEntities__Group__3 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:853:2: rule__ListofEntities__Group__2__Impl rule__ListofEntities__Group__3
            {
            pushFollow(FOLLOW_rule__ListofEntities__Group__2__Impl_in_rule__ListofEntities__Group__21754);
            rule__ListofEntities__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListofEntities__Group__3_in_rule__ListofEntities__Group__21757);
            rule__ListofEntities__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__Group__2


    // $ANTLR start rule__ListofEntities__Group__2__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:860:1: rule__ListofEntities__Group__2__Impl : ( '{' ) ;
    public final void rule__ListofEntities__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:864:1: ( ( '{' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:865:1: ( '{' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:865:1: ( '{' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:866:1: '{'
            {
             before(grammarAccess.getListofEntitiesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__ListofEntities__Group__2__Impl1785); 
             after(grammarAccess.getListofEntitiesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__Group__2__Impl


    // $ANTLR start rule__ListofEntities__Group__3
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:879:1: rule__ListofEntities__Group__3 : rule__ListofEntities__Group__3__Impl rule__ListofEntities__Group__4 ;
    public final void rule__ListofEntities__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:883:1: ( rule__ListofEntities__Group__3__Impl rule__ListofEntities__Group__4 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:884:2: rule__ListofEntities__Group__3__Impl rule__ListofEntities__Group__4
            {
            pushFollow(FOLLOW_rule__ListofEntities__Group__3__Impl_in_rule__ListofEntities__Group__31816);
            rule__ListofEntities__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ListofEntities__Group__4_in_rule__ListofEntities__Group__31819);
            rule__ListofEntities__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__Group__3


    // $ANTLR start rule__ListofEntities__Group__3__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:891:1: rule__ListofEntities__Group__3__Impl : ( ( rule__ListofEntities__EntitiesAssignment_3 )* ) ;
    public final void rule__ListofEntities__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:895:1: ( ( ( rule__ListofEntities__EntitiesAssignment_3 )* ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:896:1: ( ( rule__ListofEntities__EntitiesAssignment_3 )* )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:896:1: ( ( rule__ListofEntities__EntitiesAssignment_3 )* )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:897:1: ( rule__ListofEntities__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getListofEntitiesAccess().getEntitiesAssignment_3()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:898:1: ( rule__ListofEntities__EntitiesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:898:2: rule__ListofEntities__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ListofEntities__EntitiesAssignment_3_in_rule__ListofEntities__Group__3__Impl1846);
            	    rule__ListofEntities__EntitiesAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getListofEntitiesAccess().getEntitiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__Group__3__Impl


    // $ANTLR start rule__ListofEntities__Group__4
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:908:1: rule__ListofEntities__Group__4 : rule__ListofEntities__Group__4__Impl ;
    public final void rule__ListofEntities__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:912:1: ( rule__ListofEntities__Group__4__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:913:2: rule__ListofEntities__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ListofEntities__Group__4__Impl_in_rule__ListofEntities__Group__41877);
            rule__ListofEntities__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__Group__4


    // $ANTLR start rule__ListofEntities__Group__4__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:919:1: rule__ListofEntities__Group__4__Impl : ( '}' ) ;
    public final void rule__ListofEntities__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:923:1: ( ( '}' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:924:1: ( '}' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:924:1: ( '}' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:925:1: '}'
            {
             before(grammarAccess.getListofEntitiesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__ListofEntities__Group__4__Impl1905); 
             after(grammarAccess.getListofEntitiesAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__Group__4__Impl


    // $ANTLR start rule__MRBlock__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:948:1: rule__MRBlock__Group__0 : rule__MRBlock__Group__0__Impl rule__MRBlock__Group__1 ;
    public final void rule__MRBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:952:1: ( rule__MRBlock__Group__0__Impl rule__MRBlock__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:953:2: rule__MRBlock__Group__0__Impl rule__MRBlock__Group__1
            {
            pushFollow(FOLLOW_rule__MRBlock__Group__0__Impl_in_rule__MRBlock__Group__01946);
            rule__MRBlock__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MRBlock__Group__1_in_rule__MRBlock__Group__01949);
            rule__MRBlock__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__Group__0


    // $ANTLR start rule__MRBlock__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:960:1: rule__MRBlock__Group__0__Impl : ( 'mapreduce:' ) ;
    public final void rule__MRBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:964:1: ( ( 'mapreduce:' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:965:1: ( 'mapreduce:' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:965:1: ( 'mapreduce:' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:966:1: 'mapreduce:'
            {
             before(grammarAccess.getMRBlockAccess().getMapreduceKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__MRBlock__Group__0__Impl1977); 
             after(grammarAccess.getMRBlockAccess().getMapreduceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__Group__0__Impl


    // $ANTLR start rule__MRBlock__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:979:1: rule__MRBlock__Group__1 : rule__MRBlock__Group__1__Impl rule__MRBlock__Group__2 ;
    public final void rule__MRBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:983:1: ( rule__MRBlock__Group__1__Impl rule__MRBlock__Group__2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:984:2: rule__MRBlock__Group__1__Impl rule__MRBlock__Group__2
            {
            pushFollow(FOLLOW_rule__MRBlock__Group__1__Impl_in_rule__MRBlock__Group__12008);
            rule__MRBlock__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MRBlock__Group__2_in_rule__MRBlock__Group__12011);
            rule__MRBlock__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__Group__1


    // $ANTLR start rule__MRBlock__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:991:1: rule__MRBlock__Group__1__Impl : ( ( rule__MRBlock__LoopAssignment_1 )? ) ;
    public final void rule__MRBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:995:1: ( ( ( rule__MRBlock__LoopAssignment_1 )? ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:996:1: ( ( rule__MRBlock__LoopAssignment_1 )? )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:996:1: ( ( rule__MRBlock__LoopAssignment_1 )? )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:997:1: ( rule__MRBlock__LoopAssignment_1 )?
            {
             before(grammarAccess.getMRBlockAccess().getLoopAssignment_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:998:1: ( rule__MRBlock__LoopAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:998:2: rule__MRBlock__LoopAssignment_1
                    {
                    pushFollow(FOLLOW_rule__MRBlock__LoopAssignment_1_in_rule__MRBlock__Group__1__Impl2038);
                    rule__MRBlock__LoopAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMRBlockAccess().getLoopAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__Group__1__Impl


    // $ANTLR start rule__MRBlock__Group__2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1008:1: rule__MRBlock__Group__2 : rule__MRBlock__Group__2__Impl rule__MRBlock__Group__3 ;
    public final void rule__MRBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1012:1: ( rule__MRBlock__Group__2__Impl rule__MRBlock__Group__3 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1013:2: rule__MRBlock__Group__2__Impl rule__MRBlock__Group__3
            {
            pushFollow(FOLLOW_rule__MRBlock__Group__2__Impl_in_rule__MRBlock__Group__22069);
            rule__MRBlock__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MRBlock__Group__3_in_rule__MRBlock__Group__22072);
            rule__MRBlock__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__Group__2


    // $ANTLR start rule__MRBlock__Group__2__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1020:1: rule__MRBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__MRBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1024:1: ( ( '{' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1025:1: ( '{' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1025:1: ( '{' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1026:1: '{'
            {
             before(grammarAccess.getMRBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__MRBlock__Group__2__Impl2100); 
             after(grammarAccess.getMRBlockAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__Group__2__Impl


    // $ANTLR start rule__MRBlock__Group__3
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1039:1: rule__MRBlock__Group__3 : rule__MRBlock__Group__3__Impl rule__MRBlock__Group__4 ;
    public final void rule__MRBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1043:1: ( rule__MRBlock__Group__3__Impl rule__MRBlock__Group__4 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1044:2: rule__MRBlock__Group__3__Impl rule__MRBlock__Group__4
            {
            pushFollow(FOLLOW_rule__MRBlock__Group__3__Impl_in_rule__MRBlock__Group__32131);
            rule__MRBlock__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MRBlock__Group__4_in_rule__MRBlock__Group__32134);
            rule__MRBlock__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__Group__3


    // $ANTLR start rule__MRBlock__Group__3__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1051:1: rule__MRBlock__Group__3__Impl : ( ( rule__MRBlock__MapperAssignment_3 ) ) ;
    public final void rule__MRBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1055:1: ( ( ( rule__MRBlock__MapperAssignment_3 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1056:1: ( ( rule__MRBlock__MapperAssignment_3 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1056:1: ( ( rule__MRBlock__MapperAssignment_3 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1057:1: ( rule__MRBlock__MapperAssignment_3 )
            {
             before(grammarAccess.getMRBlockAccess().getMapperAssignment_3()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1058:1: ( rule__MRBlock__MapperAssignment_3 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1058:2: rule__MRBlock__MapperAssignment_3
            {
            pushFollow(FOLLOW_rule__MRBlock__MapperAssignment_3_in_rule__MRBlock__Group__3__Impl2161);
            rule__MRBlock__MapperAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getMRBlockAccess().getMapperAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__Group__3__Impl


    // $ANTLR start rule__MRBlock__Group__4
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1068:1: rule__MRBlock__Group__4 : rule__MRBlock__Group__4__Impl rule__MRBlock__Group__5 ;
    public final void rule__MRBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1072:1: ( rule__MRBlock__Group__4__Impl rule__MRBlock__Group__5 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1073:2: rule__MRBlock__Group__4__Impl rule__MRBlock__Group__5
            {
            pushFollow(FOLLOW_rule__MRBlock__Group__4__Impl_in_rule__MRBlock__Group__42191);
            rule__MRBlock__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MRBlock__Group__5_in_rule__MRBlock__Group__42194);
            rule__MRBlock__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__Group__4


    // $ANTLR start rule__MRBlock__Group__4__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1080:1: rule__MRBlock__Group__4__Impl : ( ( rule__MRBlock__ReducerAssignment_4 ) ) ;
    public final void rule__MRBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1084:1: ( ( ( rule__MRBlock__ReducerAssignment_4 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1085:1: ( ( rule__MRBlock__ReducerAssignment_4 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1085:1: ( ( rule__MRBlock__ReducerAssignment_4 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1086:1: ( rule__MRBlock__ReducerAssignment_4 )
            {
             before(grammarAccess.getMRBlockAccess().getReducerAssignment_4()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1087:1: ( rule__MRBlock__ReducerAssignment_4 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1087:2: rule__MRBlock__ReducerAssignment_4
            {
            pushFollow(FOLLOW_rule__MRBlock__ReducerAssignment_4_in_rule__MRBlock__Group__4__Impl2221);
            rule__MRBlock__ReducerAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getMRBlockAccess().getReducerAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__Group__4__Impl


    // $ANTLR start rule__MRBlock__Group__5
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1097:1: rule__MRBlock__Group__5 : rule__MRBlock__Group__5__Impl ;
    public final void rule__MRBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1101:1: ( rule__MRBlock__Group__5__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1102:2: rule__MRBlock__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__MRBlock__Group__5__Impl_in_rule__MRBlock__Group__52251);
            rule__MRBlock__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__Group__5


    // $ANTLR start rule__MRBlock__Group__5__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1108:1: rule__MRBlock__Group__5__Impl : ( '}' ) ;
    public final void rule__MRBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1112:1: ( ( '}' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1113:1: ( '}' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1113:1: ( '}' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1114:1: '}'
            {
             before(grammarAccess.getMRBlockAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__MRBlock__Group__5__Impl2279); 
             after(grammarAccess.getMRBlockAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__Group__5__Impl


    // $ANTLR start rule__Declaration__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1139:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1143:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1144:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__02322);
            rule__Declaration__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__02325);
            rule__Declaration__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group__0


    // $ANTLR start rule__Declaration__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1151:1: rule__Declaration__Group__0__Impl : ( 'program' ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1155:1: ( ( 'program' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1156:1: ( 'program' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1156:1: ( 'program' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1157:1: 'program'
            {
             before(grammarAccess.getDeclarationAccess().getProgramKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Declaration__Group__0__Impl2353); 
             after(grammarAccess.getDeclarationAccess().getProgramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group__0__Impl


    // $ANTLR start rule__Declaration__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1170:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1174:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1175:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__12384);
            rule__Declaration__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__12387);
            rule__Declaration__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group__1


    // $ANTLR start rule__Declaration__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1182:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__NameAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1186:1: ( ( ( rule__Declaration__NameAssignment_1 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1187:1: ( ( rule__Declaration__NameAssignment_1 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1187:1: ( ( rule__Declaration__NameAssignment_1 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1188:1: ( rule__Declaration__NameAssignment_1 )
            {
             before(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1189:1: ( rule__Declaration__NameAssignment_1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1189:2: rule__Declaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl2414);
            rule__Declaration__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group__1__Impl


    // $ANTLR start rule__Declaration__Group__2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1199:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1203:1: ( rule__Declaration__Group__2__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1204:2: rule__Declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__22444);
            rule__Declaration__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group__2


    // $ANTLR start rule__Declaration__Group__2__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1210:1: rule__Declaration__Group__2__Impl : ( ( rule__Declaration__Group_2__0 )? ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1214:1: ( ( ( rule__Declaration__Group_2__0 )? ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1215:1: ( ( rule__Declaration__Group_2__0 )? )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1215:1: ( ( rule__Declaration__Group_2__0 )? )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1216:1: ( rule__Declaration__Group_2__0 )?
            {
             before(grammarAccess.getDeclarationAccess().getGroup_2()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1217:1: ( rule__Declaration__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1217:2: rule__Declaration__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_2__0_in_rule__Declaration__Group__2__Impl2471);
                    rule__Declaration__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group__2__Impl


    // $ANTLR start rule__Declaration__Group_2__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1233:1: rule__Declaration__Group_2__0 : rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1 ;
    public final void rule__Declaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1237:1: ( rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1238:2: rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_2__0__Impl_in_rule__Declaration__Group_2__02508);
            rule__Declaration__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group_2__1_in_rule__Declaration__Group_2__02511);
            rule__Declaration__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group_2__0


    // $ANTLR start rule__Declaration__Group_2__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1245:1: rule__Declaration__Group_2__0__Impl : ( 'extend' ) ;
    public final void rule__Declaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1249:1: ( ( 'extend' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1250:1: ( 'extend' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1250:1: ( 'extend' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1251:1: 'extend'
            {
             before(grammarAccess.getDeclarationAccess().getExtendKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Declaration__Group_2__0__Impl2539); 
             after(grammarAccess.getDeclarationAccess().getExtendKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group_2__0__Impl


    // $ANTLR start rule__Declaration__Group_2__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1264:1: rule__Declaration__Group_2__1 : rule__Declaration__Group_2__1__Impl ;
    public final void rule__Declaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1268:1: ( rule__Declaration__Group_2__1__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1269:2: rule__Declaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_2__1__Impl_in_rule__Declaration__Group_2__12570);
            rule__Declaration__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group_2__1


    // $ANTLR start rule__Declaration__Group_2__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1275:1: rule__Declaration__Group_2__1__Impl : ( ( rule__Declaration__SuperNameAssignment_2_1 ) ) ;
    public final void rule__Declaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1279:1: ( ( ( rule__Declaration__SuperNameAssignment_2_1 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1280:1: ( ( rule__Declaration__SuperNameAssignment_2_1 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1280:1: ( ( rule__Declaration__SuperNameAssignment_2_1 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1281:1: ( rule__Declaration__SuperNameAssignment_2_1 )
            {
             before(grammarAccess.getDeclarationAccess().getSuperNameAssignment_2_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1282:1: ( rule__Declaration__SuperNameAssignment_2_1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1282:2: rule__Declaration__SuperNameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Declaration__SuperNameAssignment_2_1_in_rule__Declaration__Group_2__1__Impl2597);
            rule__Declaration__SuperNameAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getSuperNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__Group_2__1__Impl


    // $ANTLR start rule__Mapper__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1296:1: rule__Mapper__Group__0 : rule__Mapper__Group__0__Impl rule__Mapper__Group__1 ;
    public final void rule__Mapper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1300:1: ( rule__Mapper__Group__0__Impl rule__Mapper__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1301:2: rule__Mapper__Group__0__Impl rule__Mapper__Group__1
            {
            pushFollow(FOLLOW_rule__Mapper__Group__0__Impl_in_rule__Mapper__Group__02631);
            rule__Mapper__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapper__Group__1_in_rule__Mapper__Group__02634);
            rule__Mapper__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__0


    // $ANTLR start rule__Mapper__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1308:1: rule__Mapper__Group__0__Impl : ( 'map' ) ;
    public final void rule__Mapper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1312:1: ( ( 'map' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1313:1: ( 'map' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1313:1: ( 'map' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1314:1: 'map'
            {
             before(grammarAccess.getMapperAccess().getMapKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Mapper__Group__0__Impl2662); 
             after(grammarAccess.getMapperAccess().getMapKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__0__Impl


    // $ANTLR start rule__Mapper__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1327:1: rule__Mapper__Group__1 : rule__Mapper__Group__1__Impl rule__Mapper__Group__2 ;
    public final void rule__Mapper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1331:1: ( rule__Mapper__Group__1__Impl rule__Mapper__Group__2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1332:2: rule__Mapper__Group__1__Impl rule__Mapper__Group__2
            {
            pushFollow(FOLLOW_rule__Mapper__Group__1__Impl_in_rule__Mapper__Group__12693);
            rule__Mapper__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapper__Group__2_in_rule__Mapper__Group__12696);
            rule__Mapper__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__1


    // $ANTLR start rule__Mapper__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1339:1: rule__Mapper__Group__1__Impl : ( '(' ) ;
    public final void rule__Mapper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1343:1: ( ( '(' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1344:1: ( '(' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1344:1: ( '(' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1345:1: '('
            {
             before(grammarAccess.getMapperAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Mapper__Group__1__Impl2724); 
             after(grammarAccess.getMapperAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__1__Impl


    // $ANTLR start rule__Mapper__Group__2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1358:1: rule__Mapper__Group__2 : rule__Mapper__Group__2__Impl rule__Mapper__Group__3 ;
    public final void rule__Mapper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1362:1: ( rule__Mapper__Group__2__Impl rule__Mapper__Group__3 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1363:2: rule__Mapper__Group__2__Impl rule__Mapper__Group__3
            {
            pushFollow(FOLLOW_rule__Mapper__Group__2__Impl_in_rule__Mapper__Group__22755);
            rule__Mapper__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapper__Group__3_in_rule__Mapper__Group__22758);
            rule__Mapper__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__2


    // $ANTLR start rule__Mapper__Group__2__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1370:1: rule__Mapper__Group__2__Impl : ( ( rule__Mapper__InkeyAssignment_2 ) ) ;
    public final void rule__Mapper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1374:1: ( ( ( rule__Mapper__InkeyAssignment_2 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1375:1: ( ( rule__Mapper__InkeyAssignment_2 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1375:1: ( ( rule__Mapper__InkeyAssignment_2 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1376:1: ( rule__Mapper__InkeyAssignment_2 )
            {
             before(grammarAccess.getMapperAccess().getInkeyAssignment_2()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1377:1: ( rule__Mapper__InkeyAssignment_2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1377:2: rule__Mapper__InkeyAssignment_2
            {
            pushFollow(FOLLOW_rule__Mapper__InkeyAssignment_2_in_rule__Mapper__Group__2__Impl2785);
            rule__Mapper__InkeyAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getMapperAccess().getInkeyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__2__Impl


    // $ANTLR start rule__Mapper__Group__3
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1387:1: rule__Mapper__Group__3 : rule__Mapper__Group__3__Impl rule__Mapper__Group__4 ;
    public final void rule__Mapper__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1391:1: ( rule__Mapper__Group__3__Impl rule__Mapper__Group__4 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1392:2: rule__Mapper__Group__3__Impl rule__Mapper__Group__4
            {
            pushFollow(FOLLOW_rule__Mapper__Group__3__Impl_in_rule__Mapper__Group__32815);
            rule__Mapper__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapper__Group__4_in_rule__Mapper__Group__32818);
            rule__Mapper__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__3


    // $ANTLR start rule__Mapper__Group__3__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1399:1: rule__Mapper__Group__3__Impl : ( ',' ) ;
    public final void rule__Mapper__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1403:1: ( ( ',' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1404:1: ( ',' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1404:1: ( ',' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1405:1: ','
            {
             before(grammarAccess.getMapperAccess().getCommaKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Mapper__Group__3__Impl2846); 
             after(grammarAccess.getMapperAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__3__Impl


    // $ANTLR start rule__Mapper__Group__4
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1418:1: rule__Mapper__Group__4 : rule__Mapper__Group__4__Impl rule__Mapper__Group__5 ;
    public final void rule__Mapper__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1422:1: ( rule__Mapper__Group__4__Impl rule__Mapper__Group__5 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1423:2: rule__Mapper__Group__4__Impl rule__Mapper__Group__5
            {
            pushFollow(FOLLOW_rule__Mapper__Group__4__Impl_in_rule__Mapper__Group__42877);
            rule__Mapper__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapper__Group__5_in_rule__Mapper__Group__42880);
            rule__Mapper__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__4


    // $ANTLR start rule__Mapper__Group__4__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1430:1: rule__Mapper__Group__4__Impl : ( ( rule__Mapper__InvalueAssignment_4 ) ) ;
    public final void rule__Mapper__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1434:1: ( ( ( rule__Mapper__InvalueAssignment_4 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1435:1: ( ( rule__Mapper__InvalueAssignment_4 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1435:1: ( ( rule__Mapper__InvalueAssignment_4 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1436:1: ( rule__Mapper__InvalueAssignment_4 )
            {
             before(grammarAccess.getMapperAccess().getInvalueAssignment_4()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1437:1: ( rule__Mapper__InvalueAssignment_4 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1437:2: rule__Mapper__InvalueAssignment_4
            {
            pushFollow(FOLLOW_rule__Mapper__InvalueAssignment_4_in_rule__Mapper__Group__4__Impl2907);
            rule__Mapper__InvalueAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getMapperAccess().getInvalueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__4__Impl


    // $ANTLR start rule__Mapper__Group__5
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1447:1: rule__Mapper__Group__5 : rule__Mapper__Group__5__Impl rule__Mapper__Group__6 ;
    public final void rule__Mapper__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1451:1: ( rule__Mapper__Group__5__Impl rule__Mapper__Group__6 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1452:2: rule__Mapper__Group__5__Impl rule__Mapper__Group__6
            {
            pushFollow(FOLLOW_rule__Mapper__Group__5__Impl_in_rule__Mapper__Group__52937);
            rule__Mapper__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapper__Group__6_in_rule__Mapper__Group__52940);
            rule__Mapper__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__5


    // $ANTLR start rule__Mapper__Group__5__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1459:1: rule__Mapper__Group__5__Impl : ( ',' ) ;
    public final void rule__Mapper__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1463:1: ( ( ',' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1464:1: ( ',' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1464:1: ( ',' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1465:1: ','
            {
             before(grammarAccess.getMapperAccess().getCommaKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__Mapper__Group__5__Impl2968); 
             after(grammarAccess.getMapperAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__5__Impl


    // $ANTLR start rule__Mapper__Group__6
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1478:1: rule__Mapper__Group__6 : rule__Mapper__Group__6__Impl rule__Mapper__Group__7 ;
    public final void rule__Mapper__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1482:1: ( rule__Mapper__Group__6__Impl rule__Mapper__Group__7 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1483:2: rule__Mapper__Group__6__Impl rule__Mapper__Group__7
            {
            pushFollow(FOLLOW_rule__Mapper__Group__6__Impl_in_rule__Mapper__Group__62999);
            rule__Mapper__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapper__Group__7_in_rule__Mapper__Group__63002);
            rule__Mapper__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__6


    // $ANTLR start rule__Mapper__Group__6__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1490:1: rule__Mapper__Group__6__Impl : ( ( rule__Mapper__OutKeyTypeAssignment_6 ) ) ;
    public final void rule__Mapper__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1494:1: ( ( ( rule__Mapper__OutKeyTypeAssignment_6 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1495:1: ( ( rule__Mapper__OutKeyTypeAssignment_6 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1495:1: ( ( rule__Mapper__OutKeyTypeAssignment_6 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1496:1: ( rule__Mapper__OutKeyTypeAssignment_6 )
            {
             before(grammarAccess.getMapperAccess().getOutKeyTypeAssignment_6()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1497:1: ( rule__Mapper__OutKeyTypeAssignment_6 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1497:2: rule__Mapper__OutKeyTypeAssignment_6
            {
            pushFollow(FOLLOW_rule__Mapper__OutKeyTypeAssignment_6_in_rule__Mapper__Group__6__Impl3029);
            rule__Mapper__OutKeyTypeAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getMapperAccess().getOutKeyTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__6__Impl


    // $ANTLR start rule__Mapper__Group__7
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1507:1: rule__Mapper__Group__7 : rule__Mapper__Group__7__Impl rule__Mapper__Group__8 ;
    public final void rule__Mapper__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1511:1: ( rule__Mapper__Group__7__Impl rule__Mapper__Group__8 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1512:2: rule__Mapper__Group__7__Impl rule__Mapper__Group__8
            {
            pushFollow(FOLLOW_rule__Mapper__Group__7__Impl_in_rule__Mapper__Group__73059);
            rule__Mapper__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapper__Group__8_in_rule__Mapper__Group__73062);
            rule__Mapper__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__7


    // $ANTLR start rule__Mapper__Group__7__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1519:1: rule__Mapper__Group__7__Impl : ( ',' ) ;
    public final void rule__Mapper__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1523:1: ( ( ',' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1524:1: ( ',' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1524:1: ( ',' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1525:1: ','
            {
             before(grammarAccess.getMapperAccess().getCommaKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__Mapper__Group__7__Impl3090); 
             after(grammarAccess.getMapperAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__7__Impl


    // $ANTLR start rule__Mapper__Group__8
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1538:1: rule__Mapper__Group__8 : rule__Mapper__Group__8__Impl rule__Mapper__Group__9 ;
    public final void rule__Mapper__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1542:1: ( rule__Mapper__Group__8__Impl rule__Mapper__Group__9 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1543:2: rule__Mapper__Group__8__Impl rule__Mapper__Group__9
            {
            pushFollow(FOLLOW_rule__Mapper__Group__8__Impl_in_rule__Mapper__Group__83121);
            rule__Mapper__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapper__Group__9_in_rule__Mapper__Group__83124);
            rule__Mapper__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__8


    // $ANTLR start rule__Mapper__Group__8__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1550:1: rule__Mapper__Group__8__Impl : ( ( rule__Mapper__OutValueTypeAssignment_8 ) ) ;
    public final void rule__Mapper__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1554:1: ( ( ( rule__Mapper__OutValueTypeAssignment_8 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1555:1: ( ( rule__Mapper__OutValueTypeAssignment_8 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1555:1: ( ( rule__Mapper__OutValueTypeAssignment_8 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1556:1: ( rule__Mapper__OutValueTypeAssignment_8 )
            {
             before(grammarAccess.getMapperAccess().getOutValueTypeAssignment_8()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1557:1: ( rule__Mapper__OutValueTypeAssignment_8 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1557:2: rule__Mapper__OutValueTypeAssignment_8
            {
            pushFollow(FOLLOW_rule__Mapper__OutValueTypeAssignment_8_in_rule__Mapper__Group__8__Impl3151);
            rule__Mapper__OutValueTypeAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getMapperAccess().getOutValueTypeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__8__Impl


    // $ANTLR start rule__Mapper__Group__9
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1567:1: rule__Mapper__Group__9 : rule__Mapper__Group__9__Impl rule__Mapper__Group__10 ;
    public final void rule__Mapper__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1571:1: ( rule__Mapper__Group__9__Impl rule__Mapper__Group__10 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1572:2: rule__Mapper__Group__9__Impl rule__Mapper__Group__10
            {
            pushFollow(FOLLOW_rule__Mapper__Group__9__Impl_in_rule__Mapper__Group__93181);
            rule__Mapper__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapper__Group__10_in_rule__Mapper__Group__93184);
            rule__Mapper__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__9


    // $ANTLR start rule__Mapper__Group__9__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1579:1: rule__Mapper__Group__9__Impl : ( ')' ) ;
    public final void rule__Mapper__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1583:1: ( ( ')' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1584:1: ( ')' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1584:1: ( ')' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1585:1: ')'
            {
             before(grammarAccess.getMapperAccess().getRightParenthesisKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__Mapper__Group__9__Impl3212); 
             after(grammarAccess.getMapperAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__9__Impl


    // $ANTLR start rule__Mapper__Group__10
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1598:1: rule__Mapper__Group__10 : rule__Mapper__Group__10__Impl ;
    public final void rule__Mapper__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1602:1: ( rule__Mapper__Group__10__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1603:2: rule__Mapper__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Mapper__Group__10__Impl_in_rule__Mapper__Group__103243);
            rule__Mapper__Group__10__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__10


    // $ANTLR start rule__Mapper__Group__10__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1609:1: rule__Mapper__Group__10__Impl : ( ( rule__Mapper__TextAssignment_10 ) ) ;
    public final void rule__Mapper__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1613:1: ( ( ( rule__Mapper__TextAssignment_10 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1614:1: ( ( rule__Mapper__TextAssignment_10 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1614:1: ( ( rule__Mapper__TextAssignment_10 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1615:1: ( rule__Mapper__TextAssignment_10 )
            {
             before(grammarAccess.getMapperAccess().getTextAssignment_10()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1616:1: ( rule__Mapper__TextAssignment_10 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1616:2: rule__Mapper__TextAssignment_10
            {
            pushFollow(FOLLOW_rule__Mapper__TextAssignment_10_in_rule__Mapper__Group__10__Impl3270);
            rule__Mapper__TextAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getMapperAccess().getTextAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__Group__10__Impl


    // $ANTLR start rule__Argument__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1648:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1652:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1653:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__03322);
            rule__Argument__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__03325);
            rule__Argument__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__0


    // $ANTLR start rule__Argument__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1660:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__TypeAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1664:1: ( ( ( rule__Argument__TypeAssignment_0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1665:1: ( ( rule__Argument__TypeAssignment_0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1665:1: ( ( rule__Argument__TypeAssignment_0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1666:1: ( rule__Argument__TypeAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1667:1: ( rule__Argument__TypeAssignment_0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1667:2: rule__Argument__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Argument__TypeAssignment_0_in_rule__Argument__Group__0__Impl3352);
            rule__Argument__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__0__Impl


    // $ANTLR start rule__Argument__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1677:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1681:1: ( rule__Argument__Group__1__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1682:2: rule__Argument__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__13382);
            rule__Argument__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__1


    // $ANTLR start rule__Argument__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1688:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__ArgnameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1692:1: ( ( ( rule__Argument__ArgnameAssignment_1 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1693:1: ( ( rule__Argument__ArgnameAssignment_1 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1693:1: ( ( rule__Argument__ArgnameAssignment_1 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1694:1: ( rule__Argument__ArgnameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getArgnameAssignment_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1695:1: ( rule__Argument__ArgnameAssignment_1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1695:2: rule__Argument__ArgnameAssignment_1
            {
            pushFollow(FOLLOW_rule__Argument__ArgnameAssignment_1_in_rule__Argument__Group__1__Impl3409);
            rule__Argument__ArgnameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getArgnameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__1__Impl


    // $ANTLR start rule__Reducer__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1710:1: rule__Reducer__Group__0 : rule__Reducer__Group__0__Impl rule__Reducer__Group__1 ;
    public final void rule__Reducer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1714:1: ( rule__Reducer__Group__0__Impl rule__Reducer__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1715:2: rule__Reducer__Group__0__Impl rule__Reducer__Group__1
            {
            pushFollow(FOLLOW_rule__Reducer__Group__0__Impl_in_rule__Reducer__Group__03444);
            rule__Reducer__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reducer__Group__1_in_rule__Reducer__Group__03447);
            rule__Reducer__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__0


    // $ANTLR start rule__Reducer__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1722:1: rule__Reducer__Group__0__Impl : ( 'reduce' ) ;
    public final void rule__Reducer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1726:1: ( ( 'reduce' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1727:1: ( 'reduce' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1727:1: ( 'reduce' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1728:1: 'reduce'
            {
             before(grammarAccess.getReducerAccess().getReduceKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Reducer__Group__0__Impl3475); 
             after(grammarAccess.getReducerAccess().getReduceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__0__Impl


    // $ANTLR start rule__Reducer__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1741:1: rule__Reducer__Group__1 : rule__Reducer__Group__1__Impl rule__Reducer__Group__2 ;
    public final void rule__Reducer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1745:1: ( rule__Reducer__Group__1__Impl rule__Reducer__Group__2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1746:2: rule__Reducer__Group__1__Impl rule__Reducer__Group__2
            {
            pushFollow(FOLLOW_rule__Reducer__Group__1__Impl_in_rule__Reducer__Group__13506);
            rule__Reducer__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reducer__Group__2_in_rule__Reducer__Group__13509);
            rule__Reducer__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__1


    // $ANTLR start rule__Reducer__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1753:1: rule__Reducer__Group__1__Impl : ( '(' ) ;
    public final void rule__Reducer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1757:1: ( ( '(' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1758:1: ( '(' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1758:1: ( '(' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1759:1: '('
            {
             before(grammarAccess.getReducerAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Reducer__Group__1__Impl3537); 
             after(grammarAccess.getReducerAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__1__Impl


    // $ANTLR start rule__Reducer__Group__2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1772:1: rule__Reducer__Group__2 : rule__Reducer__Group__2__Impl rule__Reducer__Group__3 ;
    public final void rule__Reducer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1776:1: ( rule__Reducer__Group__2__Impl rule__Reducer__Group__3 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1777:2: rule__Reducer__Group__2__Impl rule__Reducer__Group__3
            {
            pushFollow(FOLLOW_rule__Reducer__Group__2__Impl_in_rule__Reducer__Group__23568);
            rule__Reducer__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reducer__Group__3_in_rule__Reducer__Group__23571);
            rule__Reducer__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__2


    // $ANTLR start rule__Reducer__Group__2__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1784:1: rule__Reducer__Group__2__Impl : ( ( rule__Reducer__InkeyAssignment_2 ) ) ;
    public final void rule__Reducer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1788:1: ( ( ( rule__Reducer__InkeyAssignment_2 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1789:1: ( ( rule__Reducer__InkeyAssignment_2 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1789:1: ( ( rule__Reducer__InkeyAssignment_2 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1790:1: ( rule__Reducer__InkeyAssignment_2 )
            {
             before(grammarAccess.getReducerAccess().getInkeyAssignment_2()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1791:1: ( rule__Reducer__InkeyAssignment_2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1791:2: rule__Reducer__InkeyAssignment_2
            {
            pushFollow(FOLLOW_rule__Reducer__InkeyAssignment_2_in_rule__Reducer__Group__2__Impl3598);
            rule__Reducer__InkeyAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getReducerAccess().getInkeyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__2__Impl


    // $ANTLR start rule__Reducer__Group__3
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1801:1: rule__Reducer__Group__3 : rule__Reducer__Group__3__Impl rule__Reducer__Group__4 ;
    public final void rule__Reducer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1805:1: ( rule__Reducer__Group__3__Impl rule__Reducer__Group__4 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1806:2: rule__Reducer__Group__3__Impl rule__Reducer__Group__4
            {
            pushFollow(FOLLOW_rule__Reducer__Group__3__Impl_in_rule__Reducer__Group__33628);
            rule__Reducer__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reducer__Group__4_in_rule__Reducer__Group__33631);
            rule__Reducer__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__3


    // $ANTLR start rule__Reducer__Group__3__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1813:1: rule__Reducer__Group__3__Impl : ( ',' ) ;
    public final void rule__Reducer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1817:1: ( ( ',' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1818:1: ( ',' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1818:1: ( ',' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1819:1: ','
            {
             before(grammarAccess.getReducerAccess().getCommaKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Reducer__Group__3__Impl3659); 
             after(grammarAccess.getReducerAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__3__Impl


    // $ANTLR start rule__Reducer__Group__4
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1832:1: rule__Reducer__Group__4 : rule__Reducer__Group__4__Impl rule__Reducer__Group__5 ;
    public final void rule__Reducer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1836:1: ( rule__Reducer__Group__4__Impl rule__Reducer__Group__5 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1837:2: rule__Reducer__Group__4__Impl rule__Reducer__Group__5
            {
            pushFollow(FOLLOW_rule__Reducer__Group__4__Impl_in_rule__Reducer__Group__43690);
            rule__Reducer__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reducer__Group__5_in_rule__Reducer__Group__43693);
            rule__Reducer__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__4


    // $ANTLR start rule__Reducer__Group__4__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1844:1: rule__Reducer__Group__4__Impl : ( ( rule__Reducer__InvalueAssignment_4 ) ) ;
    public final void rule__Reducer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1848:1: ( ( ( rule__Reducer__InvalueAssignment_4 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1849:1: ( ( rule__Reducer__InvalueAssignment_4 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1849:1: ( ( rule__Reducer__InvalueAssignment_4 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1850:1: ( rule__Reducer__InvalueAssignment_4 )
            {
             before(grammarAccess.getReducerAccess().getInvalueAssignment_4()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1851:1: ( rule__Reducer__InvalueAssignment_4 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1851:2: rule__Reducer__InvalueAssignment_4
            {
            pushFollow(FOLLOW_rule__Reducer__InvalueAssignment_4_in_rule__Reducer__Group__4__Impl3720);
            rule__Reducer__InvalueAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getReducerAccess().getInvalueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__4__Impl


    // $ANTLR start rule__Reducer__Group__5
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1861:1: rule__Reducer__Group__5 : rule__Reducer__Group__5__Impl rule__Reducer__Group__6 ;
    public final void rule__Reducer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1865:1: ( rule__Reducer__Group__5__Impl rule__Reducer__Group__6 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1866:2: rule__Reducer__Group__5__Impl rule__Reducer__Group__6
            {
            pushFollow(FOLLOW_rule__Reducer__Group__5__Impl_in_rule__Reducer__Group__53750);
            rule__Reducer__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reducer__Group__6_in_rule__Reducer__Group__53753);
            rule__Reducer__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__5


    // $ANTLR start rule__Reducer__Group__5__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1873:1: rule__Reducer__Group__5__Impl : ( ',' ) ;
    public final void rule__Reducer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1877:1: ( ( ',' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1878:1: ( ',' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1878:1: ( ',' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1879:1: ','
            {
             before(grammarAccess.getReducerAccess().getCommaKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__Reducer__Group__5__Impl3781); 
             after(grammarAccess.getReducerAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__5__Impl


    // $ANTLR start rule__Reducer__Group__6
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1892:1: rule__Reducer__Group__6 : rule__Reducer__Group__6__Impl rule__Reducer__Group__7 ;
    public final void rule__Reducer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1896:1: ( rule__Reducer__Group__6__Impl rule__Reducer__Group__7 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1897:2: rule__Reducer__Group__6__Impl rule__Reducer__Group__7
            {
            pushFollow(FOLLOW_rule__Reducer__Group__6__Impl_in_rule__Reducer__Group__63812);
            rule__Reducer__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reducer__Group__7_in_rule__Reducer__Group__63815);
            rule__Reducer__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__6


    // $ANTLR start rule__Reducer__Group__6__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1904:1: rule__Reducer__Group__6__Impl : ( ( rule__Reducer__OutKeyTypeAssignment_6 ) ) ;
    public final void rule__Reducer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1908:1: ( ( ( rule__Reducer__OutKeyTypeAssignment_6 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1909:1: ( ( rule__Reducer__OutKeyTypeAssignment_6 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1909:1: ( ( rule__Reducer__OutKeyTypeAssignment_6 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1910:1: ( rule__Reducer__OutKeyTypeAssignment_6 )
            {
             before(grammarAccess.getReducerAccess().getOutKeyTypeAssignment_6()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1911:1: ( rule__Reducer__OutKeyTypeAssignment_6 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1911:2: rule__Reducer__OutKeyTypeAssignment_6
            {
            pushFollow(FOLLOW_rule__Reducer__OutKeyTypeAssignment_6_in_rule__Reducer__Group__6__Impl3842);
            rule__Reducer__OutKeyTypeAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getReducerAccess().getOutKeyTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__6__Impl


    // $ANTLR start rule__Reducer__Group__7
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1921:1: rule__Reducer__Group__7 : rule__Reducer__Group__7__Impl rule__Reducer__Group__8 ;
    public final void rule__Reducer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1925:1: ( rule__Reducer__Group__7__Impl rule__Reducer__Group__8 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1926:2: rule__Reducer__Group__7__Impl rule__Reducer__Group__8
            {
            pushFollow(FOLLOW_rule__Reducer__Group__7__Impl_in_rule__Reducer__Group__73872);
            rule__Reducer__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reducer__Group__8_in_rule__Reducer__Group__73875);
            rule__Reducer__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__7


    // $ANTLR start rule__Reducer__Group__7__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1933:1: rule__Reducer__Group__7__Impl : ( ',' ) ;
    public final void rule__Reducer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1937:1: ( ( ',' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1938:1: ( ',' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1938:1: ( ',' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1939:1: ','
            {
             before(grammarAccess.getReducerAccess().getCommaKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__Reducer__Group__7__Impl3903); 
             after(grammarAccess.getReducerAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__7__Impl


    // $ANTLR start rule__Reducer__Group__8
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1952:1: rule__Reducer__Group__8 : rule__Reducer__Group__8__Impl rule__Reducer__Group__9 ;
    public final void rule__Reducer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1956:1: ( rule__Reducer__Group__8__Impl rule__Reducer__Group__9 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1957:2: rule__Reducer__Group__8__Impl rule__Reducer__Group__9
            {
            pushFollow(FOLLOW_rule__Reducer__Group__8__Impl_in_rule__Reducer__Group__83934);
            rule__Reducer__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reducer__Group__9_in_rule__Reducer__Group__83937);
            rule__Reducer__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__8


    // $ANTLR start rule__Reducer__Group__8__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1964:1: rule__Reducer__Group__8__Impl : ( ( rule__Reducer__OutValueTypeAssignment_8 ) ) ;
    public final void rule__Reducer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1968:1: ( ( ( rule__Reducer__OutValueTypeAssignment_8 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1969:1: ( ( rule__Reducer__OutValueTypeAssignment_8 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1969:1: ( ( rule__Reducer__OutValueTypeAssignment_8 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1970:1: ( rule__Reducer__OutValueTypeAssignment_8 )
            {
             before(grammarAccess.getReducerAccess().getOutValueTypeAssignment_8()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1971:1: ( rule__Reducer__OutValueTypeAssignment_8 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1971:2: rule__Reducer__OutValueTypeAssignment_8
            {
            pushFollow(FOLLOW_rule__Reducer__OutValueTypeAssignment_8_in_rule__Reducer__Group__8__Impl3964);
            rule__Reducer__OutValueTypeAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getReducerAccess().getOutValueTypeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__8__Impl


    // $ANTLR start rule__Reducer__Group__9
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1981:1: rule__Reducer__Group__9 : rule__Reducer__Group__9__Impl rule__Reducer__Group__10 ;
    public final void rule__Reducer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1985:1: ( rule__Reducer__Group__9__Impl rule__Reducer__Group__10 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1986:2: rule__Reducer__Group__9__Impl rule__Reducer__Group__10
            {
            pushFollow(FOLLOW_rule__Reducer__Group__9__Impl_in_rule__Reducer__Group__93994);
            rule__Reducer__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reducer__Group__10_in_rule__Reducer__Group__93997);
            rule__Reducer__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__9


    // $ANTLR start rule__Reducer__Group__9__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1993:1: rule__Reducer__Group__9__Impl : ( ')' ) ;
    public final void rule__Reducer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1997:1: ( ( ')' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1998:1: ( ')' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1998:1: ( ')' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:1999:1: ')'
            {
             before(grammarAccess.getReducerAccess().getRightParenthesisKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__Reducer__Group__9__Impl4025); 
             after(grammarAccess.getReducerAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__9__Impl


    // $ANTLR start rule__Reducer__Group__10
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2012:1: rule__Reducer__Group__10 : rule__Reducer__Group__10__Impl ;
    public final void rule__Reducer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2016:1: ( rule__Reducer__Group__10__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2017:2: rule__Reducer__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Reducer__Group__10__Impl_in_rule__Reducer__Group__104056);
            rule__Reducer__Group__10__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__10


    // $ANTLR start rule__Reducer__Group__10__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2023:1: rule__Reducer__Group__10__Impl : ( ( rule__Reducer__TextAssignment_10 ) ) ;
    public final void rule__Reducer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2027:1: ( ( ( rule__Reducer__TextAssignment_10 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2028:1: ( ( rule__Reducer__TextAssignment_10 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2028:1: ( ( rule__Reducer__TextAssignment_10 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2029:1: ( rule__Reducer__TextAssignment_10 )
            {
             before(grammarAccess.getReducerAccess().getTextAssignment_10()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2030:1: ( rule__Reducer__TextAssignment_10 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2030:2: rule__Reducer__TextAssignment_10
            {
            pushFollow(FOLLOW_rule__Reducer__TextAssignment_10_in_rule__Reducer__Group__10__Impl4083);
            rule__Reducer__TextAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getReducerAccess().getTextAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__Group__10__Impl


    // $ANTLR start rule__Entity__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2062:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2066:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2067:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__04135);
            rule__Entity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__04138);
            rule__Entity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0


    // $ANTLR start rule__Entity__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2074:1: rule__Entity__Group__0__Impl : ( 'metaelement' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2078:1: ( ( 'metaelement' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2079:1: ( 'metaelement' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2079:1: ( 'metaelement' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2080:1: 'metaelement'
            {
             before(grammarAccess.getEntityAccess().getMetaelementKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Entity__Group__0__Impl4166); 
             after(grammarAccess.getEntityAccess().getMetaelementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0__Impl


    // $ANTLR start rule__Entity__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2093:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2097:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2098:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__14197);
            rule__Entity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__14200);
            rule__Entity__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1


    // $ANTLR start rule__Entity__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2105:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2109:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2110:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2110:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2111:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2112:1: ( rule__Entity__NameAssignment_1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2112:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl4227);
            rule__Entity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1__Impl


    // $ANTLR start rule__Entity__Group__2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2122:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2126:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2127:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__24257);
            rule__Entity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__24260);
            rule__Entity__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__2


    // $ANTLR start rule__Entity__Group__2__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2134:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2138:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2139:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2139:1: ( ( rule__Entity__Group_2__0 )? )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2140:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2141:1: ( rule__Entity__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2141:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl4287);
                    rule__Entity__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__2__Impl


    // $ANTLR start rule__Entity__Group__3
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2151:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2155:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2156:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__34318);
            rule__Entity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__34321);
            rule__Entity__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__3


    // $ANTLR start rule__Entity__Group__3__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2163:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2167:1: ( ( '{' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2168:1: ( '{' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2168:1: ( '{' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2169:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Entity__Group__3__Impl4349); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__3__Impl


    // $ANTLR start rule__Entity__Group__4
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2182:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2186:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2187:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44380);
            rule__Entity__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__44383);
            rule__Entity__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__4


    // $ANTLR start rule__Entity__Group__4__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2194:1: rule__Entity__Group__4__Impl : ( ( ( rule__Entity__FeaturesAssignment_4 ) ) ( ( rule__Entity__FeaturesAssignment_4 )* ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2198:1: ( ( ( ( rule__Entity__FeaturesAssignment_4 ) ) ( ( rule__Entity__FeaturesAssignment_4 )* ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2199:1: ( ( ( rule__Entity__FeaturesAssignment_4 ) ) ( ( rule__Entity__FeaturesAssignment_4 )* ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2199:1: ( ( ( rule__Entity__FeaturesAssignment_4 ) ) ( ( rule__Entity__FeaturesAssignment_4 )* ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2200:1: ( ( rule__Entity__FeaturesAssignment_4 ) ) ( ( rule__Entity__FeaturesAssignment_4 )* )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2200:1: ( ( rule__Entity__FeaturesAssignment_4 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2201:1: ( rule__Entity__FeaturesAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2202:1: ( rule__Entity__FeaturesAssignment_4 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2202:2: rule__Entity__FeaturesAssignment_4
            {
            pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_4_in_rule__Entity__Group__4__Impl4412);
            rule__Entity__FeaturesAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 

            }

            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2205:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2206:1: ( rule__Entity__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2207:1: ( rule__Entity__FeaturesAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=27 && LA11_0<=28)||(LA11_0>=32 && LA11_0<=36)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2207:2: rule__Entity__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_4_in_rule__Entity__Group__4__Impl4424);
            	    rule__Entity__FeaturesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__4__Impl


    // $ANTLR start rule__Entity__Group__5
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2218:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2222:1: ( rule__Entity__Group__5__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2223:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__54457);
            rule__Entity__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__5


    // $ANTLR start rule__Entity__Group__5__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2229:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2233:1: ( ( '}' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2234:1: ( '}' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2234:1: ( '}' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2235:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group__5__Impl4485); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__5__Impl


    // $ANTLR start rule__Entity__Group_2__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2260:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2264:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2265:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__04528);
            rule__Entity__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__04531);
            rule__Entity__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__0


    // $ANTLR start rule__Entity__Group_2__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2272:1: rule__Entity__Group_2__0__Impl : ( 'extend' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2276:1: ( ( 'extend' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2277:1: ( 'extend' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2277:1: ( 'extend' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2278:1: 'extend'
            {
             before(grammarAccess.getEntityAccess().getExtendKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group_2__0__Impl4559); 
             after(grammarAccess.getEntityAccess().getExtendKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__0__Impl


    // $ANTLR start rule__Entity__Group_2__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2291:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2295:1: ( rule__Entity__Group_2__1__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2296:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__14590);
            rule__Entity__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__1


    // $ANTLR start rule__Entity__Group_2__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2302:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2306:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2307:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2307:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2308:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2309:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2309:2: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl4617);
            rule__Entity__SuperTypeAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__1__Impl


    // $ANTLR start rule__Feature__Group_0__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2323:1: rule__Feature__Group_0__0 : rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1 ;
    public final void rule__Feature__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2327:1: ( rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2328:2: rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_0__0__Impl_in_rule__Feature__Group_0__04651);
            rule__Feature__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_0__1_in_rule__Feature__Group_0__04654);
            rule__Feature__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_0__0


    // $ANTLR start rule__Feature__Group_0__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2335:1: rule__Feature__Group_0__0__Impl : ( ( rule__Feature__TypeAssignment_0_0 ) ) ;
    public final void rule__Feature__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2339:1: ( ( ( rule__Feature__TypeAssignment_0_0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2340:1: ( ( rule__Feature__TypeAssignment_0_0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2340:1: ( ( rule__Feature__TypeAssignment_0_0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2341:1: ( rule__Feature__TypeAssignment_0_0 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_0_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2342:1: ( rule__Feature__TypeAssignment_0_0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2342:2: rule__Feature__TypeAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_0_0_in_rule__Feature__Group_0__0__Impl4681);
            rule__Feature__TypeAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_0__0__Impl


    // $ANTLR start rule__Feature__Group_0__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2352:1: rule__Feature__Group_0__1 : rule__Feature__Group_0__1__Impl rule__Feature__Group_0__2 ;
    public final void rule__Feature__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2356:1: ( rule__Feature__Group_0__1__Impl rule__Feature__Group_0__2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2357:2: rule__Feature__Group_0__1__Impl rule__Feature__Group_0__2
            {
            pushFollow(FOLLOW_rule__Feature__Group_0__1__Impl_in_rule__Feature__Group_0__14711);
            rule__Feature__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_0__2_in_rule__Feature__Group_0__14714);
            rule__Feature__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_0__1


    // $ANTLR start rule__Feature__Group_0__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2364:1: rule__Feature__Group_0__1__Impl : ( ( rule__Feature__NameAssignment_0_1 ) ) ;
    public final void rule__Feature__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2368:1: ( ( ( rule__Feature__NameAssignment_0_1 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2369:1: ( ( rule__Feature__NameAssignment_0_1 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2369:1: ( ( rule__Feature__NameAssignment_0_1 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2370:1: ( rule__Feature__NameAssignment_0_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_0_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2371:1: ( rule__Feature__NameAssignment_0_1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2371:2: rule__Feature__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_0_1_in_rule__Feature__Group_0__1__Impl4741);
            rule__Feature__NameAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_0__1__Impl


    // $ANTLR start rule__Feature__Group_0__2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2381:1: rule__Feature__Group_0__2 : rule__Feature__Group_0__2__Impl ;
    public final void rule__Feature__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2385:1: ( rule__Feature__Group_0__2__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2386:2: rule__Feature__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_0__2__Impl_in_rule__Feature__Group_0__24771);
            rule__Feature__Group_0__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_0__2


    // $ANTLR start rule__Feature__Group_0__2__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2392:1: rule__Feature__Group_0__2__Impl : ( ';' ) ;
    public final void rule__Feature__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2396:1: ( ( ';' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2397:1: ( ';' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2397:1: ( ';' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2398:1: ';'
            {
             before(grammarAccess.getFeatureAccess().getSemicolonKeyword_0_2()); 
            match(input,26,FOLLOW_26_in_rule__Feature__Group_0__2__Impl4799); 
             after(grammarAccess.getFeatureAccess().getSemicolonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_0__2__Impl


    // $ANTLR start rule__Feature__Group_1__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2417:1: rule__Feature__Group_1__0 : rule__Feature__Group_1__0__Impl rule__Feature__Group_1__1 ;
    public final void rule__Feature__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2421:1: ( rule__Feature__Group_1__0__Impl rule__Feature__Group_1__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2422:2: rule__Feature__Group_1__0__Impl rule__Feature__Group_1__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_1__0__Impl_in_rule__Feature__Group_1__04836);
            rule__Feature__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_1__1_in_rule__Feature__Group_1__04839);
            rule__Feature__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_1__0


    // $ANTLR start rule__Feature__Group_1__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2429:1: rule__Feature__Group_1__0__Impl : ( ( rule__Feature__ReadorWriteAssignment_1_0 ) ) ;
    public final void rule__Feature__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2433:1: ( ( ( rule__Feature__ReadorWriteAssignment_1_0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2434:1: ( ( rule__Feature__ReadorWriteAssignment_1_0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2434:1: ( ( rule__Feature__ReadorWriteAssignment_1_0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2435:1: ( rule__Feature__ReadorWriteAssignment_1_0 )
            {
             before(grammarAccess.getFeatureAccess().getReadorWriteAssignment_1_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2436:1: ( rule__Feature__ReadorWriteAssignment_1_0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2436:2: rule__Feature__ReadorWriteAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Feature__ReadorWriteAssignment_1_0_in_rule__Feature__Group_1__0__Impl4866);
            rule__Feature__ReadorWriteAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getFeatureAccess().getReadorWriteAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_1__0__Impl


    // $ANTLR start rule__Feature__Group_1__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2446:1: rule__Feature__Group_1__1 : rule__Feature__Group_1__1__Impl ;
    public final void rule__Feature__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2450:1: ( rule__Feature__Group_1__1__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2451:2: rule__Feature__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_1__1__Impl_in_rule__Feature__Group_1__14896);
            rule__Feature__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_1__1


    // $ANTLR start rule__Feature__Group_1__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2457:1: rule__Feature__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Feature__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2461:1: ( ( ';' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2462:1: ( ';' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2462:1: ( ';' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2463:1: ';'
            {
             before(grammarAccess.getFeatureAccess().getSemicolonKeyword_1_1()); 
            match(input,26,FOLLOW_26_in_rule__Feature__Group_1__1__Impl4924); 
             after(grammarAccess.getFeatureAccess().getSemicolonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group_1__1__Impl


    // $ANTLR start rule__ReadorWrite__Group_0__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2480:1: rule__ReadorWrite__Group_0__0 : rule__ReadorWrite__Group_0__0__Impl rule__ReadorWrite__Group_0__1 ;
    public final void rule__ReadorWrite__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2484:1: ( rule__ReadorWrite__Group_0__0__Impl rule__ReadorWrite__Group_0__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2485:2: rule__ReadorWrite__Group_0__0__Impl rule__ReadorWrite__Group_0__1
            {
            pushFollow(FOLLOW_rule__ReadorWrite__Group_0__0__Impl_in_rule__ReadorWrite__Group_0__04959);
            rule__ReadorWrite__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ReadorWrite__Group_0__1_in_rule__ReadorWrite__Group_0__04962);
            rule__ReadorWrite__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_0__0


    // $ANTLR start rule__ReadorWrite__Group_0__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2492:1: rule__ReadorWrite__Group_0__0__Impl : ( 'read' ) ;
    public final void rule__ReadorWrite__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2496:1: ( ( 'read' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2497:1: ( 'read' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2497:1: ( 'read' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2498:1: 'read'
            {
             before(grammarAccess.getReadorWriteAccess().getReadKeyword_0_0()); 
            match(input,27,FOLLOW_27_in_rule__ReadorWrite__Group_0__0__Impl4990); 
             after(grammarAccess.getReadorWriteAccess().getReadKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_0__0__Impl


    // $ANTLR start rule__ReadorWrite__Group_0__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2511:1: rule__ReadorWrite__Group_0__1 : rule__ReadorWrite__Group_0__1__Impl rule__ReadorWrite__Group_0__2 ;
    public final void rule__ReadorWrite__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2515:1: ( rule__ReadorWrite__Group_0__1__Impl rule__ReadorWrite__Group_0__2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2516:2: rule__ReadorWrite__Group_0__1__Impl rule__ReadorWrite__Group_0__2
            {
            pushFollow(FOLLOW_rule__ReadorWrite__Group_0__1__Impl_in_rule__ReadorWrite__Group_0__15021);
            rule__ReadorWrite__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ReadorWrite__Group_0__2_in_rule__ReadorWrite__Group_0__15024);
            rule__ReadorWrite__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_0__1


    // $ANTLR start rule__ReadorWrite__Group_0__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2523:1: rule__ReadorWrite__Group_0__1__Impl : ( '(' ) ;
    public final void rule__ReadorWrite__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2527:1: ( ( '(' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2528:1: ( '(' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2528:1: ( '(' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2529:1: '('
            {
             before(grammarAccess.getReadorWriteAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,21,FOLLOW_21_in_rule__ReadorWrite__Group_0__1__Impl5052); 
             after(grammarAccess.getReadorWriteAccess().getLeftParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_0__1__Impl


    // $ANTLR start rule__ReadorWrite__Group_0__2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2542:1: rule__ReadorWrite__Group_0__2 : rule__ReadorWrite__Group_0__2__Impl rule__ReadorWrite__Group_0__3 ;
    public final void rule__ReadorWrite__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2546:1: ( rule__ReadorWrite__Group_0__2__Impl rule__ReadorWrite__Group_0__3 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2547:2: rule__ReadorWrite__Group_0__2__Impl rule__ReadorWrite__Group_0__3
            {
            pushFollow(FOLLOW_rule__ReadorWrite__Group_0__2__Impl_in_rule__ReadorWrite__Group_0__25083);
            rule__ReadorWrite__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ReadorWrite__Group_0__3_in_rule__ReadorWrite__Group_0__25086);
            rule__ReadorWrite__Group_0__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_0__2


    // $ANTLR start rule__ReadorWrite__Group_0__2__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2554:1: rule__ReadorWrite__Group_0__2__Impl : ( ( rule__ReadorWrite__TokenAssignment_0_2 ) ) ;
    public final void rule__ReadorWrite__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2558:1: ( ( ( rule__ReadorWrite__TokenAssignment_0_2 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2559:1: ( ( rule__ReadorWrite__TokenAssignment_0_2 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2559:1: ( ( rule__ReadorWrite__TokenAssignment_0_2 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2560:1: ( rule__ReadorWrite__TokenAssignment_0_2 )
            {
             before(grammarAccess.getReadorWriteAccess().getTokenAssignment_0_2()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2561:1: ( rule__ReadorWrite__TokenAssignment_0_2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2561:2: rule__ReadorWrite__TokenAssignment_0_2
            {
            pushFollow(FOLLOW_rule__ReadorWrite__TokenAssignment_0_2_in_rule__ReadorWrite__Group_0__2__Impl5113);
            rule__ReadorWrite__TokenAssignment_0_2();
            _fsp--;


            }

             after(grammarAccess.getReadorWriteAccess().getTokenAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_0__2__Impl


    // $ANTLR start rule__ReadorWrite__Group_0__3
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2571:1: rule__ReadorWrite__Group_0__3 : rule__ReadorWrite__Group_0__3__Impl rule__ReadorWrite__Group_0__4 ;
    public final void rule__ReadorWrite__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2575:1: ( rule__ReadorWrite__Group_0__3__Impl rule__ReadorWrite__Group_0__4 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2576:2: rule__ReadorWrite__Group_0__3__Impl rule__ReadorWrite__Group_0__4
            {
            pushFollow(FOLLOW_rule__ReadorWrite__Group_0__3__Impl_in_rule__ReadorWrite__Group_0__35143);
            rule__ReadorWrite__Group_0__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ReadorWrite__Group_0__4_in_rule__ReadorWrite__Group_0__35146);
            rule__ReadorWrite__Group_0__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_0__3


    // $ANTLR start rule__ReadorWrite__Group_0__3__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2583:1: rule__ReadorWrite__Group_0__3__Impl : ( ',' ) ;
    public final void rule__ReadorWrite__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2587:1: ( ( ',' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2588:1: ( ',' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2588:1: ( ',' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2589:1: ','
            {
             before(grammarAccess.getReadorWriteAccess().getCommaKeyword_0_3()); 
            match(input,22,FOLLOW_22_in_rule__ReadorWrite__Group_0__3__Impl5174); 
             after(grammarAccess.getReadorWriteAccess().getCommaKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_0__3__Impl


    // $ANTLR start rule__ReadorWrite__Group_0__4
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2602:1: rule__ReadorWrite__Group_0__4 : rule__ReadorWrite__Group_0__4__Impl rule__ReadorWrite__Group_0__5 ;
    public final void rule__ReadorWrite__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2606:1: ( rule__ReadorWrite__Group_0__4__Impl rule__ReadorWrite__Group_0__5 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2607:2: rule__ReadorWrite__Group_0__4__Impl rule__ReadorWrite__Group_0__5
            {
            pushFollow(FOLLOW_rule__ReadorWrite__Group_0__4__Impl_in_rule__ReadorWrite__Group_0__45205);
            rule__ReadorWrite__Group_0__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ReadorWrite__Group_0__5_in_rule__ReadorWrite__Group_0__45208);
            rule__ReadorWrite__Group_0__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_0__4


    // $ANTLR start rule__ReadorWrite__Group_0__4__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2614:1: rule__ReadorWrite__Group_0__4__Impl : ( ( rule__ReadorWrite__ReadvalAssignment_0_4 ) ) ;
    public final void rule__ReadorWrite__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2618:1: ( ( ( rule__ReadorWrite__ReadvalAssignment_0_4 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2619:1: ( ( rule__ReadorWrite__ReadvalAssignment_0_4 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2619:1: ( ( rule__ReadorWrite__ReadvalAssignment_0_4 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2620:1: ( rule__ReadorWrite__ReadvalAssignment_0_4 )
            {
             before(grammarAccess.getReadorWriteAccess().getReadvalAssignment_0_4()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2621:1: ( rule__ReadorWrite__ReadvalAssignment_0_4 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2621:2: rule__ReadorWrite__ReadvalAssignment_0_4
            {
            pushFollow(FOLLOW_rule__ReadorWrite__ReadvalAssignment_0_4_in_rule__ReadorWrite__Group_0__4__Impl5235);
            rule__ReadorWrite__ReadvalAssignment_0_4();
            _fsp--;


            }

             after(grammarAccess.getReadorWriteAccess().getReadvalAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_0__4__Impl


    // $ANTLR start rule__ReadorWrite__Group_0__5
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2631:1: rule__ReadorWrite__Group_0__5 : rule__ReadorWrite__Group_0__5__Impl ;
    public final void rule__ReadorWrite__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2635:1: ( rule__ReadorWrite__Group_0__5__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2636:2: rule__ReadorWrite__Group_0__5__Impl
            {
            pushFollow(FOLLOW_rule__ReadorWrite__Group_0__5__Impl_in_rule__ReadorWrite__Group_0__55265);
            rule__ReadorWrite__Group_0__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_0__5


    // $ANTLR start rule__ReadorWrite__Group_0__5__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2642:1: rule__ReadorWrite__Group_0__5__Impl : ( ')' ) ;
    public final void rule__ReadorWrite__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2646:1: ( ( ')' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2647:1: ( ')' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2647:1: ( ')' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2648:1: ')'
            {
             before(grammarAccess.getReadorWriteAccess().getRightParenthesisKeyword_0_5()); 
            match(input,23,FOLLOW_23_in_rule__ReadorWrite__Group_0__5__Impl5293); 
             after(grammarAccess.getReadorWriteAccess().getRightParenthesisKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_0__5__Impl


    // $ANTLR start rule__ReadorWrite__Group_1__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2673:1: rule__ReadorWrite__Group_1__0 : rule__ReadorWrite__Group_1__0__Impl rule__ReadorWrite__Group_1__1 ;
    public final void rule__ReadorWrite__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2677:1: ( rule__ReadorWrite__Group_1__0__Impl rule__ReadorWrite__Group_1__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2678:2: rule__ReadorWrite__Group_1__0__Impl rule__ReadorWrite__Group_1__1
            {
            pushFollow(FOLLOW_rule__ReadorWrite__Group_1__0__Impl_in_rule__ReadorWrite__Group_1__05336);
            rule__ReadorWrite__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ReadorWrite__Group_1__1_in_rule__ReadorWrite__Group_1__05339);
            rule__ReadorWrite__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_1__0


    // $ANTLR start rule__ReadorWrite__Group_1__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2685:1: rule__ReadorWrite__Group_1__0__Impl : ( 'write' ) ;
    public final void rule__ReadorWrite__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2689:1: ( ( 'write' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2690:1: ( 'write' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2690:1: ( 'write' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2691:1: 'write'
            {
             before(grammarAccess.getReadorWriteAccess().getWriteKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__ReadorWrite__Group_1__0__Impl5367); 
             after(grammarAccess.getReadorWriteAccess().getWriteKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_1__0__Impl


    // $ANTLR start rule__ReadorWrite__Group_1__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2704:1: rule__ReadorWrite__Group_1__1 : rule__ReadorWrite__Group_1__1__Impl rule__ReadorWrite__Group_1__2 ;
    public final void rule__ReadorWrite__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2708:1: ( rule__ReadorWrite__Group_1__1__Impl rule__ReadorWrite__Group_1__2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2709:2: rule__ReadorWrite__Group_1__1__Impl rule__ReadorWrite__Group_1__2
            {
            pushFollow(FOLLOW_rule__ReadorWrite__Group_1__1__Impl_in_rule__ReadorWrite__Group_1__15398);
            rule__ReadorWrite__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ReadorWrite__Group_1__2_in_rule__ReadorWrite__Group_1__15401);
            rule__ReadorWrite__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_1__1


    // $ANTLR start rule__ReadorWrite__Group_1__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2716:1: rule__ReadorWrite__Group_1__1__Impl : ( '(' ) ;
    public final void rule__ReadorWrite__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2720:1: ( ( '(' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2721:1: ( '(' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2721:1: ( '(' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2722:1: '('
            {
             before(grammarAccess.getReadorWriteAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,21,FOLLOW_21_in_rule__ReadorWrite__Group_1__1__Impl5429); 
             after(grammarAccess.getReadorWriteAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_1__1__Impl


    // $ANTLR start rule__ReadorWrite__Group_1__2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2735:1: rule__ReadorWrite__Group_1__2 : rule__ReadorWrite__Group_1__2__Impl rule__ReadorWrite__Group_1__3 ;
    public final void rule__ReadorWrite__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2739:1: ( rule__ReadorWrite__Group_1__2__Impl rule__ReadorWrite__Group_1__3 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2740:2: rule__ReadorWrite__Group_1__2__Impl rule__ReadorWrite__Group_1__3
            {
            pushFollow(FOLLOW_rule__ReadorWrite__Group_1__2__Impl_in_rule__ReadorWrite__Group_1__25460);
            rule__ReadorWrite__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ReadorWrite__Group_1__3_in_rule__ReadorWrite__Group_1__25463);
            rule__ReadorWrite__Group_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_1__2


    // $ANTLR start rule__ReadorWrite__Group_1__2__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2747:1: rule__ReadorWrite__Group_1__2__Impl : ( ( rule__ReadorWrite__TokenAssignment_1_2 ) ) ;
    public final void rule__ReadorWrite__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2751:1: ( ( ( rule__ReadorWrite__TokenAssignment_1_2 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2752:1: ( ( rule__ReadorWrite__TokenAssignment_1_2 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2752:1: ( ( rule__ReadorWrite__TokenAssignment_1_2 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2753:1: ( rule__ReadorWrite__TokenAssignment_1_2 )
            {
             before(grammarAccess.getReadorWriteAccess().getTokenAssignment_1_2()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2754:1: ( rule__ReadorWrite__TokenAssignment_1_2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2754:2: rule__ReadorWrite__TokenAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ReadorWrite__TokenAssignment_1_2_in_rule__ReadorWrite__Group_1__2__Impl5490);
            rule__ReadorWrite__TokenAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getReadorWriteAccess().getTokenAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_1__2__Impl


    // $ANTLR start rule__ReadorWrite__Group_1__3
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2764:1: rule__ReadorWrite__Group_1__3 : rule__ReadorWrite__Group_1__3__Impl rule__ReadorWrite__Group_1__4 ;
    public final void rule__ReadorWrite__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2768:1: ( rule__ReadorWrite__Group_1__3__Impl rule__ReadorWrite__Group_1__4 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2769:2: rule__ReadorWrite__Group_1__3__Impl rule__ReadorWrite__Group_1__4
            {
            pushFollow(FOLLOW_rule__ReadorWrite__Group_1__3__Impl_in_rule__ReadorWrite__Group_1__35520);
            rule__ReadorWrite__Group_1__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ReadorWrite__Group_1__4_in_rule__ReadorWrite__Group_1__35523);
            rule__ReadorWrite__Group_1__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_1__3


    // $ANTLR start rule__ReadorWrite__Group_1__3__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2776:1: rule__ReadorWrite__Group_1__3__Impl : ( ',' ) ;
    public final void rule__ReadorWrite__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2780:1: ( ( ',' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2781:1: ( ',' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2781:1: ( ',' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2782:1: ','
            {
             before(grammarAccess.getReadorWriteAccess().getCommaKeyword_1_3()); 
            match(input,22,FOLLOW_22_in_rule__ReadorWrite__Group_1__3__Impl5551); 
             after(grammarAccess.getReadorWriteAccess().getCommaKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_1__3__Impl


    // $ANTLR start rule__ReadorWrite__Group_1__4
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2795:1: rule__ReadorWrite__Group_1__4 : rule__ReadorWrite__Group_1__4__Impl rule__ReadorWrite__Group_1__5 ;
    public final void rule__ReadorWrite__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2799:1: ( rule__ReadorWrite__Group_1__4__Impl rule__ReadorWrite__Group_1__5 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2800:2: rule__ReadorWrite__Group_1__4__Impl rule__ReadorWrite__Group_1__5
            {
            pushFollow(FOLLOW_rule__ReadorWrite__Group_1__4__Impl_in_rule__ReadorWrite__Group_1__45582);
            rule__ReadorWrite__Group_1__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ReadorWrite__Group_1__5_in_rule__ReadorWrite__Group_1__45585);
            rule__ReadorWrite__Group_1__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_1__4


    // $ANTLR start rule__ReadorWrite__Group_1__4__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2807:1: rule__ReadorWrite__Group_1__4__Impl : ( ( rule__ReadorWrite__WritevalAssignment_1_4 ) ) ;
    public final void rule__ReadorWrite__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2811:1: ( ( ( rule__ReadorWrite__WritevalAssignment_1_4 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2812:1: ( ( rule__ReadorWrite__WritevalAssignment_1_4 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2812:1: ( ( rule__ReadorWrite__WritevalAssignment_1_4 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2813:1: ( rule__ReadorWrite__WritevalAssignment_1_4 )
            {
             before(grammarAccess.getReadorWriteAccess().getWritevalAssignment_1_4()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2814:1: ( rule__ReadorWrite__WritevalAssignment_1_4 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2814:2: rule__ReadorWrite__WritevalAssignment_1_4
            {
            pushFollow(FOLLOW_rule__ReadorWrite__WritevalAssignment_1_4_in_rule__ReadorWrite__Group_1__4__Impl5612);
            rule__ReadorWrite__WritevalAssignment_1_4();
            _fsp--;


            }

             after(grammarAccess.getReadorWriteAccess().getWritevalAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_1__4__Impl


    // $ANTLR start rule__ReadorWrite__Group_1__5
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2824:1: rule__ReadorWrite__Group_1__5 : rule__ReadorWrite__Group_1__5__Impl ;
    public final void rule__ReadorWrite__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2828:1: ( rule__ReadorWrite__Group_1__5__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2829:2: rule__ReadorWrite__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__ReadorWrite__Group_1__5__Impl_in_rule__ReadorWrite__Group_1__55642);
            rule__ReadorWrite__Group_1__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_1__5


    // $ANTLR start rule__ReadorWrite__Group_1__5__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2835:1: rule__ReadorWrite__Group_1__5__Impl : ( ')' ) ;
    public final void rule__ReadorWrite__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2839:1: ( ( ')' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2840:1: ( ')' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2840:1: ( ')' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2841:1: ')'
            {
             before(grammarAccess.getReadorWriteAccess().getRightParenthesisKeyword_1_5()); 
            match(input,23,FOLLOW_23_in_rule__ReadorWrite__Group_1__5__Impl5670); 
             after(grammarAccess.getReadorWriteAccess().getRightParenthesisKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__Group_1__5__Impl


    // $ANTLR start rule__TypeRef__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2866:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2870:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2871:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__05713);
            rule__TypeRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__05716);
            rule__TypeRef__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeRef__Group__0


    // $ANTLR start rule__TypeRef__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2878:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2882:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2883:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2883:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2884:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2885:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2885:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl5743);
            rule__TypeRef__ReferencedAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeRef__Group__0__Impl


    // $ANTLR start rule__TypeRef__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2895:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2899:1: ( rule__TypeRef__Group__1__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2900:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__15773);
            rule__TypeRef__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeRef__Group__1


    // $ANTLR start rule__TypeRef__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2906:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__MultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2910:1: ( ( ( rule__TypeRef__MultiAssignment_1 )? ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2911:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2911:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2912:1: ( rule__TypeRef__MultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getMultiAssignment_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2913:1: ( rule__TypeRef__MultiAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2913:2: rule__TypeRef__MultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl5800);
                    rule__TypeRef__MultiAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeRefAccess().getMultiAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeRef__Group__1__Impl


    // $ANTLR start rule__Block__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2927:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2931:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2932:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__05835);
            rule__Block__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__05838);
            rule__Block__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Block__Group__0


    // $ANTLR start rule__Block__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2939:1: rule__Block__Group__0__Impl : ( ( rule__Block__BlockAssignment_0 ) ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2943:1: ( ( ( rule__Block__BlockAssignment_0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2944:1: ( ( rule__Block__BlockAssignment_0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2944:1: ( ( rule__Block__BlockAssignment_0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2945:1: ( rule__Block__BlockAssignment_0 )
            {
             before(grammarAccess.getBlockAccess().getBlockAssignment_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2946:1: ( rule__Block__BlockAssignment_0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2946:2: rule__Block__BlockAssignment_0
            {
            pushFollow(FOLLOW_rule__Block__BlockAssignment_0_in_rule__Block__Group__0__Impl5865);
            rule__Block__BlockAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBlockAccess().getBlockAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Block__Group__0__Impl


    // $ANTLR start rule__Block__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2956:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2960:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2961:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__15895);
            rule__Block__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__15898);
            rule__Block__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Block__Group__1


    // $ANTLR start rule__Block__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2968:1: rule__Block__Group__1__Impl : ( ( rule__Block__JavafunctionsAssignment_1 )* ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2972:1: ( ( ( rule__Block__JavafunctionsAssignment_1 )* ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2973:1: ( ( rule__Block__JavafunctionsAssignment_1 )* )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2973:1: ( ( rule__Block__JavafunctionsAssignment_1 )* )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2974:1: ( rule__Block__JavafunctionsAssignment_1 )*
            {
             before(grammarAccess.getBlockAccess().getJavafunctionsAssignment_1()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2975:1: ( rule__Block__JavafunctionsAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=11 && LA13_0<=13)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2975:2: rule__Block__JavafunctionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Block__JavafunctionsAssignment_1_in_rule__Block__Group__1__Impl5925);
            	    rule__Block__JavafunctionsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getJavafunctionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Block__Group__1__Impl


    // $ANTLR start rule__Block__Group__2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2985:1: rule__Block__Group__2 : rule__Block__Group__2__Impl ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2989:1: ( rule__Block__Group__2__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2990:2: rule__Block__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__25956);
            rule__Block__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Block__Group__2


    // $ANTLR start rule__Block__Group__2__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:2996:1: rule__Block__Group__2__Impl : ( ']' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3000:1: ( ( ']' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3001:1: ( ']' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3001:1: ( ']' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3002:1: ']'
            {
             before(grammarAccess.getBlockAccess().getRightSquareBracketKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Block__Group__2__Impl5984); 
             after(grammarAccess.getBlockAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Block__Group__2__Impl


    // $ANTLR start rule__JavaFunction__Group__0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3021:1: rule__JavaFunction__Group__0 : rule__JavaFunction__Group__0__Impl rule__JavaFunction__Group__1 ;
    public final void rule__JavaFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3025:1: ( rule__JavaFunction__Group__0__Impl rule__JavaFunction__Group__1 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3026:2: rule__JavaFunction__Group__0__Impl rule__JavaFunction__Group__1
            {
            pushFollow(FOLLOW_rule__JavaFunction__Group__0__Impl_in_rule__JavaFunction__Group__06021);
            rule__JavaFunction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__JavaFunction__Group__1_in_rule__JavaFunction__Group__06024);
            rule__JavaFunction__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JavaFunction__Group__0


    // $ANTLR start rule__JavaFunction__Group__0__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3033:1: rule__JavaFunction__Group__0__Impl : ( ( rule__JavaFunction__TimeofCallAssignment_0 ) ) ;
    public final void rule__JavaFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3037:1: ( ( ( rule__JavaFunction__TimeofCallAssignment_0 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3038:1: ( ( rule__JavaFunction__TimeofCallAssignment_0 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3038:1: ( ( rule__JavaFunction__TimeofCallAssignment_0 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3039:1: ( rule__JavaFunction__TimeofCallAssignment_0 )
            {
             before(grammarAccess.getJavaFunctionAccess().getTimeofCallAssignment_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3040:1: ( rule__JavaFunction__TimeofCallAssignment_0 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3040:2: rule__JavaFunction__TimeofCallAssignment_0
            {
            pushFollow(FOLLOW_rule__JavaFunction__TimeofCallAssignment_0_in_rule__JavaFunction__Group__0__Impl6051);
            rule__JavaFunction__TimeofCallAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getJavaFunctionAccess().getTimeofCallAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JavaFunction__Group__0__Impl


    // $ANTLR start rule__JavaFunction__Group__1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3050:1: rule__JavaFunction__Group__1 : rule__JavaFunction__Group__1__Impl rule__JavaFunction__Group__2 ;
    public final void rule__JavaFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3054:1: ( rule__JavaFunction__Group__1__Impl rule__JavaFunction__Group__2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3055:2: rule__JavaFunction__Group__1__Impl rule__JavaFunction__Group__2
            {
            pushFollow(FOLLOW_rule__JavaFunction__Group__1__Impl_in_rule__JavaFunction__Group__16081);
            rule__JavaFunction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__JavaFunction__Group__2_in_rule__JavaFunction__Group__16084);
            rule__JavaFunction__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JavaFunction__Group__1


    // $ANTLR start rule__JavaFunction__Group__1__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3062:1: rule__JavaFunction__Group__1__Impl : ( ':' ) ;
    public final void rule__JavaFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3066:1: ( ( ':' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3067:1: ( ':' )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3067:1: ( ':' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3068:1: ':'
            {
             before(grammarAccess.getJavaFunctionAccess().getColonKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__JavaFunction__Group__1__Impl6112); 
             after(grammarAccess.getJavaFunctionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JavaFunction__Group__1__Impl


    // $ANTLR start rule__JavaFunction__Group__2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3081:1: rule__JavaFunction__Group__2 : rule__JavaFunction__Group__2__Impl ;
    public final void rule__JavaFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3085:1: ( rule__JavaFunction__Group__2__Impl )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3086:2: rule__JavaFunction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JavaFunction__Group__2__Impl_in_rule__JavaFunction__Group__26143);
            rule__JavaFunction__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JavaFunction__Group__2


    // $ANTLR start rule__JavaFunction__Group__2__Impl
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3092:1: rule__JavaFunction__Group__2__Impl : ( ( rule__JavaFunction__ParamnameAssignment_2 ) ) ;
    public final void rule__JavaFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3096:1: ( ( ( rule__JavaFunction__ParamnameAssignment_2 ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3097:1: ( ( rule__JavaFunction__ParamnameAssignment_2 ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3097:1: ( ( rule__JavaFunction__ParamnameAssignment_2 ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3098:1: ( rule__JavaFunction__ParamnameAssignment_2 )
            {
             before(grammarAccess.getJavaFunctionAccess().getParamnameAssignment_2()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3099:1: ( rule__JavaFunction__ParamnameAssignment_2 )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3099:2: rule__JavaFunction__ParamnameAssignment_2
            {
            pushFollow(FOLLOW_rule__JavaFunction__ParamnameAssignment_2_in_rule__JavaFunction__Group__2__Impl6170);
            rule__JavaFunction__ParamnameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getJavaFunctionAccess().getParamnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JavaFunction__Group__2__Impl


    // $ANTLR start rule__MapRedoop__DeclarationAssignment_0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3116:1: rule__MapRedoop__DeclarationAssignment_0 : ( ruleDeclaration ) ;
    public final void rule__MapRedoop__DeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3120:1: ( ( ruleDeclaration ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3121:1: ( ruleDeclaration )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3121:1: ( ruleDeclaration )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3122:1: ruleDeclaration
            {
             before(grammarAccess.getMapRedoopAccess().getDeclarationDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__MapRedoop__DeclarationAssignment_06211);
            ruleDeclaration();
            _fsp--;

             after(grammarAccess.getMapRedoopAccess().getDeclarationDeclarationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__DeclarationAssignment_0


    // $ANTLR start rule__MapRedoop__ContentAssignment_2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3131:1: rule__MapRedoop__ContentAssignment_2 : ( ruleContent ) ;
    public final void rule__MapRedoop__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3135:1: ( ( ruleContent ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3136:1: ( ruleContent )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3136:1: ( ruleContent )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3137:1: ruleContent
            {
             before(grammarAccess.getMapRedoopAccess().getContentContentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleContent_in_rule__MapRedoop__ContentAssignment_26242);
            ruleContent();
            _fsp--;

             after(grammarAccess.getMapRedoopAccess().getContentContentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MapRedoop__ContentAssignment_2


    // $ANTLR start rule__Content__EntitiesAssignment_0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3146:1: rule__Content__EntitiesAssignment_0 : ( ruleListofEntities ) ;
    public final void rule__Content__EntitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3150:1: ( ( ruleListofEntities ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3151:1: ( ruleListofEntities )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3151:1: ( ruleListofEntities )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3152:1: ruleListofEntities
            {
             before(grammarAccess.getContentAccess().getEntitiesListofEntitiesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleListofEntities_in_rule__Content__EntitiesAssignment_06273);
            ruleListofEntities();
            _fsp--;

             after(grammarAccess.getContentAccess().getEntitiesListofEntitiesParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Content__EntitiesAssignment_0


    // $ANTLR start rule__Content__MrBlocksAssignment_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3161:1: rule__Content__MrBlocksAssignment_1 : ( ruleMRBlock ) ;
    public final void rule__Content__MrBlocksAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3165:1: ( ( ruleMRBlock ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3166:1: ( ruleMRBlock )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3166:1: ( ruleMRBlock )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3167:1: ruleMRBlock
            {
             before(grammarAccess.getContentAccess().getMrBlocksMRBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMRBlock_in_rule__Content__MrBlocksAssignment_16304);
            ruleMRBlock();
            _fsp--;

             after(grammarAccess.getContentAccess().getMrBlocksMRBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Content__MrBlocksAssignment_1


    // $ANTLR start rule__ListofEntities__EntitiesAssignment_3
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3176:1: rule__ListofEntities__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__ListofEntities__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3180:1: ( ( ruleEntity ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3181:1: ( ruleEntity )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3181:1: ( ruleEntity )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3182:1: ruleEntity
            {
             before(grammarAccess.getListofEntitiesAccess().getEntitiesEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__ListofEntities__EntitiesAssignment_36335);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getListofEntitiesAccess().getEntitiesEntityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ListofEntities__EntitiesAssignment_3


    // $ANTLR start rule__MRBlock__LoopAssignment_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3191:1: rule__MRBlock__LoopAssignment_1 : ( ( 'loop' ) ) ;
    public final void rule__MRBlock__LoopAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3195:1: ( ( ( 'loop' ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3196:1: ( ( 'loop' ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3196:1: ( ( 'loop' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3197:1: ( 'loop' )
            {
             before(grammarAccess.getMRBlockAccess().getLoopLoopKeyword_1_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3198:1: ( 'loop' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3199:1: 'loop'
            {
             before(grammarAccess.getMRBlockAccess().getLoopLoopKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__MRBlock__LoopAssignment_16371); 
             after(grammarAccess.getMRBlockAccess().getLoopLoopKeyword_1_0()); 

            }

             after(grammarAccess.getMRBlockAccess().getLoopLoopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__LoopAssignment_1


    // $ANTLR start rule__MRBlock__MapperAssignment_3
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3214:1: rule__MRBlock__MapperAssignment_3 : ( ruleMapper ) ;
    public final void rule__MRBlock__MapperAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3218:1: ( ( ruleMapper ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3219:1: ( ruleMapper )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3219:1: ( ruleMapper )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3220:1: ruleMapper
            {
             before(grammarAccess.getMRBlockAccess().getMapperMapperParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMapper_in_rule__MRBlock__MapperAssignment_36410);
            ruleMapper();
            _fsp--;

             after(grammarAccess.getMRBlockAccess().getMapperMapperParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__MapperAssignment_3


    // $ANTLR start rule__MRBlock__ReducerAssignment_4
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3229:1: rule__MRBlock__ReducerAssignment_4 : ( ruleReducer ) ;
    public final void rule__MRBlock__ReducerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3233:1: ( ( ruleReducer ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3234:1: ( ruleReducer )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3234:1: ( ruleReducer )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3235:1: ruleReducer
            {
             before(grammarAccess.getMRBlockAccess().getReducerReducerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleReducer_in_rule__MRBlock__ReducerAssignment_46441);
            ruleReducer();
            _fsp--;

             after(grammarAccess.getMRBlockAccess().getReducerReducerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MRBlock__ReducerAssignment_4


    // $ANTLR start rule__Declaration__NameAssignment_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3244:1: rule__Declaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3248:1: ( ( RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3249:1: ( RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3249:1: ( RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3250:1: RULE_ID
            {
             before(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Declaration__NameAssignment_16472); 
             after(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__NameAssignment_1


    // $ANTLR start rule__Declaration__SuperNameAssignment_2_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3259:1: rule__Declaration__SuperNameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Declaration__SuperNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3263:1: ( ( RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3264:1: ( RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3264:1: ( RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3265:1: RULE_ID
            {
             before(grammarAccess.getDeclarationAccess().getSuperNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Declaration__SuperNameAssignment_2_16503); 
             after(grammarAccess.getDeclarationAccess().getSuperNameIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declaration__SuperNameAssignment_2_1


    // $ANTLR start rule__Mapper__InkeyAssignment_2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3274:1: rule__Mapper__InkeyAssignment_2 : ( ruleArgument ) ;
    public final void rule__Mapper__InkeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3278:1: ( ( ruleArgument ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3279:1: ( ruleArgument )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3279:1: ( ruleArgument )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3280:1: ruleArgument
            {
             before(grammarAccess.getMapperAccess().getInkeyArgumentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Mapper__InkeyAssignment_26534);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getMapperAccess().getInkeyArgumentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__InkeyAssignment_2


    // $ANTLR start rule__Mapper__InvalueAssignment_4
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3289:1: rule__Mapper__InvalueAssignment_4 : ( ruleArgument ) ;
    public final void rule__Mapper__InvalueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3293:1: ( ( ruleArgument ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3294:1: ( ruleArgument )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3294:1: ( ruleArgument )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3295:1: ruleArgument
            {
             before(grammarAccess.getMapperAccess().getInvalueArgumentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Mapper__InvalueAssignment_46565);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getMapperAccess().getInvalueArgumentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__InvalueAssignment_4


    // $ANTLR start rule__Mapper__OutKeyTypeAssignment_6
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3304:1: rule__Mapper__OutKeyTypeAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Mapper__OutKeyTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3308:1: ( ( RULE_STRING ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3309:1: ( RULE_STRING )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3309:1: ( RULE_STRING )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3310:1: RULE_STRING
            {
             before(grammarAccess.getMapperAccess().getOutKeyTypeSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Mapper__OutKeyTypeAssignment_66596); 
             after(grammarAccess.getMapperAccess().getOutKeyTypeSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__OutKeyTypeAssignment_6


    // $ANTLR start rule__Mapper__OutValueTypeAssignment_8
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3319:1: rule__Mapper__OutValueTypeAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Mapper__OutValueTypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3323:1: ( ( RULE_STRING ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3324:1: ( RULE_STRING )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3324:1: ( RULE_STRING )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3325:1: RULE_STRING
            {
             before(grammarAccess.getMapperAccess().getOutValueTypeSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Mapper__OutValueTypeAssignment_86627); 
             after(grammarAccess.getMapperAccess().getOutValueTypeSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__OutValueTypeAssignment_8


    // $ANTLR start rule__Mapper__TextAssignment_10
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3334:1: rule__Mapper__TextAssignment_10 : ( ruleBlock ) ;
    public final void rule__Mapper__TextAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3338:1: ( ( ruleBlock ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3339:1: ( ruleBlock )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3339:1: ( ruleBlock )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3340:1: ruleBlock
            {
             before(grammarAccess.getMapperAccess().getTextBlockParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__Mapper__TextAssignment_106658);
            ruleBlock();
            _fsp--;

             after(grammarAccess.getMapperAccess().getTextBlockParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapper__TextAssignment_10


    // $ANTLR start rule__Argument__TypeAssignment_0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3349:1: rule__Argument__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Argument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3353:1: ( ( ruleType ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3354:1: ( ruleType )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3354:1: ( ruleType )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3355:1: ruleType
            {
             before(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Argument__TypeAssignment_06689);
            ruleType();
            _fsp--;

             after(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__TypeAssignment_0


    // $ANTLR start rule__Argument__ArgnameAssignment_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3364:1: rule__Argument__ArgnameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__ArgnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3368:1: ( ( RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3369:1: ( RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3369:1: ( RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3370:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getArgnameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__ArgnameAssignment_16720); 
             after(grammarAccess.getArgumentAccess().getArgnameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__ArgnameAssignment_1


    // $ANTLR start rule__Reducer__InkeyAssignment_2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3381:1: rule__Reducer__InkeyAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Reducer__InkeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3385:1: ( ( RULE_STRING ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3386:1: ( RULE_STRING )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3386:1: ( RULE_STRING )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3387:1: RULE_STRING
            {
             before(grammarAccess.getReducerAccess().getInkeySTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Reducer__InkeyAssignment_26753); 
             after(grammarAccess.getReducerAccess().getInkeySTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__InkeyAssignment_2


    // $ANTLR start rule__Reducer__InvalueAssignment_4
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3396:1: rule__Reducer__InvalueAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Reducer__InvalueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3400:1: ( ( RULE_STRING ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3401:1: ( RULE_STRING )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3401:1: ( RULE_STRING )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3402:1: RULE_STRING
            {
             before(grammarAccess.getReducerAccess().getInvalueSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Reducer__InvalueAssignment_46784); 
             after(grammarAccess.getReducerAccess().getInvalueSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__InvalueAssignment_4


    // $ANTLR start rule__Reducer__OutKeyTypeAssignment_6
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3411:1: rule__Reducer__OutKeyTypeAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Reducer__OutKeyTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3415:1: ( ( RULE_STRING ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3416:1: ( RULE_STRING )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3416:1: ( RULE_STRING )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3417:1: RULE_STRING
            {
             before(grammarAccess.getReducerAccess().getOutKeyTypeSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Reducer__OutKeyTypeAssignment_66815); 
             after(grammarAccess.getReducerAccess().getOutKeyTypeSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__OutKeyTypeAssignment_6


    // $ANTLR start rule__Reducer__OutValueTypeAssignment_8
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3426:1: rule__Reducer__OutValueTypeAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Reducer__OutValueTypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3430:1: ( ( RULE_STRING ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3431:1: ( RULE_STRING )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3431:1: ( RULE_STRING )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3432:1: RULE_STRING
            {
             before(grammarAccess.getReducerAccess().getOutValueTypeSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Reducer__OutValueTypeAssignment_86846); 
             after(grammarAccess.getReducerAccess().getOutValueTypeSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__OutValueTypeAssignment_8


    // $ANTLR start rule__Reducer__TextAssignment_10
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3441:1: rule__Reducer__TextAssignment_10 : ( ruleBlock ) ;
    public final void rule__Reducer__TextAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3445:1: ( ( ruleBlock ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3446:1: ( ruleBlock )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3446:1: ( ruleBlock )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3447:1: ruleBlock
            {
             before(grammarAccess.getReducerAccess().getTextBlockParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__Reducer__TextAssignment_106877);
            ruleBlock();
            _fsp--;

             after(grammarAccess.getReducerAccess().getTextBlockParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reducer__TextAssignment_10


    // $ANTLR start rule__Type__TypeAssignment_0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3456:1: rule__Type__TypeAssignment_0 : ( ( 'int' ) ) ;
    public final void rule__Type__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3460:1: ( ( ( 'int' ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3461:1: ( ( 'int' ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3461:1: ( ( 'int' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3462:1: ( 'int' )
            {
             before(grammarAccess.getTypeAccess().getTypeIntKeyword_0_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3463:1: ( 'int' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3464:1: 'int'
            {
             before(grammarAccess.getTypeAccess().getTypeIntKeyword_0_0()); 
            match(input,32,FOLLOW_32_in_rule__Type__TypeAssignment_06913); 
             after(grammarAccess.getTypeAccess().getTypeIntKeyword_0_0()); 

            }

             after(grammarAccess.getTypeAccess().getTypeIntKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__TypeAssignment_0


    // $ANTLR start rule__Type__TypeAssignment_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3479:1: rule__Type__TypeAssignment_1 : ( ( 'float' ) ) ;
    public final void rule__Type__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3483:1: ( ( ( 'float' ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3484:1: ( ( 'float' ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3484:1: ( ( 'float' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3485:1: ( 'float' )
            {
             before(grammarAccess.getTypeAccess().getTypeFloatKeyword_1_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3486:1: ( 'float' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3487:1: 'float'
            {
             before(grammarAccess.getTypeAccess().getTypeFloatKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__Type__TypeAssignment_16957); 
             after(grammarAccess.getTypeAccess().getTypeFloatKeyword_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getTypeFloatKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__TypeAssignment_1


    // $ANTLR start rule__Type__TypeAssignment_2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3502:1: rule__Type__TypeAssignment_2 : ( ( 'double' ) ) ;
    public final void rule__Type__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3506:1: ( ( ( 'double' ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3507:1: ( ( 'double' ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3507:1: ( ( 'double' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3508:1: ( 'double' )
            {
             before(grammarAccess.getTypeAccess().getTypeDoubleKeyword_2_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3509:1: ( 'double' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3510:1: 'double'
            {
             before(grammarAccess.getTypeAccess().getTypeDoubleKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__Type__TypeAssignment_27001); 
             after(grammarAccess.getTypeAccess().getTypeDoubleKeyword_2_0()); 

            }

             after(grammarAccess.getTypeAccess().getTypeDoubleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__TypeAssignment_2


    // $ANTLR start rule__Type__TypeAssignment_3
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3525:1: rule__Type__TypeAssignment_3 : ( ( 'text' ) ) ;
    public final void rule__Type__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3529:1: ( ( ( 'text' ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3530:1: ( ( 'text' ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3530:1: ( ( 'text' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3531:1: ( 'text' )
            {
             before(grammarAccess.getTypeAccess().getTypeTextKeyword_3_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3532:1: ( 'text' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3533:1: 'text'
            {
             before(grammarAccess.getTypeAccess().getTypeTextKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__Type__TypeAssignment_37045); 
             after(grammarAccess.getTypeAccess().getTypeTextKeyword_3_0()); 

            }

             after(grammarAccess.getTypeAccess().getTypeTextKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__TypeAssignment_3


    // $ANTLR start rule__Type__TypeAssignment_4
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3548:1: rule__Type__TypeAssignment_4 : ( ( 'long' ) ) ;
    public final void rule__Type__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3552:1: ( ( ( 'long' ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3553:1: ( ( 'long' ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3553:1: ( ( 'long' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3554:1: ( 'long' )
            {
             before(grammarAccess.getTypeAccess().getTypeLongKeyword_4_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3555:1: ( 'long' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3556:1: 'long'
            {
             before(grammarAccess.getTypeAccess().getTypeLongKeyword_4_0()); 
            match(input,36,FOLLOW_36_in_rule__Type__TypeAssignment_47089); 
             after(grammarAccess.getTypeAccess().getTypeLongKeyword_4_0()); 

            }

             after(grammarAccess.getTypeAccess().getTypeLongKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__TypeAssignment_4


    // $ANTLR start rule__Type__NameAssignment_5
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3571:1: rule__Type__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3575:1: ( ( RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3576:1: ( RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3576:1: ( RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3577:1: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__NameAssignment_57128); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__NameAssignment_5


    // $ANTLR start rule__Entity__NameAssignment_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3586:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3590:1: ( ( RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3591:1: ( RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3591:1: ( RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3592:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_17159); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__NameAssignment_1


    // $ANTLR start rule__Entity__SuperTypeAssignment_2_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3601:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3605:1: ( ( ( RULE_ID ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3606:1: ( ( RULE_ID ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3606:1: ( ( RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3607:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3608:1: ( RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3609:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_2_17194); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__SuperTypeAssignment_2_1


    // $ANTLR start rule__Entity__FeaturesAssignment_4
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3620:1: rule__Entity__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3624:1: ( ( ruleFeature ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3625:1: ( ruleFeature )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3625:1: ( ruleFeature )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3626:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_47229);
            ruleFeature();
            _fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__FeaturesAssignment_4


    // $ANTLR start rule__Feature__TypeAssignment_0_0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3635:1: rule__Feature__TypeAssignment_0_0 : ( ruleTypeRef ) ;
    public final void rule__Feature__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3639:1: ( ( ruleTypeRef ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3640:1: ( ruleTypeRef )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3640:1: ( ruleTypeRef )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3641:1: ruleTypeRef
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_0_07260);
            ruleTypeRef();
            _fsp--;

             after(grammarAccess.getFeatureAccess().getTypeTypeRefParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__TypeAssignment_0_0


    // $ANTLR start rule__Feature__NameAssignment_0_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3650:1: rule__Feature__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3654:1: ( ( RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3655:1: ( RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3655:1: ( RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3656:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_0_17291); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__NameAssignment_0_1


    // $ANTLR start rule__Feature__ReadorWriteAssignment_1_0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3665:1: rule__Feature__ReadorWriteAssignment_1_0 : ( ruleReadorWrite ) ;
    public final void rule__Feature__ReadorWriteAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3669:1: ( ( ruleReadorWrite ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3670:1: ( ruleReadorWrite )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3670:1: ( ruleReadorWrite )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3671:1: ruleReadorWrite
            {
             before(grammarAccess.getFeatureAccess().getReadorWriteReadorWriteParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleReadorWrite_in_rule__Feature__ReadorWriteAssignment_1_07322);
            ruleReadorWrite();
            _fsp--;

             after(grammarAccess.getFeatureAccess().getReadorWriteReadorWriteParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__ReadorWriteAssignment_1_0


    // $ANTLR start rule__ReadorWrite__TokenAssignment_0_2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3680:1: rule__ReadorWrite__TokenAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__ReadorWrite__TokenAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3684:1: ( ( RULE_STRING ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3685:1: ( RULE_STRING )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3685:1: ( RULE_STRING )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3686:1: RULE_STRING
            {
             before(grammarAccess.getReadorWriteAccess().getTokenSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ReadorWrite__TokenAssignment_0_27353); 
             after(grammarAccess.getReadorWriteAccess().getTokenSTRINGTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__TokenAssignment_0_2


    // $ANTLR start rule__ReadorWrite__ReadvalAssignment_0_4
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3695:1: rule__ReadorWrite__ReadvalAssignment_0_4 : ( RULE_STRING ) ;
    public final void rule__ReadorWrite__ReadvalAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3699:1: ( ( RULE_STRING ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3700:1: ( RULE_STRING )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3700:1: ( RULE_STRING )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3701:1: RULE_STRING
            {
             before(grammarAccess.getReadorWriteAccess().getReadvalSTRINGTerminalRuleCall_0_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ReadorWrite__ReadvalAssignment_0_47384); 
             after(grammarAccess.getReadorWriteAccess().getReadvalSTRINGTerminalRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__ReadvalAssignment_0_4


    // $ANTLR start rule__ReadorWrite__TokenAssignment_1_2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3710:1: rule__ReadorWrite__TokenAssignment_1_2 : ( RULE_STRING ) ;
    public final void rule__ReadorWrite__TokenAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3714:1: ( ( RULE_STRING ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3715:1: ( RULE_STRING )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3715:1: ( RULE_STRING )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3716:1: RULE_STRING
            {
             before(grammarAccess.getReadorWriteAccess().getTokenSTRINGTerminalRuleCall_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ReadorWrite__TokenAssignment_1_27415); 
             after(grammarAccess.getReadorWriteAccess().getTokenSTRINGTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__TokenAssignment_1_2


    // $ANTLR start rule__ReadorWrite__WritevalAssignment_1_4
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3725:1: rule__ReadorWrite__WritevalAssignment_1_4 : ( RULE_STRING ) ;
    public final void rule__ReadorWrite__WritevalAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3729:1: ( ( RULE_STRING ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3730:1: ( RULE_STRING )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3730:1: ( RULE_STRING )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3731:1: RULE_STRING
            {
             before(grammarAccess.getReadorWriteAccess().getWritevalSTRINGTerminalRuleCall_1_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ReadorWrite__WritevalAssignment_1_47446); 
             after(grammarAccess.getReadorWriteAccess().getWritevalSTRINGTerminalRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ReadorWrite__WritevalAssignment_1_4


    // $ANTLR start rule__TypeRef__ReferencedAssignment_0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3740:1: rule__TypeRef__ReferencedAssignment_0 : ( ruleType ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3744:1: ( ( ruleType ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3745:1: ( ruleType )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3745:1: ( ruleType )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3746:1: ruleType
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TypeRef__ReferencedAssignment_07477);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRefAccess().getReferencedTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeRef__ReferencedAssignment_0


    // $ANTLR start rule__TypeRef__MultiAssignment_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3755:1: rule__TypeRef__MultiAssignment_1 : ( ( '*' ) ) ;
    public final void rule__TypeRef__MultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3759:1: ( ( ( '*' ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3760:1: ( ( '*' ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3760:1: ( ( '*' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3761:1: ( '*' )
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3762:1: ( '*' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3763:1: '*'
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__TypeRef__MultiAssignment_17513); 
             after(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypeRef__MultiAssignment_1


    // $ANTLR start rule__Block__BlockAssignment_0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3778:1: rule__Block__BlockAssignment_0 : ( ( '[' ) ) ;
    public final void rule__Block__BlockAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3782:1: ( ( ( '[' ) ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3783:1: ( ( '[' ) )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3783:1: ( ( '[' ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3784:1: ( '[' )
            {
             before(grammarAccess.getBlockAccess().getBlockLeftSquareBracketKeyword_0_0()); 
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3785:1: ( '[' )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3786:1: '['
            {
             before(grammarAccess.getBlockAccess().getBlockLeftSquareBracketKeyword_0_0()); 
            match(input,38,FOLLOW_38_in_rule__Block__BlockAssignment_07557); 
             after(grammarAccess.getBlockAccess().getBlockLeftSquareBracketKeyword_0_0()); 

            }

             after(grammarAccess.getBlockAccess().getBlockLeftSquareBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Block__BlockAssignment_0


    // $ANTLR start rule__Block__JavafunctionsAssignment_1
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3801:1: rule__Block__JavafunctionsAssignment_1 : ( ruleJavaFunction ) ;
    public final void rule__Block__JavafunctionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3805:1: ( ( ruleJavaFunction ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3806:1: ( ruleJavaFunction )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3806:1: ( ruleJavaFunction )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3807:1: ruleJavaFunction
            {
             before(grammarAccess.getBlockAccess().getJavafunctionsJavaFunctionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJavaFunction_in_rule__Block__JavafunctionsAssignment_17596);
            ruleJavaFunction();
            _fsp--;

             after(grammarAccess.getBlockAccess().getJavafunctionsJavaFunctionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Block__JavafunctionsAssignment_1


    // $ANTLR start rule__JavaFunction__TimeofCallAssignment_0
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3816:1: rule__JavaFunction__TimeofCallAssignment_0 : ( ruleTimeOfCall ) ;
    public final void rule__JavaFunction__TimeofCallAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3820:1: ( ( ruleTimeOfCall ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3821:1: ( ruleTimeOfCall )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3821:1: ( ruleTimeOfCall )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3822:1: ruleTimeOfCall
            {
             before(grammarAccess.getJavaFunctionAccess().getTimeofCallTimeOfCallParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTimeOfCall_in_rule__JavaFunction__TimeofCallAssignment_07627);
            ruleTimeOfCall();
            _fsp--;

             after(grammarAccess.getJavaFunctionAccess().getTimeofCallTimeOfCallParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JavaFunction__TimeofCallAssignment_0


    // $ANTLR start rule__JavaFunction__ParamnameAssignment_2
    // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3831:1: rule__JavaFunction__ParamnameAssignment_2 : ( RULE_ID ) ;
    public final void rule__JavaFunction__ParamnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3835:1: ( ( RULE_ID ) )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3836:1: ( RULE_ID )
            {
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3836:1: ( RULE_ID )
            // ../cs.ua.edu.segroup.mapredoop.ui/src-gen/cs/ua/edu/se/ui/contentassist/antlr/internal/InternalMapRedoop.g:3837:1: RULE_ID
            {
             before(grammarAccess.getJavaFunctionAccess().getParamnameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JavaFunction__ParamnameAssignment_27658); 
             after(grammarAccess.getJavaFunctionAccess().getParamnameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JavaFunction__ParamnameAssignment_2


 

    public static final BitSet FOLLOW_ruleMapRedoop_in_entryRuleMapRedoop61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapRedoop68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRedoop__Group__0_in_ruleMapRedoop94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Alternatives_in_ruleContent154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListofEntities_in_entryRuleListofEntities181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListofEntities188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListofEntities__Group__0_in_ruleListofEntities214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMRBlock_in_entryRuleMRBlock241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMRBlock248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MRBlock__Group__0_in_ruleMRBlock274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapper_in_entryRuleMapper361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapper368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__0_in_ruleMapper394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReducer_in_entryRuleReducer483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReducer490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__Group__0_in_ruleReducer516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Alternatives_in_ruleFeature696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadorWrite_in_entryRuleReadorWrite723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadorWrite730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Alternatives_in_ruleReadorWrite756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaFunction_in_entryRuleJavaFunction903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaFunction910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaFunction__Group__0_in_ruleJavaFunction936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeOfCall_in_entryRuleTimeOfCall963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeOfCall970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeOfCall__Alternatives_in_ruleTimeOfCall996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__EntitiesAssignment_0_in_rule__Content__Alternatives1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__MrBlocksAssignment_1_in_rule__Content__Alternatives1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypeAssignment_0_in_rule__Type__Alternatives1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypeAssignment_1_in_rule__Type__Alternatives1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypeAssignment_2_in_rule__Type__Alternatives1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypeAssignment_3_in_rule__Type__Alternatives1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypeAssignment_4_in_rule__Type__Alternatives1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_5_in_rule__Type__Alternatives1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__0_in_rule__Feature__Alternatives1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_1__0_in_rule__Feature__Alternatives1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_0__0_in_rule__ReadorWrite__Alternatives1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_1__0_in_rule__ReadorWrite__Alternatives1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__TimeOfCall__Alternatives1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__TimeOfCall__Alternatives1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__TimeOfCall__Alternatives1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRedoop__Group__0__Impl_in_rule__MapRedoop__Group__01381 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__MapRedoop__Group__1_in_rule__MapRedoop__Group__01384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRedoop__DeclarationAssignment_0_in_rule__MapRedoop__Group__0__Impl1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRedoop__Group__1__Impl_in_rule__MapRedoop__Group__11441 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__MapRedoop__Group__2_in_rule__MapRedoop__Group__11444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MapRedoop__Group__1__Impl1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRedoop__Group__2__Impl_in_rule__MapRedoop__Group__21503 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__MapRedoop__Group__3_in_rule__MapRedoop__Group__21506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRedoop__ContentAssignment_2_in_rule__MapRedoop__Group__2__Impl1533 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__MapRedoop__Group__3__Impl_in_rule__MapRedoop__Group__31564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MapRedoop__Group__3__Impl1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListofEntities__Group__0__Impl_in_rule__ListofEntities__Group__01631 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ListofEntities__Group__1_in_rule__ListofEntities__Group__01634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListofEntities__Group__1__Impl_in_rule__ListofEntities__Group__11692 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ListofEntities__Group__2_in_rule__ListofEntities__Group__11695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ListofEntities__Group__1__Impl1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListofEntities__Group__2__Impl_in_rule__ListofEntities__Group__21754 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_rule__ListofEntities__Group__3_in_rule__ListofEntities__Group__21757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ListofEntities__Group__2__Impl1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListofEntities__Group__3__Impl_in_rule__ListofEntities__Group__31816 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ListofEntities__Group__4_in_rule__ListofEntities__Group__31819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListofEntities__EntitiesAssignment_3_in_rule__ListofEntities__Group__3__Impl1846 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__ListofEntities__Group__4__Impl_in_rule__ListofEntities__Group__41877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ListofEntities__Group__4__Impl1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MRBlock__Group__0__Impl_in_rule__MRBlock__Group__01946 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_rule__MRBlock__Group__1_in_rule__MRBlock__Group__01949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MRBlock__Group__0__Impl1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MRBlock__Group__1__Impl_in_rule__MRBlock__Group__12008 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__MRBlock__Group__2_in_rule__MRBlock__Group__12011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MRBlock__LoopAssignment_1_in_rule__MRBlock__Group__1__Impl2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MRBlock__Group__2__Impl_in_rule__MRBlock__Group__22069 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__MRBlock__Group__3_in_rule__MRBlock__Group__22072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MRBlock__Group__2__Impl2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MRBlock__Group__3__Impl_in_rule__MRBlock__Group__32131 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MRBlock__Group__4_in_rule__MRBlock__Group__32134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MRBlock__MapperAssignment_3_in_rule__MRBlock__Group__3__Impl2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MRBlock__Group__4__Impl_in_rule__MRBlock__Group__42191 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__MRBlock__Group__5_in_rule__MRBlock__Group__42194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MRBlock__ReducerAssignment_4_in_rule__MRBlock__Group__4__Impl2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MRBlock__Group__5__Impl_in_rule__MRBlock__Group__52251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MRBlock__Group__5__Impl2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__02322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__02325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Declaration__Group__0__Impl2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__12384 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__12387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__22444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__0_in_rule__Declaration__Group__2__Impl2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__0__Impl_in_rule__Declaration__Group_2__02508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__1_in_rule__Declaration__Group_2__02511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Declaration__Group_2__0__Impl2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__1__Impl_in_rule__Declaration__Group_2__12570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__SuperNameAssignment_2_1_in_rule__Declaration__Group_2__1__Impl2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__0__Impl_in_rule__Mapper__Group__02631 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Mapper__Group__1_in_rule__Mapper__Group__02634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Mapper__Group__0__Impl2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__1__Impl_in_rule__Mapper__Group__12693 = new BitSet(new long[]{0x0000001F00000010L});
    public static final BitSet FOLLOW_rule__Mapper__Group__2_in_rule__Mapper__Group__12696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Mapper__Group__1__Impl2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__2__Impl_in_rule__Mapper__Group__22755 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Mapper__Group__3_in_rule__Mapper__Group__22758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__InkeyAssignment_2_in_rule__Mapper__Group__2__Impl2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__3__Impl_in_rule__Mapper__Group__32815 = new BitSet(new long[]{0x0000001F00000010L});
    public static final BitSet FOLLOW_rule__Mapper__Group__4_in_rule__Mapper__Group__32818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Mapper__Group__3__Impl2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__4__Impl_in_rule__Mapper__Group__42877 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Mapper__Group__5_in_rule__Mapper__Group__42880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__InvalueAssignment_4_in_rule__Mapper__Group__4__Impl2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__5__Impl_in_rule__Mapper__Group__52937 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Mapper__Group__6_in_rule__Mapper__Group__52940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Mapper__Group__5__Impl2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__6__Impl_in_rule__Mapper__Group__62999 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Mapper__Group__7_in_rule__Mapper__Group__63002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__OutKeyTypeAssignment_6_in_rule__Mapper__Group__6__Impl3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__7__Impl_in_rule__Mapper__Group__73059 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Mapper__Group__8_in_rule__Mapper__Group__73062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Mapper__Group__7__Impl3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__8__Impl_in_rule__Mapper__Group__83121 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Mapper__Group__9_in_rule__Mapper__Group__83124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__OutValueTypeAssignment_8_in_rule__Mapper__Group__8__Impl3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__9__Impl_in_rule__Mapper__Group__93181 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Mapper__Group__10_in_rule__Mapper__Group__93184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Mapper__Group__9__Impl3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__Group__10__Impl_in_rule__Mapper__Group__103243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapper__TextAssignment_10_in_rule__Mapper__Group__10__Impl3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__03322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__03325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__TypeAssignment_0_in_rule__Argument__Group__0__Impl3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__13382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__ArgnameAssignment_1_in_rule__Argument__Group__1__Impl3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__Group__0__Impl_in_rule__Reducer__Group__03444 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Reducer__Group__1_in_rule__Reducer__Group__03447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Reducer__Group__0__Impl3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__Group__1__Impl_in_rule__Reducer__Group__13506 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Reducer__Group__2_in_rule__Reducer__Group__13509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Reducer__Group__1__Impl3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__Group__2__Impl_in_rule__Reducer__Group__23568 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Reducer__Group__3_in_rule__Reducer__Group__23571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__InkeyAssignment_2_in_rule__Reducer__Group__2__Impl3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__Group__3__Impl_in_rule__Reducer__Group__33628 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Reducer__Group__4_in_rule__Reducer__Group__33631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Reducer__Group__3__Impl3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__Group__4__Impl_in_rule__Reducer__Group__43690 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Reducer__Group__5_in_rule__Reducer__Group__43693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__InvalueAssignment_4_in_rule__Reducer__Group__4__Impl3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__Group__5__Impl_in_rule__Reducer__Group__53750 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Reducer__Group__6_in_rule__Reducer__Group__53753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Reducer__Group__5__Impl3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__Group__6__Impl_in_rule__Reducer__Group__63812 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Reducer__Group__7_in_rule__Reducer__Group__63815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__OutKeyTypeAssignment_6_in_rule__Reducer__Group__6__Impl3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__Group__7__Impl_in_rule__Reducer__Group__73872 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Reducer__Group__8_in_rule__Reducer__Group__73875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Reducer__Group__7__Impl3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__Group__8__Impl_in_rule__Reducer__Group__83934 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Reducer__Group__9_in_rule__Reducer__Group__83937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__OutValueTypeAssignment_8_in_rule__Reducer__Group__8__Impl3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__Group__9__Impl_in_rule__Reducer__Group__93994 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Reducer__Group__10_in_rule__Reducer__Group__93997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Reducer__Group__9__Impl4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__Group__10__Impl_in_rule__Reducer__Group__104056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reducer__TextAssignment_10_in_rule__Reducer__Group__10__Impl4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__04135 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__04138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Entity__Group__0__Impl4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__14197 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__14200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__24257 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__24260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__34318 = new BitSet(new long[]{0x0000001F18000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__34321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Entity__Group__3__Impl4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44380 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__44383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_4_in_rule__Entity__Group__4__Impl4412 = new BitSet(new long[]{0x0000001F18000012L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_4_in_rule__Entity__Group__4__Impl4424 = new BitSet(new long[]{0x0000001F18000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__54457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group__5__Impl4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__04528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__04531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group_2__0__Impl4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__14590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__0__Impl_in_rule__Feature__Group_0__04651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__1_in_rule__Feature__Group_0__04654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_0_0_in_rule__Feature__Group_0__0__Impl4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__1__Impl_in_rule__Feature__Group_0__14711 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__2_in_rule__Feature__Group_0__14714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_0_1_in_rule__Feature__Group_0__1__Impl4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__2__Impl_in_rule__Feature__Group_0__24771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Feature__Group_0__2__Impl4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_1__0__Impl_in_rule__Feature__Group_1__04836 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Feature__Group_1__1_in_rule__Feature__Group_1__04839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ReadorWriteAssignment_1_0_in_rule__Feature__Group_1__0__Impl4866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_1__1__Impl_in_rule__Feature__Group_1__14896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Feature__Group_1__1__Impl4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_0__0__Impl_in_rule__ReadorWrite__Group_0__04959 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_0__1_in_rule__ReadorWrite__Group_0__04962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ReadorWrite__Group_0__0__Impl4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_0__1__Impl_in_rule__ReadorWrite__Group_0__15021 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_0__2_in_rule__ReadorWrite__Group_0__15024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ReadorWrite__Group_0__1__Impl5052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_0__2__Impl_in_rule__ReadorWrite__Group_0__25083 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_0__3_in_rule__ReadorWrite__Group_0__25086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__TokenAssignment_0_2_in_rule__ReadorWrite__Group_0__2__Impl5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_0__3__Impl_in_rule__ReadorWrite__Group_0__35143 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_0__4_in_rule__ReadorWrite__Group_0__35146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ReadorWrite__Group_0__3__Impl5174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_0__4__Impl_in_rule__ReadorWrite__Group_0__45205 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_0__5_in_rule__ReadorWrite__Group_0__45208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__ReadvalAssignment_0_4_in_rule__ReadorWrite__Group_0__4__Impl5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_0__5__Impl_in_rule__ReadorWrite__Group_0__55265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ReadorWrite__Group_0__5__Impl5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_1__0__Impl_in_rule__ReadorWrite__Group_1__05336 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_1__1_in_rule__ReadorWrite__Group_1__05339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ReadorWrite__Group_1__0__Impl5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_1__1__Impl_in_rule__ReadorWrite__Group_1__15398 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_1__2_in_rule__ReadorWrite__Group_1__15401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ReadorWrite__Group_1__1__Impl5429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_1__2__Impl_in_rule__ReadorWrite__Group_1__25460 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_1__3_in_rule__ReadorWrite__Group_1__25463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__TokenAssignment_1_2_in_rule__ReadorWrite__Group_1__2__Impl5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_1__3__Impl_in_rule__ReadorWrite__Group_1__35520 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_1__4_in_rule__ReadorWrite__Group_1__35523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ReadorWrite__Group_1__3__Impl5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_1__4__Impl_in_rule__ReadorWrite__Group_1__45582 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_1__5_in_rule__ReadorWrite__Group_1__45585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__WritevalAssignment_1_4_in_rule__ReadorWrite__Group_1__4__Impl5612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadorWrite__Group_1__5__Impl_in_rule__ReadorWrite__Group_1__55642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ReadorWrite__Group_1__5__Impl5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__05713 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__05716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__15773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__05835 = new BitSet(new long[]{0x0000000020003800L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__05838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__BlockAssignment_0_in_rule__Block__Group__0__Impl5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__15895 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__15898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__JavafunctionsAssignment_1_in_rule__Block__Group__1__Impl5925 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__25956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Block__Group__2__Impl5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaFunction__Group__0__Impl_in_rule__JavaFunction__Group__06021 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__JavaFunction__Group__1_in_rule__JavaFunction__Group__06024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaFunction__TimeofCallAssignment_0_in_rule__JavaFunction__Group__0__Impl6051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaFunction__Group__1__Impl_in_rule__JavaFunction__Group__16081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JavaFunction__Group__2_in_rule__JavaFunction__Group__16084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__JavaFunction__Group__1__Impl6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaFunction__Group__2__Impl_in_rule__JavaFunction__Group__26143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaFunction__ParamnameAssignment_2_in_rule__JavaFunction__Group__2__Impl6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__MapRedoop__DeclarationAssignment_06211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_rule__MapRedoop__ContentAssignment_26242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListofEntities_in_rule__Content__EntitiesAssignment_06273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMRBlock_in_rule__Content__MrBlocksAssignment_16304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__ListofEntities__EntitiesAssignment_36335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MRBlock__LoopAssignment_16371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapper_in_rule__MRBlock__MapperAssignment_36410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReducer_in_rule__MRBlock__ReducerAssignment_46441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Declaration__NameAssignment_16472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Declaration__SuperNameAssignment_2_16503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Mapper__InkeyAssignment_26534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Mapper__InvalueAssignment_46565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Mapper__OutKeyTypeAssignment_66596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Mapper__OutValueTypeAssignment_86627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__Mapper__TextAssignment_106658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Argument__TypeAssignment_06689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__ArgnameAssignment_16720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Reducer__InkeyAssignment_26753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Reducer__InvalueAssignment_46784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Reducer__OutKeyTypeAssignment_66815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Reducer__OutValueTypeAssignment_86846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__Reducer__TextAssignment_106877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Type__TypeAssignment_06913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Type__TypeAssignment_16957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Type__TypeAssignment_27001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Type__TypeAssignment_37045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Type__TypeAssignment_47089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__NameAssignment_57128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_17159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_2_17194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_47229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Feature__TypeAssignment_0_07260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_0_17291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadorWrite_in_rule__Feature__ReadorWriteAssignment_1_07322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ReadorWrite__TokenAssignment_0_27353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ReadorWrite__ReadvalAssignment_0_47384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ReadorWrite__TokenAssignment_1_27415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ReadorWrite__WritevalAssignment_1_47446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TypeRef__ReferencedAssignment_07477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__TypeRef__MultiAssignment_17513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Block__BlockAssignment_07557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaFunction_in_rule__Block__JavafunctionsAssignment_17596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeOfCall_in_rule__JavaFunction__TimeofCallAssignment_07627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JavaFunction__ParamnameAssignment_27658 = new BitSet(new long[]{0x0000000000000002L});

}