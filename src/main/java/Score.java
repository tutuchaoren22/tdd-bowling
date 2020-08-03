public class Score {
    private int ballCount;//投掷次数
    private int[] throwPinsNumber= new int[22];//10轮所投的个数
    private int currentThrow =0;

    public void addThrow(int pinsNumber){
        throwPinsNumber[currentThrow++] = pinsNumber;
    }

    public int scoreForRound(int round){
        ballCount = 0;
        int scoreForRound = 0;
        for (int i =0;i<round;i++){
            if (isStrike()){
                scoreForRound +=10+nextTwoPinsNumber();
                ballCount ++;
            }else if (isSpare()){
                scoreForRound += 10 +nextPinsNumber();
                ballCount += 2;
            }else {
                scoreForRound += thisRoundTwo();
                ballCount+=2;
            }
        }
        return scoreForRound;
    }

    private boolean isStrike(){
        return throwPinsNumber[ballCount]==10;
    }

    private boolean isSpare(){
        return (throwPinsNumber[ballCount]+throwPinsNumber[ballCount+1])==10;
    }

    private int nextTwoPinsNumber(){
        return throwPinsNumber[ballCount+1]+throwPinsNumber[ballCount+2];
    }

    private int nextPinsNumber(){
        return throwPinsNumber[ballCount+2];
    }

    private int thisRoundTwo(){
        return throwPinsNumber[ballCount]+throwPinsNumber[ballCount+1];
    }
}
