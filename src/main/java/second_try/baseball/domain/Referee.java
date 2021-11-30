package second_try.baseball.domain;

import java.util.List;

public class Referee {
    public String compare(List<Integer> computer, List<Integer> player) {

        Judgement judgement = new Judgement();
        int cnt = judgement.correctCount(computer, player);

        int strike = 0;
        for (int i = 0; i < player.size(); i++) {
            if (judgement.hasPlace(computer, i, player.get(i))) {
                strike++;
            }
        }
        int ball = cnt - strike;
        return ball + "볼 " + strike + "스트라이크";
    }
}
