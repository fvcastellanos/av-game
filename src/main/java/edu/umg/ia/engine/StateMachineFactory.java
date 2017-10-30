package edu.umg.ia.engine;

import java.util.EnumSet;

import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineBuilder;
import org.springframework.statemachine.config.StateMachineBuilder.Builder;

import edu.umg.ia.engine.domain.GameEvent;
import edu.umg.ia.engine.domain.GameState;

public class StateMachineFactory {

	public StateMachine<GameState, GameEvent> buildStateMachine() throws Exception {
		
		Builder<GameState, GameEvent> builder = StateMachineBuilder.<GameState, GameEvent>builder();
		
		builder.configureStates()
			.withStates()
			.initial(GameState.INIT)
			.states(EnumSet.allOf(GameState.class));
		
		builder.configureTransitions()
			.withExternal()
				.source(GameState.INIT).target(GameState.INTRO)
				.event(GameEvent.GAME_STARTED)
				.and()
			.withExternal()
				.source(GameState.INTRO).target(GameState.CHAPTER_ONE)
				.event(GameEvent.INIT_CHAPTER_I)
				.and()
			.withExternal()
				.source(GameState.CHAPTER_ONE).target(GameState.CHAPTER_ONE_GOAL_I)
				.event(GameEvent.INIT_CHAPTER_I)
				.and()
			.withExternal()
				.source(GameState.CHAPTER_ONE_GOAL_I).target(GameState.CHAPTER_ONE_GOAL_II)
				.event(GameEvent.CHAPTER_I_GOAL_I_COMPLETED)
				.and()
			.withExternal()
				.source(GameState.CHAPTER_ONE_GOAL_I).target(GameState.CHAPTER_ONE_GOAL_II)
				.event(GameEvent.CHAPTER_I_GOAL_I_COMPLETED)
				.and()
			.withExternal()
				.source(GameState.CHAPTER_ONE_GOAL_II).target(GameState.CHAPTER_ONE_GOAL_III)
				.event(GameEvent.CHAPTER_I_GOAL_II_COMPLETED)
				.and()
			.withExternal()
				.source(GameState.CHAPTER_ONE_GOAL_III).target(GameState.CHAPTER_TWO)
				.event(GameEvent.CHAPTER_I_GOAL_III_COMPLETED)
//				.and()

		;
		
		return builder.build();
	}
	
	
	
}
