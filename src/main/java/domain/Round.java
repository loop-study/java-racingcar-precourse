package domain;

public class Round {
    private static final int END_ROUND = 0;

    private final int round;

    public Round(int round) {
        this.round = round;
    }

    public Round next() {
        return new Round(round - 1);
    }

    public boolean isEnd() {
        return round == END_ROUND;
    }
}
