package test.java.chapter5;

import main.java.chapter5.BusinessRuleEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
