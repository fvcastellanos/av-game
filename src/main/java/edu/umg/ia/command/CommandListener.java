package edu.umg.ia.command;

import edu.umg.ia.scanner.AdventureGameBaseListener;
import edu.umg.ia.scanner.AdventureGameParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommandListener extends AdventureGameBaseListener {

    private Logger logger = LoggerFactory.getLogger(CommandListener.class);

    CommandEnum result;

    @Override
    public void exitStartGame(AdventureGameParser.StartGameContext ctx) {
        logger.info("start game: {}", ctx.getText());
        result = CommandEnum.START_GAME;
    }

    @Override
    public void exitUse(AdventureGameParser.UseContext ctx) {
        logger.info("use: {}", ctx.getText());
        result = CommandEnum.USE;
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        logger.error("something happened: {}", node.toStringTree());
        result = CommandEnum.ERROR;
    }

    public CommandEnum getResult() {
        return result;
    }
}
