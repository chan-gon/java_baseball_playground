package first_try.baseball;

import java.util.*;

public class Player {

    Operator operator = new Operator();
    Computer computer = new Computer();

    public void gameStart() {
        int strike = 0;
        int ball = 0;

        String computerNum = computer.computerGenerateDistinctNum();

        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력해 주세요 : ");
        String inputBeforeGame = scanner.nextLine();
        System.out.println("컴퓨터 : " + computerNum);

        for (int i = 0; i < 3; i++) {
            if(computerNum.charAt(i) == inputBeforeGame.charAt(i)) {
                strike++;
            }
            if(computerNum.contains(String.valueOf(inputBeforeGame.charAt(i)))) {
                ball++;
            }
        }
        System.out.println(ball + "볼 " + strike + "스트라이크 ");

        if (strike == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

            int inputAfterGame = scanner.nextInt();

            if (inputAfterGame == 1) {
               new Player().gameStart();
               return;
            }
            if (inputAfterGame == 2) {
                return;
            }
        }
        gameStart();
    }
}
