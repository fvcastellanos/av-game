package edu.umg.ia.controller;

import edu.umg.ia.engine.GameEngine;
import edu.umg.ia.html.HtmlParser;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.util.StringUtils.isEmpty;

public class MainController {

    private Logger logger = LoggerFactory.getLogger(MainController.class);

    private GameEngine gameEngine;

    @Autowired
    private HtmlParser htmlParser;

    @FXML
    private TextField edCommand;

    @FXML
    private TextArea edLog;

    @FXML
    private WebView viewMessage;

    public MainController(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
//        view = new WebView();
    }

    @FXML
    public void processCommand() {
        logger.info("receiving command: {}", edCommand.getText());

        String text = edCommand.getText();
        String response = "";

        if (!isEmpty(text)) {
            response = gameEngine.tell(text);
            addLog(text);
            addMessage(response);

            logger.info("command identified as: {}", text);
        }
    }

    @FXML
    public void closeApplication(ActionEvent event) {
        Platform.exit();
    }

    private void addLog(String text) {
        edLog.appendText(text + "\n");
    }

    private void addMessage(String message) {
        String content = htmlParser.getHtml(message);
        viewMessage.getEngine().loadContent(content);
    }
}
