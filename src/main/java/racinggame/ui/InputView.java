package racinggame.ui;

import nextstep.utils.Console;
import racinggame.utils.ValidationUtils;

import java.util.Arrays;
import java.util.List;

public class InputView {
    private static final String INPUT_CAR_NAMES_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String ERROR_VALUE_EMPTY_MESSAGE = "[ERROR]입력된 값이 없습니다.";
    private static final String ERROR_CAR_NAMES_MESSAGE = "[ERROR]자동차 이름은 5글자 이하입니다.";
    private static final String ERROR_CAR_SIZE_MESSAGE = "[ERROR]자동차는 2대 이상 참가해야합니다.";
    private static final String INPUT_ROUND_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String ERROR_MIN_ROUND_MESSAGE = "[ERROR]시도할 회수는 1 이상 입력해주세요.";
    private static final String ERROR_NOT_NUMBER_MESSAGE = "[ERROR]시도할 회수는 숫자로 입력해주세요.";

    public List<String> inputCarNames() {
        try {
            System.out.println(INPUT_CAR_NAMES_MESSAGE);
            String text = Console.readLine();
            validationCarNames(text);
            return Arrays.asList(text.split(","));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputCarNames();
        }
    }

    public int inputRound() {
        try {
            System.out.println(INPUT_ROUND_MESSAGE);
            String round = Console.readLine();
            validationRound(round);
            return Integer.parseInt(round);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputRound();
        }
    }

    private void validationRound(String round) {
        if (!ValidationUtils.vaildNumber(round)) {
            throw new IllegalArgumentException(ERROR_NOT_NUMBER_MESSAGE);
        }

        if (!ValidationUtils.validRound(Integer.parseInt(round))) {
            throw new IllegalArgumentException(ERROR_MIN_ROUND_MESSAGE);
        }
    }

    private void validationCarNames(String text) {
        if (ValidationUtils.validNullAndEmtpy(text)) {
            throw new IllegalArgumentException(ERROR_VALUE_EMPTY_MESSAGE);
        }

        if (!ValidationUtils.validCarsSize(text)) {
            throw new IllegalArgumentException(ERROR_CAR_SIZE_MESSAGE);
        }

        validationNames(Arrays.asList(text.split(",")));
    }

    private void validationNames(List<String> names) {
        for (String name : names) {
            validationName(name);
        }
    }

    private void validationName(String name) {
        if (!ValidationUtils.validCarName(name)) {
            throw new IllegalArgumentException(ERROR_CAR_NAMES_MESSAGE);
        }
    }

}
