package tudelft.blackjack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackJackOnlyLineAndBranchCoverageTest {

    @Test
    public void rightOverTheLimitLeftWins() {
        int result = new BlackJack().play(20, 29);
        Assertions.assertEquals(20, result);
    }

    @Test
    public void leftOverTheLimitRightWins() {
        int result = new BlackJack().play(31, 10);
        Assertions.assertEquals(10, result);
    }
}
