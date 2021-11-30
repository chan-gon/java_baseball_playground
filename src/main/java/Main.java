import second_try.baseball.domain.Computer;
import second_try.baseball.domain.Player;
import second_try.baseball.domain.Referee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Referee referee = new Referee();
        Computer computer = new Computer();
        Player player = new Player();

        String result = "";
        while (!result.equals("0볼 3스트라이크")) {
            result = referee.compare(computer.createRandomNumber(), player.playGame());
            System.out.println(result);
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다!\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
