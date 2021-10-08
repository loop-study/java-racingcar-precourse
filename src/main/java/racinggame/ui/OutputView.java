package racinggame.ui;

import racinggame.domain.Car;
import racinggame.domain.Cars;
import racinggame.domain.RecordDTO;

import java.util.ArrayList;
import java.util.List;

public class OutputView {
    private static final String PRINT_CAR_BOARD = "%s : %s";
    private static final String PRINT_WINNERS = "최종 우승자는 %s 입니다";

    public void printRacingBoard(List<RecordDTO> records) {
        for (RecordDTO record : records) {
            printRoundBoard(record.getRecord());
        }

        printRacingWinner(records.get(records.size()-1).getRecord());
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

    private void printRacingWinner(Cars record) {
        List<Car> winners = record.getWinners();
        System.out.println(String.format(PRINT_WINNERS, winnerCarNames(winners)));
    }

    private String winnerCarNames(List<Car> winners) {
        List<String> result = new ArrayList<>();
        for (Car winner : winners) {
            result.add(winner.getCarName());
        }
        return String.join(",", result);
    }
}
