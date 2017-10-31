package edu.umg.ia.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        CommandConfig.class,
        StateMachineConfig.class
})
public class AppConfig {
}
