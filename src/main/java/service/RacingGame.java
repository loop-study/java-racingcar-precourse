package service;

import domain.Cars;
import domain.Record;
import domain.Records;
import domain.Round;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    public Records play(Cars cars, Round round) {
        List<Record> records = new ArrayList<>();

        while (!round.isEnd()) {
            round = round.next();
            cars = cars.movedCars();
            records.add(cars.record());
        }

        return new Records(records);
    }
}
