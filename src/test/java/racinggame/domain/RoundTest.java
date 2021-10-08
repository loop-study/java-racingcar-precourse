package racinggame.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class RoundTest {

    @Test
    void 라운드_생성() {
        Round round = new Round(1);
        assertThat(round).isNotNull();
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0})
    void 잘못된_라운드_예외확인(int round) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Round(round));
    }

    @Test
    void 라운드_진행() {
        Round round = new Round(1);
        assertThat(round.next()).isTrue();
    }

    @Test
    void 라운드_종료() {
        Round round = new Round(1);
        round.next();
        assertThat(round.next()).isFalse();
    }
}