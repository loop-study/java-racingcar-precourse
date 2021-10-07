package racinggame.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class CarsTest {

    @Test
    void 자동차_여러대_생성() {
        String inputCarNames = "java,pobi,jason,loop";
        Cars cars = new Cars(Arrays.asList(inputCarNames.split(",")), new MoveStrategy());
        assertThat(cars).isNotNull();
    }

    @ParameterizedTest
    @ValueSource(strings = {",", "a"})
    void 자동차_2대미만_예외확인(String names) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Cars(Arrays.asList(names.split(",")), new MoveStrategy()));
    }
}
