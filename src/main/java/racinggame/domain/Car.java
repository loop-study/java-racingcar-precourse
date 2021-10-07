package racinggame.domain;

import racinggame.strategy.Strategy;

public class Car {
    private String carName;
    private int distance;
    private Strategy strategy;

    public Car(String carName, Strategy strategy) {
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
}
