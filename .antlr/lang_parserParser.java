// Generated from c:\Users\milat\Documents\GitHub\god-lang\lang_parser.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, WS=3, INT_TOKEN=4, FLOAT_TOKEN=5, STRING_TOKEN=6, CONST_TOKEN=7, 
		PRINT_TOKEN=8, SCANF_TOKEN=9, IF_TOKEN=10, ELSE_TOKEN=11, FOR_TOKEN=12, 
		WHILE_TOKEN=13, AND_TOKEN=14, OR_TOKEN=15, PLUS_TOKEN=16, MINUS_TOKEN=17, 
		DIV_TOKEN=18, MULTI_TOKEN=19, SQRT_TOKEN=20, ABS_TOKEN=21, POW_TOKEN=22, 
		STRING=23, NUMBER=24, FLOATING_POINT=25, LPAREN=26, RPAREN=27, LBRACE=28, 
		RBRACE=29, END=30, ASSIGN=31, VAR_NAME=32, SPACE=33, NEW_LINE=34, MAJOR=35, 
		MINOR=36, COMMA=37;
	public static final int
		RULE_statement = 0, RULE_condition_statement = 1, RULE_operation = 2, 
		RULE_int_block = 3, RULE_float_block = 4, RULE_string_block = 5, RULE_assign_block = 6, 
		RULE_const_block = 7, RULE_if_block = 8, RULE_for_block = 9, RULE_while_block = 10, 
		RULE_sqrt_block = 11, RULE_pow_block = 12, RULE_abs_block = 13, RULE_print_block = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "condition_statement", "operation", "int_block", "float_block", 
			"string_block", "assign_block", "const_block", "if_block", "for_block", 
			"while_block", "sqrt_block", "pow_block", "abs_block", "print_block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'true'", "'false'", null, "'apolo'", "'poseidon'", "'atenea'", 
			"'cronos'", "'hermes'", "'helios'", "'themis'", "'eris'", "'eon'", "'prometeo'", 
			"'omega'", "'phi'", "'sigma'", "'delta'", "'lambda'", "'chi'", "'demeter'", 
			"'aletheia'", "'dionisio'", null, null, null, "'('", "')'", "'{'", "'}'", 
			"'-->'", "'='", null, "' '", "'\n'", "'>'", "'<'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WS", "INT_TOKEN", "FLOAT_TOKEN", "STRING_TOKEN", "CONST_TOKEN", 
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
		public List<Int_blockContext> int_block() {
			return getRuleContexts(Int_blockContext.class);
		}
		public Int_blockContext int_block(int i) {
			return getRuleContext(Int_blockContext.class,i);
		}
		public List<Float_blockContext> float_block() {
			return getRuleContexts(Float_blockContext.class);
		}
		public Float_blockContext float_block(int i) {
			return getRuleContext(Float_blockContext.class,i);
		}
		public List<String_blockContext> string_block() {
			return getRuleContexts(String_blockContext.class);
		}
		public String_blockContext string_block(int i) {
			return getRuleContext(String_blockContext.class,i);
		}
		public List<Assign_blockContext> assign_block() {
			return getRuleContexts(Assign_blockContext.class);
		}
		public Assign_blockContext assign_block(int i) {
			return getRuleContext(Assign_blockContext.class,i);
		}
		public List<Const_blockContext> const_block() {
			return getRuleContexts(Const_blockContext.class);
		}
		public Const_blockContext const_block(int i) {
			return getRuleContext(Const_blockContext.class,i);
		}
		public List<If_blockContext> if_block() {
			return getRuleContexts(If_blockContext.class);
		}
		public If_blockContext if_block(int i) {
			return getRuleContext(If_blockContext.class,i);
		}
		public List<For_blockContext> for_block() {
			return getRuleContexts(For_blockContext.class);
		}
		public For_blockContext for_block(int i) {
			return getRuleContext(For_blockContext.class,i);
		}
		public List<While_blockContext> while_block() {
			return getRuleContexts(While_blockContext.class);
		}
		public While_blockContext while_block(int i) {
			return getRuleContext(While_blockContext.class,i);
		}
		public List<Sqrt_blockContext> sqrt_block() {
			return getRuleContexts(Sqrt_blockContext.class);
		}
		public Sqrt_blockContext sqrt_block(int i) {
			return getRuleContext(Sqrt_blockContext.class,i);
		}
		public List<Pow_blockContext> pow_block() {
			return getRuleContexts(Pow_blockContext.class);
		}
		public Pow_blockContext pow_block(int i) {
			return getRuleContext(Pow_blockContext.class,i);
		}
		public List<Abs_blockContext> abs_block() {
			return getRuleContexts(Abs_blockContext.class);
		}
		public Abs_blockContext abs_block(int i) {
			return getRuleContext(Abs_blockContext.class,i);
		}
		public List<Print_blockContext> print_block() {
			return getRuleContexts(Print_blockContext.class);
		}
		public Print_blockContext print_block(int i) {
			return getRuleContext(Print_blockContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TOKEN) | (1L << FLOAT_TOKEN) | (1L << STRING_TOKEN) | (1L << CONST_TOKEN) | (1L << PRINT_TOKEN) | (1L << IF_TOKEN) | (1L << FOR_TOKEN) | (1L << WHILE_TOKEN) | (1L << SQRT_TOKEN) | (1L << ABS_TOKEN) | (1L << POW_TOKEN) | (1L << VAR_NAME))) != 0)) {
				{
				setState(42);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_TOKEN:
					{
					setState(30);
					int_block();
					}
					break;
				case FLOAT_TOKEN:
					{
					setState(31);
					float_block();
					}
					break;
				case STRING_TOKEN:
					{
					setState(32);
					string_block();
					}
					break;
				case VAR_NAME:
					{
					setState(33);
					assign_block();
					}
					break;
				case CONST_TOKEN:
					{
					setState(34);
					const_block();
					}
					break;
				case IF_TOKEN:
					{
					setState(35);
					if_block();
					}
					break;
				case FOR_TOKEN:
					{
					setState(36);
					for_block();
					}
					break;
				case WHILE_TOKEN:
					{
					setState(37);
					while_block();
					}
					break;
				case SQRT_TOKEN:
					{
					setState(38);
					sqrt_block();
					}
					break;
				case POW_TOKEN:
					{
					setState(39);
					pow_block();
					}
					break;
				case ABS_TOKEN:
					{
					setState(40);
					abs_block();
					}
					break;
				case PRINT_TOKEN:
					{
					setState(41);
					print_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(46);
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

	public static class Condition_statementContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(lang_parserParser.VAR_NAME, 0); }
		public TerminalNode NUMBER() { return getToken(lang_parserParser.NUMBER, 0); }
		public TerminalNode MINOR() { return getToken(lang_parserParser.MINOR, 0); }
		public TerminalNode MAJOR() { return getToken(lang_parserParser.MAJOR, 0); }
		public Condition_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_statement; }
	}

	public final Condition_statementContext condition_statement() throws RecognitionException {
		Condition_statementContext _localctx = new Condition_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_condition_statement);
		int _la;
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(VAR_NAME);
				setState(48);
				_la = _input.LA(1);
				if ( !(_la==MAJOR || _la==MINOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(49);
				match(NUMBER);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				match(T__1);
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

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(lang_parserParser.VAR_NAME, 0); }
		public List<TerminalNode> PLUS_TOKEN() { return getTokens(lang_parserParser.PLUS_TOKEN); }
		public TerminalNode PLUS_TOKEN(int i) {
			return getToken(lang_parserParser.PLUS_TOKEN, i);
		}
		public List<TerminalNode> MINUS_TOKEN() { return getTokens(lang_parserParser.MINUS_TOKEN); }
		public TerminalNode MINUS_TOKEN(int i) {
			return getToken(lang_parserParser.MINUS_TOKEN, i);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operation);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(VAR_NAME);
				setState(55);
				match(PLUS_TOKEN);
				setState(56);
				match(PLUS_TOKEN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(VAR_NAME);
				setState(58);
				match(MINUS_TOKEN);
				setState(59);
				match(MINUS_TOKEN);
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

	public static class Int_blockContext extends ParserRuleContext {
		public TerminalNode INT_TOKEN() { return getToken(lang_parserParser.INT_TOKEN, 0); }
		public TerminalNode VAR_NAME() { return getToken(lang_parserParser.VAR_NAME, 0); }
		public TerminalNode END() { return getToken(lang_parserParser.END, 0); }
		public TerminalNode ASSIGN() { return getToken(lang_parserParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(lang_parserParser.NUMBER, 0); }
		public Int_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_block; }
	}

	public final Int_blockContext int_block() throws RecognitionException {
		Int_blockContext _localctx = new Int_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_int_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(INT_TOKEN);
			setState(63);
			match(VAR_NAME);
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				{
				setState(64);
				match(END);
				}
				break;
			case ASSIGN:
				{
				setState(65);
				match(ASSIGN);
				setState(66);
				match(NUMBER);
				setState(67);
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
		public Float_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_block; }
	}

	public final Float_blockContext float_block() throws RecognitionException {
		Float_blockContext _localctx = new Float_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_float_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(FLOAT_TOKEN);
			setState(71);
			match(VAR_NAME);
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				{
				setState(72);
				match(END);
				}
				break;
			case ASSIGN:
				{
				setState(73);
				match(ASSIGN);
				setState(74);
				match(FLOATING_POINT);
				setState(75);
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
		public String_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_block; }
	}

	public final String_blockContext string_block() throws RecognitionException {
		String_blockContext _localctx = new String_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_string_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(STRING_TOKEN);
			setState(79);
			match(VAR_NAME);
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				{
				setState(80);
				match(END);
				}
				break;
			case ASSIGN:
				{
				setState(81);
				match(ASSIGN);
				setState(82);
				match(STRING);
				setState(83);
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

	public static class Assign_blockContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(lang_parserParser.VAR_NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(lang_parserParser.ASSIGN, 0); }
		public TerminalNode END() { return getToken(lang_parserParser.END, 0); }
		public TerminalNode NUMBER() { return getToken(lang_parserParser.NUMBER, 0); }
		public TerminalNode FLOATING_POINT() { return getToken(lang_parserParser.FLOATING_POINT, 0); }
		public TerminalNode STRING() { return getToken(lang_parserParser.STRING, 0); }
		public Assign_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_block; }
	}

	public final Assign_blockContext assign_block() throws RecognitionException {
		Assign_blockContext _localctx = new Assign_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(VAR_NAME);
			setState(87);
			match(ASSIGN);
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << FLOATING_POINT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(89);
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

	public static class Const_blockContext extends ParserRuleContext {
		public TerminalNode CONST_TOKEN() { return getToken(lang_parserParser.CONST_TOKEN, 0); }
		public TerminalNode INT_TOKEN() { return getToken(lang_parserParser.INT_TOKEN, 0); }
		public TerminalNode VAR_NAME() { return getToken(lang_parserParser.VAR_NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(lang_parserParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(lang_parserParser.NUMBER, 0); }
		public TerminalNode END() { return getToken(lang_parserParser.END, 0); }
		public TerminalNode FLOAT_TOKEN() { return getToken(lang_parserParser.FLOAT_TOKEN, 0); }
		public TerminalNode FLOATING_POINT() { return getToken(lang_parserParser.FLOATING_POINT, 0); }
		public TerminalNode STRING_TOKEN() { return getToken(lang_parserParser.STRING_TOKEN, 0); }
		public TerminalNode STRING() { return getToken(lang_parserParser.STRING, 0); }
		public Const_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_block; }
	}

	public final Const_blockContext const_block() throws RecognitionException {
		Const_blockContext _localctx = new Const_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_const_block);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(91);
				match(CONST_TOKEN);
				setState(92);
				match(INT_TOKEN);
				setState(93);
				match(VAR_NAME);
				setState(94);
				match(ASSIGN);
				setState(95);
				match(NUMBER);
				setState(96);
				match(END);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(97);
				match(CONST_TOKEN);
				setState(98);
				match(FLOAT_TOKEN);
				setState(99);
				match(VAR_NAME);
				setState(100);
				match(ASSIGN);
				setState(101);
				match(FLOATING_POINT);
				setState(102);
				match(END);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(103);
				match(CONST_TOKEN);
				setState(104);
				match(STRING_TOKEN);
				setState(105);
				match(VAR_NAME);
				setState(106);
				match(ASSIGN);
				setState(107);
				match(STRING);
				setState(108);
				match(END);
				}
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

	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode IF_TOKEN() { return getToken(lang_parserParser.IF_TOKEN, 0); }
		public TerminalNode LPAREN() { return getToken(lang_parserParser.LPAREN, 0); }
		public Condition_statementContext condition_statement() {
			return getRuleContext(Condition_statementContext.class,0);
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
		enterRule(_localctx, 16, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(IF_TOKEN);
			setState(112);
			match(LPAREN);
			setState(113);
			condition_statement();
			setState(114);
			match(RPAREN);
			setState(115);
			match(LBRACE);
			setState(116);
			statement();
			setState(117);
			match(RBRACE);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_TOKEN) {
				{
				setState(118);
				match(ELSE_TOKEN);
				setState(119);
				match(LBRACE);
				setState(120);
				statement();
				setState(121);
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
		public TerminalNode VAR_NAME() { return getToken(lang_parserParser.VAR_NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(lang_parserParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(lang_parserParser.NUMBER, 0); }
		public List<TerminalNode> END() { return getTokens(lang_parserParser.END); }
		public TerminalNode END(int i) {
			return getToken(lang_parserParser.END, i);
		}
		public Condition_statementContext condition_statement() {
			return getRuleContext(Condition_statementContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(lang_parserParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(lang_parserParser.LBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(lang_parserParser.RBRACE, 0); }
		public For_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_block; }
	}

	public final For_blockContext for_block() throws RecognitionException {
		For_blockContext _localctx = new For_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(FOR_TOKEN);
			setState(126);
			match(LPAREN);
			setState(127);
			match(INT_TOKEN);
			setState(128);
			match(VAR_NAME);
			setState(129);
			match(ASSIGN);
			setState(130);
			match(NUMBER);
			setState(131);
			match(END);
			setState(132);
			condition_statement();
			setState(133);
			match(END);
			setState(134);
			operation();
			setState(135);
			match(RPAREN);
			setState(136);
			match(LBRACE);
			setState(137);
			statement();
			setState(138);
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
		public Condition_statementContext condition_statement() {
			return getRuleContext(Condition_statementContext.class,0);
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
		enterRule(_localctx, 20, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(WHILE_TOKEN);
			setState(141);
			match(LPAREN);
			setState(142);
			condition_statement();
			setState(143);
			match(RPAREN);
			setState(144);
			statement();
			setState(145);
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
		enterRule(_localctx, 22, RULE_sqrt_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(SQRT_TOKEN);
			setState(148);
			match(LPAREN);
			setState(149);
			match(FLOATING_POINT);
			setState(150);
			match(RPAREN);
			setState(151);
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
		enterRule(_localctx, 24, RULE_pow_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(POW_TOKEN);
			setState(154);
			match(LPAREN);
			setState(155);
			match(FLOATING_POINT);
			setState(156);
			match(COMMA);
			setState(157);
			match(NUMBER);
			setState(158);
			match(RPAREN);
			setState(159);
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
		enterRule(_localctx, 26, RULE_abs_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ABS_TOKEN);
			setState(162);
			match(LPAREN);
			setState(163);
			match(FLOATING_POINT);
			setState(164);
			match(RPAREN);
			setState(165);
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

	public static class Print_blockContext extends ParserRuleContext {
		public TerminalNode PRINT_TOKEN() { return getToken(lang_parserParser.PRINT_TOKEN, 0); }
		public TerminalNode LPAREN() { return getToken(lang_parserParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(lang_parserParser.RPAREN, 0); }
		public TerminalNode END() { return getToken(lang_parserParser.END, 0); }
		public TerminalNode STRING() { return getToken(lang_parserParser.STRING, 0); }
		public TerminalNode VAR_NAME() { return getToken(lang_parserParser.VAR_NAME, 0); }
		public Print_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_block; }
	}

	public final Print_blockContext print_block() throws RecognitionException {
		Print_blockContext _localctx = new Print_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_print_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(PRINT_TOKEN);
			setState(168);
			match(LPAREN);
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==VAR_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(170);
			match(RPAREN);
			setState(171);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00b0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\67\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5G\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7W\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tp\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n~\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36\2\5\3\2%&\3\2\31\33\4\2\31\31\"\"\2\u00b5"+
		"\2.\3\2\2\2\4\66\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nH\3\2\2\2\fP\3\2\2\2\16"+
		"X\3\2\2\2\20o\3\2\2\2\22q\3\2\2\2\24\177\3\2\2\2\26\u008e\3\2\2\2\30\u0095"+
		"\3\2\2\2\32\u009b\3\2\2\2\34\u00a3\3\2\2\2\36\u00a9\3\2\2\2 -\5\b\5\2"+
		"!-\5\n\6\2\"-\5\f\7\2#-\5\16\b\2$-\5\20\t\2%-\5\22\n\2&-\5\24\13\2\'-"+
		"\5\26\f\2(-\5\30\r\2)-\5\32\16\2*-\5\34\17\2+-\5\36\20\2, \3\2\2\2,!\3"+
		"\2\2\2,\"\3\2\2\2,#\3\2\2\2,$\3\2\2\2,%\3\2\2\2,&\3\2\2\2,\'\3\2\2\2,"+
		"(\3\2\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2"+
		"\2/\3\3\2\2\2\60.\3\2\2\2\61\62\7\"\2\2\62\63\t\2\2\2\63\67\7\32\2\2\64"+
		"\67\7\3\2\2\65\67\7\4\2\2\66\61\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67"+
		"\5\3\2\2\289\7\"\2\29:\7\22\2\2:?\7\22\2\2;<\7\"\2\2<=\7\23\2\2=?\7\23"+
		"\2\2>8\3\2\2\2>;\3\2\2\2?\7\3\2\2\2@A\7\6\2\2AF\7\"\2\2BG\7 \2\2CD\7!"+
		"\2\2DE\7\32\2\2EG\7 \2\2FB\3\2\2\2FC\3\2\2\2G\t\3\2\2\2HI\7\7\2\2IN\7"+
		"\"\2\2JO\7 \2\2KL\7!\2\2LM\7\33\2\2MO\7 \2\2NJ\3\2\2\2NK\3\2\2\2O\13\3"+
		"\2\2\2PQ\7\b\2\2QV\7\"\2\2RW\7 \2\2ST\7!\2\2TU\7\31\2\2UW\7 \2\2VR\3\2"+
		"\2\2VS\3\2\2\2W\r\3\2\2\2XY\7\"\2\2YZ\7!\2\2Z[\t\3\2\2[\\\7 \2\2\\\17"+
		"\3\2\2\2]^\7\t\2\2^_\7\6\2\2_`\7\"\2\2`a\7!\2\2ab\7\32\2\2bp\7 \2\2cd"+
		"\7\t\2\2de\7\7\2\2ef\7\"\2\2fg\7!\2\2gh\7\33\2\2hp\7 \2\2ij\7\t\2\2jk"+
		"\7\b\2\2kl\7\"\2\2lm\7!\2\2mn\7\31\2\2np\7 \2\2o]\3\2\2\2oc\3\2\2\2oi"+
		"\3\2\2\2p\21\3\2\2\2qr\7\f\2\2rs\7\34\2\2st\5\4\3\2tu\7\35\2\2uv\7\36"+
		"\2\2vw\5\2\2\2w}\7\37\2\2xy\7\r\2\2yz\7\36\2\2z{\5\2\2\2{|\7\37\2\2|~"+
		"\3\2\2\2}x\3\2\2\2}~\3\2\2\2~\23\3\2\2\2\177\u0080\7\16\2\2\u0080\u0081"+
		"\7\34\2\2\u0081\u0082\7\6\2\2\u0082\u0083\7\"\2\2\u0083\u0084\7!\2\2\u0084"+
		"\u0085\7\32\2\2\u0085\u0086\7 \2\2\u0086\u0087\5\4\3\2\u0087\u0088\7 "+
		"\2\2\u0088\u0089\5\6\4\2\u0089\u008a\7\35\2\2\u008a\u008b\7\36\2\2\u008b"+
		"\u008c\5\2\2\2\u008c\u008d\7\37\2\2\u008d\25\3\2\2\2\u008e\u008f\7\17"+
		"\2\2\u008f\u0090\7\34\2\2\u0090\u0091\5\4\3\2\u0091\u0092\7\35\2\2\u0092"+
		"\u0093\5\2\2\2\u0093\u0094\7\36\2\2\u0094\27\3\2\2\2\u0095\u0096\7\26"+
		"\2\2\u0096\u0097\7\34\2\2\u0097\u0098\7\33\2\2\u0098\u0099\7\35\2\2\u0099"+
		"\u009a\7 \2\2\u009a\31\3\2\2\2\u009b\u009c\7\30\2\2\u009c\u009d\7\34\2"+
		"\2\u009d\u009e\7\33\2\2\u009e\u009f\7\'\2\2\u009f\u00a0\7\32\2\2\u00a0"+
		"\u00a1\7\35\2\2\u00a1\u00a2\7 \2\2\u00a2\33\3\2\2\2\u00a3\u00a4\7\27\2"+
		"\2\u00a4\u00a5\7\34\2\2\u00a5\u00a6\7\33\2\2\u00a6\u00a7\7\35\2\2\u00a7"+
		"\u00a8\7 \2\2\u00a8\35\3\2\2\2\u00a9\u00aa\7\n\2\2\u00aa\u00ab\7\34\2"+
		"\2\u00ab\u00ac\t\4\2\2\u00ac\u00ad\7\35\2\2\u00ad\u00ae\7 \2\2\u00ae\37"+
		"\3\2\2\2\13,.\66>FNVo}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}