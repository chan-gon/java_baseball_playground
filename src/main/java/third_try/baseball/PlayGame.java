package third_try.baseball;

import java.io.Console;
import java.util.List;
import java.util.Scanner;

public class PlayGame {

    private int strike;
    private int ball;

    static final String FINISH_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    static final String RESTART_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    Computer computer = new Computer();
    Player player = new Player();
    JudgeNumber judgeNumber = new JudgeNumber();
    GameStatus gameStatus;

    public void playBaseballGame() {
        List<Integer> computerNumber = computer.generateNumbers();
        List<Integer> playerNumber = player.createInputNumbers();
        do {
            strike = 0;
            ball = 0;
            checkNumber(computerNumber, playerNumber);
        } while (!isFinish());
        System.out.println(FINISH_MESSAGE);
    }

    public void checkNumber(List<Integer> computerNumber, List<Integer> playerNumber) {

        int cnt = judgeNumber.correctCount(computerNumber, playerNumber);

        for (int i = 0; i < 3; i++) {
            if (judgeNumber.hasPlace(computerNumber, i, playerNumber.get(i))) {
                strike++;
            }
            ball = cnt - strike;
        }
        String result = showResult(ball, strike, cnt);

        System.out.println(result);
    }

    public String showResult(int ball, int strike, int cnt) {
        String result = "";
        if (ball > 0) {
            result = ball + gameStatus.BALL.getStatus();
        }
        if (strike > 0) {
            result = strike + gameStatus.STRIKE.getStatus();
        }
        if (cnt == 0) {
            result = gameStatus.NOTHING.getStatus();
        }
        return result;
    }

    public boolean isFinish() {
        return strike == 3;
    }

    public boolean gameRestart() {
        System.out.println(RESTART_MESSAGE);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (!NumberValidator.restartNumberCheck(input)) {
            throw new IllegalArgumentException();
        }
        return input.equals(GameStatus.RESTART.getStatus());
    }
}
