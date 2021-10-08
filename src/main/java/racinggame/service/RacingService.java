package racinggame.service;

import racinggame.domain.Cars;
import racinggame.domain.Record;
import racinggame.domain.Round;

import java.util.ArrayList;
import java.util.List;

public class RacingService {

    public List<Record> play(Cars cars, Round round) {
        List<Record> records = new ArrayList<>();
        while (round.next()) {
            Cars moveCars = cars.move();
            records.add(new Record(moveCars));
        }
        return records;
    }
}
