package strategy;

import java.util.Random;

public class MoveStrategy implements Strategy{
    private static final int MOVE_CONDITION = 4;
    private static final int RANDOM_RANGE = 10;
    private static final Random random = new Random();

    @Override
    public boolean isMoveable() {
        return random.nextInt(RANDOM_RANGE) >= MOVE_CONDITION;
    }
}
