package baseball;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ValidationNumberTest {

    @Test
    void 야구게임_숫자_1_9_검증() {
        assertThat(ValidationNumber.validNum(1)).isTrue();
        assertThat(ValidationNumber.validNum(9)).isTrue();
        assertThat(ValidationNumber.validNum(0)).isFalse();
        assertThat(ValidationNumber.validNum(10)).isFalse();
    }

    @Test
    void 야구게임_숫자_자리수_검증() {
        int numDigits = ValidationNumber.checkThreeDigits().length();
        assertThat(numDigits).isEqualTo(3);
    }

}
