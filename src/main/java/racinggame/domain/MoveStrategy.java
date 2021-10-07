package racinggame.domain;

import nextstep.utils.Randoms;
import racinggame.strategy.Strategy;

public class MoveStrategy implements Strategy {
    private static final Integer RANDOM_MIN_NUMBER = 0;
    private static final Integer RANDOM_MAX_NUMBER = 9;
    private static final Integer MOVE_CONDISION = 4;

    @Override
    public boolean isMoveable() {
        if (randomNumber() >= MOVE_CONDISION) {
            return true;
        }
        return false;
    }

    private int randomNumber() {
        return Randoms.pickNumberInRange(RANDOM_MIN_NUMBER, RANDOM_MAX_NUMBER);
    }
}
