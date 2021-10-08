package racinggame.domain;

import racinggame.strategy.Strategy;

public class Car {
    private CarName carName;
    private int distance;
    private Strategy strategy;

    public Car(String carName, Strategy strategy) {
        this.carName = new CarName(carName);
        this.strategy = strategy;
        this.distance = 0;
    }

    private Car(CarName carName, Strategy strategy, Integer distance) {
        this.carName = carName;
        this.strategy = strategy;
        this.distance = distance;
    }

    public Car move() {
        if (strategy.isMoveable()) {
            distance++;
        }
        return new Car(carName, strategy, distance);
    }

    public String getCarName() {
        return carName.getName();
    }

    public int getDistance() {
        return distance;
    }

    public boolean isMaxDistance(int distance) {
        return this.distance == distance;
    }
}
