package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("자동차")
public class CarTest {

    @Test
    void 자동차_생성() {
        Car car = new Car("자동차", new MoveStrategy());
        assertThat(car).isNotNull();
    }

    @Test
    void 자동차_전진() {
        Car car = new Car("자동차", new FakeMoveStrategy()).move();
        assertThat(car.getDistance()).isEqualTo(1);
    }

    @Test
    void 자동차_멈춤() {
        Car car = new Car("자동차", new FakeStopStrategy()).move();
        assertThat(car.getDistance()).isEqualTo(0);
    }
}
