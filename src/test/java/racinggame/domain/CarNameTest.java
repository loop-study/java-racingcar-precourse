package racinggame.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class CarNameTest {

    @Test
    void 이름_생성() {
        CarName carName = new CarName("loop");
        assertThat(carName).isNotNull();
    }

    @ParameterizedTest
    @ValueSource(strings = {"abcdef"})
    @NullAndEmptySource
    void 자동차_이름_예외확인(String name) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Car(name, new MoveStrategy()));
    }

}
