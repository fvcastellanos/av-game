package edu.umg.ia.command;

import edu.umg.ia.command.domain.Command;
import edu.umg.ia.scanner.AdventureGameLexer;
import edu.umg.ia.scanner.AdventureGameParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommandParser {

    private Logger logger = LoggerFactory.getLogger(CommandParser.class);

    public Command parse(String command) {

        CommandListener commandListener = syntaxAnalyzer(command);
        Command result = commandListener.getCommand();

        logger.info("command: {} accepted", command);
        return result;
    }

    private CommandListener syntaxAnalyzer(String command) {
        CommandListener commandListener = new CommandListener();

        try {
            logger.info("verifying command: {}", command);
            AdventureGameLexer lexer = new AdventureGameLexer(CharStreams.fromString(command));

            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            AdventureGameParser gameParser = new AdventureGameParser(tokenStream);
            AdventureGameParser.CommandsContext commandsContext = gameParser.commands();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(commandListener, commandsContext);

            logger.info("command {} verified", command);

        } catch (Exception ex) {
            logger.error("something happended with the command: {} - {}", command, ex);

        }
        return commandListener;
    }
}
