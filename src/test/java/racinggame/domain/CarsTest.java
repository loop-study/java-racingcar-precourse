package racinggame.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    @Test
    void 자동차_여러대_생성() {
        String inputCarNames = "java,pobi,jason,loop";
        Cars cars = new Cars(Arrays.asList(inputCarNames.split(",")), new MoveStrategy());
        assertThat(cars).isNotNull();
    }


}
