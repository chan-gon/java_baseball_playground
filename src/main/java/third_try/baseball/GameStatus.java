package third_try.baseball;

/*
 *게임 진행 상태 관련 상수값 모음 클래스
 * */
public enum GameStatus {
    BALL("볼"),
    STRIKE("스트라이크"),
    NOTHING("낫싱"),
    RESTART("1"),
    EXIT("2"),
    FINISH("3");

    private String status;

    GameStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
