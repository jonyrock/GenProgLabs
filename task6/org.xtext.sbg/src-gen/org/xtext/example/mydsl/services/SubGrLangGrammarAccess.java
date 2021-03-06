/*
* generated by Xtext
*/
package org.xtext.example.mydsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SubGrLangGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cPersonsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cPersonsPersonParserRuleCall_0 = (RuleCall)cPersonsAssignment.eContents().get(0);
		
		//Model:
		//	persons+=Person*;
		public ParserRule getRule() { return rule; }

		//persons+=Person*
		public Assignment getPersonsAssignment() { return cPersonsAssignment; }

		//Person
		public RuleCall getPersonsPersonParserRuleCall_0() { return cPersonsPersonParserRuleCall_0; }
	}

	public class PersonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Person");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPersonKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cFollowingAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFollowingFollowRecordParserRuleCall_2_0 = (RuleCall)cFollowingAssignment_2.eContents().get(0);
		
		//Person:
		//	"Person" name=ID following+=FollowRecord*;
		public ParserRule getRule() { return rule; }

		//"Person" name=ID following+=FollowRecord*
		public Group getGroup() { return cGroup; }

		//"Person"
		public Keyword getPersonKeyword_0() { return cPersonKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//following+=FollowRecord*
		public Assignment getFollowingAssignment_2() { return cFollowingAssignment_2; }

		//FollowRecord
		public RuleCall getFollowingFollowRecordParserRuleCall_2_0() { return cFollowingFollowRecordParserRuleCall_2_0; }
	}

	public class FollowRecordElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FollowRecord");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFollowKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPersonAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPersonPersonCrossReference_1_0 = (CrossReference)cPersonAssignment_1.eContents().get(0);
		private final RuleCall cPersonPersonIDTerminalRuleCall_1_0_1 = (RuleCall)cPersonPersonCrossReference_1_0.eContents().get(1);
		
		//FollowRecord:
		//	"follow" person=[Person];
		public ParserRule getRule() { return rule; }

		//"follow" person=[Person]
		public Group getGroup() { return cGroup; }

		//"follow"
		public Keyword getFollowKeyword_0() { return cFollowKeyword_0; }

		//person=[Person]
		public Assignment getPersonAssignment_1() { return cPersonAssignment_1; }

		//[Person]
		public CrossReference getPersonPersonCrossReference_1_0() { return cPersonPersonCrossReference_1_0; }

		//ID
		public RuleCall getPersonPersonIDTerminalRuleCall_1_0_1() { return cPersonPersonIDTerminalRuleCall_1_0_1; }
	}
	
	
	private ModelElements pModel;
	private PersonElements pPerson;
	private FollowRecordElements pFollowRecord;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public SubGrLangGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.SubGrLang".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	persons+=Person*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Person:
	//	"Person" name=ID following+=FollowRecord*;
	public PersonElements getPersonAccess() {
		return (pPerson != null) ? pPerson : (pPerson = new PersonElements());
	}
	
	public ParserRule getPersonRule() {
		return getPersonAccess().getRule();
	}

	//FollowRecord:
	//	"follow" person=[Person];
	public FollowRecordElements getFollowRecordAccess() {
		return (pFollowRecord != null) ? pFollowRecord : (pFollowRecord = new FollowRecordElements());
	}
	
	public ParserRule getFollowRecordRule() {
		return getFollowRecordAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
