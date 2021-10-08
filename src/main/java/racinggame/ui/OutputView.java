package racinggame.ui;

import racinggame.domain.Car;
import racinggame.domain.Cars;
import racinggame.domain.RecordDTO;

import java.util.List;

public class OutputView {
    private static final String PRINT_CAR_BOARD = "%5s : %s";

    public void printRacingBoard(List<RecordDTO> records) {
        for (RecordDTO record : records) {
            printRoundBoard(record.getRecord());
        }
    }

    private void printRoundBoard(Cars record) {
        System.out.println();
        for (Car car : record.getCars()) {
            System.out.println(String.format(PRINT_CAR_BOARD, car.getCarName(), printDistance(car.getDistance())));
        }
    }

    private String printDistance(int distance) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < distance; i++) {
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }
}
