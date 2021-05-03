package domain;

import strategy.MoveStrategy;

import java.util.ArrayList;
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
        List<Car> movedCars = new ArrayList<>();

        for (int i = 0; i < cars.size(); i++) {
            movedCars.add(cars.get(i).move(new MoveStrategy()));
        }

        return new Cars(movedCars);
    }

    public List<Car> cars() {
        return cars;
    }

    private static List<Car> stringToListCar(String inputText) {
        String[] names = inputText.split(",");
        List<Car> result = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            result.add(new Car(names[i]));
        }

        return result;
    }
}
