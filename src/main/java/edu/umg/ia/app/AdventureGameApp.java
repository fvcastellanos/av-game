package edu.umg.ia.app;

import edu.umg.ia.config.AppConfig;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import static java.lang.System.exit;

@Import(AppConfig.class)
@SpringBootApplication
public class AdventureGameApp extends Application {

    private Logger logger = LoggerFactory.getLogger(AdventureGameApp.class);

    private ConfigurableApplicationContext context;

    private Stage primaryStage;
    private VBox rootLayout;

	@Override
	public void init() throws Exception {
	    logger.info("Loading spring context");
        SpringApplicationBuilder builder = new SpringApplicationBuilder(AdventureGameApp.class);
        context = builder.run(getParameters().getRaw().toArray(new String[0]));

        // Load root layout from fxml file.
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            logger.info("Loading Java FX context");
            ClassLoader classLoader = getClass().getClassLoader();
            FXMLLoader loader = new FXMLLoader(classLoader.getResource("fxml/MainForm.fxml"));
            loader.setControllerFactory(context::getBean);
            rootLayout = loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setTitle("Juego de Aventura de Texto - La casa de Jose");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            logger.error("Can't load FX form: ", e);
            exit(2);
        }
    }

    @Override
    public void stop() throws Exception {
	    logger.info("closing application");
        context.close();
    }

    public static void main(String [] args) {
	    launch(args);
    }
}
