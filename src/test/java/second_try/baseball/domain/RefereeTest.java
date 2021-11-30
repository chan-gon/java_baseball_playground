package second_try.baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RefereeTest {

    private static final List<Integer> ANSWSER = Arrays.asList(1, 2, 3);
    private Referee referee;

    @BeforeEach
    void setUp() {
        referee = new Referee();
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 3, 0볼 3스트라이크", "4, 5, 6, NOTHING", "2, 4, 5, 1볼 0스트라이크"})
    void compare(int num1, int num2, int num3, String expected) {
        String result = referee.compare(ANSWSER, Arrays.asList(num1, num2, num3));
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void three_strike() {
        String result = referee.compare(ANSWSER, Arrays.asList(1, 2, 3));
        assertThat(result).isEqualTo("0볼 3스트라이크");
    }

    @Test
    void nothing() {
        String result = referee.compare(ANSWSER, Arrays.asList(4, 5, 6));
        assertThat(result).isEqualTo("NOTHING");
    }

    @Test
    void ball() {
        String result = referee.compare(ANSWSER, Arrays.asList(2, 4, 5));
        assertThat(result).isEqualTo("1볼 0스트라이크");
    }
}