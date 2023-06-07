// Generated from k:\Dev\java\Lang\grammar\lang_parser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lang_parserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, INT_TOKEN=3, FLOAT_TOKEN=4, STRING_TOKEN=5, CONST_TOKEN=6, 
		PRINT_TOKEN=7, SCANF_TOKEN=8, IF_TOKEN=9, ELSE_TOKEN=10, FOR_TOKEN=11, 
		WHILE_TOKEN=12, AND_TOKEN=13, OR_TOKEN=14, PLUS_TOKEN=15, MINUS_TOKEN=16, 
		DIV_TOKEN=17, MULTI_TOKEN=18, SQRT_TOKEN=19, ABS_TOKEN=20, POW_TOKEN=21, 
		STRING=22, NUMBER=23, FLOATING_POINT=24, LPAREN=25, RPAREN=26, LBRACE=27, 
		RBRACE=28, END=29, ASSIGN=30, VAR_NAME=31, SPACE=32, NEW_LINE=33, MAJOR=34, 
		MINOR=35, COMMA=36;
	public static final int
		RULE_statement = 0, RULE_bool_statement = 1, RULE_int_block = 2, RULE_float_block = 3, 
		RULE_string_block = 4, RULE_if_block = 5, RULE_for_block = 6, RULE_while_block = 7, 
		RULE_sqrt_block = 8, RULE_pow_block = 9, RULE_abs_block = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "bool_statement", "int_block", "float_block", "string_block", 
			"if_block", "for_block", "while_block", "sqrt_block", "pow_block", "abs_block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'a'", "'b'", "'apolo '", "'poseidon '", "'atenea '", "'cronos'", 
			"'hermes'", "'helios'", "'themis'", "'eris'", "'eon'", "'prometeo'", 
			"'omega'", "'phi'", "'sigma'", "'delta'", "'lambda'", "'chi'", "'demeter'", 
			"'aletheia'", "'dionisio'", null, null, null, "'('", "')'", "'{'", "'}'", 
			"'-->'", "'='", null, "' '", "'\n'", "'>'", "'<'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "INT_TOKEN", "FLOAT_TOKEN", "STRING_TOKEN", "CONST_TOKEN", 
			"PRINT_TOKEN", "SCANF_TOKEN", "IF_TOKEN", "ELSE_TOKEN", "FOR_TOKEN", 
			"WHILE_TOKEN", "AND_TOKEN", "OR_TOKEN", "PLUS_TOKEN", "MINUS_TOKEN", 
			"DIV_TOKEN", "MULTI_TOKEN", "SQRT_TOKEN", "ABS_TOKEN", "POW_TOKEN", "STRING", 
			"NUMBER", "FLOATING_POINT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "END", 
			"ASSIGN", "VAR_NAME", "SPACE", "NEW_LINE", "MAJOR", "MINOR", "COMMA"
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
	public String getGrammarFileName() { return "lang_parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lang_parserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
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

	public static class Bool_statementContext extends ParserRuleContext {
		public Bool_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_statement; }
	}

	public final Bool_statementContext bool_statement() throws RecognitionException {
		Bool_statementContext _localctx = new Bool_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bool_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__1);
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

	public static class Int_blockContext extends ParserRuleContext {
		public TerminalNode INT_TOKEN() { return getToken(lang_parserParser.INT_TOKEN, 0); }
		public TerminalNode VAR_NAME() { return getToken(lang_parserParser.VAR_NAME, 0); }
		public TerminalNode END() { return getToken(lang_parserParser.END, 0); }
		public TerminalNode ASSIGN() { return getToken(lang_parserParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(lang_parserParser.NUMBER, 0); }
		public TerminalNode CONST_TOKEN() { return getToken(lang_parserParser.CONST_TOKEN, 0); }
		public Int_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_block; }
	}

	public final Int_blockContext int_block() throws RecognitionException {
		Int_blockContext _localctx = new Int_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_int_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST_TOKEN) {
				{
				setState(26);
				match(CONST_TOKEN);
				}
			}

			setState(29);
			match(INT_TOKEN);
			setState(30);
			match(VAR_NAME);
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				{
				setState(31);
				match(END);
				}
				break;
			case ASSIGN:
				{
				setState(32);
				match(ASSIGN);
				setState(33);
				match(NUMBER);
				setState(34);
				match(END);
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

	public static class Float_blockContext extends ParserRuleContext {
		public TerminalNode FLOAT_TOKEN() { return getToken(lang_parserParser.FLOAT_TOKEN, 0); }
		public TerminalNode VAR_NAME() { return getToken(lang_parserParser.VAR_NAME, 0); }
		public TerminalNode END() { return getToken(lang_parserParser.END, 0); }
		public TerminalNode ASSIGN() { return getToken(lang_parserParser.ASSIGN, 0); }
		public TerminalNode FLOATING_POINT() { return getToken(lang_parserParser.FLOATING_POINT, 0); }
		public TerminalNode CONST_TOKEN() { return getToken(lang_parserParser.CONST_TOKEN, 0); }
		public Float_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_block; }
	}

	public final Float_blockContext float_block() throws RecognitionException {
		Float_blockContext _localctx = new Float_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_float_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST_TOKEN) {
				{
				setState(37);
				match(CONST_TOKEN);
				}
			}

			setState(40);
			match(FLOAT_TOKEN);
			setState(41);
			match(VAR_NAME);
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				{
				setState(42);
				match(END);
				}
				break;
			case ASSIGN:
				{
				setState(43);
				match(ASSIGN);
				setState(44);
				match(FLOATING_POINT);
				setState(45);
				match(END);
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

	public static class String_blockContext extends ParserRuleContext {
		public TerminalNode STRING_TOKEN() { return getToken(lang_parserParser.STRING_TOKEN, 0); }
		public TerminalNode VAR_NAME() { return getToken(lang_parserParser.VAR_NAME, 0); }
		public TerminalNode END() { return getToken(lang_parserParser.END, 0); }
		public TerminalNode ASSIGN() { return getToken(lang_parserParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(lang_parserParser.STRING, 0); }
		public TerminalNode CONST_TOKEN() { return getToken(lang_parserParser.CONST_TOKEN, 0); }
		public String_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_block; }
	}

	public final String_blockContext string_block() throws RecognitionException {
		String_blockContext _localctx = new String_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST_TOKEN) {
				{
				setState(48);
				match(CONST_TOKEN);
				}
			}

			setState(51);
			match(STRING_TOKEN);
			setState(52);
			match(VAR_NAME);
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				{
				setState(53);
				match(END);
				}
				break;
			case ASSIGN:
				{
				setState(54);
				match(ASSIGN);
				setState(55);
				match(STRING);
				setState(56);
				match(END);
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

	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode IF_TOKEN() { return getToken(lang_parserParser.IF_TOKEN, 0); }
		public TerminalNode LPAREN() { return getToken(lang_parserParser.LPAREN, 0); }
		public Bool_statementContext bool_statement() {
			return getRuleContext(Bool_statementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(lang_parserParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(lang_parserParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(lang_parserParser.LBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(lang_parserParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(lang_parserParser.RBRACE, i);
		}
		public TerminalNode ELSE_TOKEN() { return getToken(lang_parserParser.ELSE_TOKEN, 0); }
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(IF_TOKEN);
			setState(60);
			match(LPAREN);
			setState(61);
			bool_statement();
			setState(62);
			match(RPAREN);
			setState(63);
			match(LBRACE);
			setState(64);
			statement();
			setState(65);
			match(RBRACE);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_TOKEN) {
				{
				setState(66);
				match(ELSE_TOKEN);
				setState(67);
				match(LBRACE);
				setState(68);
				statement();
				setState(69);
				match(RBRACE);
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

	public static class For_blockContext extends ParserRuleContext {
		public TerminalNode FOR_TOKEN() { return getToken(lang_parserParser.FOR_TOKEN, 0); }
		public TerminalNode LPAREN() { return getToken(lang_parserParser.LPAREN, 0); }
		public TerminalNode INT_TOKEN() { return getToken(lang_parserParser.INT_TOKEN, 0); }
		public List<TerminalNode> VAR_NAME() { return getTokens(lang_parserParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(lang_parserParser.VAR_NAME, i);
		}
		public TerminalNode ASSIGN() { return getToken(lang_parserParser.ASSIGN, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(lang_parserParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(lang_parserParser.NUMBER, i);
		}
		public List<TerminalNode> END() { return getTokens(lang_parserParser.END); }
		public TerminalNode END(int i) {
			return getToken(lang_parserParser.END, i);
		}
		public TerminalNode RPAREN() { return getToken(lang_parserParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(lang_parserParser.LBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(lang_parserParser.RBRACE, 0); }
		public TerminalNode MINOR() { return getToken(lang_parserParser.MINOR, 0); }
		public TerminalNode MAJOR() { return getToken(lang_parserParser.MAJOR, 0); }
		public List<TerminalNode> PLUS_TOKEN() { return getTokens(lang_parserParser.PLUS_TOKEN); }
		public TerminalNode PLUS_TOKEN(int i) {
			return getToken(lang_parserParser.PLUS_TOKEN, i);
		}
		public List<TerminalNode> MINUS_TOKEN() { return getTokens(lang_parserParser.MINUS_TOKEN); }
		public TerminalNode MINUS_TOKEN(int i) {
			return getToken(lang_parserParser.MINUS_TOKEN, i);
		}
		public For_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_block; }
	}

	public final For_blockContext for_block() throws RecognitionException {
		For_blockContext _localctx = new For_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(FOR_TOKEN);
			setState(74);
			match(LPAREN);
			setState(75);
			match(INT_TOKEN);
			setState(76);
			match(VAR_NAME);
			setState(77);
			match(ASSIGN);
			setState(78);
			match(NUMBER);
			setState(79);
			match(END);
			setState(80);
			match(VAR_NAME);
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==MAJOR || _la==MINOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(82);
			match(NUMBER);
			setState(83);
			match(END);
			setState(84);
			match(VAR_NAME);
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_TOKEN:
				{
				setState(85);
				match(PLUS_TOKEN);
				setState(86);
				match(PLUS_TOKEN);
				}
				break;
			case MINUS_TOKEN:
				{
				setState(87);
				match(MINUS_TOKEN);
				setState(88);
				match(MINUS_TOKEN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(91);
			match(RPAREN);
			setState(92);
			match(LBRACE);
			setState(93);
			statement();
			setState(94);
			match(RBRACE);
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

	public static class While_blockContext extends ParserRuleContext {
		public TerminalNode WHILE_TOKEN() { return getToken(lang_parserParser.WHILE_TOKEN, 0); }
		public TerminalNode LPAREN() { return getToken(lang_parserParser.LPAREN, 0); }
		public Bool_statementContext bool_statement() {
			return getRuleContext(Bool_statementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(lang_parserParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(lang_parserParser.LBRACE, 0); }
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(WHILE_TOKEN);
			setState(97);
			match(LPAREN);
			setState(98);
			bool_statement();
			setState(99);
			match(RPAREN);
			setState(100);
			statement();
			setState(101);
			match(LBRACE);
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

	public static class Sqrt_blockContext extends ParserRuleContext {
		public TerminalNode SQRT_TOKEN() { return getToken(lang_parserParser.SQRT_TOKEN, 0); }
		public TerminalNode LPAREN() { return getToken(lang_parserParser.LPAREN, 0); }
		public TerminalNode FLOATING_POINT() { return getToken(lang_parserParser.FLOATING_POINT, 0); }
		public TerminalNode RPAREN() { return getToken(lang_parserParser.RPAREN, 0); }
		public TerminalNode END() { return getToken(lang_parserParser.END, 0); }
		public Sqrt_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrt_block; }
	}

	public final Sqrt_blockContext sqrt_block() throws RecognitionException {
		Sqrt_blockContext _localctx = new Sqrt_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sqrt_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(SQRT_TOKEN);
			setState(104);
			match(LPAREN);
			setState(105);
			match(FLOATING_POINT);
			setState(106);
			match(RPAREN);
			setState(107);
			match(END);
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

	public static class Pow_blockContext extends ParserRuleContext {
		public TerminalNode POW_TOKEN() { return getToken(lang_parserParser.POW_TOKEN, 0); }
		public TerminalNode LPAREN() { return getToken(lang_parserParser.LPAREN, 0); }
		public TerminalNode FLOATING_POINT() { return getToken(lang_parserParser.FLOATING_POINT, 0); }
		public TerminalNode COMMA() { return getToken(lang_parserParser.COMMA, 0); }
		public TerminalNode NUMBER() { return getToken(lang_parserParser.NUMBER, 0); }
		public TerminalNode RPAREN() { return getToken(lang_parserParser.RPAREN, 0); }
		public TerminalNode END() { return getToken(lang_parserParser.END, 0); }
		public Pow_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow_block; }
	}

	public final Pow_blockContext pow_block() throws RecognitionException {
		Pow_blockContext _localctx = new Pow_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pow_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(POW_TOKEN);
			setState(110);
			match(LPAREN);
			setState(111);
			match(FLOATING_POINT);
			setState(112);
			match(COMMA);
			setState(113);
			match(NUMBER);
			setState(114);
			match(RPAREN);
			setState(115);
			match(END);
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

	public static class Abs_blockContext extends ParserRuleContext {
		public TerminalNode ABS_TOKEN() { return getToken(lang_parserParser.ABS_TOKEN, 0); }
		public TerminalNode LPAREN() { return getToken(lang_parserParser.LPAREN, 0); }
		public TerminalNode FLOATING_POINT() { return getToken(lang_parserParser.FLOATING_POINT, 0); }
		public TerminalNode RPAREN() { return getToken(lang_parserParser.RPAREN, 0); }
		public TerminalNode END() { return getToken(lang_parserParser.END, 0); }
		public Abs_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abs_block; }
	}

	public final Abs_blockContext abs_block() throws RecognitionException {
		Abs_blockContext _localctx = new Abs_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_abs_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ABS_TOKEN);
			setState(118);
			match(LPAREN);
			setState(119);
			match(FLOATING_POINT);
			setState(120);
			match(RPAREN);
			setState(121);
			match(END);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&~\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\3\2\3\2\3\3\3\3\3\4\5\4\36\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4&\n\4\3"+
		"\5\5\5)\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\61\n\5\3\6\5\6\64\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6<\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7J\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\\\n\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2$%\2z\2\30"+
		"\3\2\2\2\4\32\3\2\2\2\6\35\3\2\2\2\b(\3\2\2\2\n\63\3\2\2\2\f=\3\2\2\2"+
		"\16K\3\2\2\2\20b\3\2\2\2\22i\3\2\2\2\24o\3\2\2\2\26w\3\2\2\2\30\31\7\3"+
		"\2\2\31\3\3\2\2\2\32\33\7\4\2\2\33\5\3\2\2\2\34\36\7\b\2\2\35\34\3\2\2"+
		"\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \7\5\2\2 %\7!\2\2!&\7\37\2\2\"#\7 \2"+
		"\2#$\7\31\2\2$&\7\37\2\2%!\3\2\2\2%\"\3\2\2\2&\7\3\2\2\2\')\7\b\2\2(\'"+
		"\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7\6\2\2+\60\7!\2\2,\61\7\37\2\2-.\7 \2"+
		"\2./\7\32\2\2/\61\7\37\2\2\60,\3\2\2\2\60-\3\2\2\2\61\t\3\2\2\2\62\64"+
		"\7\b\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\7\2\2\66;\7"+
		"!\2\2\67<\7\37\2\289\7 \2\29:\7\30\2\2:<\7\37\2\2;\67\3\2\2\2;8\3\2\2"+
		"\2<\13\3\2\2\2=>\7\13\2\2>?\7\33\2\2?@\5\4\3\2@A\7\34\2\2AB\7\35\2\2B"+
		"C\5\2\2\2CI\7\36\2\2DE\7\f\2\2EF\7\35\2\2FG\5\2\2\2GH\7\36\2\2HJ\3\2\2"+
		"\2ID\3\2\2\2IJ\3\2\2\2J\r\3\2\2\2KL\7\r\2\2LM\7\33\2\2MN\7\5\2\2NO\7!"+
		"\2\2OP\7 \2\2PQ\7\31\2\2QR\7\37\2\2RS\7!\2\2ST\t\2\2\2TU\7\31\2\2UV\7"+
		"\37\2\2V[\7!\2\2WX\7\21\2\2X\\\7\21\2\2YZ\7\22\2\2Z\\\7\22\2\2[W\3\2\2"+
		"\2[Y\3\2\2\2\\]\3\2\2\2]^\7\34\2\2^_\7\35\2\2_`\5\2\2\2`a\7\36\2\2a\17"+
		"\3\2\2\2bc\7\16\2\2cd\7\33\2\2de\5\4\3\2ef\7\34\2\2fg\5\2\2\2gh\7\35\2"+
		"\2h\21\3\2\2\2ij\7\25\2\2jk\7\33\2\2kl\7\32\2\2lm\7\34\2\2mn\7\37\2\2"+
		"n\23\3\2\2\2op\7\27\2\2pq\7\33\2\2qr\7\32\2\2rs\7&\2\2st\7\31\2\2tu\7"+
		"\34\2\2uv\7\37\2\2v\25\3\2\2\2wx\7\26\2\2xy\7\33\2\2yz\7\32\2\2z{\7\34"+
		"\2\2{|\7\37\2\2|\27\3\2\2\2\n\35%(\60\63;I[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}