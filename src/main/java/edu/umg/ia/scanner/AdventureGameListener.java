// Generated from .\AdventureGame.g4 by ANTLR 4.7
package edu.umg.ia.scanner;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AdventureGameParser}.
 */
public interface AdventureGameListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AdventureGameParser#iniciarJuego}.
	 * @param ctx the parse tree
	 */
	void enterIniciarJuego(AdventureGameParser.IniciarJuegoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdventureGameParser#iniciarJuego}.
	 * @param ctx the parse tree
	 */
	void exitIniciarJuego(AdventureGameParser.IniciarJuegoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdventureGameParser#dondeEstoy}.
	 * @param ctx the parse tree
	 */
	void enterDondeEstoy(AdventureGameParser.DondeEstoyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdventureGameParser#dondeEstoy}.
	 * @param ctx the parse tree
	 */
	void exitDondeEstoy(AdventureGameParser.DondeEstoyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdventureGameParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(AdventureGameParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdventureGameParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(AdventureGameParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdventureGameParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(AdventureGameParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdventureGameParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(AdventureGameParser.ComandoContext ctx);
}