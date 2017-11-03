package edu.umg.ia.config;

import edu.umg.ia.controller.MainController;
import edu.umg.ia.engine.GameEngine;
import edu.umg.ia.html.HtmlParser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        CommandConfig.class,
        StateMachineConfig.class,
        EngineConfig.class
})
public class AppConfig {

    @Bean
    public HtmlParser htmlParser() {
        return new HtmlParser();
    }

    @Bean
    public MainController mainController(GameEngine gameEngine) {
        return new MainController(gameEngine);
    }
}
