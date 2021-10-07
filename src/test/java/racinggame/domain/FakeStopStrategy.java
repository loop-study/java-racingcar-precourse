package racinggame.domain;

import racinggame.strategy.Strategy;

public class FakeStopStrategy implements Strategy {

    @Override
    public boolean isMoveable() {
        return false;
    }
}
