import first_try.baseball.Player;
import second_try.baseball.domain.Calculator;
import second_try.baseball.domain.Judgement;
import second_try.baseball.domain.NumberGenerator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Player player = new Player();
        player.gameStart();*/
        /*Calculator calculator1 = new Calculator();
        calculator1.add(2, 2);
        System.out.println(Calculator.result);

        Calculator calculator2 = new Calculator();
        calculator2.add(3, 3);
        System.out.println(Calculator.result);
        System.out.println(Calculator.result);
        System.out.println(Calculator.SHARE_BIRTHDAY);*/

        Judgement judgement = new Judgement();
        boolean result = judgement.hasPlace(Arrays.asList(1, 2, 3), 1, 2);
        System.out.println(result);
    }
}
