package racinggame.service;

import racinggame.domain.Cars;
import racinggame.domain.RecordDTO;
import racinggame.domain.Round;

import java.util.ArrayList;
import java.util.List;

public class RacingService {

    public List<RecordDTO> play(Cars cars, Round round) {
        List<RecordDTO> records = new ArrayList<>();
        while (round.next()) {
            Cars moveCars = cars.move();
            records.add(new RecordDTO(moveCars));
        }
        return records;
    }
}
