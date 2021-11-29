import first_try.baseball.Player;
import second_try.baseball.domain.Calculator;
import second_try.baseball.domain.NumberGenerator;

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

        NumberGenerator numberGenerator = new NumberGenerator();

        System.out.println(numberGenerator.createRandomNumber());
    }
}
