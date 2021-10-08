package racinggame.domain;

import racinggame.utils.ValidationUtils;

public class Round {
    private static final String ERROR_MIN_ROUND_MESSAGE = "마이너스 라운드는 불가능합니다.";
    private static final Integer LAST_ROUND = 0;

    private int round;

    public Round(int round) {
        validationRound(round);
        this.round = round;
    }

    private void validationRound(int round) {
        if (!ValidationUtils.validRound(round)) {
            throw new IllegalArgumentException(ERROR_MIN_ROUND_MESSAGE);
        }
    }

    public boolean next() {
        if (isLastRound()) {
            return false;
        }
        round--;
        return true;
    }

    private boolean isLastRound() {
        return round <= LAST_ROUND;
    }
}
