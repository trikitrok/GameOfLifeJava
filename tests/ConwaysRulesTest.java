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
    public void lessThanTwoNeighborsDies() {
        assertFalse(rules.shouldStayAlive(0));
        assertFalse(rules.shouldStayAlive(1));
    }

    @Test
    public void twoNeighborsStaysAlive() {
        assertTrue(rules.shouldStayAlive(2));
    }

    @Test
    public void threeNeighborsStaysAlive() {
        assertTrue(rules.shouldStayAlive(3));
    }

    @Test
    public void moreThanThreeNeighborsDies() {
        assertFalse(rules.shouldStayAlive(4));
        assertFalse(rules.shouldStayAlive(5));
    }

    @Test
    public void threeNeighborsIsBorn() {
        assertTrue(rules.shouldBeBorn(3));
    }
}
