package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NameTest {

    @ParameterizedTest
    @ValueSource(strings = {"s", "st", "stu", "stud", "study"})
    @DisplayName("이름은 최대 5글자")
    public void nameLengthTest(String inputText) throws Exception {
        Name name = new Name(inputText);

        Assertions.assertThat(name.value()).isEqualTo(inputText);
    }
}
