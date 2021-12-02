package third_try.baseball;

import java.util.List;

public class PlayGame {
    Computer computer = new Computer();
    Player player = new Player();
    JudgeNumber judgeNumber = new JudgeNumber();

    public String checkNumber(List<Integer> computerNumber, List<Integer> playerNumber) {

        computerNumber = computer.generateNumbers();
        playerNumber = player.createInputNumbers();
        int cnt = judgeNumber.correctCount(computerNumber, playerNumber);

        int strike = 0;
        int ball = 0;

        for (int i = 0; i < 3; i++) {
            if (judgeNumber.hasPlace(computerNumber, i, playerNumber.get(i))) {
                strike++;
            }
            ball = cnt - strike;
        }
        String result = showResult(ball, strike, cnt);

        return result;
    }

    public String showResult(int ball, int strike, int cnt) {
        String result = "";
        if (ball > 0) {
            result = ball + "볼";
        }
        if (strike > 0) {
            result = strike + "스트라이크";
        }
        if (cnt == 0) {
            result = "낫싱";
        }
        return result;
    }
}
