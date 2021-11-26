package first_try.baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class ComputerTest {

    Computer computer;

    @BeforeEach
    void setComputer() {
        computer = new Computer();
    }

    @DisplayName("컴퓨터 숫자 생성 테스트")
    @Test
    void computerGenerateNumTest() {
        String generatedNum = computer.computerGenerateDistinctNum();
        assertThat(3).isEqualTo(generatedNum.length());
    }
}