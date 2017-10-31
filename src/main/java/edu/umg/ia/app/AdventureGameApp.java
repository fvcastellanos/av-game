package edu.umg.ia.app;

import edu.umg.ia.command.CommandParser;
import edu.umg.ia.config.AppConfig;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Import;

import java.io.IOException;

import static java.lang.System.exit;
import static java.lang.System.setErr;

@Import(AppConfig.class)
public class AdventureGameApp extends Application implements CommandLineRunner {

	@Autowired
	private CommandParser parser;

    private Stage primaryStage;
    private VBox rootLayout;

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hola mundo");
		launch(arg0);

//        start(primaryStage);
	}

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            primaryStage = new Stage();
            // Load root layout from fxml file.
            ClassLoader classLoader = getClass().getClassLoader();
            FXMLLoader loader = new FXMLLoader(classLoader.getResource("fxml/MainForm.fxml"));
            rootLayout = loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            exit(2);
        }
    }

}
