package third_try.baseball;

public enum GameStatus {
    BALL("볼"),
    STRIKE("스트라이크"),
    NOTHING("낫싱"),
    RESTART("2"),
    EXIT("1")
    ;

    private String status;

    GameStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
