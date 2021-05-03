package domain;

import strategy.MoveStrategy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    public Cars(String inputText) {
        this(stringToListCar(inputText));
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Cars movedCars() {
        List<Car> movedCars = cars.stream()
                                    .map(car -> car.move(new MoveStrategy()))
                                    .collect(Collectors.toList());

        return new Cars(movedCars);
    }

    public List<Car> cars() {
        return cars;
    }

    private static List<Car> stringToListCar(String inputText) {
        return Arrays.stream(inputText.split(","))
                .map(Car::new)
                .collect(Collectors.toList());
    }
}
