package edu.umg.ia.controller;

import edu.umg.ia.engine.GameEngine;
import edu.umg.ia.html.HtmlParser;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import static org.springframework.util.StringUtils.isEmpty;

public class MainController {

    private Logger logger = LoggerFactory.getLogger(MainController.class);

    private GameEngine gameEngine;

    private HtmlParser htmlParser;

    @FXML
    private TextField edCommand;

    @FXML
    private TextArea edLog;

    @FXML
    private WebView viewMessage;

    public MainController(GameEngine gameEngine,
                          HtmlParser htmlParser) {
        this.gameEngine = gameEngine;
        this.htmlParser = htmlParser;
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

        edCommand.setText("");
        edCommand.requestFocus();
    }

    @FXML
    public void closeApplication(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    public void keyReleased(KeyEvent event) {
        if (event.getCode().equals(KeyCode.ENTER)) {
            processCommand();
        }
    }

    @FXML
    public void iniciarEstado() {
        htmlParser.cleanContent();
        addMessage("");
        gameEngine.restart();
    }

    @FXML
    public void openInstructionsForm() {
        openForm("fxml/Instructions.fxml");
    }

    private void addLog(String text) {
        edLog.appendText(text + "\n");
    }

    private void addMessage(String message) {
        String content = htmlParser.getHtml(message);
        viewMessage.getEngine().loadContent(content);
    }

    private void openForm(String name) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource(name));
            Stage stage = new Stage();
            stage.setTitle("Game Instructions");
            stage.setScene(new Scene(root, 450, 450));
            stage.show();
        }
        catch (IOException ex) {
            logger.error("No se pueden cargar las instrucciones ", ex);
        }
    }
}
