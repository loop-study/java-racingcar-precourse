package racinggame.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ValidationUtils {
    private static final Integer NAME_MAX_LENGTH = 5;
    private static final Integer NAME_MIN_LENGTH = 1;
    private static final Integer CARS_MIN_SIZE = 2;

    public static boolean validNullAndEmtpy(String text) {
        return Objects.isNull(text) || text.isEmpty();
    }

    public static boolean validCarName(String carNames) {
        return !validNullAndEmtpy(carNames)
                && carNames.length() <= NAME_MAX_LENGTH
                && carNames.length() >= NAME_MIN_LENGTH;
    }

    public static boolean validCarsSize(String carNames) {
        return !validNullAndEmtpy(carNames)
                && carNames.split(",").length >= CARS_MIN_SIZE;
    }
}
