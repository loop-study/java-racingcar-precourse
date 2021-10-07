package racinggame.domain;

import racinggame.strategy.Strategy;

public class FakeMoveStrategy implements Strategy {

    @Override
    public boolean isMoveable() {
        return true;
    }
}
