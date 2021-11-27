package baseball;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

public class BallsTest {

    @Test
    void play_nothing() {
        Balls answers = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result = answers.play(Arrays.asList(4, 5, 6));
        assertThat(result.getStrike()).isEqualTo(0);
        assertThat(result.getBall()).isEqualTo(0);
    }

    @Test
    void play_1strike_1ball() {
        Balls answers = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result = answers.play(Arrays.asList(1, 3, 6));
        assertThat(result.getStrike()).isEqualTo(1);
        assertThat(result.getBall()).isEqualTo(1);
    }

    @Test
    void play_3strike() {
        Balls answers = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result = answers.play(Arrays.asList(1, 2, 3));
        assertThat(result.getStrike()).isEqualTo(3);
        assertThat(result.isGameEnd()).isTrue();
    }

    @Test
    void strike() {
        Balls balls = new Balls(Arrays.asList(1, 2, 3));
        BallStatus status = balls.play(new Ball(1, 1));
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void ball() {
        Balls balls = new Balls(Arrays.asList(1, 2, 3));
        BallStatus status = balls.play(new Ball(1, 2));
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    void nothing() {
        Balls balls = new Balls(Arrays.asList(1, 2, 3));
        BallStatus status = balls.play(new Ball(1, 4));
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }
}
