package third_try.baseball;

import java.util.List;

/*
 * 사용자가 입력한 숫자 유효성 확인 클래스
 * 입력한 숫자 자릿수, 범위, 중복 여부 확인
 *
 * 게임 다시 시작 시 입력 숫자 유효성 확인 메소드도 추가했다(restartNumberCheck)
 * */
public class NumberValidator {

    static final int MIN_NUM = 1;
    static final int MAX_NUM = 9;
    static final int NUM_LENGTH = 3;

    public static boolean inputNumberCheck(List<Integer> inputNumberList) {
        return numberLengthCheck(inputNumberList)
                && numberRangeCheck(inputNumberList)
                && numberDistinctCheck(inputNumberList);
    }

    static boolean numberRangeCheck(List<Integer> inputNumberList) {
        return inputNumberList.size() == NUM_LENGTH;
    }

    static boolean numberLengthCheck(List<Integer> inputNumberList) {
        return inputNumberList.stream()
                .filter(number -> MIN_NUM <= number && number <= MAX_NUM)
                .count() == NUM_LENGTH;
    }

    static boolean numberDistinctCheck(List<Integer> inputNumberList) {
        return inputNumberList.stream()
                .distinct()
                .count() == NUM_LENGTH;
    }

    static boolean restartNumberCheck(String input) {
        return input.equals(GameStatus.RESTART.getStatus()) || input.equals(GameStatus.EXIT.getStatus());
    }

}
