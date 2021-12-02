import third_try.baseball.PlayGame;

public class Main {
    public static void main(String[] args) {
        PlayGame playGame = new PlayGame();
        do {
            playGame.playBaseballGame();
        } while (playGame.gameRestart());
    }
}
