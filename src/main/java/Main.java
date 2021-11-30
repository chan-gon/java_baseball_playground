import first_try.baseball.Player;
import second_try.baseball.domain.Calculator;
import second_try.baseball.domain.Judgement;
import second_try.baseball.domain.NumberGenerator;
import second_try.baseball.domain.Referee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Referee referee = new Referee();

        System.out.println(referee.compare(Arrays.asList(1, 2, 3), Arrays.asList(3, 4, 5)));
    }
}
