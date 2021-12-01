package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Ball> answers;

    public Balls(List<Integer> answers) {
        this.answers = getBalls(answers);
    }

    private static List<Ball> getBalls(List<Integer> answers) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            balls.add(new Ball(i + 1, answers.get(i)));
        }
        return balls;
    }

    public PlayResult play(List<Integer> balls) {
        Balls userBalls = new Balls(balls);
        PlayResult result = new PlayResult();
        for (Ball answer : answers) {
            BallStatus status = userBalls.play(answer);
            result.report(status);
        }
        return result;
    }

    /*
    * map을 통해 특정 데이터로 한정(변환)
    * filter를 통해 NOTHING이 아닌 값만 걸러냄
    * findFirst를 통해 stream의 가장 첫 번째 요소(값)을 가져옴
    * orElse를 통해 위 조건에 해당되지 않을 경우 NOTHING을 리턴하도록 설정
    * */
    public BallStatus play(Ball userBall) {
        return answers.stream()
                .map(answer -> answer.play(userBall))
                .filter(BallStatus::isNotNothing) // Enum도 하나의 클래스이고 객체이기 때문에 메시지를 통해 접근한다
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }
}
