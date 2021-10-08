package racinggame.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DistanceTest {

    @Test
    void 이동거리_생성() {
        Distance distance = new Distance();
        assertThat(distance).isNotNull();
    }


    @Test
    void 이동거리_추가() {
        Distance distance = new Distance().addDistance().addDistance();
        assertThat(distance.getDistance()).isEqualTo(2);
    }
}
