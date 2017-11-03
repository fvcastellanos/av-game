package edu.umg.ia.config;

import edu.umg.ia.engine.domain.GameEvent;
import edu.umg.ia.engine.domain.GameState;
import edu.umg.ia.engine.state.GameStateListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineConfigurationConfigurer;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;
import org.springframework.statemachine.listener.StateMachineListener;

import java.util.EnumSet;

@Configuration
@EnableStateMachine
public class StateMachineConfig extends EnumStateMachineConfigurerAdapter<GameState, GameEvent> {

    @Autowired
    private StateMachineListener stateMachineListener;

    @Override
    public void configure(StateMachineConfigurationConfigurer<GameState, GameEvent> config) throws Exception {
        config.withConfiguration()
        	.autoStartup(true)
            .listener(stateMachineListener);
    }

    @Override
    public void configure(StateMachineStateConfigurer<GameState, GameEvent> gameState) throws Exception {
        gameState.withStates()
        	.initial(GameState.INIT)
        	.states(EnumSet.allOf(GameState.class));
    }

    @Override
    public void configure(StateMachineTransitionConfigurer<GameState, GameEvent> transitions) throws Exception {
        transitions
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
				.source(GameState.CHAPTER_ONE_GOAL_II).target(GameState.CHAPTER_ONE_GOAL_III)
				.event(GameEvent.CHAPTER_I_GOAL_II_COMPLETED)
				.and()
			.withExternal()
				.source(GameState.CHAPTER_ONE_GOAL_III).target(GameState.CHAPTER_TWO)
				.event(GameEvent.CHAPTER_I_GOAL_III_COMPLETED)
		//		.and()
			;
    }

    @Bean
    public StateMachineListener<GameState, GameEvent> listener() {
    	return new GameStateListener();
    }
}
