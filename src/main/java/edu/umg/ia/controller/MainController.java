package edu.umg.ia.controller;

import edu.umg.ia.command.CommandParser;
import edu.umg.ia.command.domain.Command;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import static org.springframework.util.StringUtils.isEmpty;

@Component
public class MainController {

    private Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private CommandParser commandParser;

    @FXML
    private TextField edCommand;

    @FXML
    public void processCommand() {
        logger.info("receiving command: {}", edCommand.getText());

        String text = edCommand.getText();

        if (!isEmpty(text)) {
            Command command = commandParser.parse(text);

            logger.info("command identified as: {}", command.getCommand());
        }
    }
}
