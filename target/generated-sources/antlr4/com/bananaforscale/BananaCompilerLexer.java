// Generated from C:/Users/franzj/Documents/Software Engineering/BananaCompiler/src/main/antlr4/com/bananaforscale\BananaCompiler.g4 by ANTLR 4.5
package com.bananaforscale;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BananaCompilerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, EXPRESSION=2, DECLARATION=3, DEFINITION=4, MATHOPERATION=5, BASICOPERATION=6, 
		OPERAND=7, CONSTANT=8, NUMBER=9, VARIABLE=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "EXPRESSION", "DECLARATION", "DEFINITION", "MATHOPERATION", "BASICOPERATION", 
		"OPERAND", "CONSTANT", "NUMBER", "VARIABLE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'§'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "EXPRESSION", "DECLARATION", "DEFINITION", "MATHOPERATION", 
		"BASICOPERATION", "OPERAND", "CONSTANT", "NUMBER", "VARIABLE"
	};
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public BananaCompilerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BananaCompiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\fN\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\5\5)\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\62\n\6\3\7\3\7\3\b\3\b\3"+
		"\b\5\b9\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tA\n\t\3\n\6\nD\n\n\r\n\16\nE\3"+
		"\13\3\13\7\13J\n\13\f\13\16\13M\13\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\3\2\6\5\2,-//\61\61\3\2\62;\5\2C\\aac|\6\2\62;C\\a"+
		"ac|W\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2"+
		"\2\2\5\35\3\2\2\2\7\37\3\2\2\2\t(\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17"+
		"8\3\2\2\2\21@\3\2\2\2\23C\3\2\2\2\25G\3\2\2\2\27\30\7\u00c4\2\2\30\31"+
		"\7\u00a9\2\2\31\4\3\2\2\2\32\36\5\7\4\2\33\36\5\t\5\2\34\36\5\13\6\2\35"+
		"\32\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\6\3\2\2\2\37 \7p\2\2 !\7g\2"+
		"\2!\"\7y\2\2\"#\3\2\2\2#$\5\25\13\2$\b\3\2\2\2%&\7p\2\2&\'\7g\2\2\')\7"+
		"y\2\2(%\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\5\23\n\2+\n\3\2\2\2,\62\5\17\b\2"+
		"-.\5\17\b\2./\5\r\7\2/\60\5\17\b\2\60\62\3\2\2\2\61,\3\2\2\2\61-\3\2\2"+
		"\2\62\f\3\2\2\2\63\64\t\2\2\2\64\16\3\2\2\2\659\5\25\13\2\669\5\23\n\2"+
		"\679\5\21\t\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29\20\3\2\2\2:;\7R\2\2"+
		";A\7K\2\2<A\7G\2\2=>\7D\2\2>?\7H\2\2?A\7U\2\2@:\3\2\2\2@<\3\2\2\2@=\3"+
		"\2\2\2A\22\3\2\2\2BD\t\3\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F"+
		"\24\3\2\2\2GK\t\4\2\2HJ\t\5\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2"+
		"\2L\26\3\2\2\2MK\3\2\2\2\n\2\35(\618@EK\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}