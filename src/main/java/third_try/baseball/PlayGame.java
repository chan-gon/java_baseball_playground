package third_try.baseball;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * 숫자야구게임 실행에 관한 클래스
 * checkNumber(), showResult() 메소드로 숫자를 평가한다
 * playBaseballGame() 메소드가 실행 메소드이다
 * */
public class PlayGame {

    static final String FINISH_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    static final String RESTART_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    Computer computer = new Computer();
    Player player = new Player();
    JudgeNumber judgeNumber = new JudgeNumber();
    GameStatus gameStatus;

    public void playBaseballGame() {
//        List<Integer> computerNumber = computer.generateNumbers();
        List<Integer> computerNumber = Arrays.asList(1, 2, 3); // 테스트를 위한 임의 설정
        List<Integer> playerNumber = player.createInputNumbers();
        checkNumber(computerNumber, playerNumber);
    }

    public void checkNumber(List<Integer> computerNumber, List<Integer> playerNumber) {
        int strike = 0;
        int ball = 0;

        int cnt = judgeNumber.correctCount(computerNumber, playerNumber);

        for (int i = 0; i < 3; i++) {
            if (judgeNumber.hasPlace(computerNumber, i, playerNumber.get(i))) {
                strike++;
            }
            ball = cnt - strike;
        }
        String result = showResult(ball, strike, cnt);
        System.out.println(result);

        if (strike == Integer.valueOf(GameStatus.FINISH.getStatus())) {
            System.out.println(FINISH_MESSAGE);
            gameRestart();
        }
    }

    public String showResult(int ball, int strike, int cnt) {
        String result = "";
        if (ball > 0) {
            result += ball + gameStatus.BALL.getStatus();
        }
        if (strike > 0) {
            result += strike + gameStatus.STRIKE.getStatus();
        }
        if (cnt == 0) {
            result += gameStatus.NOTHING.getStatus();
        }
        return result;
    }

    public void gameRestart() {
        System.out.println(RESTART_MESSAGE);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (!NumberValidator.restartNumberCheck(input)) {
            throw new IllegalArgumentException();
        }
        if (input.equals(GameStatus.RESTART.getStatus())) {
            playBaseballGame();
        }
        if (input.equals(GameStatus.EXIT.getStatus())) {
            System.exit(0);
        }
    }
}
