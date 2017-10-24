// Generated from .\AdventureGame.g4 by ANTLR 4.7
package edu.umg.ia.scanner;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AdventureGameParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, WS=34, ID=35;
	public static final int
		RULE_startGame = 0, RULE_clue = 1, RULE_whereAmI = 2, RULE_getInstructions = 3, 
		RULE_viewInventory = 4, RULE_takeItem = 5, RULE_viewItem = 6, RULE_openItem = 7, 
		RULE_closeItem = 8, RULE_writeItem = 9, RULE_use = 10, RULE_commands = 11, 
		RULE_command = 12;
	public static final String[] ruleNames = {
		"startGame", "clue", "whereAmI", "getInstructions", "viewInventory", "takeItem", 
		"viewItem", "openItem", "closeItem", "writeItem", "use", "commands", "command"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'iniciar'", "'comenzar'", "'empezar'", "'el'", "'juego'", "'ayuda'", 
		"'alguna pista'", "'no se que hacer'", "'donde estoy'", "'que paso'", 
		"'que hubo'", "'ver'", "'obtener'", "'repasar'", "'leer'", "'las'", "'instrucciones'", 
		"'revisar'", "'consultar'", "'inventario'", "'tomar'", "'agarrar'", "'recoger'", 
		"'la'", "'los'", "'observar'", "'abrir'", "'cerrar'", "'ingresar'", "'escribir'", 
		"'usar'", "'utilizar'", "'en'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "WS", "ID"
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

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AdventureGame.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AdventureGameParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartGameContext extends ParserRuleContext {
		public StartGameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startGame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).enterStartGame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).exitStartGame(this);
		}
	}

	public final StartGameContext startGame() throws RecognitionException {
		StartGameContext _localctx = new StartGameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startGame);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(27);
				match(T__3);
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			match(T__4);
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

	public static class ClueContext extends ParserRuleContext {
		public ClueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).enterClue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).exitClue(this);
		}
	}

	public final ClueContext clue() throws RecognitionException {
		ClueContext _localctx = new ClueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_clue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class WhereAmIContext extends ParserRuleContext {
		public WhereAmIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereAmI; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).enterWhereAmI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).exitWhereAmI(this);
		}
	}

	public final WhereAmIContext whereAmI() throws RecognitionException {
		WhereAmIContext _localctx = new WhereAmIContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_whereAmI);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class GetInstructionsContext extends ParserRuleContext {
		public GetInstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getInstructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).enterGetInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).exitGetInstructions(this);
		}
	}

	public final GetInstructionsContext getInstructions() throws RecognitionException {
		GetInstructionsContext _localctx = new GetInstructionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_getInstructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(40);
				match(T__15);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(T__16);
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

	public static class ViewInventoryContext extends ParserRuleContext {
		public ViewInventoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewInventory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).enterViewInventory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).exitViewInventory(this);
		}
	}

	public final ViewInventoryContext viewInventory() throws RecognitionException {
		ViewInventoryContext _localctx = new ViewInventoryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_viewInventory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__17) | (1L << T__18))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(49);
				match(T__3);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(T__19);
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

	public static class TakeItemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AdventureGameParser.ID, 0); }
		public TakeItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_takeItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).enterTakeItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).exitTakeItem(this);
		}
	}

	public final TakeItemContext takeItem() throws RecognitionException {
		TakeItemContext _localctx = new TakeItemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_takeItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__15) | (1L << T__23) | (1L << T__24))) != 0)) {
				{
				{
				setState(58);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__15) | (1L << T__23) | (1L << T__24))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(ID);
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

	public static class ViewItemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AdventureGameParser.ID, 0); }
		public ViewItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).enterViewItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).exitViewItem(this);
		}
	}

	public final ViewItemContext viewItem() throws RecognitionException {
		ViewItemContext _localctx = new ViewItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_viewItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__17) | (1L << T__25))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__15) | (1L << T__23) | (1L << T__24))) != 0)) {
				{
				{
				setState(67);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__15) | (1L << T__23) | (1L << T__24))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(ID);
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

	public static class OpenItemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AdventureGameParser.ID, 0); }
		public OpenItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).enterOpenItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).exitOpenItem(this);
		}
	}

	public final OpenItemContext openItem() throws RecognitionException {
		OpenItemContext _localctx = new OpenItemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_openItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(75);
			match(T__26);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__15) | (1L << T__23) | (1L << T__24))) != 0)) {
				{
				{
				setState(76);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__15) | (1L << T__23) | (1L << T__24))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(ID);
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

	public static class CloseItemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AdventureGameParser.ID, 0); }
		public CloseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).enterCloseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).exitCloseItem(this);
		}
	}

	public final CloseItemContext closeItem() throws RecognitionException {
		CloseItemContext _localctx = new CloseItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_closeItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(84);
			match(T__27);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__15) | (1L << T__23) | (1L << T__24))) != 0)) {
				{
				{
				setState(85);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__15) | (1L << T__23) | (1L << T__24))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(ID);
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

	public static class WriteItemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AdventureGameParser.ID, 0); }
		public WriteItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).enterWriteItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).exitWriteItem(this);
		}
	}

	public final WriteItemContext writeItem() throws RecognitionException {
		WriteItemContext _localctx = new WriteItemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_writeItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==T__29) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__15) | (1L << T__23) | (1L << T__24))) != 0)) {
				{
				{
				setState(94);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__15) | (1L << T__23) | (1L << T__24))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(ID);
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

	public static class UseContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AdventureGameParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AdventureGameParser.ID, i);
		}
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).exitUse(this);
		}
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_use);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==T__30 || _la==T__31) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__15) | (1L << T__23) | (1L << T__24))) != 0)) {
				{
				{
				setState(103);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__15) | (1L << T__23) | (1L << T__24))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(ID);
			{
			setState(110);
			match(T__32);
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__15) | (1L << T__23) | (1L << T__24))) != 0)) {
				{
				{
				setState(111);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__15) | (1L << T__23) | (1L << T__24))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(ID);
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

	public static class CommandsContext extends ParserRuleContext {
		public StartGameContext startGame() {
			return getRuleContext(StartGameContext.class,0);
		}
		public WhereAmIContext whereAmI() {
			return getRuleContext(WhereAmIContext.class,0);
		}
		public GetInstructionsContext getInstructions() {
			return getRuleContext(GetInstructionsContext.class,0);
		}
		public ViewInventoryContext viewInventory() {
			return getRuleContext(ViewInventoryContext.class,0);
		}
		public TakeItemContext takeItem() {
			return getRuleContext(TakeItemContext.class,0);
		}
		public ViewItemContext viewItem() {
			return getRuleContext(ViewItemContext.class,0);
		}
		public OpenItemContext openItem() {
			return getRuleContext(OpenItemContext.class,0);
		}
		public CloseItemContext closeItem() {
			return getRuleContext(CloseItemContext.class,0);
		}
		public WriteItemContext writeItem() {
			return getRuleContext(WriteItemContext.class,0);
		}
		public UseContext use() {
			return getRuleContext(UseContext.class,0);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).exitCommands(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_commands);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				startGame();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				whereAmI();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				getInstructions();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				viewInventory();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				takeItem();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				viewItem();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				openItem();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(126);
				closeItem();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(127);
				writeItem();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(128);
				use();
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

	public static class CommandContext extends ParserRuleContext {
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AdventureGameListener ) ((AdventureGameListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_command);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			commands();
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					command();
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u008d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\7\5,\n\5\f\5\16\5/\13\5\3\5\3\5\3\6\3\6\7\6"+
		"\65\n\6\f\6\16\68\13\6\3\6\3\6\3\7\3\7\7\7>\n\7\f\7\16\7A\13\7\3\7\3\7"+
		"\3\b\3\b\7\bG\n\b\f\b\16\bJ\13\b\3\b\3\b\3\t\3\t\7\tP\n\t\f\t\16\tS\13"+
		"\t\3\t\3\t\3\n\3\n\7\nY\n\n\f\n\16\n\\\13\n\3\n\3\n\3\13\3\13\7\13b\n"+
		"\13\f\13\16\13e\13\13\3\13\3\13\3\f\3\f\7\fk\n\f\f\f\16\fn\13\f\3\f\3"+
		"\f\3\f\7\fs\n\f\f\f\16\fv\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u0084\n\r\3\16\3\16\7\16\u0088\n\16\f\16\16\16\u008b\13\16"+
		"\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\f\3\2\3\5\3\2\b\n\3\2"+
		"\13\r\3\2\16\21\4\2\16\16\24\25\3\2\27\31\5\2\6\6\22\22\32\33\5\2\16\16"+
		"\24\24\34\34\3\2\37 \3\2!\"\2\u0093\2\34\3\2\2\2\4%\3\2\2\2\6\'\3\2\2"+
		"\2\b)\3\2\2\2\n\62\3\2\2\2\f;\3\2\2\2\16D\3\2\2\2\20M\3\2\2\2\22V\3\2"+
		"\2\2\24_\3\2\2\2\26h\3\2\2\2\30\u0083\3\2\2\2\32\u0085\3\2\2\2\34 \t\2"+
		"\2\2\35\37\7\6\2\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#"+
		"\3\2\2\2\" \3\2\2\2#$\7\7\2\2$\3\3\2\2\2%&\t\3\2\2&\5\3\2\2\2\'(\t\4\2"+
		"\2(\7\3\2\2\2)-\t\5\2\2*,\7\22\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2"+
		"\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\23\2\2\61\t\3\2\2\2\62\66\t\6\2\2\63"+
		"\65\7\6\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679"+
		"\3\2\2\28\66\3\2\2\29:\7\26\2\2:\13\3\2\2\2;?\t\7\2\2<>\t\b\2\2=<\3\2"+
		"\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7%\2\2C\r\3\2"+
		"\2\2DH\t\t\2\2EG\t\b\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2"+
		"\2\2JH\3\2\2\2KL\7%\2\2L\17\3\2\2\2MQ\7\35\2\2NP\t\b\2\2ON\3\2\2\2PS\3"+
		"\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7%\2\2U\21\3\2\2\2VZ"+
		"\7\36\2\2WY\t\b\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2"+
		"\\Z\3\2\2\2]^\7%\2\2^\23\3\2\2\2_c\t\n\2\2`b\t\b\2\2a`\3\2\2\2be\3\2\2"+
		"\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7%\2\2g\25\3\2\2\2hl\t\13"+
		"\2\2ik\t\b\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2"+
		"\2\2op\7%\2\2pt\7#\2\2qs\t\b\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2"+
		"\2uw\3\2\2\2vt\3\2\2\2wx\7%\2\2x\27\3\2\2\2y\u0084\5\2\2\2z\u0084\5\6"+
		"\4\2{\u0084\5\b\5\2|\u0084\5\n\6\2}\u0084\5\f\7\2~\u0084\5\16\b\2\177"+
		"\u0084\5\20\t\2\u0080\u0084\5\22\n\2\u0081\u0084\5\24\13\2\u0082\u0084"+
		"\5\26\f\2\u0083y\3\2\2\2\u0083z\3\2\2\2\u0083{\3\2\2\2\u0083|\3\2\2\2"+
		"\u0083}\3\2\2\2\u0083~\3\2\2\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\31\3\2\2\2\u0085\u0089\5\30\r"+
		"\2\u0086\u0088\5\32\16\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\33\3\2\2\2\u008b\u0089\3\2\2"+
		"\2\16 -\66?HQZclt\u0083\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}