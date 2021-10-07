package racinggame.domain;

import racinggame.strategy.Strategy;
import racinggame.utils.ValidationUtils;

public class Car {
    private static final String ERROR_CAR_NAME_MESSAGE = "자동차 이름이 잘못되었습니다.";

    private String carName;
    private int distance;
    private Strategy strategy;

    public Car(String carName, Strategy strategy) {
        validationCarName(carName);
        this.carName = carName;
        this.strategy = strategy;
        this.distance = 0;
    }

    public void move() {
        if (strategy.isMoveable()) {
            distance++;
        }
    }

    public int getDistance() {
        return distance;
    }

    private void validationCarName(String carName) {
        if (!ValidationUtils.validCarName(carName)) {
            throw new IllegalArgumentException(ERROR_CAR_NAME_MESSAGE);
        }
    }
}
