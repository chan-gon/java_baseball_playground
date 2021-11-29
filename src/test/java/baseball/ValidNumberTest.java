package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ValidNumberTest {

    @DisplayName("숫자가 1 ~ 9 범위인지 테스트")
    @Test
    void 숫자_1_9_범위_검증() {
        assertThat(ValidNumber.checkNumberRange(0)).isFalse();
        assertThat(ValidNumber.checkNumberRange(1)).isTrue();
        assertThat(ValidNumber.checkNumberRange(9)).isTrue();
    }

    @DisplayName("값이 세자리수의 값인지 테스트")
    @Test
    void 숫자_세자리수_검증() {
        assertThat(ValidNumber.checkNumberLength("123")).isTrue();
        assertThat(ValidNumber.checkNumberLength("12")).isFalse();
        assertThat(ValidNumber.checkNumberLength("1")).isFalse();
        assertThat(ValidNumber.checkNumberLength("12345")).isFalse();
    }

    @DisplayName("값에 중복이 없는지 테스트")
    @Test
    void 숫자_중복_검증() {
        assertThat(ValidNumber.checkNumberDuplicate(1, 2, 3)).isTrue();
        assertThat(ValidNumber.checkNumberDuplicate(1, 1, 3)).isFalse();
        assertThat(ValidNumber.checkNumberDuplicate(1, 1, 1)).isFalse();
    }
}
