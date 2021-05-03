package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

@DisplayName("이름")
public class NameTest {
    static final Name STUDY = new Name("study");

    @ParameterizedTest
    @ValueSource(strings = {"s", "st", "stu", "stud", "study"})
    @DisplayName("이름은 최대 5글자")
    public void nameLengthTest(String inputText) throws Exception {
        Name name = new Name(inputText);

        assertThat(name.value()).isEqualTo(inputText);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "loopst"})
    @DisplayName("이름 0글자, 6글자 이상 에러 확인")
    public void nameLengthError(String inputText) throws Exception {
        assertThatThrownBy(() -> new Name(inputText))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
