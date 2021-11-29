package baseball;

import java.util.Map;

public class Ball {

    public static BallStatus checkBall(int position, int number) {

        Map<String, Integer> comNumber = Computer.generateNum();

        if(comNumber.get("comPosition") == position && comNumber.get("comNumber") == number) {
            return BallStatus.STRIKE;
        }
        if(comNumber.get("comPosition") == position || comNumber.get("comNumber") == number) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }
}

