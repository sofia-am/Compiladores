// Generated from c:\Users\sofia\Compiladores\Compiladores\Nueva carpeta\Compiladores\src\main\java\variables\SyntaxAnalyzer.g4 by ANTLR 4.8

    package variables;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SyntaxAnalyzerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMA=2, IGUAL=3, PYC=4, UNDERSCORE=5, TIPO=6, ID=7, ASIGNACION=8;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_declaracion = 3, 
		RULE_secvar = 4, RULE_comvar = 5, RULE_var = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "instruccion", "declaracion", "secvar", 
			"comvar", "var"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "','", "'='", "';'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMA", "IGUAL", "PYC", "UNDERSCORE", "TIPO", "ID", "ASIGNACION"
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
	public String getGrammarFileName() { return "SyntaxAnalyzer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SyntaxAnalyzerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SyntaxAnalyzerParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxAnalyzerListener ) ((SyntaxAnalyzerListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxAnalyzerListener ) ((SyntaxAnalyzerListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxAnalyzerVisitor ) return ((SyntaxAnalyzerVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				instrucciones();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(EOF);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxAnalyzerListener ) ((SyntaxAnalyzerListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxAnalyzerListener ) ((SyntaxAnalyzerListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxAnalyzerVisitor ) return ((SyntaxAnalyzerVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			instruccion();
			setState(19);
			programa();
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

	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxAnalyzerListener ) ((SyntaxAnalyzerListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxAnalyzerListener ) ((SyntaxAnalyzerListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxAnalyzerVisitor ) return ((SyntaxAnalyzerVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			declaracion();
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(SyntaxAnalyzerParser.TIPO, 0); }
		public SecvarContext secvar() {
			return getRuleContext(SecvarContext.class,0);
		}
		public TerminalNode PYC() { return getToken(SyntaxAnalyzerParser.PYC, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxAnalyzerListener ) ((SyntaxAnalyzerListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxAnalyzerListener ) ((SyntaxAnalyzerListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxAnalyzerVisitor ) return ((SyntaxAnalyzerVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(TIPO);
			setState(24);
			secvar();
			setState(25);
			match(PYC);
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

	public static class SecvarContext extends ParserRuleContext {
		public ComvarContext comvar() {
			return getRuleContext(ComvarContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public SecvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxAnalyzerListener ) ((SyntaxAnalyzerListener)listener).enterSecvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxAnalyzerListener ) ((SyntaxAnalyzerListener)listener).exitSecvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxAnalyzerVisitor ) return ((SyntaxAnalyzerVisitor<? extends T>)visitor).visitSecvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecvarContext secvar() throws RecognitionException {
		SecvarContext _localctx = new SecvarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_secvar);
		try {
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				comvar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				var();
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

	public static class ComvarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SyntaxAnalyzerParser.ID, 0); }
		public TerminalNode COMA() { return getToken(SyntaxAnalyzerParser.COMA, 0); }
		public SecvarContext secvar() {
			return getRuleContext(SecvarContext.class,0);
		}
		public TerminalNode ASIGNACION() { return getToken(SyntaxAnalyzerParser.ASIGNACION, 0); }
		public ComvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxAnalyzerListener ) ((SyntaxAnalyzerListener)listener).enterComvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxAnalyzerListener ) ((SyntaxAnalyzerListener)listener).exitComvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxAnalyzerVisitor ) return ((SyntaxAnalyzerVisitor<? extends T>)visitor).visitComvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComvarContext comvar() throws RecognitionException {
		ComvarContext _localctx = new ComvarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comvar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(ID);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASIGNACION) {
				{
				setState(32);
				match(ASIGNACION);
				}
			}

			setState(35);
			match(COMA);
			setState(36);
			secvar();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SyntaxAnalyzerParser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(SyntaxAnalyzerParser.ASIGNACION, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxAnalyzerListener ) ((SyntaxAnalyzerListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxAnalyzerListener ) ((SyntaxAnalyzerListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxAnalyzerVisitor ) return ((SyntaxAnalyzerVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(ID);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASIGNACION) {
				{
				setState(39);
				match(ASIGNACION);
				}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n-\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\5\2\23\n\2\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6 \n\6\3\7\3\7\5\7$\n\7\3\7\3\7"+
		"\3\7\3\b\3\b\5\b+\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2\2)\2\22\3\2\2\2\4\24"+
		"\3\2\2\2\6\27\3\2\2\2\b\31\3\2\2\2\n\37\3\2\2\2\f!\3\2\2\2\16(\3\2\2\2"+
		"\20\23\5\4\3\2\21\23\7\2\2\3\22\20\3\2\2\2\22\21\3\2\2\2\23\3\3\2\2\2"+
		"\24\25\5\6\4\2\25\26\5\2\2\2\26\5\3\2\2\2\27\30\5\b\5\2\30\7\3\2\2\2\31"+
		"\32\7\b\2\2\32\33\5\n\6\2\33\34\7\6\2\2\34\t\3\2\2\2\35 \5\f\7\2\36 \5"+
		"\16\b\2\37\35\3\2\2\2\37\36\3\2\2\2 \13\3\2\2\2!#\7\t\2\2\"$\7\n\2\2#"+
		"\"\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\7\4\2\2&\'\5\n\6\2\'\r\3\2\2\2(*\7\t"+
		"\2\2)+\7\n\2\2*)\3\2\2\2*+\3\2\2\2+\17\3\2\2\2\6\22\37#*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}