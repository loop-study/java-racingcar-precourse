package racinggame.domain;

import racinggame.utils.ValidationUtils;

public class CarName {
    private static final String ERROR_CAR_NAME_MESSAGE = "자동차 이름이 잘못되었습니다.";

    private String name;

    public CarName(String name) {
        validationCarName(name);
        this.name = name;
    }

    private void validationCarName(String carName) {
        if (!ValidationUtils.validCarName(carName)) {
            throw new IllegalArgumentException(ERROR_CAR_NAME_MESSAGE);
        }
    }

    public String getName() {
        return name;
    }
}
