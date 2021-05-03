package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

@DisplayName("라운드")
public class RoundTest {

    @ParameterizedTest
    @ValueSource(ints = {2,3,4})
    @DisplayName("진행 확인")
    public void playTest(int count) throws Exception {
        Round round = new Round(count);
        round = round.next();
        assertThat(round.isEnd()).isFalse();
    }

    @Test
    @DisplayName("종료 확인")
    public void endTest() throws Exception {
        Round round = new Round(1);
        round = round.next();
        assertThat(round.isEnd()).isTrue();
    }
}
