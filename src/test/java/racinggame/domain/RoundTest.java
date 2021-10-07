package racinggame.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RoundTest {

    @Test
    void 라운드_생성() {
        Round round = new Round(1);
        assertThat(round).isNotNull();
    }
}