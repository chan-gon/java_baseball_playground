package computer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import first_try.baseball.Operator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
class OperatorTest {

    Operator number;

    public static InputStream generatePlayerInput(String input) {
        return new ByteArrayInputStream(input.getBytes());
    }

    private static Stream<Arguments> provideInputNum() {
        return Stream.of(
                Arguments.of("1"),
                Arguments.of("&"),
                Arguments.of("3")
        );
    }

    private InputStream createInputStream(String numInput) {
        List<InputStream> streams = Arrays.asList(generatePlayerInput(numInput));
        return new SequenceInputStream(Collections.enumeration(streams));
    }

    @BeforeEach
    void setNum(){
        number = new Operator();
    }

    @DisplayName("상대방(컴퓨터)이 1-9 범위의 중복되지 않는 세 자리 임의의 숫자를 생성하는지 테스트")
    @Test
    void computerGenerateDistinctNumTest(){
        int numSize = number.computerGenerateDistinctNum().size();
        long cnt = number.computerGenerateDistinctNum().stream().distinct().count();
        assertThat(3).isEqualTo(numSize);
        assertThat(cnt).isEqualTo(3);
    }

    @DisplayName("플레이어(사용자)가 1 ~ 9 이외의 숫자, 문자 및 기호가 입력되었을 경우 예외 처리 테스트")
    @ParameterizedTest
    @MethodSource("provideInputNum")
    void playerInputDistinctNumTest(String numInput){
        InputStream in = createInputStream(numInput);
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);

        if(!scanner.hasNext(number.getNUM_REGEX())) throw new IllegalArgumentException();
    }
}