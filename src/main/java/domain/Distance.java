package domain;

public class Distance {
    private static final int DEFAULT_DISTANCE = 0;

    private final int distance;

    public Distance() {
        this(DEFAULT_DISTANCE);
    }

    public Distance(int distance) {
        this.distance = distance;
    }

    public Distance add() {
        return new Distance(distance + 1);
    }

    public int value() {
        return distance;
    }
}
