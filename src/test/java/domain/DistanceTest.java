package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

@DisplayName("이동거리")
public class DistanceTest {

    @Test
    @DisplayName("이동거리 확인")
    public void distanceTest() throws Exception {
        Distance distance = new Distance().add();

        assertThat(distance.value()).isEqualTo(1);
    }
}
