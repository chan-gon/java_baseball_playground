package baseball;

public class ValidationNumber {

    public static boolean validNum(int num) {

        if(1 <= num && num <= 9) {
            return true;
        }

        return false;
    }
}
