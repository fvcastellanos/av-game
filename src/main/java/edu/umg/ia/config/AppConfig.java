package edu.umg.ia.config;

import edu.umg.ia.controller.MainController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        CommandConfig.class,
        StateMachineConfig.class
})
public class AppConfig {

    @Bean
    public MainController mainController() {
        return new MainController();
    }
}
