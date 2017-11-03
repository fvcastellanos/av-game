package edu.umg.ia.engine;

import edu.umg.ia.engine.config.GameEngineTestConfig;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = GameEngineTestConfig.class)
public abstract class BaseITTest {
}
