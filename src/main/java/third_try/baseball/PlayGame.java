package third_try.baseball;

import java.util.List;

public class PlayGame {
    Computer computer = new Computer();
    Player player = new Player();

    public String checkNumber(List<Integer> computerNumber, List<Integer> playerNumber) {

/*        computerNumber = computer.generateNumbers();
        playerNumber = player.createInputNumbers();*/
        int cnt = correctCount(computerNumber, playerNumber);

        int strike = 0;
        int ball = 0;

        for (int i = 0; i < 3; i++) {
            if (hasPlace(computerNumber, i, playerNumber.get(i))) {
                strike++;
            }

            ball = cnt - strike;

            if (cnt == 0) {
                return "낫싱";
            }
        }
        return ball + "볼 " + strike + "스트라이크";
    }

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
