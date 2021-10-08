package racinggame.domain;

import racinggame.strategy.Strategy;

public class Car {
    private CarName carName;
    private Distance distance;
    private Strategy strategy;

    public Car(String carName, Strategy strategy) {
        this.carName = new CarName(carName);
        this.strategy = strategy;
        this.distance = new Distance();
    }

    private Car(CarName carName, Strategy strategy, Distance distance) {
        this.carName = carName;
        this.strategy = strategy;
        this.distance = distance;
    }

    public Car move() {
        if (strategy.isMoveable()) {
            distance = distance.addDistance();
        }
        return new Car(carName, strategy, distance);
    }

    public String getCarName() {
        return carName.getName();
    }

    public int getDistance() {
        return distance.getDistance();
    }

    public boolean isMaxDistance(int distance) {
        return this.distance.isMaxDistance(distance);
    }
}
