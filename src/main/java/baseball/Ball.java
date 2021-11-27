package baseball;

import java.util.Objects;

public class Ball {

    private final int position;
    private final int ballNum;

    public Ball(int position, int ballNum) {
        this.position = position;
        this.ballNum = ballNum;
    }

    public BallStatus play(Ball ball) {
        System.out.println("Ball 테스트 디폴트 객체값 = " + ballNum);
        System.out.println("play 메서드로 변경한 Ball 객체값 = " + ball.ballNum);

        if(this.equals(ball)) {
            return BallStatus.STRIKE;
        }
        // if(ballNum == ball.ballNum)
        if(ball.matchBallNum(ballNum)) { // 객체를 직접 가져오지 않고 객체에게 메시지를 보내는 것이 좋다.
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean matchBallNum(int ballNum) {
        return this.ballNum == ballNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && ballNum == ball.ballNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, ballNum);
    }
}
