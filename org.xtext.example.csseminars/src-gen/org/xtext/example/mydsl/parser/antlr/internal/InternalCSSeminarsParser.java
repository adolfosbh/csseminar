package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.CSSeminarsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCSSeminarsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DATE", "RULE_HOUR", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'group'", "'member'", "'seminar'", "'('", "','", "')'", "'date'", "'duration'", "'talk'", "'abstract'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_HOUR=7;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_DATE=6;
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
    public String getGrammarFileName() { return "../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g"; }



     	private CSSeminarsGrammarAccess grammarAccess;
     	
        public InternalCSSeminarsParser(TokenStream input, CSSeminarsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DepartmentSeminars";	
       	}
       	
       	@Override
       	protected CSSeminarsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDepartmentSeminars"
    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:67:1: entryRuleDepartmentSeminars returns [EObject current=null] : iv_ruleDepartmentSeminars= ruleDepartmentSeminars EOF ;
    public final EObject entryRuleDepartmentSeminars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepartmentSeminars = null;


        try {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:68:2: (iv_ruleDepartmentSeminars= ruleDepartmentSeminars EOF )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:69:2: iv_ruleDepartmentSeminars= ruleDepartmentSeminars EOF
            {
             newCompositeNode(grammarAccess.getDepartmentSeminarsRule()); 
            pushFollow(FOLLOW_ruleDepartmentSeminars_in_entryRuleDepartmentSeminars75);
            iv_ruleDepartmentSeminars=ruleDepartmentSeminars();

            state._fsp--;

             current =iv_ruleDepartmentSeminars; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDepartmentSeminars85); 

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
    // $ANTLR end "entryRuleDepartmentSeminars"


    // $ANTLR start "ruleDepartmentSeminars"
    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:76:1: ruleDepartmentSeminars returns [EObject current=null] : ( ( (lv_groups_0_0= ruleGroup ) )* ( (lv_users_1_0= ruleMember ) )* ( (lv_seminars_2_0= ruleSeminar ) )* ) ;
    public final EObject ruleDepartmentSeminars() throws RecognitionException {
        EObject current = null;

        EObject lv_groups_0_0 = null;

        EObject lv_users_1_0 = null;

        EObject lv_seminars_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:79:28: ( ( ( (lv_groups_0_0= ruleGroup ) )* ( (lv_users_1_0= ruleMember ) )* ( (lv_seminars_2_0= ruleSeminar ) )* ) )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:80:1: ( ( (lv_groups_0_0= ruleGroup ) )* ( (lv_users_1_0= ruleMember ) )* ( (lv_seminars_2_0= ruleSeminar ) )* )
            {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:80:1: ( ( (lv_groups_0_0= ruleGroup ) )* ( (lv_users_1_0= ruleMember ) )* ( (lv_seminars_2_0= ruleSeminar ) )* )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:80:2: ( (lv_groups_0_0= ruleGroup ) )* ( (lv_users_1_0= ruleMember ) )* ( (lv_seminars_2_0= ruleSeminar ) )*
            {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:80:2: ( (lv_groups_0_0= ruleGroup ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:81:1: (lv_groups_0_0= ruleGroup )
            	    {
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:81:1: (lv_groups_0_0= ruleGroup )
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:82:3: lv_groups_0_0= ruleGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDepartmentSeminarsAccess().getGroupsGroupParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGroup_in_ruleDepartmentSeminars131);
            	    lv_groups_0_0=ruleGroup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDepartmentSeminarsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"groups",
            	            		lv_groups_0_0, 
            	            		"Group");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:98:3: ( (lv_users_1_0= ruleMember ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:99:1: (lv_users_1_0= ruleMember )
            	    {
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:99:1: (lv_users_1_0= ruleMember )
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:100:3: lv_users_1_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDepartmentSeminarsAccess().getUsersMemberParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleDepartmentSeminars153);
            	    lv_users_1_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDepartmentSeminarsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"users",
            	            		lv_users_1_0, 
            	            		"Member");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:116:3: ( (lv_seminars_2_0= ruleSeminar ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:117:1: (lv_seminars_2_0= ruleSeminar )
            	    {
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:117:1: (lv_seminars_2_0= ruleSeminar )
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:118:3: lv_seminars_2_0= ruleSeminar
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDepartmentSeminarsAccess().getSeminarsSeminarParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSeminar_in_ruleDepartmentSeminars175);
            	    lv_seminars_2_0=ruleSeminar();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDepartmentSeminarsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"seminars",
            	            		lv_seminars_2_0, 
            	            		"Seminar");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDepartmentSeminars"


    // $ANTLR start "entryRuleGroup"
    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:142:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:143:2: (iv_ruleGroup= ruleGroup EOF )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:144:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup212);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup222); 

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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:151:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:154:28: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:155:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:155:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:155:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleGroup259); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:159:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:160:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:160:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:161:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGroup276); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:177:2: ( (lv_description_2_0= RULE_STRING ) )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:178:1: (lv_description_2_0= RULE_STRING )
            {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:178:1: (lv_description_2_0= RULE_STRING )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:179:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGroup298); 

            			newLeafNode(lv_description_2_0, grammarAccess.getGroupAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleMember"
    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:203:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:204:2: (iv_ruleMember= ruleMember EOF )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:205:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember339);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember349); 

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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:212:1: ruleMember returns [EObject current=null] : (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_surname_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_surname_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:215:28: ( (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_surname_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:216:1: (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_surname_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:216:1: (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_surname_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:216:3: otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_surname_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleMember386); 

                	newLeafNode(otherlv_0, grammarAccess.getMemberAccess().getMemberKeyword_0());
                
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:220:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:221:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:221:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:222:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMember403); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMemberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:238:2: ( (lv_surname_2_0= RULE_ID ) )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:239:1: (lv_surname_2_0= RULE_ID )
            {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:239:1: (lv_surname_2_0= RULE_ID )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:240:3: lv_surname_2_0= RULE_ID
            {
            lv_surname_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMember425); 

            			newLeafNode(lv_surname_2_0, grammarAccess.getMemberAccess().getSurnameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMemberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"surname",
                    		lv_surname_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:256:2: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:257:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:257:1: (otherlv_3= RULE_ID )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:258:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMemberRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMember450); 

            		newLeafNode(otherlv_3, grammarAccess.getMemberAccess().getGroupGroupCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleSeminar"
    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:277:1: entryRuleSeminar returns [EObject current=null] : iv_ruleSeminar= ruleSeminar EOF ;
    public final EObject entryRuleSeminar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeminar = null;


        try {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:278:2: (iv_ruleSeminar= ruleSeminar EOF )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:279:2: iv_ruleSeminar= ruleSeminar EOF
            {
             newCompositeNode(grammarAccess.getSeminarRule()); 
            pushFollow(FOLLOW_ruleSeminar_in_entryRuleSeminar486);
            iv_ruleSeminar=ruleSeminar();

            state._fsp--;

             current =iv_ruleSeminar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSeminar496); 

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
    // $ANTLR end "entryRuleSeminar"


    // $ANTLR start "ruleSeminar"
    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:286:1: ruleSeminar returns [EObject current=null] : (otherlv_0= 'seminar' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'date' this_DATE_8= RULE_DATE otherlv_9= 'duration' this_HOUR_10= RULE_HOUR ( (lv_talks_11_0= ruleTalk ) )+ ) ;
    public final EObject ruleSeminar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_DATE_8=null;
        Token otherlv_9=null;
        Token this_HOUR_10=null;
        EObject lv_talks_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:289:28: ( (otherlv_0= 'seminar' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'date' this_DATE_8= RULE_DATE otherlv_9= 'duration' this_HOUR_10= RULE_HOUR ( (lv_talks_11_0= ruleTalk ) )+ ) )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:290:1: (otherlv_0= 'seminar' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'date' this_DATE_8= RULE_DATE otherlv_9= 'duration' this_HOUR_10= RULE_HOUR ( (lv_talks_11_0= ruleTalk ) )+ )
            {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:290:1: (otherlv_0= 'seminar' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'date' this_DATE_8= RULE_DATE otherlv_9= 'duration' this_HOUR_10= RULE_HOUR ( (lv_talks_11_0= ruleTalk ) )+ )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:290:3: otherlv_0= 'seminar' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'date' this_DATE_8= RULE_DATE otherlv_9= 'duration' this_HOUR_10= RULE_HOUR ( (lv_talks_11_0= ruleTalk ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSeminar533); 

                	newLeafNode(otherlv_0, grammarAccess.getSeminarAccess().getSeminarKeyword_0());
                
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:294:1: ( (lv_title_1_0= RULE_ID ) )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:295:1: (lv_title_1_0= RULE_ID )
            {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:295:1: (lv_title_1_0= RULE_ID )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:296:3: lv_title_1_0= RULE_ID
            {
            lv_title_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSeminar550); 

            			newLeafNode(lv_title_1_0, grammarAccess.getSeminarAccess().getTitleIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSeminarRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSeminar567); 

                	newLeafNode(otherlv_2, grammarAccess.getSeminarAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:316:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:317:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:317:1: (otherlv_3= RULE_ID )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:318:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSeminarRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSeminar587); 

            		newLeafNode(otherlv_3, grammarAccess.getSeminarAccess().getOrganizersMemberCrossReference_3_0()); 
            	

            }


            }

            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:329:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:329:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSeminar600); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSeminarAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:333:1: ( (otherlv_5= RULE_ID ) )
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:334:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:334:1: (otherlv_5= RULE_ID )
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:335:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSeminarRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSeminar620); 

            	    		newLeafNode(otherlv_5, grammarAccess.getSeminarAccess().getOrganizersMemberCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleSeminar634); 

                	newLeafNode(otherlv_6, grammarAccess.getSeminarAccess().getRightParenthesisKeyword_5());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleSeminar646); 

                	newLeafNode(otherlv_7, grammarAccess.getSeminarAccess().getDateKeyword_6());
                
            this_DATE_8=(Token)match(input,RULE_DATE,FOLLOW_RULE_DATE_in_ruleSeminar657); 
             
                newLeafNode(this_DATE_8, grammarAccess.getSeminarAccess().getDATETerminalRuleCall_7()); 
                
            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleSeminar668); 

                	newLeafNode(otherlv_9, grammarAccess.getSeminarAccess().getDurationKeyword_8());
                
            this_HOUR_10=(Token)match(input,RULE_HOUR,FOLLOW_RULE_HOUR_in_ruleSeminar679); 
             
                newLeafNode(this_HOUR_10, grammarAccess.getSeminarAccess().getHOURTerminalRuleCall_9()); 
                
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:366:1: ( (lv_talks_11_0= ruleTalk ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:367:1: (lv_talks_11_0= ruleTalk )
            	    {
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:367:1: (lv_talks_11_0= ruleTalk )
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:368:3: lv_talks_11_0= ruleTalk
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSeminarAccess().getTalksTalkParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTalk_in_ruleSeminar699);
            	    lv_talks_11_0=ruleTalk();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSeminarRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"talks",
            	            		lv_talks_11_0, 
            	            		"Talk");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSeminar"


    // $ANTLR start "entryRuleTalk"
    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:392:1: entryRuleTalk returns [EObject current=null] : iv_ruleTalk= ruleTalk EOF ;
    public final EObject entryRuleTalk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTalk = null;


        try {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:393:2: (iv_ruleTalk= ruleTalk EOF )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:394:2: iv_ruleTalk= ruleTalk EOF
            {
             newCompositeNode(grammarAccess.getTalkRule()); 
            pushFollow(FOLLOW_ruleTalk_in_entryRuleTalk736);
            iv_ruleTalk=ruleTalk();

            state._fsp--;

             current =iv_ruleTalk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTalk746); 

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
    // $ANTLR end "entryRuleTalk"


    // $ANTLR start "ruleTalk"
    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:401:1: ruleTalk returns [EObject current=null] : (otherlv_0= 'talk' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'abstract' this_STRING_8= RULE_STRING (otherlv_9= 'duration' ( (lv_duration_10_0= RULE_HOUR ) ) )? ) ;
    public final EObject ruleTalk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_STRING_8=null;
        Token otherlv_9=null;
        Token lv_duration_10_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:404:28: ( (otherlv_0= 'talk' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'abstract' this_STRING_8= RULE_STRING (otherlv_9= 'duration' ( (lv_duration_10_0= RULE_HOUR ) ) )? ) )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:405:1: (otherlv_0= 'talk' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'abstract' this_STRING_8= RULE_STRING (otherlv_9= 'duration' ( (lv_duration_10_0= RULE_HOUR ) ) )? )
            {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:405:1: (otherlv_0= 'talk' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'abstract' this_STRING_8= RULE_STRING (otherlv_9= 'duration' ( (lv_duration_10_0= RULE_HOUR ) ) )? )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:405:3: otherlv_0= 'talk' ( (lv_title_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' otherlv_7= 'abstract' this_STRING_8= RULE_STRING (otherlv_9= 'duration' ( (lv_duration_10_0= RULE_HOUR ) ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleTalk783); 

                	newLeafNode(otherlv_0, grammarAccess.getTalkAccess().getTalkKeyword_0());
                
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:409:1: ( (lv_title_1_0= RULE_ID ) )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:410:1: (lv_title_1_0= RULE_ID )
            {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:410:1: (lv_title_1_0= RULE_ID )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:411:3: lv_title_1_0= RULE_ID
            {
            lv_title_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTalk800); 

            			newLeafNode(lv_title_1_0, grammarAccess.getTalkAccess().getTitleIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTalkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleTalk817); 

                	newLeafNode(otherlv_2, grammarAccess.getTalkAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:431:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:432:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:432:1: (otherlv_3= RULE_ID )
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:433:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTalkRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTalk837); 

            		newLeafNode(otherlv_3, grammarAccess.getTalkAccess().getPresentersMemberCrossReference_3_0()); 
            	

            }


            }

            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:444:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:444:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleTalk850); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTalkAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:448:1: ( (otherlv_5= RULE_ID ) )
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:449:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:449:1: (otherlv_5= RULE_ID )
            	    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:450:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTalkRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTalk870); 

            	    		newLeafNode(otherlv_5, grammarAccess.getTalkAccess().getPresentersMemberCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleTalk884); 

                	newLeafNode(otherlv_6, grammarAccess.getTalkAccess().getRightParenthesisKeyword_5());
                
            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleTalk896); 

                	newLeafNode(otherlv_7, grammarAccess.getTalkAccess().getAbstractKeyword_6());
                
            this_STRING_8=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTalk907); 
             
                newLeafNode(this_STRING_8, grammarAccess.getTalkAccess().getSTRINGTerminalRuleCall_7()); 
                
            // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:473:1: (otherlv_9= 'duration' ( (lv_duration_10_0= RULE_HOUR ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:473:3: otherlv_9= 'duration' ( (lv_duration_10_0= RULE_HOUR ) )
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleTalk919); 

                        	newLeafNode(otherlv_9, grammarAccess.getTalkAccess().getDurationKeyword_8_0());
                        
                    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:477:1: ( (lv_duration_10_0= RULE_HOUR ) )
                    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:478:1: (lv_duration_10_0= RULE_HOUR )
                    {
                    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:478:1: (lv_duration_10_0= RULE_HOUR )
                    // ../org.xtext.example.csseminars/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalCSSeminars.g:479:3: lv_duration_10_0= RULE_HOUR
                    {
                    lv_duration_10_0=(Token)match(input,RULE_HOUR,FOLLOW_RULE_HOUR_in_ruleTalk936); 

                    			newLeafNode(lv_duration_10_0, grammarAccess.getTalkAccess().getDurationHOURTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTalkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"duration",
                            		lv_duration_10_0, 
                            		"HOUR");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTalk"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDepartmentSeminars_in_entryRuleDepartmentSeminars75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDepartmentSeminars85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleDepartmentSeminars131 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_ruleMember_in_ruleDepartmentSeminars153 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_ruleSeminar_in_ruleDepartmentSeminars175 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGroup259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGroup276 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGroup298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMember386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMember403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMember425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMember450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeminar_in_entryRuleSeminar486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSeminar496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSeminar533 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSeminar550 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSeminar567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSeminar587 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleSeminar600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSeminar620 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleSeminar634 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSeminar646 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_DATE_in_ruleSeminar657 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSeminar668 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_HOUR_in_ruleSeminar679 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleTalk_in_ruleSeminar699 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleTalk_in_entryRuleTalk736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTalk746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTalk783 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTalk800 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTalk817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTalk837 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleTalk850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTalk870 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleTalk884 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTalk896 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTalk907 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleTalk919 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_HOUR_in_ruleTalk936 = new BitSet(new long[]{0x0000000000000002L});

}