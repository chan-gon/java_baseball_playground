package third_try.baseball;

import java.util.List;

/*
 *컴퓨터 숫자와 사용자 숫자를 계산하는 클래스
 * */
public class JudgeNumber {

    public int correctCount(List<Integer> computer, List<Integer> player) {
        int result = 0;
        for (int i = 0; i < player.size(); i++) {
            if (computer.contains(player.get(i))) {
                result++;
            }
        }
        return result;
    }

    public boolean hasPlace(List<Integer> computer, int placeIndex, int number) {
        return computer.get(placeIndex) == number;
    }
}
