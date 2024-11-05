package tudelft.blackjack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BlackJackLineCoverageTest {

    @Test
    public void bothPlayersGoTooHigh() {
        int result = new BlackJack().play(30, 30);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void leftPlayerWins() {
        int result = new BlackJack().play(10, 9);
        Assertions.assertEquals(10, result);
    }

    @ParameterizedTest(name="left={0}, right={1},wins={2}")
    @CsvSource({
            "21, 20, 21",           // left wins
            "21, 21, 21",           // both 21 -- both win
            "19, 20, 20",           // right wins
            "0, 0, 0",              // 0
            "20, 23, 20",           // right exceeds the limit, left wins
            "22, 0, 0",             // left exceeds the limit, right is 0, 0
            "-1, 1, 1",             // left negative - right wins
            "-1, -2, -1",           // both negative, left wins
            "23, 22, 0",            // both exceed the limit, left is bigger, 0
            "100, 100, 0"           // both exceed the limit, 0
    })
    public void allCombinations(int left, int right, int wins) {
        int result = new BlackJack().play(left, right);
        Assertions.assertEquals(wins, result);
    }
}
