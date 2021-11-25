package first_try.baseball;

import java.util.*;

public class Player {

    NumberPattern numberPattern = new NumberPattern();
    Computer computer = new Computer();

    public void gameStart() {
        int strike = 0;
        int ball = 0;

        String computerNum = computer.computerGenerateDistinctNum();

        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력해 주세요 : ");
        String inputBeforeGame = scanner.nextLine();
        System.out.println("컴퓨터 : " + computerNum);

        if(!inputBeforeGame.matches(numberPattern.getNUM_REGEX().toString())) {
            System.out.println("1 ~ 9 범위의 숫자만 입력하세요.");
        }
        if(inputBeforeGame.charAt(0) == inputBeforeGame.charAt(1) || inputBeforeGame.charAt(1) == inputBeforeGame.charAt(2)) {
            System.out.println("중복되는 숫자를 입력할 수 없습니다.");
        }

        for (int i = 0; i < inputBeforeGame.length(); i++) {
            if(computerNum.charAt(i) == inputBeforeGame.charAt(i)) {
                strike++;
            }
            if(computerNum.contains(String.valueOf(inputBeforeGame.charAt(i)))) {
                ball++;
            }
        }
        System.out.print(ball > 0 ? ball + "볼 " : "");
        System.out.println(strike > 0 ? strike + "스트라이크" : "");

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
