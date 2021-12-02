package third_try.baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {

    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player();
    }

    @Test
    void 사용자_세자리_숫자_입력_검증() {
        assertThat(player.createInputNumbers().size()).isEqualTo(3);
    }

}
