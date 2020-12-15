package test.java.chapter5;

import main.java.chapter5.Action;
import main.java.chapter5.BusinessRuleEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class BusinessRuleEngineTest {

    @Test
    void shouldHaveNoRulesInitially() {
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();

        Assertions.assertEquals(0, businessRuleEngine.count());
    }

    @Test
    void shouldAddTwoActions() {
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();

        businessRuleEngine.addAction(() -> {});
        businessRuleEngine.addAction(() -> {});

        Assertions.assertEquals(2, businessRuleEngine.count());
    }

    /* Uncomment after creating a gradle or maven build file to handle external libraries */
    @Test
    void shouldExecuteOneAction() {
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
        final Action mockAction = Mockito.mock(Action.class);

        businessRuleEngine.addAction(mockAction);
        businessRuleEngine.run();

        Mockito.verify(mockAction).execute();
    }
}
