package edu.umg.ia.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.statemachine.listener.StateMachineListenerAdapter;
import org.springframework.statemachine.state.State;

import edu.umg.ia.engine.domain.GameEvent;
import edu.umg.ia.engine.domain.GameState;

public class GameStateListener extends StateMachineListenerAdapter<GameState, GameEvent> {

	private Logger logger = LoggerFactory.getLogger(GameStateListener.class);
	
	@Override
	public void stateChanged(State<GameState, GameEvent> from, State<GameState, GameEvent> to) {
		// TODO Auto-generated method stub

		String fromString = from==null?"[No state]":from.getId().toString();
		String toString = to==null?"[No state]":to.getId().toString();


		logger.info("State change from: {} to: {}", fromString, toString);
	}

}