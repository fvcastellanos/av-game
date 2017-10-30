package edu.umg.ia.engine;

import edu.umg.ia.config.CommandConfig;
import edu.umg.ia.config.StateMachineConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
	CommandConfig.class,
	StateMachineConfig.class
})
public class GameEngineTestConfig {

}
