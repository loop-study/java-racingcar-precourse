package racinggame.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    void 자동차_생성() {
        Car car = new Car("자동차");

        assertThat(car).isNotNull();
    }
}
