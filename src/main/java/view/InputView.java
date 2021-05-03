package view;

import domain.Cars;
import domain.Round;

import java.util.Scanner;

public class InputView {
    private static final String NAMES_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)";
    private static final String ROUND_MESSAGE = "시도할 회수는 몇회인가요?";

    private final Scanner scanner;

    public InputView() {
        this.scanner = new Scanner(System.in);
    }

    public Cars inputCars() {
        System.out.println(NAMES_MESSAGE);
        return new Cars(scanner.nextLine());
    }

    public Round inputRound() {
        System.out.println(ROUND_MESSAGE);
        return new Round(scanner.nextInt());
    }
}
