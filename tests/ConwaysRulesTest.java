import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import rules.types.ConwaysRules;

public class ConwaysRulesTest {

    private ConwaysRules rules;

    @Before
    public void setUp() {
        rules = new ConwaysRules();
    }

    @Test
    public void diesBecauseOfUnderpopulation() {
        assertFalse(rules.shouldStayAlive(1));
    }

    @Test
    public void staysAlive() {
        assertTrue(rules.shouldStayAlive(2));
        assertTrue(rules.shouldStayAlive(3));
    }

    @Test
    public void diesBecauseOfOverpopulation() {
        assertFalse(rules.shouldStayAlive(4));
    }

    @Test
    public void aCellIsBorn() {
        assertTrue(rules.shouldBeBorn(3));
    }
}
