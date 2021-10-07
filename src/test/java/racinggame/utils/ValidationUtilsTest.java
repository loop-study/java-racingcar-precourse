package racinggame.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"a", "ab", "abc", "abcd", "abcde"})
    void 자동차_이름_길이는_1부터_5까지(String name) {
        boolean result = ValidationUtils.validName(name);
        assertThat(result).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"abcdef"})
    @NullAndEmptySource
    void 자동차_이름_길이가_잘못됨(String name) {
        boolean result = ValidationUtils.validName(name);
        assertThat(result).isFalse();
    }
}
