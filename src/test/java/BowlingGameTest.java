import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    private BowlingGame bowlingGame;

    @BeforeEach
    public void setup() {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void should_return_zero_when_given_all_zero() {
        int[] allZeroNumber = new int[20];
        bowlingGame.addThrow(allZeroNumber);
        int result = bowlingGame.totalScore();
        int expected = 0;
        assertEquals(result, expected);
    }

    @Test
    public void should_return_sum_of_number_when_no_strike_and_spare() {
        int[] noStrikeAndSpareNumber = {1,3,4,5,5,2,1,2,4,2,3,6,4,1,2,5,3,4,2,6};
        bowlingGame.addThrow(noStrikeAndSpareNumber);
        int result = bowlingGame.totalScore();
        int expected = 65;
        assertEquals(result, expected);
    }

    @Test
    public void should_add_next_two_number_when_has_strike_before_nine() {
        int[] noStrikeAndSpareNumber = {10,0,4,5,3,2,1,2,4,2,3,4,4,1,2,5,3,4,2};
        bowlingGame.addThrow(noStrikeAndSpareNumber);
        int result = bowlingGame.totalScore();
        int expected = 65;
        assertEquals(result, expected);
    }

    @Test
    public void should_add_next_one_number_when_has_spare_before_nine() {
        int[] noStrikeAndSpareNumber = {1,0,5,5,3,2,1,2,4,2,3,4,4,6,2,5,3,4,2,3};
        bowlingGame.addThrow(noStrikeAndSpareNumber);
        int result = bowlingGame.totalScore();
        int expected = 66;
        assertEquals(result, expected);
    }


}
