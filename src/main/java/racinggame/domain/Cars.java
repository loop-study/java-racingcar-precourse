package racinggame.domain;

import racinggame.strategy.Strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cars {
    private static final Integer CARS_MIN_SIZE = 2;
    private static final String ERROR_CARS_SIZE_MESSAGE = "자동차는 2대 이상 있어야합니다.";

    private final List<Car> cars;

    public Cars(List<String> carNames, Strategy strategy) {
        validationCarsSize(carNames);
        this.cars = createCars(carNames, strategy);
    }

    private Cars(List<Car> moveCars) {
        this.cars = moveCars;
    }

    public Cars move() {
        List<Car> moveCars = new ArrayList<>();
        for (Car car : cars) {
            moveCars.add(car.move());
        }

        return new Cars(moveCars);
    }

    public List<Car> getCars () {
        return Collections.unmodifiableList(cars);
    }

    private List<Car> createCars(List<String> carNames, Strategy strategy) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName, strategy));
        }
        return cars;
    }

    private void validationCarsSize(List<String> carNames) {
        if (CARS_MIN_SIZE > carNames.size()) {
            throw new IllegalArgumentException(ERROR_CARS_SIZE_MESSAGE);
        }
    }

    public List<Car> getWinners() {
        int maxDistance = maxDistance();
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            addWinner(maxDistance, result, car);
        }
        return result;
    }

    private void addWinner(int maxDistance, List<Car> result, Car car) {
        if (car.isMaxDistance(maxDistance)) {
            result.add(car);
        }
    }

    private int maxDistance() {
        int maxDistance =cars.get(0).getDistance();
        for (int i = 1; i < cars.size(); i++) {
            maxDistance = Math.max(maxDistance, cars.get(1).getDistance());
        }
        return maxDistance;
    }
}
