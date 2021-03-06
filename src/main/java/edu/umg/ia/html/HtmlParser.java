package edu.umg.ia.html;

import com.github.rjeschke.txtmark.Processor;
import io.vavr.control.Try;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.springframework.util.StringUtils.isEmpty;

public class HtmlParser {

    private Logger logger = LoggerFactory.getLogger(HtmlParser.class);

    private static final String TEMPLATE = "<!DOCTYPE html><html><head><style>%s</style></head><body>%s</body></html>";
    private String content;
    private String css;

    public HtmlParser() {
        this.content = "";
    }

    public String getHtml(String markdown) {
        logger.info("processing markdown: {}", markdown);
        content += Processor.process(markdown);

        Try<String> proccessHtml = Try.of(() -> String.format(TEMPLATE, loadCss(), content))
                .recover(ex -> {
                    logger.error("can't load css: {}", ex);
                    return String.format(TEMPLATE, "", content);
                    });

        return proccessHtml.get();
    }

    public void cleanContent() {
        this.content = "";
    }

    public String getHtmlFromMarkdownFile(String fileName) {
        return getHtml(loadMarkdownFile(fileName));
    }

    private String loadMarkdownFile(String fileName) {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            String markdown = getStringFromInputStream(classLoader.getResourceAsStream(fileName));

            return markdown;

        } catch (Exception ex) {
            return "*No se pudo cargar el archivo*";
        }
    }

    private String loadCss() throws Exception {

        if (isEmpty(css)) {
            ClassLoader classLoader = getClass().getClassLoader();
            css = getStringFromInputStream(classLoader.getResourceAsStream("css/markdown.css"));
        }

        return css;
    }

    private String getStringFromInputStream(InputStream is) {

        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {

            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        } catch (IOException e) {
            logger.error("error: {}", e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return sb.toString();

    }

}
