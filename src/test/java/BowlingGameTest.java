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
    public void should_return_zero_when_given__zero() {
        int[] allZeroScore = new int[20];
        int result = bowlingGame.getScore();
        int expected = 0;
        assertEquals(result, expected);
    }

}
