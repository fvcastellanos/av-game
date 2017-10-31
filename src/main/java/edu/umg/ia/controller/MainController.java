package edu.umg.ia.controller;

import edu.umg.ia.command.CommandParser;
import javafx.fxml.FXML;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainController {

    private Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private CommandParser commandParser;

    @FXML
    public void processCommand() {
        logger.info("hola");
    }
}
