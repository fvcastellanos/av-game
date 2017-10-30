package edu.umg.ia.engine;

import org.junit.Before;
import org.junit.Test;
import org.springframework.statemachine.StateMachine;

import edu.umg.ia.engine.domain.GameEvent;
import edu.umg.ia.engine.domain.GameState;


public class StateMachineFactoryTest {

	private StateMachineFactory stateMachineFactory;
	
	@Before
	public void setup() {
		stateMachineFactory = new StateMachineFactory();
	}
	
	@Test
	public void testStateMachineFactory() throws Exception {
		StateMachine<GameState, GameEvent> stateMachine = stateMachineFactory.buildStateMachine();
		
//		stateMachine.
				
	}
}
