// Generated from java-escape by ANTLR 4.11.1
package org.example;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9,
		T__9=10, MODIFICATORS=11, TYPE=12, PHRASE=13, WS=14, PUBLIC=15, PROTECTED=16,
		PRIVATE=17, OBR=18, CBR=19, INT=20, FLOAT=21, SHORT=22, STRING=23, VOID=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
			"T__9", "MODIFICATORS", "TYPE", "NEW_DIGIT", "PHRASE", "WS", "PUBLIC",
			"PROTECTED", "PRIVATE", "OBR", "CBR", "INT", "FLOAT", "SHORT", "STRING",
			"VOID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "';'", "'='", "'\"'", "'('", "')'", "','",
			"'{ }'", null, null, null, null, "'public'", "'protected'", "'private'",
			"'['", "']'", "'int'", "'float'", "'short'", "'String'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "MODIFICATORS",
			"TYPE", "PHRASE", "WS", "PUBLIC", "PROTECTED", "PRIVATE", "OBR", "CBR",
			"INT", "FLOAT", "SHORT", "STRING", "VOID"
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


	public gLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\u0004\u0000\u0018\u00b6\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\nQ\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bX\b"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0004\r]\b\r\u000b\r\f\r^\u0001\r\u0004"+
		"\rb\b\r\u000b\r\f\rc\u0001\r\u0004\rg\b\r\u000b\r\f\rh\u0001\r\u0004\r"+
		"l\b\r\u000b\r\f\rm\u0001\r\u0004\rq\b\r\u000b\r\f\rr\u0003\ru\b\r\u0001"+
		"\u000e\u0004\u000ex\b\u000e\u000b\u000e\f\u000ey\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\u0000\u001b\r\u001d\u000e\u001f\u000f"+
		"!\u0010#\u0011%\u0012\'\u0013)\u0014+\u0015-\u0016/\u00171\u0018\u0001"+
		"\u0000\u0002\u0001\u000009\u0003\u0000\t\n\r\r  \u00c4\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0001"+
		"3\u0001\u0000\u0000\u0000\u00039\u0001\u0000\u0000\u0000\u0005;\u0001"+
		"\u0000\u0000\u0000\u0007=\u0001\u0000\u0000\u0000\t?\u0001\u0000\u0000"+
		"\u0000\u000bA\u0001\u0000\u0000\u0000\rC\u0001\u0000\u0000\u0000\u000f"+
		"E\u0001\u0000\u0000\u0000\u0011G\u0001\u0000\u0000\u0000\u0013I\u0001"+
		"\u0000\u0000\u0000\u0015P\u0001\u0000\u0000\u0000\u0017W\u0001\u0000\u0000"+
		"\u0000\u0019Y\u0001\u0000\u0000\u0000\u001bt\u0001\u0000\u0000\u0000\u001d"+
		"w\u0001\u0000\u0000\u0000\u001f}\u0001\u0000\u0000\u0000!\u0084\u0001"+
		"\u0000\u0000\u0000#\u008e\u0001\u0000\u0000\u0000%\u0096\u0001\u0000\u0000"+
		"\u0000\'\u0098\u0001\u0000\u0000\u0000)\u009a\u0001\u0000\u0000\u0000"+
		"+\u009e\u0001\u0000\u0000\u0000-\u00a4\u0001\u0000\u0000\u0000/\u00aa"+
		"\u0001\u0000\u0000\u00001\u00b1\u0001\u0000\u0000\u000034\u0005c\u0000"+
		"\u000045\u0005l\u0000\u000056\u0005a\u0000\u000067\u0005s\u0000\u0000"+
		"78\u0005s\u0000\u00008\u0002\u0001\u0000\u0000\u00009:\u0005{\u0000\u0000"+
		":\u0004\u0001\u0000\u0000\u0000;<\u0005}\u0000\u0000<\u0006\u0001\u0000"+
		"\u0000\u0000=>\u0005;\u0000\u0000>\b\u0001\u0000\u0000\u0000?@\u0005="+
		"\u0000\u0000@\n\u0001\u0000\u0000\u0000AB\u0005\"\u0000\u0000B\f\u0001"+
		"\u0000\u0000\u0000CD\u0005(\u0000\u0000D\u000e\u0001\u0000\u0000\u0000"+
		"EF\u0005)\u0000\u0000F\u0010\u0001\u0000\u0000\u0000GH\u0005,\u0000\u0000"+
		"H\u0012\u0001\u0000\u0000\u0000IJ\u0005{\u0000\u0000JK\u0005 \u0000\u0000"+
		"KL\u0005}\u0000\u0000L\u0014\u0001\u0000\u0000\u0000MQ\u0003\u001f\u000f"+
		"\u0000NQ\u0003!\u0010\u0000OQ\u0003#\u0011\u0000PM\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\u0016\u0001\u0000"+
		"\u0000\u0000RX\u0003)\u0014\u0000SX\u0003+\u0015\u0000TX\u0003-\u0016"+
		"\u0000UX\u0003/\u0017\u0000VX\u00031\u0018\u0000WR\u0001\u0000\u0000\u0000"+
		"WS\u0001\u0000\u0000\u0000WT\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000WV\u0001\u0000\u0000\u0000X\u0018\u0001\u0000\u0000\u0000YZ\u0007"+
		"\u0000\u0000\u0000Z\u001a\u0001\u0000\u0000\u0000[]\u0002az\u0000\\[\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_u\u0001\u0000\u0000\u0000`b\u0002AZ\u0000a"+
		"`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000du\u0001\u0000\u0000\u0000eg\u0003\u0019"+
		"\f\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000iu\u0001\u0000\u0000\u0000jl\u0005"+
		"_\u0000\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nu\u0001\u0000\u0000\u0000"+
		"oq\u0005-\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000"+
		"\u0000t\\\u0001\u0000\u0000\u0000ta\u0001\u0000\u0000\u0000tf\u0001\u0000"+
		"\u0000\u0000tk\u0001\u0000\u0000\u0000tp\u0001\u0000\u0000\u0000u\u001c"+
		"\u0001\u0000\u0000\u0000vx\u0007\u0001\u0000\u0000wv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0006\u000e\u0000\u0000|\u001e"+
		"\u0001\u0000\u0000\u0000}~\u0005p\u0000\u0000~\u007f\u0005u\u0000\u0000"+
		"\u007f\u0080\u0005b\u0000\u0000\u0080\u0081\u0005l\u0000\u0000\u0081\u0082"+
		"\u0005i\u0000\u0000\u0082\u0083\u0005c\u0000\u0000\u0083 \u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005p\u0000\u0000\u0085\u0086\u0005r\u0000\u0000"+
		"\u0086\u0087\u0005o\u0000\u0000\u0087\u0088\u0005t\u0000\u0000\u0088\u0089"+
		"\u0005e\u0000\u0000\u0089\u008a\u0005c\u0000\u0000\u008a\u008b\u0005t"+
		"\u0000\u0000\u008b\u008c\u0005e\u0000\u0000\u008c\u008d\u0005d\u0000\u0000"+
		"\u008d\"\u0001\u0000\u0000\u0000\u008e\u008f\u0005p\u0000\u0000\u008f"+
		"\u0090\u0005r\u0000\u0000\u0090\u0091\u0005i\u0000\u0000\u0091\u0092\u0005"+
		"v\u0000\u0000\u0092\u0093\u0005a\u0000\u0000\u0093\u0094\u0005t\u0000"+
		"\u0000\u0094\u0095\u0005e\u0000\u0000\u0095$\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005[\u0000\u0000\u0097&\u0001\u0000\u0000\u0000\u0098\u0099\u0005"+
		"]\u0000\u0000\u0099(\u0001\u0000\u0000\u0000\u009a\u009b\u0005i\u0000"+
		"\u0000\u009b\u009c\u0005n\u0000\u0000\u009c\u009d\u0005t\u0000\u0000\u009d"+
		"*\u0001\u0000\u0000\u0000\u009e\u009f\u0005f\u0000\u0000\u009f\u00a0\u0005"+
		"l\u0000\u0000\u00a0\u00a1\u0005o\u0000\u0000\u00a1\u00a2\u0005a\u0000"+
		"\u0000\u00a2\u00a3\u0005t\u0000\u0000\u00a3,\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005s\u0000\u0000\u00a5\u00a6\u0005h\u0000\u0000\u00a6\u00a7\u0005"+
		"o\u0000\u0000\u00a7\u00a8\u0005r\u0000\u0000\u00a8\u00a9\u0005t\u0000"+
		"\u0000\u00a9.\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005S\u0000\u0000\u00ab"+
		"\u00ac\u0005t\u0000\u0000\u00ac\u00ad\u0005r\u0000\u0000\u00ad\u00ae\u0005"+
		"i\u0000\u0000\u00ae\u00af\u0005n\u0000\u0000\u00af\u00b0\u0005g\u0000"+
		"\u0000\u00b00\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005v\u0000\u0000\u00b2"+
		"\u00b3\u0005o\u0000\u0000\u00b3\u00b4\u0005i\u0000\u0000\u00b4\u00b5\u0005"+
		"d\u0000\u0000\u00b52\u0001\u0000\u0000\u0000\n\u0000PW^chmrty\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}