public class Score {
    private final static int FULL_SCORE = 10;
    private int ballCount;
    private int[] throwPinsNumber = new int[21];
    private int currentThrow = 0;

    public void addThrow(int pinsNumber) {
        throwPinsNumber[currentThrow++] = pinsNumber;
    }

    public int scoreForRound(int round) {
        ballCount = 0;
        int scoreForRound = 0;
        for (int i = 0; i < round; i++) {
            if (isStrike()) {
                scoreForRound += FULL_SCORE + nextTwoPinsNumber();
                ballCount++;
            } else if (isSpare()) {
                scoreForRound += FULL_SCORE + nextPinsNumber();
                ballCount += 2;
            } else {
                scoreForRound += thisRoundTwo();
                ballCount += 2;
            }
        }
        return scoreForRound;
    }

    private boolean isStrike() {
        return throwPinsNumber[ballCount] == FULL_SCORE;
    }

    private boolean isSpare() {
        return (throwPinsNumber[ballCount] + throwPinsNumber[ballCount + 1]) == FULL_SCORE;
    }

    private int nextTwoPinsNumber() {
        return throwPinsNumber[ballCount + 1] + throwPinsNumber[ballCount + 2];
    }

    private int nextPinsNumber() {
        return throwPinsNumber[ballCount + 2];
    }

    private int thisRoundTwo() {
        return throwPinsNumber[ballCount] + throwPinsNumber[ballCount + 1];
    }
}
