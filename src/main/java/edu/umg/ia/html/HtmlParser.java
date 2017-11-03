package edu.umg.ia.html;

import com.github.rjeschke.txtmark.Processor;
import io.vavr.control.Try;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

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

    private String loadCss() throws Exception {

        if (isEmpty(css)) {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = FileUtils.getFile(classLoader.getResource("css/markdown.css").getFile());
            css = FileUtils.readFileToString(file);
        }

        return css;
    }
}
