package racinggame.domain;

import racinggame.strategy.Strategy;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<String> carNames, Strategy strategy) {
        this.cars = createCars(carNames, strategy);
    }

    private List<Car> createCars(List<String> carNames, Strategy strategy) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName, strategy));
        }
        return cars;
    }
}
