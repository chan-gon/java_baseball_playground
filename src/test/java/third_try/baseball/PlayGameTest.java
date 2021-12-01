package third_try.baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayGameTest {

    private PlayGame playGame;

    @BeforeEach
    void setUp() {
        playGame = new PlayGame();
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 3,0볼 3스트라이크", "4, 5, 6, 낫싱", "2, 4, 5, 1볼 0스트라이크"})
    void 숫자야구게임_동작_검증(int num1, int num2, int num3, String expected) {
        String result = playGame.checkNumber(Arrays.asList(num1,num2,num3), Arrays.asList(1,2,3));
        assertThat(result).isEqualTo(expected);
    }
}
