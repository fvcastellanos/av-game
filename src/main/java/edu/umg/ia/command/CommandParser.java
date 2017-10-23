package edu.umg.ia.command;

import edu.umg.ia.scanner.AdventureGameLexer;
import edu.umg.ia.scanner.AdventureGameParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class CommandParser {

    private CommandListener commandListener;

    public CommandParser() {
        commandListener = new CommandListener();
    }

    public void parse(String command) {
        AdventureGameLexer lexer = new AdventureGameLexer(new ANTLRInputStream(command));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        AdventureGameParser gameParser = new AdventureGameParser(tokenStream);
        AdventureGameParser.ComandosContext comandosContext = gameParser.comandos();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(commandListener, comandosContext);
    }
}
