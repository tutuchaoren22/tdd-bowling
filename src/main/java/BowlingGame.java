import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BowlingGame {
//    private int round = 1;
    private List<Integer> throwNumber = new ArrayList<>();
    private final static  int FULL_SCORE = 10;
    private int score = 0;

    public BowlingGame() {
    }

    public void setThrowNumber(int[] throwNumber) {
        this.throwNumber = Arrays.stream(throwNumber).boxed().collect(Collectors.toList());
    }

    public int getScore() {
        return throwNumber.stream().mapToInt(integer -> integer).sum();
    }
}
