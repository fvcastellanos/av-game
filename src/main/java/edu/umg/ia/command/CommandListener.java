package edu.umg.ia.command;

import edu.umg.ia.scanner.AdventureGameBaseListener;
import edu.umg.ia.scanner.AdventureGameParser;
import io.vavr.control.Validation;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommandListener extends AdventureGameBaseListener {

    private Logger logger = LoggerFactory.getLogger(CommandListener.class);
    private Validation<String, String> commandValidation;

    @Override
    public void enterComando(AdventureGameParser.ComandoContext ctx) {
    }

    @Override
    public void exitComandos(AdventureGameParser.ComandosContext ctx) {
        logger.info("comando: {}", ctx.getText());
    }

    @Override
    public void exitIniciarJuego(AdventureGameParser.IniciarJuegoContext ctx) {
        logger.info("iniciar juego -> {}", ctx.getText());
        commandValidation = valid("iniciar juego");
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        logger.error("algo no anda bien: {}", node.toStringTree());
        commandValidation = invalid("lo siento, no entiendo...");
    }

    public Validation<String, String> getCommandValidation() {
        return commandValidation;
    }


    private Validation<String, String> valid(String text) {
        return Validation.valid(text);
    }

    private Validation<String, String> invalid(String text) {
        return Validation.invalid(text);
    }
}
