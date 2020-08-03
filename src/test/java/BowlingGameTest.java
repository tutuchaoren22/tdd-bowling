import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    private BowlingGame bowlingGame;

    @BeforeEach
    public void setup() {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void should_return_zero_when_given_zero() {
        int[] allZeroNumber = new int[20];
        bowlingGame.setThrowNumber(allZeroNumber);
        int result = bowlingGame.getScore();
        int expected = 0;
        assertEquals(result, expected);
    }

    @Test
    public void should_return_sum_of_number_when_no_strike_and_spare() {
        int[] noStrikeAndSpareNumber = {1,3,4,5,5,2,1,2,4,2,3,6,4,1,2,5,3,4,2,6};
        bowlingGame.setThrowNumber(noStrikeAndSpareNumber);
        int result = bowlingGame.getScore();
        int expected = 65;
        assertEquals(result, expected);
    }

}
