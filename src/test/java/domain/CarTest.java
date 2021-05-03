package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

@DisplayName("자동차")
public class CarTest {

    @Test
    @DisplayName("이동 확인")
    public void car() throws Exception {
        Car car = new Car(NameTest.STUDY);
        car = car.move(() -> true);
        assertThat(car.distance()).isEqualTo(DistanceTest.ONE);
    }
}
