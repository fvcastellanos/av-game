package edu.umg.ia.command;

import edu.umg.ia.command.domain.Command;
import edu.umg.ia.command.domain.CommandEnum;
import edu.umg.ia.command.domain.CommandFactory;
import edu.umg.ia.scanner.AdventureGameBaseListener;
import edu.umg.ia.scanner.AdventureGameParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

public class CommandListener extends AdventureGameBaseListener {

    private Logger logger = LoggerFactory.getLogger(CommandListener.class);

    private Command command;
    private Stack<String> identifierStack;

    public CommandListener() {
        identifierStack = new Stack<>();
    }

    @Override
    public void exitStartGame(AdventureGameParser.StartGameContext ctx) {
        logger.info("start game: {}", ctx.getText());
        command = CommandFactory.startGame();
    }

    @Override
    public void exitUse(AdventureGameParser.UseContext ctx) {
        logger.info("use: {}", ctx.getText());

        String toItem = identifierStack.pop();
        String item = identifierStack.pop();
        command = CommandFactory.useItemInToItem(item, toItem);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        logger.error("something happened: {}", node.toStringTree());
        command = CommandFactory.error();
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        logger.info("node: {}, type: {}", node.getText(), node.getSymbol().getType());
        storeIdentifier(node);
    }

    public Command getCommand() {
        return command;
    }

    private void storeIdentifier(TerminalNode node) {
        if (node.getSymbol().getType() == AdventureGameParser.ID) {
            logger.info("node: {} is an ID, storing into the stack", node.getText());
            identifierStack.push(node.getText());
        }
    }
}
