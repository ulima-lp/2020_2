// Generated from H:/ULIMA/2020_2/LP/602/ejercicios_interpretes/Ejercicio2\Ejercicio2.g4 by ANTLR 4.8

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
public class Ejercicio2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SS_INICIO_SENTENCIA=1, SS_FIN_SENTENCIA=2, SS_OP_SUMAR=3, SS_OP_RESTAR=4, 
		SS_OP_MULTIPLICAR=5, SS_OP_DIVIDIR=6, KW_PRINT=7, I_VARIABLE=8, L_ENTEROS=9, 
		IGNORED_CHARS=10;
	public static final int
		RULE_root = 0, RULE_sentencia = 1, RULE_sentencia_operacion = 2, RULE_asignacion_inicial = 3, 
		RULE_definicion = 4, RULE_operacion = 5, RULE_tipo_operacion = 6, RULE_sentencia_visualizacion = 7, 
		RULE_fin = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "sentencia", "sentencia_operacion", "asignacion_inicial", "definicion", 
			"operacion", "tipo_operacion", "sentencia_visualizacion", "fin"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'mostrar'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SS_INICIO_SENTENCIA", "SS_FIN_SENTENCIA", "SS_OP_SUMAR", "SS_OP_RESTAR", 
			"SS_OP_MULTIPLICAR", "SS_OP_DIVIDIR", "KW_PRINT", "I_VARIABLE", "L_ENTEROS", 
			"IGNORED_CHARS"
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
	public String getGrammarFileName() { return "Ejercicio2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    HashMap<String, Integer> tablaSimbolos = new HashMap<>();
	    int total = 0;

	public Ejercicio2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public FinContext fin() {
			return getRuleContext(FinContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ejercicio2Listener ) ((Ejercicio2Listener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ejercicio2Listener ) ((Ejercicio2Listener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ejercicio2Visitor ) return ((Ejercicio2Visitor<? extends T>)visitor).visitRoot(this);
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
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				sentencia();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SS_INICIO_SENTENCIA );
			setState(23);
			fin();
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
		public Sentencia_operacionContext sentencia_operacion() {
			return getRuleContext(Sentencia_operacionContext.class,0);
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
			if ( listener instanceof Ejercicio2Listener ) ((Ejercicio2Listener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ejercicio2Listener ) ((Ejercicio2Listener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ejercicio2Visitor ) return ((Ejercicio2Visitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				sentencia_operacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				sentencia_visualizacion();
				}
				break;
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
		public DefinicionContext definicion;
		public TerminalNode SS_INICIO_SENTENCIA() { return getToken(Ejercicio2Parser.SS_INICIO_SENTENCIA, 0); }
		public DefinicionContext definicion() {
			return getRuleContext(DefinicionContext.class,0);
		}
		public Asignacion_inicialContext asignacion_inicial() {
			return getRuleContext(Asignacion_inicialContext.class,0);
		}
		public TerminalNode SS_FIN_SENTENCIA() { return getToken(Ejercicio2Parser.SS_FIN_SENTENCIA, 0); }
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public Sentencia_operacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ejercicio2Listener ) ((Ejercicio2Listener)listener).enterSentencia_operacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ejercicio2Listener ) ((Ejercicio2Listener)listener).exitSentencia_operacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ejercicio2Visitor ) return ((Ejercicio2Visitor<? extends T>)visitor).visitSentencia_operacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_operacionContext sentencia_operacion() throws RecognitionException {
		Sentencia_operacionContext _localctx = new Sentencia_operacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencia_operacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(SS_INICIO_SENTENCIA);
			setState(30);
			((Sentencia_operacionContext)_localctx).definicion = definicion();
			setState(31);
			asignacion_inicial();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==L_ENTEROS) {
				{
				{
				setState(32);
				operacion();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(SS_FIN_SENTENCIA);

			    tablaSimbolos.put(((Sentencia_operacionContext)_localctx).definicion.var, total);
			    total = 0;

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

	public static class Asignacion_inicialContext extends ParserRuleContext {
		public Token L_ENTEROS;
		public TerminalNode L_ENTEROS() { return getToken(Ejercicio2Parser.L_ENTEROS, 0); }
		public Asignacion_inicialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_inicial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ejercicio2Listener ) ((Ejercicio2Listener)listener).enterAsignacion_inicial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ejercicio2Listener ) ((Ejercicio2Listener)listener).exitAsignacion_inicial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ejercicio2Visitor ) return ((Ejercicio2Visitor<? extends T>)visitor).visitAsignacion_inicial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion_inicialContext asignacion_inicial() throws RecognitionException {
		Asignacion_inicialContext _localctx = new Asignacion_inicialContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion_inicial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			((Asignacion_inicialContext)_localctx).L_ENTEROS = match(L_ENTEROS);

			    total = Integer.parseInt((((Asignacion_inicialContext)_localctx).L_ENTEROS!=null?((Asignacion_inicialContext)_localctx).L_ENTEROS.getText():null));

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

	public static class DefinicionContext extends ParserRuleContext {
		public String var;
		public Token I_VARIABLE;
		public TerminalNode I_VARIABLE() { return getToken(Ejercicio2Parser.I_VARIABLE, 0); }
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ejercicio2Listener ) ((Ejercicio2Listener)listener).enterDefinicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ejercicio2Listener ) ((Ejercicio2Listener)listener).exitDefinicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ejercicio2Visitor ) return ((Ejercicio2Visitor<? extends T>)visitor).visitDefinicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			((DefinicionContext)_localctx).I_VARIABLE = match(I_VARIABLE);

			    tablaSimbolos.put((((DefinicionContext)_localctx).I_VARIABLE!=null?((DefinicionContext)_localctx).I_VARIABLE.getText():null), 0);
			    ((DefinicionContext)_localctx).var =  (((DefinicionContext)_localctx).I_VARIABLE!=null?((DefinicionContext)_localctx).I_VARIABLE.getText():null);

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
		public Token L_ENTEROS;
		public Tipo_operacionContext tipo_operacion;
		public TerminalNode L_ENTEROS() { return getToken(Ejercicio2Parser.L_ENTEROS, 0); }
		public Tipo_operacionContext tipo_operacion() {
			return getRuleContext(Tipo_operacionContext.class,0);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ejercicio2Listener ) ((Ejercicio2Listener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ejercicio2Listener ) ((Ejercicio2Listener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ejercicio2Visitor ) return ((Ejercicio2Visitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			((OperacionContext)_localctx).L_ENTEROS = match(L_ENTEROS);
			setState(48);
			((OperacionContext)_localctx).tipo_operacion = tipo_operacion();

			    switch(((OperacionContext)_localctx).tipo_operacion.op) {
			        case 0:
			            total += Integer.parseInt((((OperacionContext)_localctx).L_ENTEROS!=null?((OperacionContext)_localctx).L_ENTEROS.getText():null));
			        break;
			        case 1:
			            total -= Integer.parseInt((((OperacionContext)_localctx).L_ENTEROS!=null?((OperacionContext)_localctx).L_ENTEROS.getText():null));
			        break;
			        case 2:
			            total *= Integer.parseInt((((OperacionContext)_localctx).L_ENTEROS!=null?((OperacionContext)_localctx).L_ENTEROS.getText():null));
			        break;
			        case 3:
			            total /= Integer.parseInt((((OperacionContext)_localctx).L_ENTEROS!=null?((OperacionContext)_localctx).L_ENTEROS.getText():null));
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

	public static class Tipo_operacionContext extends ParserRuleContext {
		public Integer op;
		public TerminalNode SS_OP_SUMAR() { return getToken(Ejercicio2Parser.SS_OP_SUMAR, 0); }
		public TerminalNode SS_OP_RESTAR() { return getToken(Ejercicio2Parser.SS_OP_RESTAR, 0); }
		public TerminalNode SS_OP_MULTIPLICAR() { return getToken(Ejercicio2Parser.SS_OP_MULTIPLICAR, 0); }
		public TerminalNode SS_OP_DIVIDIR() { return getToken(Ejercicio2Parser.SS_OP_DIVIDIR, 0); }
		public Tipo_operacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ejercicio2Listener ) ((Ejercicio2Listener)listener).enterTipo_operacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ejercicio2Listener ) ((Ejercicio2Listener)listener).exitTipo_operacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ejercicio2Visitor ) return ((Ejercicio2Visitor<? extends T>)visitor).visitTipo_operacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_operacionContext tipo_operacion() throws RecognitionException {
		Tipo_operacionContext _localctx = new Tipo_operacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo_operacion);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SS_OP_SUMAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(SS_OP_SUMAR);
				 ((Tipo_operacionContext)_localctx).op =  0;
				}
				break;
			case SS_OP_RESTAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(SS_OP_RESTAR);
				 ((Tipo_operacionContext)_localctx).op =  1;
				}
				break;
			case SS_OP_MULTIPLICAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(SS_OP_MULTIPLICAR);
				 ((Tipo_operacionContext)_localctx).op =  2;
				}
				break;
			case SS_OP_DIVIDIR:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				match(SS_OP_DIVIDIR);
				 ((Tipo_operacionContext)_localctx).op =  3;
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

	public static class Sentencia_visualizacionContext extends ParserRuleContext {
		public Token I_VARIABLE;
		public TerminalNode SS_INICIO_SENTENCIA() { return getToken(Ejercicio2Parser.SS_INICIO_SENTENCIA, 0); }
		public TerminalNode KW_PRINT() { return getToken(Ejercicio2Parser.KW_PRINT, 0); }
		public TerminalNode I_VARIABLE() { return getToken(Ejercicio2Parser.I_VARIABLE, 0); }
		public TerminalNode SS_FIN_SENTENCIA() { return getToken(Ejercicio2Parser.SS_FIN_SENTENCIA, 0); }
		public Sentencia_visualizacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_visualizacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ejercicio2Listener ) ((Ejercicio2Listener)listener).enterSentencia_visualizacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ejercicio2Listener ) ((Ejercicio2Listener)listener).exitSentencia_visualizacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ejercicio2Visitor ) return ((Ejercicio2Visitor<? extends T>)visitor).visitSentencia_visualizacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_visualizacionContext sentencia_visualizacion() throws RecognitionException {
		Sentencia_visualizacionContext _localctx = new Sentencia_visualizacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentencia_visualizacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(SS_INICIO_SENTENCIA);
			setState(62);
			match(KW_PRINT);
			setState(63);
			((Sentencia_visualizacionContext)_localctx).I_VARIABLE = match(I_VARIABLE);
			setState(64);
			match(SS_FIN_SENTENCIA);

			    Integer valor = tablaSimbolos.get((((Sentencia_visualizacionContext)_localctx).I_VARIABLE!=null?((Sentencia_visualizacionContext)_localctx).I_VARIABLE.getText():null));
			    System.out.println(valor);

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
		public TerminalNode EOF() { return getToken(Ejercicio2Parser.EOF, 0); }
		public FinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Ejercicio2Listener ) ((Ejercicio2Listener)listener).enterFin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Ejercicio2Listener ) ((Ejercicio2Listener)listener).exitFin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Ejercicio2Visitor ) return ((Ejercicio2Visitor<? extends T>)visitor).visitFin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinContext fin() throws RecognitionException {
		FinContext _localctx = new FinContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(EOF);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\fH\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\2\3\2\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\7\4$\n\4\f"+
		"\4\16\4\'\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b>\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2D\2\25\3\2\2\2\4\35\3\2\2\2\6\37"+
		"\3\2\2\2\b+\3\2\2\2\n.\3\2\2\2\f\61\3\2\2\2\16=\3\2\2\2\20?\3\2\2\2\22"+
		"E\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30"+
		"\3\2\2\2\30\31\3\2\2\2\31\32\5\22\n\2\32\3\3\2\2\2\33\36\5\6\4\2\34\36"+
		"\5\20\t\2\35\33\3\2\2\2\35\34\3\2\2\2\36\5\3\2\2\2\37 \7\3\2\2 !\5\n\6"+
		"\2!%\5\b\5\2\"$\5\f\7\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3"+
		"\2\2\2\'%\3\2\2\2()\7\4\2\2)*\b\4\1\2*\7\3\2\2\2+,\7\13\2\2,-\b\5\1\2"+
		"-\t\3\2\2\2./\7\n\2\2/\60\b\6\1\2\60\13\3\2\2\2\61\62\7\13\2\2\62\63\5"+
		"\16\b\2\63\64\b\7\1\2\64\r\3\2\2\2\65\66\7\5\2\2\66>\b\b\1\2\678\7\6\2"+
		"\28>\b\b\1\29:\7\7\2\2:>\b\b\1\2;<\7\b\2\2<>\b\b\1\2=\65\3\2\2\2=\67\3"+
		"\2\2\2=9\3\2\2\2=;\3\2\2\2>\17\3\2\2\2?@\7\3\2\2@A\7\t\2\2AB\7\n\2\2B"+
		"C\7\4\2\2CD\b\t\1\2D\21\3\2\2\2EF\7\2\2\3F\23\3\2\2\2\6\27\35%=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}