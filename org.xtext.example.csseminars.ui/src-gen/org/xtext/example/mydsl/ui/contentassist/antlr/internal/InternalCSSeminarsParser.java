package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.CSSeminarsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCSSeminarsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DATE", "RULE_HOUR", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'group'", "'member'", "'seminar'", "'('", "')'", "'date'", "'duration'", "','", "'talk'", "'abstract'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_HOUR=5;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_DATE=4;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCSSeminarsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCSSeminarsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCSSeminarsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g"; }


     
     	private CSSeminarsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CSSeminarsGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDepartmentSeminars"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:60:1: entryRuleDepartmentSeminars : ruleDepartmentSeminars EOF ;
    public final void entryRuleDepartmentSeminars() throws RecognitionException {
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:61:1: ( ruleDepartmentSeminars EOF )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:62:1: ruleDepartmentSeminars EOF
            {
             before(grammarAccess.getDepartmentSeminarsRule()); 
            pushFollow(FOLLOW_ruleDepartmentSeminars_in_entryRuleDepartmentSeminars61);
            ruleDepartmentSeminars();

            state._fsp--;

             after(grammarAccess.getDepartmentSeminarsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDepartmentSeminars68); 

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
    // $ANTLR end "entryRuleDepartmentSeminars"


    // $ANTLR start "ruleDepartmentSeminars"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:69:1: ruleDepartmentSeminars : ( ( rule__DepartmentSeminars__Group__0 ) ) ;
    public final void ruleDepartmentSeminars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:73:2: ( ( ( rule__DepartmentSeminars__Group__0 ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:74:1: ( ( rule__DepartmentSeminars__Group__0 ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:74:1: ( ( rule__DepartmentSeminars__Group__0 ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:75:1: ( rule__DepartmentSeminars__Group__0 )
            {
             before(grammarAccess.getDepartmentSeminarsAccess().getGroup()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:76:1: ( rule__DepartmentSeminars__Group__0 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:76:2: rule__DepartmentSeminars__Group__0
            {
            pushFollow(FOLLOW_rule__DepartmentSeminars__Group__0_in_ruleDepartmentSeminars94);
            rule__DepartmentSeminars__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDepartmentSeminarsAccess().getGroup()); 

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
    // $ANTLR end "ruleDepartmentSeminars"


    // $ANTLR start "entryRuleGroup"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:88:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:89:1: ( ruleGroup EOF )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:90:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup121);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup128); 

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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:97:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:101:2: ( ( ( rule__Group__Group__0 ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:102:1: ( ( rule__Group__Group__0 ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:102:1: ( ( rule__Group__Group__0 ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:103:1: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:104:1: ( rule__Group__Group__0 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:104:2: rule__Group__Group__0
            {
            pushFollow(FOLLOW_rule__Group__Group__0_in_ruleGroup154);
            rule__Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleMember"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:116:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:117:1: ( ruleMember EOF )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:118:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember181);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember188); 

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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:125:1: ruleMember : ( ( rule__Member__Group__0 ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:129:2: ( ( ( rule__Member__Group__0 ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:130:1: ( ( rule__Member__Group__0 ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:130:1: ( ( rule__Member__Group__0 ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:131:1: ( rule__Member__Group__0 )
            {
             before(grammarAccess.getMemberAccess().getGroup()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:132:1: ( rule__Member__Group__0 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:132:2: rule__Member__Group__0
            {
            pushFollow(FOLLOW_rule__Member__Group__0_in_ruleMember214);
            rule__Member__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getGroup()); 

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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleSeminar"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:144:1: entryRuleSeminar : ruleSeminar EOF ;
    public final void entryRuleSeminar() throws RecognitionException {
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:145:1: ( ruleSeminar EOF )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:146:1: ruleSeminar EOF
            {
             before(grammarAccess.getSeminarRule()); 
            pushFollow(FOLLOW_ruleSeminar_in_entryRuleSeminar241);
            ruleSeminar();

            state._fsp--;

             after(grammarAccess.getSeminarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSeminar248); 

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
    // $ANTLR end "entryRuleSeminar"


    // $ANTLR start "ruleSeminar"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:153:1: ruleSeminar : ( ( rule__Seminar__Group__0 ) ) ;
    public final void ruleSeminar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:157:2: ( ( ( rule__Seminar__Group__0 ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:158:1: ( ( rule__Seminar__Group__0 ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:158:1: ( ( rule__Seminar__Group__0 ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:159:1: ( rule__Seminar__Group__0 )
            {
             before(grammarAccess.getSeminarAccess().getGroup()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:160:1: ( rule__Seminar__Group__0 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:160:2: rule__Seminar__Group__0
            {
            pushFollow(FOLLOW_rule__Seminar__Group__0_in_ruleSeminar274);
            rule__Seminar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeminarAccess().getGroup()); 

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
    // $ANTLR end "ruleSeminar"


    // $ANTLR start "entryRuleTalk"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:172:1: entryRuleTalk : ruleTalk EOF ;
    public final void entryRuleTalk() throws RecognitionException {
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:173:1: ( ruleTalk EOF )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:174:1: ruleTalk EOF
            {
             before(grammarAccess.getTalkRule()); 
            pushFollow(FOLLOW_ruleTalk_in_entryRuleTalk301);
            ruleTalk();

            state._fsp--;

             after(grammarAccess.getTalkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTalk308); 

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
    // $ANTLR end "entryRuleTalk"


    // $ANTLR start "ruleTalk"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:181:1: ruleTalk : ( ( rule__Talk__Group__0 ) ) ;
    public final void ruleTalk() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:185:2: ( ( ( rule__Talk__Group__0 ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:186:1: ( ( rule__Talk__Group__0 ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:186:1: ( ( rule__Talk__Group__0 ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:187:1: ( rule__Talk__Group__0 )
            {
             before(grammarAccess.getTalkAccess().getGroup()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:188:1: ( rule__Talk__Group__0 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:188:2: rule__Talk__Group__0
            {
            pushFollow(FOLLOW_rule__Talk__Group__0_in_ruleTalk334);
            rule__Talk__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getGroup()); 

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
    // $ANTLR end "ruleTalk"


    // $ANTLR start "rule__DepartmentSeminars__Group__0"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:202:1: rule__DepartmentSeminars__Group__0 : rule__DepartmentSeminars__Group__0__Impl rule__DepartmentSeminars__Group__1 ;
    public final void rule__DepartmentSeminars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:206:1: ( rule__DepartmentSeminars__Group__0__Impl rule__DepartmentSeminars__Group__1 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:207:2: rule__DepartmentSeminars__Group__0__Impl rule__DepartmentSeminars__Group__1
            {
            pushFollow(FOLLOW_rule__DepartmentSeminars__Group__0__Impl_in_rule__DepartmentSeminars__Group__0368);
            rule__DepartmentSeminars__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DepartmentSeminars__Group__1_in_rule__DepartmentSeminars__Group__0371);
            rule__DepartmentSeminars__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__DepartmentSeminars__Group__0"


    // $ANTLR start "rule__DepartmentSeminars__Group__0__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:214:1: rule__DepartmentSeminars__Group__0__Impl : ( ( rule__DepartmentSeminars__GroupsAssignment_0 )* ) ;
    public final void rule__DepartmentSeminars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:218:1: ( ( ( rule__DepartmentSeminars__GroupsAssignment_0 )* ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:219:1: ( ( rule__DepartmentSeminars__GroupsAssignment_0 )* )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:219:1: ( ( rule__DepartmentSeminars__GroupsAssignment_0 )* )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:220:1: ( rule__DepartmentSeminars__GroupsAssignment_0 )*
            {
             before(grammarAccess.getDepartmentSeminarsAccess().getGroupsAssignment_0()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:221:1: ( rule__DepartmentSeminars__GroupsAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:221:2: rule__DepartmentSeminars__GroupsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__DepartmentSeminars__GroupsAssignment_0_in_rule__DepartmentSeminars__Group__0__Impl398);
            	    rule__DepartmentSeminars__GroupsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDepartmentSeminarsAccess().getGroupsAssignment_0()); 

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
    // $ANTLR end "rule__DepartmentSeminars__Group__0__Impl"


    // $ANTLR start "rule__DepartmentSeminars__Group__1"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:231:1: rule__DepartmentSeminars__Group__1 : rule__DepartmentSeminars__Group__1__Impl rule__DepartmentSeminars__Group__2 ;
    public final void rule__DepartmentSeminars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:235:1: ( rule__DepartmentSeminars__Group__1__Impl rule__DepartmentSeminars__Group__2 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:236:2: rule__DepartmentSeminars__Group__1__Impl rule__DepartmentSeminars__Group__2
            {
            pushFollow(FOLLOW_rule__DepartmentSeminars__Group__1__Impl_in_rule__DepartmentSeminars__Group__1429);
            rule__DepartmentSeminars__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DepartmentSeminars__Group__2_in_rule__DepartmentSeminars__Group__1432);
            rule__DepartmentSeminars__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__DepartmentSeminars__Group__1"


    // $ANTLR start "rule__DepartmentSeminars__Group__1__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:243:1: rule__DepartmentSeminars__Group__1__Impl : ( ( rule__DepartmentSeminars__UsersAssignment_1 )* ) ;
    public final void rule__DepartmentSeminars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:247:1: ( ( ( rule__DepartmentSeminars__UsersAssignment_1 )* ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:248:1: ( ( rule__DepartmentSeminars__UsersAssignment_1 )* )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:248:1: ( ( rule__DepartmentSeminars__UsersAssignment_1 )* )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:249:1: ( rule__DepartmentSeminars__UsersAssignment_1 )*
            {
             before(grammarAccess.getDepartmentSeminarsAccess().getUsersAssignment_1()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:250:1: ( rule__DepartmentSeminars__UsersAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:250:2: rule__DepartmentSeminars__UsersAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__DepartmentSeminars__UsersAssignment_1_in_rule__DepartmentSeminars__Group__1__Impl459);
            	    rule__DepartmentSeminars__UsersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getDepartmentSeminarsAccess().getUsersAssignment_1()); 

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
    // $ANTLR end "rule__DepartmentSeminars__Group__1__Impl"


    // $ANTLR start "rule__DepartmentSeminars__Group__2"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:260:1: rule__DepartmentSeminars__Group__2 : rule__DepartmentSeminars__Group__2__Impl ;
    public final void rule__DepartmentSeminars__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:264:1: ( rule__DepartmentSeminars__Group__2__Impl )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:265:2: rule__DepartmentSeminars__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DepartmentSeminars__Group__2__Impl_in_rule__DepartmentSeminars__Group__2490);
            rule__DepartmentSeminars__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__DepartmentSeminars__Group__2"


    // $ANTLR start "rule__DepartmentSeminars__Group__2__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:271:1: rule__DepartmentSeminars__Group__2__Impl : ( ( rule__DepartmentSeminars__SeminarsAssignment_2 )* ) ;
    public final void rule__DepartmentSeminars__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:275:1: ( ( ( rule__DepartmentSeminars__SeminarsAssignment_2 )* ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:276:1: ( ( rule__DepartmentSeminars__SeminarsAssignment_2 )* )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:276:1: ( ( rule__DepartmentSeminars__SeminarsAssignment_2 )* )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:277:1: ( rule__DepartmentSeminars__SeminarsAssignment_2 )*
            {
             before(grammarAccess.getDepartmentSeminarsAccess().getSeminarsAssignment_2()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:278:1: ( rule__DepartmentSeminars__SeminarsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:278:2: rule__DepartmentSeminars__SeminarsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__DepartmentSeminars__SeminarsAssignment_2_in_rule__DepartmentSeminars__Group__2__Impl517);
            	    rule__DepartmentSeminars__SeminarsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDepartmentSeminarsAccess().getSeminarsAssignment_2()); 

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
    // $ANTLR end "rule__DepartmentSeminars__Group__2__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:294:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:298:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:299:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__0554);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__1_in_rule__Group__Group__0557);
            rule__Group__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:306:1: rule__Group__Group__0__Impl : ( 'group' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:310:1: ( ( 'group' ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:311:1: ( 'group' )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:311:1: ( 'group' )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:312:1: 'group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Group__Group__0__Impl585); 
             after(grammarAccess.getGroupAccess().getGroupKeyword_0()); 

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
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:325:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:329:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:330:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__1616);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__2_in_rule__Group__Group__1619);
            rule__Group__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:337:1: rule__Group__Group__1__Impl : ( ( rule__Group__NameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:341:1: ( ( ( rule__Group__NameAssignment_1 ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:342:1: ( ( rule__Group__NameAssignment_1 ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:342:1: ( ( rule__Group__NameAssignment_1 ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:343:1: ( rule__Group__NameAssignment_1 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:344:1: ( rule__Group__NameAssignment_1 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:344:2: rule__Group__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Group__NameAssignment_1_in_rule__Group__Group__1__Impl646);
            rule__Group__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__2"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:354:1: rule__Group__Group__2 : rule__Group__Group__2__Impl ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:358:1: ( rule__Group__Group__2__Impl )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:359:2: rule__Group__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__2676);
            rule__Group__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Group__Group__2"


    // $ANTLR start "rule__Group__Group__2__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:365:1: rule__Group__Group__2__Impl : ( ( rule__Group__DescriptionAssignment_2 ) ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:369:1: ( ( ( rule__Group__DescriptionAssignment_2 ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:370:1: ( ( rule__Group__DescriptionAssignment_2 ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:370:1: ( ( rule__Group__DescriptionAssignment_2 ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:371:1: ( rule__Group__DescriptionAssignment_2 )
            {
             before(grammarAccess.getGroupAccess().getDescriptionAssignment_2()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:372:1: ( rule__Group__DescriptionAssignment_2 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:372:2: rule__Group__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__Group__DescriptionAssignment_2_in_rule__Group__Group__2__Impl703);
            rule__Group__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getDescriptionAssignment_2()); 

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
    // $ANTLR end "rule__Group__Group__2__Impl"


    // $ANTLR start "rule__Member__Group__0"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:388:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:392:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:393:2: rule__Member__Group__0__Impl rule__Member__Group__1
            {
            pushFollow(FOLLOW_rule__Member__Group__0__Impl_in_rule__Member__Group__0739);
            rule__Member__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Member__Group__1_in_rule__Member__Group__0742);
            rule__Member__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Member__Group__0"


    // $ANTLR start "rule__Member__Group__0__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:400:1: rule__Member__Group__0__Impl : ( 'member' ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:404:1: ( ( 'member' ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:405:1: ( 'member' )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:405:1: ( 'member' )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:406:1: 'member'
            {
             before(grammarAccess.getMemberAccess().getMemberKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Member__Group__0__Impl770); 
             after(grammarAccess.getMemberAccess().getMemberKeyword_0()); 

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
    // $ANTLR end "rule__Member__Group__0__Impl"


    // $ANTLR start "rule__Member__Group__1"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:419:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:423:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:424:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FOLLOW_rule__Member__Group__1__Impl_in_rule__Member__Group__1801);
            rule__Member__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Member__Group__2_in_rule__Member__Group__1804);
            rule__Member__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Member__Group__1"


    // $ANTLR start "rule__Member__Group__1__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:431:1: rule__Member__Group__1__Impl : ( ( rule__Member__NameAssignment_1 ) ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:435:1: ( ( ( rule__Member__NameAssignment_1 ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:436:1: ( ( rule__Member__NameAssignment_1 ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:436:1: ( ( rule__Member__NameAssignment_1 ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:437:1: ( rule__Member__NameAssignment_1 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_1()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:438:1: ( rule__Member__NameAssignment_1 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:438:2: rule__Member__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Member__NameAssignment_1_in_rule__Member__Group__1__Impl831);
            rule__Member__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Member__Group__1__Impl"


    // $ANTLR start "rule__Member__Group__2"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:448:1: rule__Member__Group__2 : rule__Member__Group__2__Impl rule__Member__Group__3 ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:452:1: ( rule__Member__Group__2__Impl rule__Member__Group__3 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:453:2: rule__Member__Group__2__Impl rule__Member__Group__3
            {
            pushFollow(FOLLOW_rule__Member__Group__2__Impl_in_rule__Member__Group__2861);
            rule__Member__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Member__Group__3_in_rule__Member__Group__2864);
            rule__Member__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Member__Group__2"


    // $ANTLR start "rule__Member__Group__2__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:460:1: rule__Member__Group__2__Impl : ( ( rule__Member__SurnameAssignment_2 ) ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:464:1: ( ( ( rule__Member__SurnameAssignment_2 ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:465:1: ( ( rule__Member__SurnameAssignment_2 ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:465:1: ( ( rule__Member__SurnameAssignment_2 ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:466:1: ( rule__Member__SurnameAssignment_2 )
            {
             before(grammarAccess.getMemberAccess().getSurnameAssignment_2()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:467:1: ( rule__Member__SurnameAssignment_2 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:467:2: rule__Member__SurnameAssignment_2
            {
            pushFollow(FOLLOW_rule__Member__SurnameAssignment_2_in_rule__Member__Group__2__Impl891);
            rule__Member__SurnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getSurnameAssignment_2()); 

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
    // $ANTLR end "rule__Member__Group__2__Impl"


    // $ANTLR start "rule__Member__Group__3"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:477:1: rule__Member__Group__3 : rule__Member__Group__3__Impl ;
    public final void rule__Member__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:481:1: ( rule__Member__Group__3__Impl )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:482:2: rule__Member__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Member__Group__3__Impl_in_rule__Member__Group__3921);
            rule__Member__Group__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Member__Group__3"


    // $ANTLR start "rule__Member__Group__3__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:488:1: rule__Member__Group__3__Impl : ( ( rule__Member__GroupAssignment_3 ) ) ;
    public final void rule__Member__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:492:1: ( ( ( rule__Member__GroupAssignment_3 ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:493:1: ( ( rule__Member__GroupAssignment_3 ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:493:1: ( ( rule__Member__GroupAssignment_3 ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:494:1: ( rule__Member__GroupAssignment_3 )
            {
             before(grammarAccess.getMemberAccess().getGroupAssignment_3()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:495:1: ( rule__Member__GroupAssignment_3 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:495:2: rule__Member__GroupAssignment_3
            {
            pushFollow(FOLLOW_rule__Member__GroupAssignment_3_in_rule__Member__Group__3__Impl948);
            rule__Member__GroupAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getGroupAssignment_3()); 

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
    // $ANTLR end "rule__Member__Group__3__Impl"


    // $ANTLR start "rule__Seminar__Group__0"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:513:1: rule__Seminar__Group__0 : rule__Seminar__Group__0__Impl rule__Seminar__Group__1 ;
    public final void rule__Seminar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:517:1: ( rule__Seminar__Group__0__Impl rule__Seminar__Group__1 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:518:2: rule__Seminar__Group__0__Impl rule__Seminar__Group__1
            {
            pushFollow(FOLLOW_rule__Seminar__Group__0__Impl_in_rule__Seminar__Group__0986);
            rule__Seminar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Seminar__Group__1_in_rule__Seminar__Group__0989);
            rule__Seminar__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Seminar__Group__0"


    // $ANTLR start "rule__Seminar__Group__0__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:525:1: rule__Seminar__Group__0__Impl : ( 'seminar' ) ;
    public final void rule__Seminar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:529:1: ( ( 'seminar' ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:530:1: ( 'seminar' )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:530:1: ( 'seminar' )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:531:1: 'seminar'
            {
             before(grammarAccess.getSeminarAccess().getSeminarKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Seminar__Group__0__Impl1017); 
             after(grammarAccess.getSeminarAccess().getSeminarKeyword_0()); 

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
    // $ANTLR end "rule__Seminar__Group__0__Impl"


    // $ANTLR start "rule__Seminar__Group__1"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:544:1: rule__Seminar__Group__1 : rule__Seminar__Group__1__Impl rule__Seminar__Group__2 ;
    public final void rule__Seminar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:548:1: ( rule__Seminar__Group__1__Impl rule__Seminar__Group__2 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:549:2: rule__Seminar__Group__1__Impl rule__Seminar__Group__2
            {
            pushFollow(FOLLOW_rule__Seminar__Group__1__Impl_in_rule__Seminar__Group__11048);
            rule__Seminar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Seminar__Group__2_in_rule__Seminar__Group__11051);
            rule__Seminar__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Seminar__Group__1"


    // $ANTLR start "rule__Seminar__Group__1__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:556:1: rule__Seminar__Group__1__Impl : ( ( rule__Seminar__TitleAssignment_1 ) ) ;
    public final void rule__Seminar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:560:1: ( ( ( rule__Seminar__TitleAssignment_1 ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:561:1: ( ( rule__Seminar__TitleAssignment_1 ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:561:1: ( ( rule__Seminar__TitleAssignment_1 ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:562:1: ( rule__Seminar__TitleAssignment_1 )
            {
             before(grammarAccess.getSeminarAccess().getTitleAssignment_1()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:563:1: ( rule__Seminar__TitleAssignment_1 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:563:2: rule__Seminar__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__Seminar__TitleAssignment_1_in_rule__Seminar__Group__1__Impl1078);
            rule__Seminar__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSeminarAccess().getTitleAssignment_1()); 

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
    // $ANTLR end "rule__Seminar__Group__1__Impl"


    // $ANTLR start "rule__Seminar__Group__2"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:573:1: rule__Seminar__Group__2 : rule__Seminar__Group__2__Impl rule__Seminar__Group__3 ;
    public final void rule__Seminar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:577:1: ( rule__Seminar__Group__2__Impl rule__Seminar__Group__3 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:578:2: rule__Seminar__Group__2__Impl rule__Seminar__Group__3
            {
            pushFollow(FOLLOW_rule__Seminar__Group__2__Impl_in_rule__Seminar__Group__21108);
            rule__Seminar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Seminar__Group__3_in_rule__Seminar__Group__21111);
            rule__Seminar__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Seminar__Group__2"


    // $ANTLR start "rule__Seminar__Group__2__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:585:1: rule__Seminar__Group__2__Impl : ( '(' ) ;
    public final void rule__Seminar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:589:1: ( ( '(' ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:590:1: ( '(' )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:590:1: ( '(' )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:591:1: '('
            {
             before(grammarAccess.getSeminarAccess().getLeftParenthesisKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Seminar__Group__2__Impl1139); 
             after(grammarAccess.getSeminarAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Seminar__Group__2__Impl"


    // $ANTLR start "rule__Seminar__Group__3"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:604:1: rule__Seminar__Group__3 : rule__Seminar__Group__3__Impl rule__Seminar__Group__4 ;
    public final void rule__Seminar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:608:1: ( rule__Seminar__Group__3__Impl rule__Seminar__Group__4 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:609:2: rule__Seminar__Group__3__Impl rule__Seminar__Group__4
            {
            pushFollow(FOLLOW_rule__Seminar__Group__3__Impl_in_rule__Seminar__Group__31170);
            rule__Seminar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Seminar__Group__4_in_rule__Seminar__Group__31173);
            rule__Seminar__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Seminar__Group__3"


    // $ANTLR start "rule__Seminar__Group__3__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:616:1: rule__Seminar__Group__3__Impl : ( ( rule__Seminar__OrganizersAssignment_3 ) ) ;
    public final void rule__Seminar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:620:1: ( ( ( rule__Seminar__OrganizersAssignment_3 ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:621:1: ( ( rule__Seminar__OrganizersAssignment_3 ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:621:1: ( ( rule__Seminar__OrganizersAssignment_3 ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:622:1: ( rule__Seminar__OrganizersAssignment_3 )
            {
             before(grammarAccess.getSeminarAccess().getOrganizersAssignment_3()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:623:1: ( rule__Seminar__OrganizersAssignment_3 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:623:2: rule__Seminar__OrganizersAssignment_3
            {
            pushFollow(FOLLOW_rule__Seminar__OrganizersAssignment_3_in_rule__Seminar__Group__3__Impl1200);
            rule__Seminar__OrganizersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSeminarAccess().getOrganizersAssignment_3()); 

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
    // $ANTLR end "rule__Seminar__Group__3__Impl"


    // $ANTLR start "rule__Seminar__Group__4"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:633:1: rule__Seminar__Group__4 : rule__Seminar__Group__4__Impl rule__Seminar__Group__5 ;
    public final void rule__Seminar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:637:1: ( rule__Seminar__Group__4__Impl rule__Seminar__Group__5 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:638:2: rule__Seminar__Group__4__Impl rule__Seminar__Group__5
            {
            pushFollow(FOLLOW_rule__Seminar__Group__4__Impl_in_rule__Seminar__Group__41230);
            rule__Seminar__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Seminar__Group__5_in_rule__Seminar__Group__41233);
            rule__Seminar__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__Seminar__Group__4"


    // $ANTLR start "rule__Seminar__Group__4__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:645:1: rule__Seminar__Group__4__Impl : ( ( rule__Seminar__Group_4__0 )* ) ;
    public final void rule__Seminar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:649:1: ( ( ( rule__Seminar__Group_4__0 )* ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:650:1: ( ( rule__Seminar__Group_4__0 )* )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:650:1: ( ( rule__Seminar__Group_4__0 )* )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:651:1: ( rule__Seminar__Group_4__0 )*
            {
             before(grammarAccess.getSeminarAccess().getGroup_4()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:652:1: ( rule__Seminar__Group_4__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:652:2: rule__Seminar__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Seminar__Group_4__0_in_rule__Seminar__Group__4__Impl1260);
            	    rule__Seminar__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Seminar__Group__4__Impl"


    // $ANTLR start "rule__Seminar__Group__5"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:662:1: rule__Seminar__Group__5 : rule__Seminar__Group__5__Impl rule__Seminar__Group__6 ;
    public final void rule__Seminar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:666:1: ( rule__Seminar__Group__5__Impl rule__Seminar__Group__6 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:667:2: rule__Seminar__Group__5__Impl rule__Seminar__Group__6
            {
            pushFollow(FOLLOW_rule__Seminar__Group__5__Impl_in_rule__Seminar__Group__51291);
            rule__Seminar__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Seminar__Group__6_in_rule__Seminar__Group__51294);
            rule__Seminar__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__Seminar__Group__5"


    // $ANTLR start "rule__Seminar__Group__5__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:674:1: rule__Seminar__Group__5__Impl : ( ')' ) ;
    public final void rule__Seminar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:678:1: ( ( ')' ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:679:1: ( ')' )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:679:1: ( ')' )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:680:1: ')'
            {
             before(grammarAccess.getSeminarAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__Seminar__Group__5__Impl1322); 
             after(grammarAccess.getSeminarAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Seminar__Group__5__Impl"


    // $ANTLR start "rule__Seminar__Group__6"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:693:1: rule__Seminar__Group__6 : rule__Seminar__Group__6__Impl rule__Seminar__Group__7 ;
    public final void rule__Seminar__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:697:1: ( rule__Seminar__Group__6__Impl rule__Seminar__Group__7 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:698:2: rule__Seminar__Group__6__Impl rule__Seminar__Group__7
            {
            pushFollow(FOLLOW_rule__Seminar__Group__6__Impl_in_rule__Seminar__Group__61353);
            rule__Seminar__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Seminar__Group__7_in_rule__Seminar__Group__61356);
            rule__Seminar__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__Seminar__Group__6"


    // $ANTLR start "rule__Seminar__Group__6__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:705:1: rule__Seminar__Group__6__Impl : ( 'date' ) ;
    public final void rule__Seminar__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:709:1: ( ( 'date' ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:710:1: ( 'date' )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:710:1: ( 'date' )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:711:1: 'date'
            {
             before(grammarAccess.getSeminarAccess().getDateKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__Seminar__Group__6__Impl1384); 
             after(grammarAccess.getSeminarAccess().getDateKeyword_6()); 

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
    // $ANTLR end "rule__Seminar__Group__6__Impl"


    // $ANTLR start "rule__Seminar__Group__7"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:724:1: rule__Seminar__Group__7 : rule__Seminar__Group__7__Impl rule__Seminar__Group__8 ;
    public final void rule__Seminar__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:728:1: ( rule__Seminar__Group__7__Impl rule__Seminar__Group__8 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:729:2: rule__Seminar__Group__7__Impl rule__Seminar__Group__8
            {
            pushFollow(FOLLOW_rule__Seminar__Group__7__Impl_in_rule__Seminar__Group__71415);
            rule__Seminar__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Seminar__Group__8_in_rule__Seminar__Group__71418);
            rule__Seminar__Group__8();

            state._fsp--;


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
    // $ANTLR end "rule__Seminar__Group__7"


    // $ANTLR start "rule__Seminar__Group__7__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:736:1: rule__Seminar__Group__7__Impl : ( RULE_DATE ) ;
    public final void rule__Seminar__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:740:1: ( ( RULE_DATE ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:741:1: ( RULE_DATE )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:741:1: ( RULE_DATE )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:742:1: RULE_DATE
            {
             before(grammarAccess.getSeminarAccess().getDATETerminalRuleCall_7()); 
            match(input,RULE_DATE,FOLLOW_RULE_DATE_in_rule__Seminar__Group__7__Impl1445); 
             after(grammarAccess.getSeminarAccess().getDATETerminalRuleCall_7()); 

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
    // $ANTLR end "rule__Seminar__Group__7__Impl"


    // $ANTLR start "rule__Seminar__Group__8"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:753:1: rule__Seminar__Group__8 : rule__Seminar__Group__8__Impl rule__Seminar__Group__9 ;
    public final void rule__Seminar__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:757:1: ( rule__Seminar__Group__8__Impl rule__Seminar__Group__9 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:758:2: rule__Seminar__Group__8__Impl rule__Seminar__Group__9
            {
            pushFollow(FOLLOW_rule__Seminar__Group__8__Impl_in_rule__Seminar__Group__81474);
            rule__Seminar__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Seminar__Group__9_in_rule__Seminar__Group__81477);
            rule__Seminar__Group__9();

            state._fsp--;


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
    // $ANTLR end "rule__Seminar__Group__8"


    // $ANTLR start "rule__Seminar__Group__8__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:765:1: rule__Seminar__Group__8__Impl : ( 'duration' ) ;
    public final void rule__Seminar__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:769:1: ( ( 'duration' ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:770:1: ( 'duration' )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:770:1: ( 'duration' )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:771:1: 'duration'
            {
             before(grammarAccess.getSeminarAccess().getDurationKeyword_8()); 
            match(input,19,FOLLOW_19_in_rule__Seminar__Group__8__Impl1505); 
             after(grammarAccess.getSeminarAccess().getDurationKeyword_8()); 

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
    // $ANTLR end "rule__Seminar__Group__8__Impl"


    // $ANTLR start "rule__Seminar__Group__9"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:784:1: rule__Seminar__Group__9 : rule__Seminar__Group__9__Impl rule__Seminar__Group__10 ;
    public final void rule__Seminar__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:788:1: ( rule__Seminar__Group__9__Impl rule__Seminar__Group__10 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:789:2: rule__Seminar__Group__9__Impl rule__Seminar__Group__10
            {
            pushFollow(FOLLOW_rule__Seminar__Group__9__Impl_in_rule__Seminar__Group__91536);
            rule__Seminar__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Seminar__Group__10_in_rule__Seminar__Group__91539);
            rule__Seminar__Group__10();

            state._fsp--;


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
    // $ANTLR end "rule__Seminar__Group__9"


    // $ANTLR start "rule__Seminar__Group__9__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:796:1: rule__Seminar__Group__9__Impl : ( RULE_HOUR ) ;
    public final void rule__Seminar__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:800:1: ( ( RULE_HOUR ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:801:1: ( RULE_HOUR )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:801:1: ( RULE_HOUR )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:802:1: RULE_HOUR
            {
             before(grammarAccess.getSeminarAccess().getHOURTerminalRuleCall_9()); 
            match(input,RULE_HOUR,FOLLOW_RULE_HOUR_in_rule__Seminar__Group__9__Impl1566); 
             after(grammarAccess.getSeminarAccess().getHOURTerminalRuleCall_9()); 

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
    // $ANTLR end "rule__Seminar__Group__9__Impl"


    // $ANTLR start "rule__Seminar__Group__10"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:813:1: rule__Seminar__Group__10 : rule__Seminar__Group__10__Impl ;
    public final void rule__Seminar__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:817:1: ( rule__Seminar__Group__10__Impl )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:818:2: rule__Seminar__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Seminar__Group__10__Impl_in_rule__Seminar__Group__101595);
            rule__Seminar__Group__10__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Seminar__Group__10"


    // $ANTLR start "rule__Seminar__Group__10__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:824:1: rule__Seminar__Group__10__Impl : ( ( ( rule__Seminar__TalksAssignment_10 ) ) ( ( rule__Seminar__TalksAssignment_10 )* ) ) ;
    public final void rule__Seminar__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:828:1: ( ( ( ( rule__Seminar__TalksAssignment_10 ) ) ( ( rule__Seminar__TalksAssignment_10 )* ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:829:1: ( ( ( rule__Seminar__TalksAssignment_10 ) ) ( ( rule__Seminar__TalksAssignment_10 )* ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:829:1: ( ( ( rule__Seminar__TalksAssignment_10 ) ) ( ( rule__Seminar__TalksAssignment_10 )* ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:830:1: ( ( rule__Seminar__TalksAssignment_10 ) ) ( ( rule__Seminar__TalksAssignment_10 )* )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:830:1: ( ( rule__Seminar__TalksAssignment_10 ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:831:1: ( rule__Seminar__TalksAssignment_10 )
            {
             before(grammarAccess.getSeminarAccess().getTalksAssignment_10()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:832:1: ( rule__Seminar__TalksAssignment_10 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:832:2: rule__Seminar__TalksAssignment_10
            {
            pushFollow(FOLLOW_rule__Seminar__TalksAssignment_10_in_rule__Seminar__Group__10__Impl1624);
            rule__Seminar__TalksAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getSeminarAccess().getTalksAssignment_10()); 

            }

            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:835:1: ( ( rule__Seminar__TalksAssignment_10 )* )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:836:1: ( rule__Seminar__TalksAssignment_10 )*
            {
             before(grammarAccess.getSeminarAccess().getTalksAssignment_10()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:837:1: ( rule__Seminar__TalksAssignment_10 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:837:2: rule__Seminar__TalksAssignment_10
            	    {
            	    pushFollow(FOLLOW_rule__Seminar__TalksAssignment_10_in_rule__Seminar__Group__10__Impl1636);
            	    rule__Seminar__TalksAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSeminarAccess().getTalksAssignment_10()); 

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
    // $ANTLR end "rule__Seminar__Group__10__Impl"


    // $ANTLR start "rule__Seminar__Group_4__0"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:870:1: rule__Seminar__Group_4__0 : rule__Seminar__Group_4__0__Impl rule__Seminar__Group_4__1 ;
    public final void rule__Seminar__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:874:1: ( rule__Seminar__Group_4__0__Impl rule__Seminar__Group_4__1 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:875:2: rule__Seminar__Group_4__0__Impl rule__Seminar__Group_4__1
            {
            pushFollow(FOLLOW_rule__Seminar__Group_4__0__Impl_in_rule__Seminar__Group_4__01691);
            rule__Seminar__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Seminar__Group_4__1_in_rule__Seminar__Group_4__01694);
            rule__Seminar__Group_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__Seminar__Group_4__0"


    // $ANTLR start "rule__Seminar__Group_4__0__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:882:1: rule__Seminar__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Seminar__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:886:1: ( ( ',' ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:887:1: ( ',' )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:887:1: ( ',' )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:888:1: ','
            {
             before(grammarAccess.getSeminarAccess().getCommaKeyword_4_0()); 
            match(input,20,FOLLOW_20_in_rule__Seminar__Group_4__0__Impl1722); 
             after(grammarAccess.getSeminarAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Seminar__Group_4__0__Impl"


    // $ANTLR start "rule__Seminar__Group_4__1"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:901:1: rule__Seminar__Group_4__1 : rule__Seminar__Group_4__1__Impl ;
    public final void rule__Seminar__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:905:1: ( rule__Seminar__Group_4__1__Impl )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:906:2: rule__Seminar__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Seminar__Group_4__1__Impl_in_rule__Seminar__Group_4__11753);
            rule__Seminar__Group_4__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Seminar__Group_4__1"


    // $ANTLR start "rule__Seminar__Group_4__1__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:912:1: rule__Seminar__Group_4__1__Impl : ( ( rule__Seminar__OrganizersAssignment_4_1 ) ) ;
    public final void rule__Seminar__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:916:1: ( ( ( rule__Seminar__OrganizersAssignment_4_1 ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:917:1: ( ( rule__Seminar__OrganizersAssignment_4_1 ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:917:1: ( ( rule__Seminar__OrganizersAssignment_4_1 ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:918:1: ( rule__Seminar__OrganizersAssignment_4_1 )
            {
             before(grammarAccess.getSeminarAccess().getOrganizersAssignment_4_1()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:919:1: ( rule__Seminar__OrganizersAssignment_4_1 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:919:2: rule__Seminar__OrganizersAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Seminar__OrganizersAssignment_4_1_in_rule__Seminar__Group_4__1__Impl1780);
            rule__Seminar__OrganizersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSeminarAccess().getOrganizersAssignment_4_1()); 

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
    // $ANTLR end "rule__Seminar__Group_4__1__Impl"


    // $ANTLR start "rule__Talk__Group__0"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:933:1: rule__Talk__Group__0 : rule__Talk__Group__0__Impl rule__Talk__Group__1 ;
    public final void rule__Talk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:937:1: ( rule__Talk__Group__0__Impl rule__Talk__Group__1 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:938:2: rule__Talk__Group__0__Impl rule__Talk__Group__1
            {
            pushFollow(FOLLOW_rule__Talk__Group__0__Impl_in_rule__Talk__Group__01814);
            rule__Talk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__1_in_rule__Talk__Group__01817);
            rule__Talk__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Talk__Group__0"


    // $ANTLR start "rule__Talk__Group__0__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:945:1: rule__Talk__Group__0__Impl : ( 'talk' ) ;
    public final void rule__Talk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:949:1: ( ( 'talk' ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:950:1: ( 'talk' )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:950:1: ( 'talk' )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:951:1: 'talk'
            {
             before(grammarAccess.getTalkAccess().getTalkKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Talk__Group__0__Impl1845); 
             after(grammarAccess.getTalkAccess().getTalkKeyword_0()); 

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
    // $ANTLR end "rule__Talk__Group__0__Impl"


    // $ANTLR start "rule__Talk__Group__1"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:964:1: rule__Talk__Group__1 : rule__Talk__Group__1__Impl rule__Talk__Group__2 ;
    public final void rule__Talk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:968:1: ( rule__Talk__Group__1__Impl rule__Talk__Group__2 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:969:2: rule__Talk__Group__1__Impl rule__Talk__Group__2
            {
            pushFollow(FOLLOW_rule__Talk__Group__1__Impl_in_rule__Talk__Group__11876);
            rule__Talk__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__2_in_rule__Talk__Group__11879);
            rule__Talk__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Talk__Group__1"


    // $ANTLR start "rule__Talk__Group__1__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:976:1: rule__Talk__Group__1__Impl : ( ( rule__Talk__TitleAssignment_1 ) ) ;
    public final void rule__Talk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:980:1: ( ( ( rule__Talk__TitleAssignment_1 ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:981:1: ( ( rule__Talk__TitleAssignment_1 ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:981:1: ( ( rule__Talk__TitleAssignment_1 ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:982:1: ( rule__Talk__TitleAssignment_1 )
            {
             before(grammarAccess.getTalkAccess().getTitleAssignment_1()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:983:1: ( rule__Talk__TitleAssignment_1 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:983:2: rule__Talk__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__Talk__TitleAssignment_1_in_rule__Talk__Group__1__Impl1906);
            rule__Talk__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getTitleAssignment_1()); 

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
    // $ANTLR end "rule__Talk__Group__1__Impl"


    // $ANTLR start "rule__Talk__Group__2"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:993:1: rule__Talk__Group__2 : rule__Talk__Group__2__Impl rule__Talk__Group__3 ;
    public final void rule__Talk__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:997:1: ( rule__Talk__Group__2__Impl rule__Talk__Group__3 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:998:2: rule__Talk__Group__2__Impl rule__Talk__Group__3
            {
            pushFollow(FOLLOW_rule__Talk__Group__2__Impl_in_rule__Talk__Group__21936);
            rule__Talk__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__3_in_rule__Talk__Group__21939);
            rule__Talk__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Talk__Group__2"


    // $ANTLR start "rule__Talk__Group__2__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1005:1: rule__Talk__Group__2__Impl : ( '(' ) ;
    public final void rule__Talk__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1009:1: ( ( '(' ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1010:1: ( '(' )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1010:1: ( '(' )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1011:1: '('
            {
             before(grammarAccess.getTalkAccess().getLeftParenthesisKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Talk__Group__2__Impl1967); 
             after(grammarAccess.getTalkAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Talk__Group__2__Impl"


    // $ANTLR start "rule__Talk__Group__3"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1024:1: rule__Talk__Group__3 : rule__Talk__Group__3__Impl rule__Talk__Group__4 ;
    public final void rule__Talk__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1028:1: ( rule__Talk__Group__3__Impl rule__Talk__Group__4 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1029:2: rule__Talk__Group__3__Impl rule__Talk__Group__4
            {
            pushFollow(FOLLOW_rule__Talk__Group__3__Impl_in_rule__Talk__Group__31998);
            rule__Talk__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__4_in_rule__Talk__Group__32001);
            rule__Talk__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Talk__Group__3"


    // $ANTLR start "rule__Talk__Group__3__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1036:1: rule__Talk__Group__3__Impl : ( ( rule__Talk__PresentersAssignment_3 ) ) ;
    public final void rule__Talk__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1040:1: ( ( ( rule__Talk__PresentersAssignment_3 ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1041:1: ( ( rule__Talk__PresentersAssignment_3 ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1041:1: ( ( rule__Talk__PresentersAssignment_3 ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1042:1: ( rule__Talk__PresentersAssignment_3 )
            {
             before(grammarAccess.getTalkAccess().getPresentersAssignment_3()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1043:1: ( rule__Talk__PresentersAssignment_3 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1043:2: rule__Talk__PresentersAssignment_3
            {
            pushFollow(FOLLOW_rule__Talk__PresentersAssignment_3_in_rule__Talk__Group__3__Impl2028);
            rule__Talk__PresentersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getPresentersAssignment_3()); 

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
    // $ANTLR end "rule__Talk__Group__3__Impl"


    // $ANTLR start "rule__Talk__Group__4"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1053:1: rule__Talk__Group__4 : rule__Talk__Group__4__Impl rule__Talk__Group__5 ;
    public final void rule__Talk__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1057:1: ( rule__Talk__Group__4__Impl rule__Talk__Group__5 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1058:2: rule__Talk__Group__4__Impl rule__Talk__Group__5
            {
            pushFollow(FOLLOW_rule__Talk__Group__4__Impl_in_rule__Talk__Group__42058);
            rule__Talk__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__5_in_rule__Talk__Group__42061);
            rule__Talk__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__Talk__Group__4"


    // $ANTLR start "rule__Talk__Group__4__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1065:1: rule__Talk__Group__4__Impl : ( ( rule__Talk__Group_4__0 )* ) ;
    public final void rule__Talk__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1069:1: ( ( ( rule__Talk__Group_4__0 )* ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1070:1: ( ( rule__Talk__Group_4__0 )* )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1070:1: ( ( rule__Talk__Group_4__0 )* )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1071:1: ( rule__Talk__Group_4__0 )*
            {
             before(grammarAccess.getTalkAccess().getGroup_4()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1072:1: ( rule__Talk__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1072:2: rule__Talk__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Talk__Group_4__0_in_rule__Talk__Group__4__Impl2088);
            	    rule__Talk__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTalkAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Talk__Group__4__Impl"


    // $ANTLR start "rule__Talk__Group__5"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1082:1: rule__Talk__Group__5 : rule__Talk__Group__5__Impl rule__Talk__Group__6 ;
    public final void rule__Talk__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1086:1: ( rule__Talk__Group__5__Impl rule__Talk__Group__6 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1087:2: rule__Talk__Group__5__Impl rule__Talk__Group__6
            {
            pushFollow(FOLLOW_rule__Talk__Group__5__Impl_in_rule__Talk__Group__52119);
            rule__Talk__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__6_in_rule__Talk__Group__52122);
            rule__Talk__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__Talk__Group__5"


    // $ANTLR start "rule__Talk__Group__5__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1094:1: rule__Talk__Group__5__Impl : ( ')' ) ;
    public final void rule__Talk__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1098:1: ( ( ')' ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1099:1: ( ')' )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1099:1: ( ')' )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1100:1: ')'
            {
             before(grammarAccess.getTalkAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__Talk__Group__5__Impl2150); 
             after(grammarAccess.getTalkAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Talk__Group__5__Impl"


    // $ANTLR start "rule__Talk__Group__6"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1113:1: rule__Talk__Group__6 : rule__Talk__Group__6__Impl rule__Talk__Group__7 ;
    public final void rule__Talk__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1117:1: ( rule__Talk__Group__6__Impl rule__Talk__Group__7 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1118:2: rule__Talk__Group__6__Impl rule__Talk__Group__7
            {
            pushFollow(FOLLOW_rule__Talk__Group__6__Impl_in_rule__Talk__Group__62181);
            rule__Talk__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__7_in_rule__Talk__Group__62184);
            rule__Talk__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__Talk__Group__6"


    // $ANTLR start "rule__Talk__Group__6__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1125:1: rule__Talk__Group__6__Impl : ( 'abstract' ) ;
    public final void rule__Talk__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1129:1: ( ( 'abstract' ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1130:1: ( 'abstract' )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1130:1: ( 'abstract' )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1131:1: 'abstract'
            {
             before(grammarAccess.getTalkAccess().getAbstractKeyword_6()); 
            match(input,22,FOLLOW_22_in_rule__Talk__Group__6__Impl2212); 
             after(grammarAccess.getTalkAccess().getAbstractKeyword_6()); 

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
    // $ANTLR end "rule__Talk__Group__6__Impl"


    // $ANTLR start "rule__Talk__Group__7"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1144:1: rule__Talk__Group__7 : rule__Talk__Group__7__Impl rule__Talk__Group__8 ;
    public final void rule__Talk__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1148:1: ( rule__Talk__Group__7__Impl rule__Talk__Group__8 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1149:2: rule__Talk__Group__7__Impl rule__Talk__Group__8
            {
            pushFollow(FOLLOW_rule__Talk__Group__7__Impl_in_rule__Talk__Group__72243);
            rule__Talk__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__8_in_rule__Talk__Group__72246);
            rule__Talk__Group__8();

            state._fsp--;


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
    // $ANTLR end "rule__Talk__Group__7"


    // $ANTLR start "rule__Talk__Group__7__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1156:1: rule__Talk__Group__7__Impl : ( RULE_STRING ) ;
    public final void rule__Talk__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1160:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1161:1: ( RULE_STRING )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1161:1: ( RULE_STRING )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1162:1: RULE_STRING
            {
             before(grammarAccess.getTalkAccess().getSTRINGTerminalRuleCall_7()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Talk__Group__7__Impl2273); 
             after(grammarAccess.getTalkAccess().getSTRINGTerminalRuleCall_7()); 

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
    // $ANTLR end "rule__Talk__Group__7__Impl"


    // $ANTLR start "rule__Talk__Group__8"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1173:1: rule__Talk__Group__8 : rule__Talk__Group__8__Impl ;
    public final void rule__Talk__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1177:1: ( rule__Talk__Group__8__Impl )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1178:2: rule__Talk__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Talk__Group__8__Impl_in_rule__Talk__Group__82302);
            rule__Talk__Group__8__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Talk__Group__8"


    // $ANTLR start "rule__Talk__Group__8__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1184:1: rule__Talk__Group__8__Impl : ( ( rule__Talk__Group_8__0 )? ) ;
    public final void rule__Talk__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1188:1: ( ( ( rule__Talk__Group_8__0 )? ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1189:1: ( ( rule__Talk__Group_8__0 )? )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1189:1: ( ( rule__Talk__Group_8__0 )? )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1190:1: ( rule__Talk__Group_8__0 )?
            {
             before(grammarAccess.getTalkAccess().getGroup_8()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1191:1: ( rule__Talk__Group_8__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1191:2: rule__Talk__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Talk__Group_8__0_in_rule__Talk__Group__8__Impl2329);
                    rule__Talk__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTalkAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Talk__Group__8__Impl"


    // $ANTLR start "rule__Talk__Group_4__0"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1219:1: rule__Talk__Group_4__0 : rule__Talk__Group_4__0__Impl rule__Talk__Group_4__1 ;
    public final void rule__Talk__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1223:1: ( rule__Talk__Group_4__0__Impl rule__Talk__Group_4__1 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1224:2: rule__Talk__Group_4__0__Impl rule__Talk__Group_4__1
            {
            pushFollow(FOLLOW_rule__Talk__Group_4__0__Impl_in_rule__Talk__Group_4__02378);
            rule__Talk__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group_4__1_in_rule__Talk__Group_4__02381);
            rule__Talk__Group_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__Talk__Group_4__0"


    // $ANTLR start "rule__Talk__Group_4__0__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1231:1: rule__Talk__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Talk__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1235:1: ( ( ',' ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1236:1: ( ',' )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1236:1: ( ',' )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1237:1: ','
            {
             before(grammarAccess.getTalkAccess().getCommaKeyword_4_0()); 
            match(input,20,FOLLOW_20_in_rule__Talk__Group_4__0__Impl2409); 
             after(grammarAccess.getTalkAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Talk__Group_4__0__Impl"


    // $ANTLR start "rule__Talk__Group_4__1"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1250:1: rule__Talk__Group_4__1 : rule__Talk__Group_4__1__Impl ;
    public final void rule__Talk__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1254:1: ( rule__Talk__Group_4__1__Impl )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1255:2: rule__Talk__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Talk__Group_4__1__Impl_in_rule__Talk__Group_4__12440);
            rule__Talk__Group_4__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Talk__Group_4__1"


    // $ANTLR start "rule__Talk__Group_4__1__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1261:1: rule__Talk__Group_4__1__Impl : ( ( rule__Talk__PresentersAssignment_4_1 ) ) ;
    public final void rule__Talk__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1265:1: ( ( ( rule__Talk__PresentersAssignment_4_1 ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1266:1: ( ( rule__Talk__PresentersAssignment_4_1 ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1266:1: ( ( rule__Talk__PresentersAssignment_4_1 ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1267:1: ( rule__Talk__PresentersAssignment_4_1 )
            {
             before(grammarAccess.getTalkAccess().getPresentersAssignment_4_1()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1268:1: ( rule__Talk__PresentersAssignment_4_1 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1268:2: rule__Talk__PresentersAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Talk__PresentersAssignment_4_1_in_rule__Talk__Group_4__1__Impl2467);
            rule__Talk__PresentersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getPresentersAssignment_4_1()); 

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
    // $ANTLR end "rule__Talk__Group_4__1__Impl"


    // $ANTLR start "rule__Talk__Group_8__0"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1282:1: rule__Talk__Group_8__0 : rule__Talk__Group_8__0__Impl rule__Talk__Group_8__1 ;
    public final void rule__Talk__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1286:1: ( rule__Talk__Group_8__0__Impl rule__Talk__Group_8__1 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1287:2: rule__Talk__Group_8__0__Impl rule__Talk__Group_8__1
            {
            pushFollow(FOLLOW_rule__Talk__Group_8__0__Impl_in_rule__Talk__Group_8__02501);
            rule__Talk__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group_8__1_in_rule__Talk__Group_8__02504);
            rule__Talk__Group_8__1();

            state._fsp--;


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
    // $ANTLR end "rule__Talk__Group_8__0"


    // $ANTLR start "rule__Talk__Group_8__0__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1294:1: rule__Talk__Group_8__0__Impl : ( 'duration' ) ;
    public final void rule__Talk__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1298:1: ( ( 'duration' ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1299:1: ( 'duration' )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1299:1: ( 'duration' )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1300:1: 'duration'
            {
             before(grammarAccess.getTalkAccess().getDurationKeyword_8_0()); 
            match(input,19,FOLLOW_19_in_rule__Talk__Group_8__0__Impl2532); 
             after(grammarAccess.getTalkAccess().getDurationKeyword_8_0()); 

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
    // $ANTLR end "rule__Talk__Group_8__0__Impl"


    // $ANTLR start "rule__Talk__Group_8__1"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1313:1: rule__Talk__Group_8__1 : rule__Talk__Group_8__1__Impl ;
    public final void rule__Talk__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1317:1: ( rule__Talk__Group_8__1__Impl )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1318:2: rule__Talk__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Talk__Group_8__1__Impl_in_rule__Talk__Group_8__12563);
            rule__Talk__Group_8__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Talk__Group_8__1"


    // $ANTLR start "rule__Talk__Group_8__1__Impl"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1324:1: rule__Talk__Group_8__1__Impl : ( ( rule__Talk__DurationAssignment_8_1 ) ) ;
    public final void rule__Talk__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1328:1: ( ( ( rule__Talk__DurationAssignment_8_1 ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1329:1: ( ( rule__Talk__DurationAssignment_8_1 ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1329:1: ( ( rule__Talk__DurationAssignment_8_1 ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1330:1: ( rule__Talk__DurationAssignment_8_1 )
            {
             before(grammarAccess.getTalkAccess().getDurationAssignment_8_1()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1331:1: ( rule__Talk__DurationAssignment_8_1 )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1331:2: rule__Talk__DurationAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Talk__DurationAssignment_8_1_in_rule__Talk__Group_8__1__Impl2590);
            rule__Talk__DurationAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getDurationAssignment_8_1()); 

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
    // $ANTLR end "rule__Talk__Group_8__1__Impl"


    // $ANTLR start "rule__DepartmentSeminars__GroupsAssignment_0"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1346:1: rule__DepartmentSeminars__GroupsAssignment_0 : ( ruleGroup ) ;
    public final void rule__DepartmentSeminars__GroupsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1350:1: ( ( ruleGroup ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1351:1: ( ruleGroup )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1351:1: ( ruleGroup )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1352:1: ruleGroup
            {
             before(grammarAccess.getDepartmentSeminarsAccess().getGroupsGroupParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__DepartmentSeminars__GroupsAssignment_02629);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getDepartmentSeminarsAccess().getGroupsGroupParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DepartmentSeminars__GroupsAssignment_0"


    // $ANTLR start "rule__DepartmentSeminars__UsersAssignment_1"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1361:1: rule__DepartmentSeminars__UsersAssignment_1 : ( ruleMember ) ;
    public final void rule__DepartmentSeminars__UsersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1365:1: ( ( ruleMember ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1366:1: ( ruleMember )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1366:1: ( ruleMember )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1367:1: ruleMember
            {
             before(grammarAccess.getDepartmentSeminarsAccess().getUsersMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__DepartmentSeminars__UsersAssignment_12660);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getDepartmentSeminarsAccess().getUsersMemberParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DepartmentSeminars__UsersAssignment_1"


    // $ANTLR start "rule__DepartmentSeminars__SeminarsAssignment_2"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1376:1: rule__DepartmentSeminars__SeminarsAssignment_2 : ( ruleSeminar ) ;
    public final void rule__DepartmentSeminars__SeminarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1380:1: ( ( ruleSeminar ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1381:1: ( ruleSeminar )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1381:1: ( ruleSeminar )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1382:1: ruleSeminar
            {
             before(grammarAccess.getDepartmentSeminarsAccess().getSeminarsSeminarParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSeminar_in_rule__DepartmentSeminars__SeminarsAssignment_22691);
            ruleSeminar();

            state._fsp--;

             after(grammarAccess.getDepartmentSeminarsAccess().getSeminarsSeminarParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DepartmentSeminars__SeminarsAssignment_2"


    // $ANTLR start "rule__Group__NameAssignment_1"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1391:1: rule__Group__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Group__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1395:1: ( ( RULE_ID ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1396:1: ( RULE_ID )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1396:1: ( RULE_ID )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1397:1: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Group__NameAssignment_12722); 
             after(grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Group__NameAssignment_1"


    // $ANTLR start "rule__Group__DescriptionAssignment_2"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1406:1: rule__Group__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Group__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1410:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1411:1: ( RULE_STRING )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1411:1: ( RULE_STRING )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1412:1: RULE_STRING
            {
             before(grammarAccess.getGroupAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Group__DescriptionAssignment_22753); 
             after(grammarAccess.getGroupAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Group__DescriptionAssignment_2"


    // $ANTLR start "rule__Member__NameAssignment_1"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1421:1: rule__Member__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Member__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1425:1: ( ( RULE_ID ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1426:1: ( RULE_ID )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1426:1: ( RULE_ID )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1427:1: RULE_ID
            {
             before(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Member__NameAssignment_12784); 
             after(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Member__NameAssignment_1"


    // $ANTLR start "rule__Member__SurnameAssignment_2"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1436:1: rule__Member__SurnameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Member__SurnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1440:1: ( ( RULE_ID ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1441:1: ( RULE_ID )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1441:1: ( RULE_ID )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1442:1: RULE_ID
            {
             before(grammarAccess.getMemberAccess().getSurnameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Member__SurnameAssignment_22815); 
             after(grammarAccess.getMemberAccess().getSurnameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Member__SurnameAssignment_2"


    // $ANTLR start "rule__Member__GroupAssignment_3"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1451:1: rule__Member__GroupAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Member__GroupAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1455:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1456:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1456:1: ( ( RULE_ID ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1457:1: ( RULE_ID )
            {
             before(grammarAccess.getMemberAccess().getGroupGroupCrossReference_3_0()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1458:1: ( RULE_ID )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1459:1: RULE_ID
            {
             before(grammarAccess.getMemberAccess().getGroupGroupIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Member__GroupAssignment_32850); 
             after(grammarAccess.getMemberAccess().getGroupGroupIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMemberAccess().getGroupGroupCrossReference_3_0()); 

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
    // $ANTLR end "rule__Member__GroupAssignment_3"


    // $ANTLR start "rule__Seminar__TitleAssignment_1"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1470:1: rule__Seminar__TitleAssignment_1 : ( RULE_ID ) ;
    public final void rule__Seminar__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1474:1: ( ( RULE_ID ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1475:1: ( RULE_ID )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1475:1: ( RULE_ID )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1476:1: RULE_ID
            {
             before(grammarAccess.getSeminarAccess().getTitleIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Seminar__TitleAssignment_12885); 
             after(grammarAccess.getSeminarAccess().getTitleIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Seminar__TitleAssignment_1"


    // $ANTLR start "rule__Seminar__OrganizersAssignment_3"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1485:1: rule__Seminar__OrganizersAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Seminar__OrganizersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1489:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1490:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1490:1: ( ( RULE_ID ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1491:1: ( RULE_ID )
            {
             before(grammarAccess.getSeminarAccess().getOrganizersMemberCrossReference_3_0()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1492:1: ( RULE_ID )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1493:1: RULE_ID
            {
             before(grammarAccess.getSeminarAccess().getOrganizersMemberIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Seminar__OrganizersAssignment_32920); 
             after(grammarAccess.getSeminarAccess().getOrganizersMemberIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSeminarAccess().getOrganizersMemberCrossReference_3_0()); 

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
    // $ANTLR end "rule__Seminar__OrganizersAssignment_3"


    // $ANTLR start "rule__Seminar__OrganizersAssignment_4_1"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1504:1: rule__Seminar__OrganizersAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Seminar__OrganizersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1508:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1509:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1509:1: ( ( RULE_ID ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1510:1: ( RULE_ID )
            {
             before(grammarAccess.getSeminarAccess().getOrganizersMemberCrossReference_4_1_0()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1511:1: ( RULE_ID )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1512:1: RULE_ID
            {
             before(grammarAccess.getSeminarAccess().getOrganizersMemberIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Seminar__OrganizersAssignment_4_12959); 
             after(grammarAccess.getSeminarAccess().getOrganizersMemberIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getSeminarAccess().getOrganizersMemberCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Seminar__OrganizersAssignment_4_1"


    // $ANTLR start "rule__Seminar__TalksAssignment_10"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1523:1: rule__Seminar__TalksAssignment_10 : ( ruleTalk ) ;
    public final void rule__Seminar__TalksAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1527:1: ( ( ruleTalk ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1528:1: ( ruleTalk )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1528:1: ( ruleTalk )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1529:1: ruleTalk
            {
             before(grammarAccess.getSeminarAccess().getTalksTalkParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleTalk_in_rule__Seminar__TalksAssignment_102994);
            ruleTalk();

            state._fsp--;

             after(grammarAccess.getSeminarAccess().getTalksTalkParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Seminar__TalksAssignment_10"


    // $ANTLR start "rule__Talk__TitleAssignment_1"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1538:1: rule__Talk__TitleAssignment_1 : ( RULE_ID ) ;
    public final void rule__Talk__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1542:1: ( ( RULE_ID ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1543:1: ( RULE_ID )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1543:1: ( RULE_ID )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1544:1: RULE_ID
            {
             before(grammarAccess.getTalkAccess().getTitleIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Talk__TitleAssignment_13025); 
             after(grammarAccess.getTalkAccess().getTitleIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Talk__TitleAssignment_1"


    // $ANTLR start "rule__Talk__PresentersAssignment_3"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1553:1: rule__Talk__PresentersAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Talk__PresentersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1557:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1558:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1558:1: ( ( RULE_ID ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1559:1: ( RULE_ID )
            {
             before(grammarAccess.getTalkAccess().getPresentersMemberCrossReference_3_0()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1560:1: ( RULE_ID )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1561:1: RULE_ID
            {
             before(grammarAccess.getTalkAccess().getPresentersMemberIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Talk__PresentersAssignment_33060); 
             after(grammarAccess.getTalkAccess().getPresentersMemberIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTalkAccess().getPresentersMemberCrossReference_3_0()); 

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
    // $ANTLR end "rule__Talk__PresentersAssignment_3"


    // $ANTLR start "rule__Talk__PresentersAssignment_4_1"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1572:1: rule__Talk__PresentersAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Talk__PresentersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1576:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1577:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1577:1: ( ( RULE_ID ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1578:1: ( RULE_ID )
            {
             before(grammarAccess.getTalkAccess().getPresentersMemberCrossReference_4_1_0()); 
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1579:1: ( RULE_ID )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1580:1: RULE_ID
            {
             before(grammarAccess.getTalkAccess().getPresentersMemberIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Talk__PresentersAssignment_4_13099); 
             after(grammarAccess.getTalkAccess().getPresentersMemberIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getTalkAccess().getPresentersMemberCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Talk__PresentersAssignment_4_1"


    // $ANTLR start "rule__Talk__DurationAssignment_8_1"
    // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1591:1: rule__Talk__DurationAssignment_8_1 : ( RULE_HOUR ) ;
    public final void rule__Talk__DurationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1595:1: ( ( RULE_HOUR ) )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1596:1: ( RULE_HOUR )
            {
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1596:1: ( RULE_HOUR )
            // ../org.xtext.example.csseminars.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalCSSeminars.g:1597:1: RULE_HOUR
            {
             before(grammarAccess.getTalkAccess().getDurationHOURTerminalRuleCall_8_1_0()); 
            match(input,RULE_HOUR,FOLLOW_RULE_HOUR_in_rule__Talk__DurationAssignment_8_13134); 
             after(grammarAccess.getTalkAccess().getDurationHOURTerminalRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Talk__DurationAssignment_8_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDepartmentSeminars_in_entryRuleDepartmentSeminars61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDepartmentSeminars68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DepartmentSeminars__Group__0_in_ruleDepartmentSeminars94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0_in_ruleGroup154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group__0_in_ruleMember214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeminar_in_entryRuleSeminar241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSeminar248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Seminar__Group__0_in_ruleSeminar274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTalk_in_entryRuleTalk301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTalk308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__0_in_ruleTalk334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DepartmentSeminars__Group__0__Impl_in_rule__DepartmentSeminars__Group__0368 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__DepartmentSeminars__Group__1_in_rule__DepartmentSeminars__Group__0371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DepartmentSeminars__GroupsAssignment_0_in_rule__DepartmentSeminars__Group__0__Impl398 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__DepartmentSeminars__Group__1__Impl_in_rule__DepartmentSeminars__Group__1429 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__DepartmentSeminars__Group__2_in_rule__DepartmentSeminars__Group__1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DepartmentSeminars__UsersAssignment_1_in_rule__DepartmentSeminars__Group__1__Impl459 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__DepartmentSeminars__Group__2__Impl_in_rule__DepartmentSeminars__Group__2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DepartmentSeminars__SeminarsAssignment_2_in_rule__DepartmentSeminars__Group__2__Impl517 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__0554 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__0557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Group__Group__0__Impl585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__1616 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__NameAssignment_1_in_rule__Group__Group__1__Impl646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__DescriptionAssignment_2_in_rule__Group__Group__2__Impl703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group__0__Impl_in_rule__Member__Group__0739 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Member__Group__1_in_rule__Member__Group__0742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Member__Group__0__Impl770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group__1__Impl_in_rule__Member__Group__1801 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Member__Group__2_in_rule__Member__Group__1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__NameAssignment_1_in_rule__Member__Group__1__Impl831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group__2__Impl_in_rule__Member__Group__2861 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Member__Group__3_in_rule__Member__Group__2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__SurnameAssignment_2_in_rule__Member__Group__2__Impl891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group__3__Impl_in_rule__Member__Group__3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__GroupAssignment_3_in_rule__Member__Group__3__Impl948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Seminar__Group__0__Impl_in_rule__Seminar__Group__0986 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Seminar__Group__1_in_rule__Seminar__Group__0989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Seminar__Group__0__Impl1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Seminar__Group__1__Impl_in_rule__Seminar__Group__11048 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Seminar__Group__2_in_rule__Seminar__Group__11051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Seminar__TitleAssignment_1_in_rule__Seminar__Group__1__Impl1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Seminar__Group__2__Impl_in_rule__Seminar__Group__21108 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Seminar__Group__3_in_rule__Seminar__Group__21111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Seminar__Group__2__Impl1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Seminar__Group__3__Impl_in_rule__Seminar__Group__31170 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__Seminar__Group__4_in_rule__Seminar__Group__31173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Seminar__OrganizersAssignment_3_in_rule__Seminar__Group__3__Impl1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Seminar__Group__4__Impl_in_rule__Seminar__Group__41230 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__Seminar__Group__5_in_rule__Seminar__Group__41233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Seminar__Group_4__0_in_rule__Seminar__Group__4__Impl1260 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Seminar__Group__5__Impl_in_rule__Seminar__Group__51291 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Seminar__Group__6_in_rule__Seminar__Group__51294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Seminar__Group__5__Impl1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Seminar__Group__6__Impl_in_rule__Seminar__Group__61353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Seminar__Group__7_in_rule__Seminar__Group__61356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Seminar__Group__6__Impl1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Seminar__Group__7__Impl_in_rule__Seminar__Group__71415 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Seminar__Group__8_in_rule__Seminar__Group__71418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_in_rule__Seminar__Group__7__Impl1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Seminar__Group__8__Impl_in_rule__Seminar__Group__81474 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Seminar__Group__9_in_rule__Seminar__Group__81477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Seminar__Group__8__Impl1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Seminar__Group__9__Impl_in_rule__Seminar__Group__91536 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Seminar__Group__10_in_rule__Seminar__Group__91539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HOUR_in_rule__Seminar__Group__9__Impl1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Seminar__Group__10__Impl_in_rule__Seminar__Group__101595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Seminar__TalksAssignment_10_in_rule__Seminar__Group__10__Impl1624 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Seminar__TalksAssignment_10_in_rule__Seminar__Group__10__Impl1636 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Seminar__Group_4__0__Impl_in_rule__Seminar__Group_4__01691 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Seminar__Group_4__1_in_rule__Seminar__Group_4__01694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Seminar__Group_4__0__Impl1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Seminar__Group_4__1__Impl_in_rule__Seminar__Group_4__11753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Seminar__OrganizersAssignment_4_1_in_rule__Seminar__Group_4__1__Impl1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__0__Impl_in_rule__Talk__Group__01814 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Talk__Group__1_in_rule__Talk__Group__01817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Talk__Group__0__Impl1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__1__Impl_in_rule__Talk__Group__11876 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Talk__Group__2_in_rule__Talk__Group__11879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__TitleAssignment_1_in_rule__Talk__Group__1__Impl1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__2__Impl_in_rule__Talk__Group__21936 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Talk__Group__3_in_rule__Talk__Group__21939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Talk__Group__2__Impl1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__3__Impl_in_rule__Talk__Group__31998 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__Talk__Group__4_in_rule__Talk__Group__32001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__PresentersAssignment_3_in_rule__Talk__Group__3__Impl2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__4__Impl_in_rule__Talk__Group__42058 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__Talk__Group__5_in_rule__Talk__Group__42061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group_4__0_in_rule__Talk__Group__4__Impl2088 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Talk__Group__5__Impl_in_rule__Talk__Group__52119 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Talk__Group__6_in_rule__Talk__Group__52122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Talk__Group__5__Impl2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__6__Impl_in_rule__Talk__Group__62181 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Talk__Group__7_in_rule__Talk__Group__62184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Talk__Group__6__Impl2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__7__Impl_in_rule__Talk__Group__72243 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Talk__Group__8_in_rule__Talk__Group__72246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Talk__Group__7__Impl2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__8__Impl_in_rule__Talk__Group__82302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group_8__0_in_rule__Talk__Group__8__Impl2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group_4__0__Impl_in_rule__Talk__Group_4__02378 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Talk__Group_4__1_in_rule__Talk__Group_4__02381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Talk__Group_4__0__Impl2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group_4__1__Impl_in_rule__Talk__Group_4__12440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__PresentersAssignment_4_1_in_rule__Talk__Group_4__1__Impl2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group_8__0__Impl_in_rule__Talk__Group_8__02501 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Talk__Group_8__1_in_rule__Talk__Group_8__02504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Talk__Group_8__0__Impl2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group_8__1__Impl_in_rule__Talk__Group_8__12563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__DurationAssignment_8_1_in_rule__Talk__Group_8__1__Impl2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__DepartmentSeminars__GroupsAssignment_02629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__DepartmentSeminars__UsersAssignment_12660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeminar_in_rule__DepartmentSeminars__SeminarsAssignment_22691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Group__NameAssignment_12722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Group__DescriptionAssignment_22753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Member__NameAssignment_12784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Member__SurnameAssignment_22815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Member__GroupAssignment_32850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Seminar__TitleAssignment_12885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Seminar__OrganizersAssignment_32920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Seminar__OrganizersAssignment_4_12959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTalk_in_rule__Seminar__TalksAssignment_102994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Talk__TitleAssignment_13025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Talk__PresentersAssignment_33060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Talk__PresentersAssignment_4_13099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HOUR_in_rule__Talk__DurationAssignment_8_13134 = new BitSet(new long[]{0x0000000000000002L});

}