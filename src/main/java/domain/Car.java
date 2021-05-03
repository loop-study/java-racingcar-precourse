package domain;

import strategy.Strategy;

public class Car {

    private final Name name;
    private final Distance distance;

    public Car(String name) {
        this(new Name(name));
    }

    public Car(Name name) {
        this(name, new Distance());
    }

    public Car(Name name, Distance distance) {
        this.name = name;
        this.distance = distance;
    }

    public Car move(Strategy move) {
        if (move.isMoveable()) {
            return new Car(name, distance.add());
        }
        return this;
    }

    public Distance distance() {
        return distance;
    }
}
