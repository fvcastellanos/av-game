package edu.umg.ia.engine;

import edu.umg.ia.engine.domain.GameEvent;
import edu.umg.ia.engine.domain.GameState;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = GameEngineTestConfig.class)
public class GameStateMachineIT {
	
	@Autowired
	private StateMachine<GameState, GameEvent> stateMachine;
	
	@Test
	public void testInitStateMachine() {

	    stateMachine.start();

		assertEquals(GameState.INIT, stateMachine.getState().getId());

		stateMachine.sendEvent(GameEvent.GAME_STARTED);

		assertEquals(GameState.INTRO, stateMachine.getState().getId());

		stateMachine.stop();
	}

	@Test
	public void testNotExpectedEventKeepsInSameState() {
	    stateMachine.start();

	    stateMachine.sendEvent(GameEvent.GAME_STARTED);
        assertEquals(GameState.INTRO, stateMachine.getState().getId());

        stateMachine.sendEvent(GameEvent.INIT_CHAPTER_I);
        assertEquals(GameState.CHAPTER_ONE, stateMachine.getState().getId());

        stateMachine.sendEvent(GameEvent.CHAPTER_II_GOAL_I_COMPLETED);
        assertEquals(GameState.CHAPTER_ONE, stateMachine.getState().getId());

    }
		
}
