package edu.umg.ia.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.web.WebView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static edu.umg.ia.file.FileUtils.loadResourceFile;

public class InstructionController {

    private Logger logger = LoggerFactory.getLogger(InstructionController.class);

    @FXML
    private WebView webView;

    @FXML
    private Button btnCargar;

    @FXML
    private void loadInstructions() {

        logger.info("loading help from file");
        String html = loadHtml();

        webView.getEngine().loadContent(html);
    }

    private String loadHtml() {
        try {
            return loadResourceFile("html/help.html");
        } catch (Exception ex) {
            return "";
        }
    }



}
