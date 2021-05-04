package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.*;

@DisplayName("자동차")
public class CarTest {

    @Test
    @DisplayName("이동 확인")
    public void movedCar() throws Exception {
        Car car = new Car(NameTest.STUDY);
        car = car.movedCar(() -> true);
        assertThat(car.distance()).isEqualTo(DistanceTest.ONE);
    }

    @Test
    @DisplayName("이동 안함 확인")
    public void noneMovedCar() throws Exception {
        Car car = new Car(NameTest.STUDY);
        car = car.movedCar(() -> false);
        assertThat(car.distance()).isEqualTo(DistanceTest.ZERO);
    }
}
