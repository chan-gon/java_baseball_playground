package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Ball> balls;

    public Balls(List<Integer> answers) {
        this.balls = getBalls(answers);
    }

    private static List<Ball> getBalls(List<Integer> answers) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            balls.add(new Ball(i + 1, answers.get(i)));
        }
        return balls;
    }

    public BallStatus play(Ball userBall) {
        return balls.stream()
                .map(answer -> answer.play(userBall))
                .filter(BallStatus::isNotNothing) // Enum도 하나의 클래스이고 객체이기 때문에 메시지를 통해 접근한다
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }
}
