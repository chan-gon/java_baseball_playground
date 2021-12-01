package third_try.baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class ComputerTest {

    private Computer computer;

    @BeforeEach
    void setUp() {
        computer = new Computer();
    }

    @Test
    void 컴퓨터_세자리_숫자_생성_검증() {

        assertThat(computer.generateNumbers().size()).isEqualTo(3);
    }
}
