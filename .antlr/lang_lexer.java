// Generated from k:\Dev\java\Lang\grammar\lang_lexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lang_lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_TOKEN=1, FLOAT_TOKEN=2, STRING_TOKEN=3, CONST_TOKEN=4, PRINT_TOKEN=5, 
		SCANF_TOKEN=6, IF_TOKEN=7, ELSE_TOKEN=8, FOR_TOKEN=9, WHILE_TOKEN=10, 
		AND_TOKEN=11, OR_TOKEN=12, PLUS_TOKEN=13, MINUS_TOKEN=14, DIV_TOKEN=15, 
		MULTI_TOKEN=16, SQRT_TOKEN=17, ABS_TOKEN=18, POW_TOKEN=19, STRING=20, 
		NUMBER=21, FLOATING_POINT=22, LPAREN=23, RPAREN=24, LBRACE=25, RBRACE=26, 
		END=27, ASSIGN=28, VAR_NAME=29, SPACE=30, NEW_LINE=31, MAJOR=32, MINOR=33, 
		COMMA=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_TOKEN", "FLOAT_TOKEN", "STRING_TOKEN", "CONST_TOKEN", "PRINT_TOKEN", 
			"SCANF_TOKEN", "IF_TOKEN", "ELSE_TOKEN", "FOR_TOKEN", "WHILE_TOKEN", 
			"AND_TOKEN", "OR_TOKEN", "PLUS_TOKEN", "MINUS_TOKEN", "DIV_TOKEN", "MULTI_TOKEN", 
			"SQRT_TOKEN", "ABS_TOKEN", "POW_TOKEN", "STRING", "NATURAL", "NUMBER", 
			"FLOATING_POINT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "END", "ASSIGN", 
			"VAR_NAME", "SPACE", "NEW_LINE", "MAJOR", "MINOR", "COMMA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'apolo '", "'poseidon '", "'atenea '", "'cronos'", "'hermes'", 
			"'helios'", "'themis'", "'eris'", "'eon'", "'prometeo'", "'omega'", "'phi'", 
			"'sigma'", "'delta'", "'lambda'", "'chi'", "'demeter'", "'aletheia'", 
			"'dionisio'", null, null, null, "'('", "')'", "'{'", "'}'", "'-->'", 
			"'='", null, "' '", "'\n'", "'>'", "'<'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_TOKEN", "FLOAT_TOKEN", "STRING_TOKEN", "CONST_TOKEN", "PRINT_TOKEN", 
			"SCANF_TOKEN", "IF_TOKEN", "ELSE_TOKEN", "FOR_TOKEN", "WHILE_TOKEN", 
			"AND_TOKEN", "OR_TOKEN", "PLUS_TOKEN", "MINUS_TOKEN", "DIV_TOKEN", "MULTI_TOKEN", 
			"SQRT_TOKEN", "ABS_TOKEN", "POW_TOKEN", "STRING", "NUMBER", "FLOATING_POINT", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "END", "ASSIGN", "VAR_NAME", 
			"SPACE", "NEW_LINE", "MAJOR", "MINOR", "COMMA"
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


	public lang_lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lang_lexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u0103\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\7\25\u00ce\n\25"+
		"\f\25\16\25\u00d1\13\25\3\25\3\25\3\26\3\26\3\27\6\27\u00d8\n\27\r\27"+
		"\16\27\u00d9\3\30\6\30\u00dd\n\30\r\30\16\30\u00de\3\30\3\30\6\30\u00e3"+
		"\n\30\r\30\16\30\u00e4\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\37\6\37\u00f6\n\37\r\37\16\37\u00f7\3 \3 \3"+
		"!\3!\3\"\3\"\3#\3#\3$\3$\3\u00cf\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\27/"+
		"\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$\3\2\4\3\2\62;\3\2c"+
		"|\2\u0106\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\3I\3\2\2\2\5P\3\2\2\2\7Z\3\2\2\2\tb\3\2\2\2\13i\3\2\2\2\rp\3\2\2\2\17"+
		"w\3\2\2\2\21~\3\2\2\2\23\u0083\3\2\2\2\25\u0087\3\2\2\2\27\u0090\3\2\2"+
		"\2\31\u0096\3\2\2\2\33\u009a\3\2\2\2\35\u00a0\3\2\2\2\37\u00a6\3\2\2\2"+
		"!\u00ad\3\2\2\2#\u00b1\3\2\2\2%\u00b9\3\2\2\2\'\u00c2\3\2\2\2)\u00cb\3"+
		"\2\2\2+\u00d4\3\2\2\2-\u00d7\3\2\2\2/\u00dc\3\2\2\2\61\u00e6\3\2\2\2\63"+
		"\u00e8\3\2\2\2\65\u00ea\3\2\2\2\67\u00ec\3\2\2\29\u00ee\3\2\2\2;\u00f2"+
		"\3\2\2\2=\u00f5\3\2\2\2?\u00f9\3\2\2\2A\u00fb\3\2\2\2C\u00fd\3\2\2\2E"+
		"\u00ff\3\2\2\2G\u0101\3\2\2\2IJ\7c\2\2JK\7r\2\2KL\7q\2\2LM\7n\2\2MN\7"+
		"q\2\2NO\7\"\2\2O\4\3\2\2\2PQ\7r\2\2QR\7q\2\2RS\7u\2\2ST\7g\2\2TU\7k\2"+
		"\2UV\7f\2\2VW\7q\2\2WX\7p\2\2XY\7\"\2\2Y\6\3\2\2\2Z[\7c\2\2[\\\7v\2\2"+
		"\\]\7g\2\2]^\7p\2\2^_\7g\2\2_`\7c\2\2`a\7\"\2\2a\b\3\2\2\2bc\7e\2\2cd"+
		"\7t\2\2de\7q\2\2ef\7p\2\2fg\7q\2\2gh\7u\2\2h\n\3\2\2\2ij\7j\2\2jk\7g\2"+
		"\2kl\7t\2\2lm\7o\2\2mn\7g\2\2no\7u\2\2o\f\3\2\2\2pq\7j\2\2qr\7g\2\2rs"+
		"\7n\2\2st\7k\2\2tu\7q\2\2uv\7u\2\2v\16\3\2\2\2wx\7v\2\2xy\7j\2\2yz\7g"+
		"\2\2z{\7o\2\2{|\7k\2\2|}\7u\2\2}\20\3\2\2\2~\177\7g\2\2\177\u0080\7t\2"+
		"\2\u0080\u0081\7k\2\2\u0081\u0082\7u\2\2\u0082\22\3\2\2\2\u0083\u0084"+
		"\7g\2\2\u0084\u0085\7q\2\2\u0085\u0086\7p\2\2\u0086\24\3\2\2\2\u0087\u0088"+
		"\7r\2\2\u0088\u0089\7t\2\2\u0089\u008a\7q\2\2\u008a\u008b\7o\2\2\u008b"+
		"\u008c\7g\2\2\u008c\u008d\7v\2\2\u008d\u008e\7g\2\2\u008e\u008f\7q\2\2"+
		"\u008f\26\3\2\2\2\u0090\u0091\7q\2\2\u0091\u0092\7o\2\2\u0092\u0093\7"+
		"g\2\2\u0093\u0094\7i\2\2\u0094\u0095\7c\2\2\u0095\30\3\2\2\2\u0096\u0097"+
		"\7r\2\2\u0097\u0098\7j\2\2\u0098\u0099\7k\2\2\u0099\32\3\2\2\2\u009a\u009b"+
		"\7u\2\2\u009b\u009c\7k\2\2\u009c\u009d\7i\2\2\u009d\u009e\7o\2\2\u009e"+
		"\u009f\7c\2\2\u009f\34\3\2\2\2\u00a0\u00a1\7f\2\2\u00a1\u00a2\7g\2\2\u00a2"+
		"\u00a3\7n\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7c\2\2\u00a5\36\3\2\2\2\u00a6"+
		"\u00a7\7n\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7o\2\2\u00a9\u00aa\7d\2\2"+
		"\u00aa\u00ab\7f\2\2\u00ab\u00ac\7c\2\2\u00ac \3\2\2\2\u00ad\u00ae\7e\2"+
		"\2\u00ae\u00af\7j\2\2\u00af\u00b0\7k\2\2\u00b0\"\3\2\2\2\u00b1\u00b2\7"+
		"f\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7o\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6"+
		"\7v\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7t\2\2\u00b8$\3\2\2\2\u00b9\u00ba"+
		"\7c\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7v\2\2\u00bd"+
		"\u00be\7j\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7c\2\2"+
		"\u00c1&\3\2\2\2\u00c2\u00c3\7f\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7q\2"+
		"\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9"+
		"\7k\2\2\u00c9\u00ca\7q\2\2\u00ca(\3\2\2\2\u00cb\u00cf\7$\2\2\u00cc\u00ce"+
		"\13\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00d0\3\2\2\2"+
		"\u00cf\u00cd\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3"+
		"\7$\2\2\u00d3*\3\2\2\2\u00d4\u00d5\t\2\2\2\u00d5,\3\2\2\2\u00d6\u00d8"+
		"\5+\26\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da.\3\2\2\2\u00db\u00dd\5+\26\2\u00dc\u00db\3\2\2\2"+
		"\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00e2\7\60\2\2\u00e1\u00e3\5+\26\2\u00e2\u00e1\3\2\2\2"+
		"\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\60"+
		"\3\2\2\2\u00e6\u00e7\7*\2\2\u00e7\62\3\2\2\2\u00e8\u00e9\7+\2\2\u00e9"+
		"\64\3\2\2\2\u00ea\u00eb\7}\2\2\u00eb\66\3\2\2\2\u00ec\u00ed\7\177\2\2"+
		"\u00ed8\3\2\2\2\u00ee\u00ef\7/\2\2\u00ef\u00f0\7/\2\2\u00f0\u00f1\7@\2"+
		"\2\u00f1:\3\2\2\2\u00f2\u00f3\7?\2\2\u00f3<\3\2\2\2\u00f4\u00f6\t\3\2"+
		"\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8>\3\2\2\2\u00f9\u00fa\7\"\2\2\u00fa@\3\2\2\2\u00fb\u00fc"+
		"\7\f\2\2\u00fcB\3\2\2\2\u00fd\u00fe\7@\2\2\u00feD\3\2\2\2\u00ff\u0100"+
		"\7>\2\2\u0100F\3\2\2\2\u0101\u0102\7.\2\2\u0102H\3\2\2\2\b\2\u00cf\u00d9"+
		"\u00de\u00e4\u00f7\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}