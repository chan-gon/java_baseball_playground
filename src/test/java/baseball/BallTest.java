package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    @DisplayName("같은 자리에 같은 숫자인 경우")
    @Test
    void strike() {
        System.out.println("컴퓨터의 숫자: position 1, number 2");
        assertThat(Ball.checkBall(1, 2)).isEqualTo(BallStatus.STRIKE);
    }

    @DisplayName("같은 자리에 같은 숫자인 경우")
    @Test
    void ball() {
        System.out.println("컴퓨터의 숫자: position 1, number 2");
        assertThat(Ball.checkBall(2, 2)).isEqualTo(BallStatus.BALL);
    }

    @DisplayName("같은 자리에 같은 숫자인 경우")
    @Test
    void nothing() {
        System.out.println("컴퓨터의 숫자: position 1, number 2");
        assertThat(Ball.checkBall(2, 3)).isEqualTo(BallStatus.NOTHING);
    }
}
