// Generated from .\AdventureGame.g4 by ANTLR 4.7
package edu.umg.ia.scanner;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AdventureGameParser}.
 */
public interface AdventureGameListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AdventureGameParser#startGame}.
	 * @param ctx the parse tree
	 */
	void enterStartGame(AdventureGameParser.StartGameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdventureGameParser#startGame}.
	 * @param ctx the parse tree
	 */
	void exitStartGame(AdventureGameParser.StartGameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdventureGameParser#clue}.
	 * @param ctx the parse tree
	 */
	void enterClue(AdventureGameParser.ClueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdventureGameParser#clue}.
	 * @param ctx the parse tree
	 */
	void exitClue(AdventureGameParser.ClueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdventureGameParser#whereAmI}.
	 * @param ctx the parse tree
	 */
	void enterWhereAmI(AdventureGameParser.WhereAmIContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdventureGameParser#whereAmI}.
	 * @param ctx the parse tree
	 */
	void exitWhereAmI(AdventureGameParser.WhereAmIContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdventureGameParser#getInstructions}.
	 * @param ctx the parse tree
	 */
	void enterGetInstructions(AdventureGameParser.GetInstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdventureGameParser#getInstructions}.
	 * @param ctx the parse tree
	 */
	void exitGetInstructions(AdventureGameParser.GetInstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdventureGameParser#viewInventory}.
	 * @param ctx the parse tree
	 */
	void enterViewInventory(AdventureGameParser.ViewInventoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdventureGameParser#viewInventory}.
	 * @param ctx the parse tree
	 */
	void exitViewInventory(AdventureGameParser.ViewInventoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdventureGameParser#takeItem}.
	 * @param ctx the parse tree
	 */
	void enterTakeItem(AdventureGameParser.TakeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdventureGameParser#takeItem}.
	 * @param ctx the parse tree
	 */
	void exitTakeItem(AdventureGameParser.TakeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdventureGameParser#viewItem}.
	 * @param ctx the parse tree
	 */
	void enterViewItem(AdventureGameParser.ViewItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdventureGameParser#viewItem}.
	 * @param ctx the parse tree
	 */
	void exitViewItem(AdventureGameParser.ViewItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdventureGameParser#openItem}.
	 * @param ctx the parse tree
	 */
	void enterOpenItem(AdventureGameParser.OpenItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdventureGameParser#openItem}.
	 * @param ctx the parse tree
	 */
	void exitOpenItem(AdventureGameParser.OpenItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdventureGameParser#closeItem}.
	 * @param ctx the parse tree
	 */
	void enterCloseItem(AdventureGameParser.CloseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdventureGameParser#closeItem}.
	 * @param ctx the parse tree
	 */
	void exitCloseItem(AdventureGameParser.CloseItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdventureGameParser#writeItem}.
	 * @param ctx the parse tree
	 */
	void enterWriteItem(AdventureGameParser.WriteItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdventureGameParser#writeItem}.
	 * @param ctx the parse tree
	 */
	void exitWriteItem(AdventureGameParser.WriteItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdventureGameParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(AdventureGameParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdventureGameParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(AdventureGameParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdventureGameParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(AdventureGameParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdventureGameParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(AdventureGameParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdventureGameParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(AdventureGameParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdventureGameParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(AdventureGameParser.CommandContext ctx);
}