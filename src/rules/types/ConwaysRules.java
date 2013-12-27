package rules.types;

import game.Rules;

public class ConwaysRules implements Rules {

    public boolean shouldStayAlive(int numberOfNeighbors) {
        return numberOfNeighbors == 2 || numberOfNeighbors == 3;

    }

    public boolean shouldBeBorn(int numberOfNeighbors) {
        return numberOfNeighbors == 3;
    }
}
