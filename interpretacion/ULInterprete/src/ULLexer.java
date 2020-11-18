// Generated from H:/ULIMA/2020_2/LP/624/clases/2020_2/interpretacion/ULInterprete\UL.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ULLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_PROGRAM=1, KW_VAR=2, KW_PRINT=3, SS_START_BRACE=4, SS_END_BRACE=5, 
		SS_ASSIGNMENT_OPERATOR=6, SS_END_STATEMENT=7, I_VARIABLE_NAME=8, L_ENTEROS=9, 
		IGNORED_CHARACTERS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"KW_PROGRAM", "KW_VAR", "KW_PRINT", "SS_START_BRACE", "SS_END_BRACE", 
			"SS_ASSIGNMENT_OPERATOR", "SS_END_STATEMENT", "I_VARIABLE_NAME", "L_ENTEROS", 
			"IGNORED_CHARACTERS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'variable'", "'mostrar'", "'{'", "'}'", "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KW_PROGRAM", "KW_VAR", "KW_PRINT", "SS_START_BRACE", "SS_END_BRACE", 
			"SS_ASSIGNMENT_OPERATOR", "SS_END_STATEMENT", "I_VARIABLE_NAME", "L_ENTEROS", 
			"IGNORED_CHARACTERS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ULLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fQ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\7\t<\n\t\f\t\16\t?\13\t\3\n\3\n\3\n\7\nD\n\n\f\n\16\nG\13\n\5"+
		"\nI\n\n\3\13\6\13L\n\13\r\13\16\13M\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\3\2\7\4\2C\\c|\6\2\62;C\\aac|\3\2\63;\3\2"+
		"\62;\5\2\13\f\17\17\"\"\2T\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\3\27\3\2\2\2\5 \3\2\2\2\7)\3\2\2\2\t\61\3\2\2\2\13\63\3\2"+
		"\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23H\3\2\2\2\25K\3\2\2\2\27"+
		"\30\7r\2\2\30\31\7t\2\2\31\32\7q\2\2\32\33\7i\2\2\33\34\7t\2\2\34\35\7"+
		"c\2\2\35\36\7o\2\2\36\37\7c\2\2\37\4\3\2\2\2 !\7x\2\2!\"\7c\2\2\"#\7t"+
		"\2\2#$\7k\2\2$%\7c\2\2%&\7d\2\2&\'\7n\2\2\'(\7g\2\2(\6\3\2\2\2)*\7o\2"+
		"\2*+\7q\2\2+,\7u\2\2,-\7v\2\2-.\7t\2\2./\7c\2\2/\60\7t\2\2\60\b\3\2\2"+
		"\2\61\62\7}\2\2\62\n\3\2\2\2\63\64\7\177\2\2\64\f\3\2\2\2\65\66\7?\2\2"+
		"\66\16\3\2\2\2\678\7=\2\28\20\3\2\2\29=\t\2\2\2:<\t\3\2\2;:\3\2\2\2<?"+
		"\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\22\3\2\2\2?=\3\2\2\2@I\7\62\2\2AE\t\4\2"+
		"\2BD\t\5\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FI\3\2\2\2GE\3\2\2"+
		"\2H@\3\2\2\2HA\3\2\2\2I\24\3\2\2\2JL\t\6\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2"+
		"\2\2MN\3\2\2\2NO\3\2\2\2OP\b\13\2\2P\26\3\2\2\2\7\2=EHM\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}