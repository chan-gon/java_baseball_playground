package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

   private Ball com;

    @BeforeEach
    void setUp() {
        com = new Ball(1, 2);
    }

    @DisplayName("같은 자리에 같은 숫자인 경우")
    @Test
    void strike() {
        BallStatus status = com.play(new Ball(1, 2));
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }

    @DisplayName("다른 자리에 같은 숫자인 경우")
    @Test
    void ball() {
        BallStatus status = com.play(new Ball(2, 2));
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @DisplayName("모든 숫자가 다를 경우")
    @Test
    void nothing() {
        BallStatus status = com.play(new Ball(1, 1));
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }
}
