package domain;

import java.util.Objects;

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

    public int compareMaxDistance(int maxDistance) {
        if (maxDistance < distance) {
            return distance;
        }
        return maxDistance;
    }

    public boolean isMaxDistance(int maxDistance) {
        return maxDistance == distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Distance distance1 = (Distance) o;
        return distance == distance1.distance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(distance);
    }
}
