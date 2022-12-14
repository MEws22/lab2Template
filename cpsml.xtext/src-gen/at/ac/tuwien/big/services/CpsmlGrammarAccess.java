/*
 * generated by Xtext 2.22.0
 */
package at.ac.tuwien.big.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class CpsmlGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class CPSElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "at.ac.tuwien.big.Cpsml.CPS");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCPSKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//CPS:
		//	'CPS'
		//	name=EString
		//	'{'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'CPS' name=EString '{' '}'
		public Group getGroup() { return cGroup; }
		
		//'CPS'
		public Keyword getCPSKeyword_0() { return cCPSKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "at.ac.tuwien.big.Cpsml.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class EFloatElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "at.ac.tuwien.big.Cpsml.EFloat");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_4_0 = (Alternatives)cGroup_4.eContents().get(0);
		private final Keyword cEKeyword_4_0_0 = (Keyword)cAlternatives_4_0.eContents().get(0);
		private final Keyword cEKeyword_4_0_1 = (Keyword)cAlternatives_4_0.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_4_2 = (RuleCall)cGroup_4.eContents().get(2);
		
		//EFloat ecore::EFloat:
		//	'-'? INT? '.' INT (('E' | 'e') '-'? INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT? '.' INT (('E' | 'e') '-'? INT)?
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//'.'
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_3() { return cINTTerminalRuleCall_3; }
		
		//(('E' | 'e') '-'? INT)?
		public Group getGroup_4() { return cGroup_4; }
		
		//('E' | 'e')
		public Alternatives getAlternatives_4_0() { return cAlternatives_4_0; }
		
		//'E'
		public Keyword getEKeyword_4_0_0() { return cEKeyword_4_0_0; }
		
		//'e'
		public Keyword getEKeyword_4_0_1() { return cEKeyword_4_0_1; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_4_1() { return cHyphenMinusKeyword_4_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_4_2() { return cINTTerminalRuleCall_4_2; }
	}
	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "at.ac.tuwien.big.Cpsml.EBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EBoolean ecore::EBoolean:
		//	'true' | 'false';
		@Override public ParserRule getRule() { return rule; }
		
		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "at.ac.tuwien.big.Cpsml.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt ecore::EInt:
		//	'-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	
	public class DataTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "at.ac.tuwien.big.Cpsml.DataType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cNULLEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cNULLNULLKeyword_0_0 = (Keyword)cNULLEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cBOOLEANEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cBOOLEANBOOLEANKeyword_1_0 = (Keyword)cBOOLEANEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cINTEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cINTINTKeyword_2_0 = (Keyword)cINTEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cSTRINGEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cSTRINGSTRINGKeyword_3_0 = (Keyword)cSTRINGEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum DataType:
		//	NULL | BOOLEAN | INT | STRING;
		public EnumRule getRule() { return rule; }
		
		//NULL | BOOLEAN | INT | STRING
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//NULL
		public EnumLiteralDeclaration getNULLEnumLiteralDeclaration_0() { return cNULLEnumLiteralDeclaration_0; }
		
		//'NULL'
		public Keyword getNULLNULLKeyword_0_0() { return cNULLNULLKeyword_0_0; }
		
		//BOOLEAN
		public EnumLiteralDeclaration getBOOLEANEnumLiteralDeclaration_1() { return cBOOLEANEnumLiteralDeclaration_1; }
		
		//'BOOLEAN'
		public Keyword getBOOLEANBOOLEANKeyword_1_0() { return cBOOLEANBOOLEANKeyword_1_0; }
		
		//INT
		public EnumLiteralDeclaration getINTEnumLiteralDeclaration_2() { return cINTEnumLiteralDeclaration_2; }
		
		//'INT'
		public Keyword getINTINTKeyword_2_0() { return cINTINTKeyword_2_0; }
		
		//STRING
		public EnumLiteralDeclaration getSTRINGEnumLiteralDeclaration_3() { return cSTRINGEnumLiteralDeclaration_3; }
		
		//'STRING'
		public Keyword getSTRINGSTRINGKeyword_3_0() { return cSTRINGSTRINGKeyword_3_0; }
	}
	
	private final CPSElements pCPS;
	private final DataTypeElements eDataType;
	private final EStringElements pEString;
	private final EFloatElements pEFloat;
	private final EBooleanElements pEBoolean;
	private final EIntElements pEInt;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CpsmlGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pCPS = new CPSElements();
		this.eDataType = new DataTypeElements();
		this.pEString = new EStringElements();
		this.pEFloat = new EFloatElements();
		this.pEBoolean = new EBooleanElements();
		this.pEInt = new EIntElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("at.ac.tuwien.big.Cpsml".equals(grammar.getName())) {
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
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//CPS:
	//	'CPS'
	//	name=EString
	//	'{'
	//	'}';
	public CPSElements getCPSAccess() {
		return pCPS;
	}
	
	public ParserRule getCPSRule() {
		return getCPSAccess().getRule();
	}
	
	//enum DataType:
	//	NULL | BOOLEAN | INT | STRING;
	public DataTypeElements getDataTypeAccess() {
		return eDataType;
	}
	
	public EnumRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//EFloat ecore::EFloat:
	//	'-'? INT? '.' INT (('E' | 'e') '-'? INT)?;
	public EFloatElements getEFloatAccess() {
		return pEFloat;
	}
	
	public ParserRule getEFloatRule() {
		return getEFloatAccess().getRule();
	}
	
	//EBoolean ecore::EBoolean:
	//	'true' | 'false';
	public EBooleanElements getEBooleanAccess() {
		return pEBoolean;
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
