public class BowlingGame {
    private final static int ROUNDS = 10;
    private final static int FULL_SCORE = 10;
    private int[] throwPinsNumber;
    private int currentRound = 0;
    private boolean isfirstThrowInRound = true;
    private Score score = new Score();

    public BowlingGame() {
    }
    public void addThrow(int[] throwPinsNumber){
        for (int pinsNumber : throwPinsNumber) {
            score.addThrow(pinsNumber);
            adjustCurrentRound(pinsNumber);
        }
    }

    private void adjustCurrentRound(int pinsNumber){
        if (!isfirstThrowInRound || (pinsNumber == FULL_SCORE)){
            currentRound = Math.min(FULL_SCORE,currentRound+1);
        }else {
            isfirstThrowInRound=false;
        }
    }
    public int totalScore(){
        return  score.scoreForRound(ROUNDS);
    }

    public static void main(String[] args) {
        int[] pins = {10,9,0,5,1,1,4,1,4,1,1,1,1,1,1,2};
        BowlingGame g = new BowlingGame();
        g.addThrow(pins);
        System.out.println("得分是："+g.totalScore());

    }
}
