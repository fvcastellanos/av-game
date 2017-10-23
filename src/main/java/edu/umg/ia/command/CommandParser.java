package edu.umg.ia.command;

import edu.umg.ia.scanner.AdventureGameLexer;
import edu.umg.ia.scanner.AdventureGameParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommandParser {

    private Logger logger = LoggerFactory.getLogger(CommandParser.class);

    public String parse(String command) {
        AdventureGameLexer lexer = new AdventureGameLexer(CharStreams.fromString(command));
        CommandListener commandListener = new CommandListener();

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        AdventureGameParser gameParser = new AdventureGameParser(tokenStream);
        AdventureGameParser.ComandosContext comandosContext = gameParser.comandos();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(commandListener, comandosContext);

        if (commandListener.getCommandValidation().isInvalid()) {
            return commandListener.getCommandValidation().getError();
        }

        return commandListener.getCommandValidation().get();
    }
}
