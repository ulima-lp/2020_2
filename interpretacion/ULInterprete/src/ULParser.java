// Generated from H:/ULIMA/2020_2/LP/624/clases/2020_2/interpretacion/ULInterprete\UL.g4 by ANTLR 4.8

    import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ULParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_PROGRAM=1, KW_VAR=2, KW_PRINT=3, SS_START_BRACE=4, SS_END_BRACE=5, 
		SS_ASSIGNMENT_OPERATOR=6, SS_END_STATEMENT=7, I_VARIABLE_NAME=8, L_ENTEROS=9, 
		IGNORED_CHARACTERS=10;
	public static final int
		RULE_root = 0, RULE_cuerpo = 1, RULE_sentencia = 2, RULE_sentencia_definicion = 3, 
		RULE_sentencia_asignacion = 4, RULE_sentencia_visualizacion = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "cuerpo", "sentencia", "sentencia_definicion", "sentencia_asignacion", 
			"sentencia_visualizacion"
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

	@Override
	public String getGrammarFileName() { return "UL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    HashMap<String, Object> tablaSimbolos = new HashMap<>();

	public ULParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode KW_PROGRAM() { return getToken(ULParser.KW_PROGRAM, 0); }
		public TerminalNode I_VARIABLE_NAME() { return getToken(ULParser.I_VARIABLE_NAME, 0); }
		public TerminalNode SS_START_BRACE() { return getToken(ULParser.SS_START_BRACE, 0); }
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public TerminalNode SS_END_BRACE() { return getToken(ULParser.SS_END_BRACE, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ULListener ) ((ULListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ULListener ) ((ULListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ULVisitor ) return ((ULVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(KW_PROGRAM);
			setState(13);
			match(I_VARIABLE_NAME);
			setState(14);
			match(SS_START_BRACE);
			setState(15);
			cuerpo();
			setState(16);
			match(SS_END_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CuerpoContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public CuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ULListener ) ((ULListener)listener).enterCuerpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ULListener ) ((ULListener)listener).exitCuerpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ULVisitor ) return ((ULVisitor<? extends T>)visitor).visitCuerpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoContext cuerpo() throws RecognitionException {
		CuerpoContext _localctx = new CuerpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cuerpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_VAR) | (1L << KW_PRINT) | (1L << I_VARIABLE_NAME))) != 0)) {
				{
				{
				setState(18);
				sentencia();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciaContext extends ParserRuleContext {
		public Sentencia_definicionContext sentencia_definicion() {
			return getRuleContext(Sentencia_definicionContext.class,0);
		}
		public Sentencia_asignacionContext sentencia_asignacion() {
			return getRuleContext(Sentencia_asignacionContext.class,0);
		}
		public Sentencia_visualizacionContext sentencia_visualizacion() {
			return getRuleContext(Sentencia_visualizacionContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ULListener ) ((ULListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ULListener ) ((ULListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ULVisitor ) return ((ULVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencia);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				sentencia_definicion();
				}
				break;
			case I_VARIABLE_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				sentencia_asignacion();
				}
				break;
			case KW_PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				sentencia_visualizacion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentencia_definicionContext extends ParserRuleContext {
		public Token I_VARIABLE_NAME;
		public TerminalNode KW_VAR() { return getToken(ULParser.KW_VAR, 0); }
		public TerminalNode I_VARIABLE_NAME() { return getToken(ULParser.I_VARIABLE_NAME, 0); }
		public TerminalNode SS_END_STATEMENT() { return getToken(ULParser.SS_END_STATEMENT, 0); }
		public Sentencia_definicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_definicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ULListener ) ((ULListener)listener).enterSentencia_definicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ULListener ) ((ULListener)listener).exitSentencia_definicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ULVisitor ) return ((ULVisitor<? extends T>)visitor).visitSentencia_definicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_definicionContext sentencia_definicion() throws RecognitionException {
		Sentencia_definicionContext _localctx = new Sentencia_definicionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentencia_definicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(KW_VAR);
			setState(30);
			((Sentencia_definicionContext)_localctx).I_VARIABLE_NAME = match(I_VARIABLE_NAME);
			setState(31);
			match(SS_END_STATEMENT);

			    tablaSimbolos.put((((Sentencia_definicionContext)_localctx).I_VARIABLE_NAME!=null?((Sentencia_definicionContext)_localctx).I_VARIABLE_NAME.getText():null), null);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentencia_asignacionContext extends ParserRuleContext {
		public Token I_VARIABLE_NAME;
		public Token L_ENTEROS;
		public TerminalNode I_VARIABLE_NAME() { return getToken(ULParser.I_VARIABLE_NAME, 0); }
		public TerminalNode SS_ASSIGNMENT_OPERATOR() { return getToken(ULParser.SS_ASSIGNMENT_OPERATOR, 0); }
		public TerminalNode L_ENTEROS() { return getToken(ULParser.L_ENTEROS, 0); }
		public TerminalNode SS_END_STATEMENT() { return getToken(ULParser.SS_END_STATEMENT, 0); }
		public Sentencia_asignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ULListener ) ((ULListener)listener).enterSentencia_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ULListener ) ((ULListener)listener).exitSentencia_asignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ULVisitor ) return ((ULVisitor<? extends T>)visitor).visitSentencia_asignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_asignacionContext sentencia_asignacion() throws RecognitionException {
		Sentencia_asignacionContext _localctx = new Sentencia_asignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			((Sentencia_asignacionContext)_localctx).I_VARIABLE_NAME = match(I_VARIABLE_NAME);
			setState(35);
			match(SS_ASSIGNMENT_OPERATOR);
			setState(36);
			((Sentencia_asignacionContext)_localctx).L_ENTEROS = match(L_ENTEROS);
			setState(37);
			match(SS_END_STATEMENT);

			    tablaSimbolos.put((((Sentencia_asignacionContext)_localctx).I_VARIABLE_NAME!=null?((Sentencia_asignacionContext)_localctx).I_VARIABLE_NAME.getText():null), Integer.parseInt((((Sentencia_asignacionContext)_localctx).L_ENTEROS!=null?((Sentencia_asignacionContext)_localctx).L_ENTEROS.getText():null)));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentencia_visualizacionContext extends ParserRuleContext {
		public Token I_VARIABLE_NAME;
		public TerminalNode KW_PRINT() { return getToken(ULParser.KW_PRINT, 0); }
		public TerminalNode I_VARIABLE_NAME() { return getToken(ULParser.I_VARIABLE_NAME, 0); }
		public TerminalNode SS_END_STATEMENT() { return getToken(ULParser.SS_END_STATEMENT, 0); }
		public Sentencia_visualizacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_visualizacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ULListener ) ((ULListener)listener).enterSentencia_visualizacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ULListener ) ((ULListener)listener).exitSentencia_visualizacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ULVisitor ) return ((ULVisitor<? extends T>)visitor).visitSentencia_visualizacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_visualizacionContext sentencia_visualizacion() throws RecognitionException {
		Sentencia_visualizacionContext _localctx = new Sentencia_visualizacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentencia_visualizacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(KW_PRINT);
			setState(41);
			((Sentencia_visualizacionContext)_localctx).I_VARIABLE_NAME = match(I_VARIABLE_NAME);
			setState(42);
			match(SS_END_STATEMENT);

			    System.out.println(tablaSimbolos.get((((Sentencia_visualizacionContext)_localctx).I_VARIABLE_NAME!=null?((Sentencia_visualizacionContext)_localctx).I_VARIABLE_NAME.getText():null)));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f\60\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3\26"+
		"\n\3\f\3\16\3\31\13\3\3\4\3\4\3\4\5\4\36\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2,\2"+
		"\16\3\2\2\2\4\27\3\2\2\2\6\35\3\2\2\2\b\37\3\2\2\2\n$\3\2\2\2\f*\3\2\2"+
		"\2\16\17\7\3\2\2\17\20\7\n\2\2\20\21\7\6\2\2\21\22\5\4\3\2\22\23\7\7\2"+
		"\2\23\3\3\2\2\2\24\26\5\6\4\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2"+
		"\2\27\30\3\2\2\2\30\5\3\2\2\2\31\27\3\2\2\2\32\36\5\b\5\2\33\36\5\n\6"+
		"\2\34\36\5\f\7\2\35\32\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\7\3\2\2"+
		"\2\37 \7\4\2\2 !\7\n\2\2!\"\7\t\2\2\"#\b\5\1\2#\t\3\2\2\2$%\7\n\2\2%&"+
		"\7\b\2\2&\'\7\13\2\2\'(\7\t\2\2()\b\6\1\2)\13\3\2\2\2*+\7\5\2\2+,\7\n"+
		"\2\2,-\7\t\2\2-.\b\7\1\2.\r\3\2\2\2\4\27\35";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}