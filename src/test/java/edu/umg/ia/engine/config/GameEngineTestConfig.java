package edu.umg.ia.engine.config;

import edu.umg.ia.config.CommandConfig;
import edu.umg.ia.config.EngineConfig;
import edu.umg.ia.config.StateMachineConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
    CommandConfig.class,
    StateMachineConfig.class,
    EngineConfig.class
})
public class GameEngineTestConfig {

}
