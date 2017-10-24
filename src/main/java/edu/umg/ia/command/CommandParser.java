package edu.umg.ia.command;

import edu.umg.ia.scanner.AdventureGameLexer;
import edu.umg.ia.scanner.AdventureGameParser;
import io.vavr.control.Either;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CommandParser {

    private Logger logger = LoggerFactory.getLogger(CommandParser.class);

    public String parse(String command) {

        CommandListener commandListener = syntaxAnalyzer(command);
        CommandEnum result = commandListener.getResult();

        if (result.equals(CommandEnum.ERROR)) {
            logger.error("there is a syntax error: {}", result.getText());
            return result.getText();
        }

        logger.info("command: {} accepted", command);
        return result.getText();
    }

    private CommandListener syntaxAnalyzer(String command) {
        logger.info("verifying command: {}", command);
        AdventureGameLexer lexer = new AdventureGameLexer(CharStreams.fromString(command));
        CommandListener commandListener = new CommandListener();

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        AdventureGameParser gameParser = new AdventureGameParser(tokenStream);
        AdventureGameParser.CommandsContext comandosContext = gameParser.commands();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(commandListener, comandosContext);

        logger.info("command {} verified", command);
        return commandListener;
    }

    private String listToString(List<String> stringList) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");
        stringList.stream()
                .forEach(string -> {
                    stringBuilder.append(string).append(", ");
                });

        stringBuilder.append(" ]");

        return stringBuilder.toString();
    }
}
