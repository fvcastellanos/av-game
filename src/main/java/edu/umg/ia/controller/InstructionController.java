package edu.umg.ia.controller;

import edu.umg.ia.html.HtmlParser;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.web.WebView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InstructionController {

    private Logger logger = LoggerFactory.getLogger(InstructionController.class);
    private HtmlParser htmlParser;

    @FXML
    private WebView webView;

    @FXML
    private Button btnCargar;

    public InstructionController() {
        this.htmlParser = new HtmlParser();
    }

    @FXML
    private void loadInstructions() {

        logger.info("loading help from file");
        String html = htmlParser.getHtmlFromMarkdownFile("markdown/help.md");

        webView.getEngine().loadContent(html);
    }


}
