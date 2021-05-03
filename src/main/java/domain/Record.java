package domain;

import java.util.ArrayList;
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

    public List<Car> winners() {
        List<Car> winners = new ArrayList<>();

        int maxDistance = this.maxDistance();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).isMaxDistance(maxDistance)) {
                winners.add(cars.get(i));
            }
        }

        return winners;
    }

    public List<Car> cars() {
        return cars;
    }
}
