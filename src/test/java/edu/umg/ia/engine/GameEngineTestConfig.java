package edu.umg.ia.engine;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Import;

import edu.umg.ia.config.CommandConfig;
import edu.umg.ia.config.StateMachineConfig;

@Import({
	CommandConfig.class,
	StateMachineConfig.class
})
public class GameEngineTestConfig {

}
