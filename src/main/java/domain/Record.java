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
            maxDistance = cars.get(i).compareMaxDistance(maxDistance);
        }
        return maxDistance;
    }

    public List<Car> winners() {
        List<Car> winners = new ArrayList<>();
        int maxDistance = this.maxDistance();
        for (int i = 0; i < cars.size(); i++) {
            addMaxDistanceCar(winners, maxDistance, cars.get(i));
        }
        return winners;
    }

    private void addMaxDistanceCar(List<Car> winners, int maxDistance, Car car) {
        if (car.isMaxDistance(maxDistance)) {
            winners.add(car);
        }
    }

    public List<Car> cars() {
        return cars;
    }
}
