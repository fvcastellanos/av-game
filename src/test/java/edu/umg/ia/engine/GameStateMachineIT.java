package edu.umg.ia.engine;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.statemachine.StateMachine;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.umg.ia.app.Application;
import edu.umg.ia.engine.domain.GameEvent;
import edu.umg.ia.engine.domain.GameState;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = { GameEngineTestConfig.class })
@ContextConfiguration(classes = GameEngineTestConfig.class)
public class GameStateMachineIT {
	
	@Autowired
	private StateMachine<GameState, GameEvent> stateMachine;
	
	@Test
	public void testStateMachine() {

		assertEquals(GameState.INIT, stateMachine.getState().getId());
		
		stateMachine.sendEvent(GameEvent.GAME_STARTED);
		
		assertEquals(GameState.INTRO, stateMachine.getState().getId());
	}
		
}
