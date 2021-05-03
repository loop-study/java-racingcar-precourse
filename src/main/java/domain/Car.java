package domain;

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

    public Car move() {
        return new Car(name, distance.add());
    }

    public Distance distance() {
        return distance;
    }
}
