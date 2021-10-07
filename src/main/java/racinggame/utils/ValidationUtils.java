package racinggame.utils;

import java.util.Objects;

public class ValidationUtils {
    private static final Integer NAME_MAX_LENGTH = 5;
    private static final Integer NAME_MIN_LENGTH = 1;

    public static boolean validName(String carName) {
        return !Objects.isNull(carName)
                && carName.length() <= 5
                && carName.length() >= 1;
    }
}
