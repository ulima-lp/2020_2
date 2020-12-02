// Generated from H:/ULIMA/2020_2/LP/624/clases/2020_2/interpretacion/InterpreteCaja\Caja.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CajaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SS_ABONO=1, SS_RESTA=2, SS_FIN_SENTENCIA=3, L_NUMEROS=4, IGNORED_CHARS=5;
	public static final int
		RULE_root = 0, RULE_sentencia_apertura = 1, RULE_sentencia_operacion = 2, 
		RULE_operacion = 3, RULE_fin = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "sentencia_apertura", "sentencia_operacion", "operacion", "fin"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SS_ABONO", "SS_RESTA", "SS_FIN_SENTENCIA", "L_NUMEROS", "IGNORED_CHARS"
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
	public String getGrammarFileName() { return "Caja.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    int caja = 0;

	public CajaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public Sentencia_aperturaContext sentencia_apertura() {
			return getRuleContext(Sentencia_aperturaContext.class,0);
		}
		public List<Sentencia_operacionContext> sentencia_operacion() {
			return getRuleContexts(Sentencia_operacionContext.class);
		}
		public Sentencia_operacionContext sentencia_operacion(int i) {
			return getRuleContext(Sentencia_operacionContext.class,i);
		}
		public FinContext fin() {
			return getRuleContext(FinContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CajaListener ) ((CajaListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CajaListener ) ((CajaListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CajaVisitor ) return ((CajaVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			sentencia_apertura();
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==L_NUMEROS) {
				{
				{
				setState(11);
				sentencia_operacion();
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(17);
				fin();
				}
				break;
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

	public static class Sentencia_aperturaContext extends ParserRuleContext {
		public Token L_NUMEROS;
		public TerminalNode L_NUMEROS() { return getToken(CajaParser.L_NUMEROS, 0); }
		public TerminalNode SS_FIN_SENTENCIA() { return getToken(CajaParser.SS_FIN_SENTENCIA, 0); }
		public Sentencia_aperturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_apertura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CajaListener ) ((CajaListener)listener).enterSentencia_apertura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CajaListener ) ((CajaListener)listener).exitSentencia_apertura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CajaVisitor ) return ((CajaVisitor<? extends T>)visitor).visitSentencia_apertura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_aperturaContext sentencia_apertura() throws RecognitionException {
		Sentencia_aperturaContext _localctx = new Sentencia_aperturaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia_apertura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			((Sentencia_aperturaContext)_localctx).L_NUMEROS = match(L_NUMEROS);
			setState(21);
			match(SS_FIN_SENTENCIA);

			    caja = Integer.parseInt((((Sentencia_aperturaContext)_localctx).L_NUMEROS!=null?((Sentencia_aperturaContext)_localctx).L_NUMEROS.getText():null));

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

	public static class Sentencia_operacionContext extends ParserRuleContext {
		public Token L_NUMEROS;
		public OperacionContext operacion;
		public TerminalNode L_NUMEROS() { return getToken(CajaParser.L_NUMEROS, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode SS_FIN_SENTENCIA() { return getToken(CajaParser.SS_FIN_SENTENCIA, 0); }
		public TerminalNode EOF() { return getToken(CajaParser.EOF, 0); }
		public Sentencia_operacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CajaListener ) ((CajaListener)listener).enterSentencia_operacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CajaListener ) ((CajaListener)listener).exitSentencia_operacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CajaVisitor ) return ((CajaVisitor<? extends T>)visitor).visitSentencia_operacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_operacionContext sentencia_operacion() throws RecognitionException {
		Sentencia_operacionContext _localctx = new Sentencia_operacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencia_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((Sentencia_operacionContext)_localctx).L_NUMEROS = match(L_NUMEROS);
			setState(25);
			((Sentencia_operacionContext)_localctx).operacion = operacion();
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SS_FIN_SENTENCIA:
				{
				setState(26);
				match(SS_FIN_SENTENCIA);

				        if (((Sentencia_operacionContext)_localctx).operacion.op.equals("+")){
				            caja += Integer.parseInt((((Sentencia_operacionContext)_localctx).L_NUMEROS!=null?((Sentencia_operacionContext)_localctx).L_NUMEROS.getText():null));
				        } else {
				            caja -= Integer.parseInt((((Sentencia_operacionContext)_localctx).L_NUMEROS!=null?((Sentencia_operacionContext)_localctx).L_NUMEROS.getText():null));
				        }
				    
				}
				break;
			case EOF:
				{
				setState(28);
				match(EOF);

				        if (((Sentencia_operacionContext)_localctx).operacion.op.equals("+")){
				            caja += Integer.parseInt((((Sentencia_operacionContext)_localctx).L_NUMEROS!=null?((Sentencia_operacionContext)_localctx).L_NUMEROS.getText():null));
				        } else {
				            caja -= Integer.parseInt((((Sentencia_operacionContext)_localctx).L_NUMEROS!=null?((Sentencia_operacionContext)_localctx).L_NUMEROS.getText():null));
				        }
				        System.out.println("Caja Total : " + caja);
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OperacionContext extends ParserRuleContext {
		public String op;
		public TerminalNode SS_ABONO() { return getToken(CajaParser.SS_ABONO, 0); }
		public TerminalNode SS_RESTA() { return getToken(CajaParser.SS_RESTA, 0); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CajaListener ) ((CajaListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CajaListener ) ((CajaListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CajaVisitor ) return ((CajaVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operacion);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SS_ABONO:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(SS_ABONO);

				    ((OperacionContext)_localctx).op =  "+";

				}
				break;
			case SS_RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(SS_RESTA);

				    ((OperacionContext)_localctx).op =  "-";

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

	public static class FinContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CajaParser.EOF, 0); }
		public FinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CajaListener ) ((CajaListener)listener).enterFin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CajaListener ) ((CajaListener)listener).exitFin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CajaVisitor ) return ((CajaVisitor<? extends T>)visitor).visitFin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinContext fin() throws RecognitionException {
		FinContext _localctx = new FinContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(EOF);

			    System.out.println("Caja Total : " + caja);

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7,\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\2\5\2"+
		"\25\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4!\n\4\3\5\3\5\3\5\3"+
		"\5\5\5\'\n\5\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\2*\2\f\3\2\2\2\4\26\3"+
		"\2\2\2\6\32\3\2\2\2\b&\3\2\2\2\n(\3\2\2\2\f\20\5\4\3\2\r\17\5\6\4\2\16"+
		"\r\3\2\2\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\24\3\2\2\2\22"+
		"\20\3\2\2\2\23\25\5\n\6\2\24\23\3\2\2\2\24\25\3\2\2\2\25\3\3\2\2\2\26"+
		"\27\7\6\2\2\27\30\7\5\2\2\30\31\b\3\1\2\31\5\3\2\2\2\32\33\7\6\2\2\33"+
		" \5\b\5\2\34\35\7\5\2\2\35!\b\4\1\2\36\37\7\2\2\3\37!\b\4\1\2 \34\3\2"+
		"\2\2 \36\3\2\2\2!\7\3\2\2\2\"#\7\3\2\2#\'\b\5\1\2$%\7\4\2\2%\'\b\5\1\2"+
		"&\"\3\2\2\2&$\3\2\2\2\'\t\3\2\2\2()\7\2\2\3)*\b\6\1\2*\13\3\2\2\2\6\20"+
		"\24 &";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}