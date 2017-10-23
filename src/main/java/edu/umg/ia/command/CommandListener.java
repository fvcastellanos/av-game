package edu.umg.ia.command;

import edu.umg.ia.scanner.AdventureGameBaseListener;
import edu.umg.ia.scanner.AdventureGameParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommandListener extends AdventureGameBaseListener {

    private Logger logger = LoggerFactory.getLogger(CommandListener.class);

    @Override
    public void enterComando(AdventureGameParser.ComandoContext ctx) {
//        logger.info("Comando: {}", ctx.getText());
    }

    @Override
    public void exitComandos(AdventureGameParser.ComandosContext ctx) {

        String comando = ctx.getText();
        if (comando.equals("iniciar")) {
            ctx.iniciarJuego();
        }

        logger.info("Comando: {}", ctx.getText());
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        logger.error(node.getText());
    }

}
