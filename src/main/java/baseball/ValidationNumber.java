package baseball;

public class ValidationNumber {

    public static final int MIN_NUM = 1;
    public static final int MAX_NUM = 9;

    public static boolean validNum(int num) {
        return MIN_NUM <= num && num <= MAX_NUM;
    }
}
