package domain;

public class Round {
    private static final int END_ROUND = 0;
    private static final String ROUND_RANGE_MASSAGE = "음수는 잘못된 값입니다.";

    private final int round;

    public Round(int round) {
        validRoundRange(round);
        this.round = round;
    }

    public Round next() {
        return new Round(round - 1);
    }

    public boolean isEnd() {
        return round == END_ROUND;
    }

    private void validRoundRange(int round) {
        if (round < END_ROUND) {
            throw new IllegalArgumentException(ROUND_RANGE_MASSAGE);
        }
    }
}
