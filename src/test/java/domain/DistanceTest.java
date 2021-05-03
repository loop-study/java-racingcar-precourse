package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

@DisplayName("이동거리")
public class DistanceTest {

    @ParameterizedTest
    @ValueSource(ints = {0,1,2,3})
    @DisplayName("이동거리 확인")
    public void distanceTest(int moveCount) throws Exception {
        Distance distance = new Distance();

        for (int i = 0; i < moveCount; i++) {
            distance = distance.add();
        }

        assertThat(distance.value()).isEqualTo(moveCount);
    }
}
