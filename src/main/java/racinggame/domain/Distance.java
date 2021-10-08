package racinggame.domain;

public class Distance {
    private static final Integer ADD_DISTANCE = 1;
    private final Integer distance;

    public Distance() {
        distance = 0;
    }

    private Distance(int distance) {
        this.distance = distance;
    }

    public Distance addDistance() {
        return new Distance(distance + ADD_DISTANCE);
    }

    public int getDistance() {
        return distance;
    }

    public boolean isMaxDistance(int distance) {
        return this.distance == distance;
    }
}
