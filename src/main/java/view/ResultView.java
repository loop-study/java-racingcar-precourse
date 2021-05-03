package view;

import domain.Car;
import domain.Distance;
import domain.Record;
import domain.Records;

import java.util.List;
import java.util.StringJoiner;

public class ResultView {
    private static final String PLAY_MESSAGE = "실행 결과";

    public void printRaceBoard(Records records) {
        System.out.println("\n\r" + PLAY_MESSAGE);

        printRecords(records);
        printWinners(records);
    }

    private void printRecords(Records records) {
        List<Record> printRecords = records.records();

        for (int i = 0; i < printRecords.size(); i++) {
            System.out.println();
            printRecord(printRecords.get(i));
        }
    }

    private void printRecord(Record record) {
        List<Car> cars = record.cars();

        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            System.out.println(car.name().value() + " : " + distanceToString(car.distance()));
        }
    }

    private String distanceToString(Distance distance) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < distance.value(); i++) {
            builder.append("-");
        }
        return builder.toString();
    }

    private void printWinners(Records records) {
        Record lastRecord = records.records().get(records.records().size() - 1);

        System.out.println(winnersName(lastRecord) + "가 최종 우승했습니다.");
    }

    private String winnersName(Record lastRecord) {
        StringJoiner joiner = new StringJoiner(",");
        List<Car> winners = lastRecord.winners();
        for (int i = 0; i < winners.size(); i++) {
            joiner.add(winners.get(i).name().value());
        }
        return joiner.toString();
    }
}
