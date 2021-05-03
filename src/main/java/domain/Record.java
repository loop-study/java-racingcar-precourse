package domain;

import java.util.List;

public class Record {

    private final List<Car> cars;

    public Record(List<Car> cars) {
        this.cars = cars;
    }

    public int maxDistance() {
        int maxDistance = 0;

        for (int i = 0; i < cars.size(); i++) {
            maxDistance = cars.get(i).maxDistance(maxDistance);
        }

        return maxDistance;
    }

    public List<Car> cars() {
        return cars;
    }
}
