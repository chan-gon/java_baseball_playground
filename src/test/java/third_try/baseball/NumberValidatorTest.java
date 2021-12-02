package third_try.baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumberValidatorTest {

    private static final List<Integer> INPUT_NUMBER = Arrays.asList(1, 2, 3);
    private NumberValidator numberValidator;

    @BeforeEach
    void setUp() {
        numberValidator = new NumberValidator();
    }

    @Test
    void 숫자_세자리_검증() {
        assertThat(numberValidator.numberRangeCheck(INPUT_NUMBER)).isTrue();
    }

    @Test
    void 숫자_1에서_9까지_범위_검증() {
        assertThat(numberValidator.numberLengthCheck(INPUT_NUMBER)).isTrue();
        assertThat(numberValidator.numberLengthCheck(Arrays.asList(0,1,2))).isFalse();
    }

    @Test
    void 숫자_중복_검증() {
        assertThat(numberValidator.numberDistinctCheck(INPUT_NUMBER)).isTrue();
        assertThat(numberValidator.numberDistinctCheck(Arrays.asList(1,1,3))).isFalse();
    }
}