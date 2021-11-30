package second_try.baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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