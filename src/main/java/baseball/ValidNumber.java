package baseball;

public class ValidNumber {
    private static int MIN_NUM = 1;
    private static int MAX_NUM = 9;

    public static boolean checkNumberRange(int number) {
        return MIN_NUM <= number && number <= MAX_NUM;
    }

    public static boolean checkNumberLength(String number) {
        return number.length() == 3;
    }

    public static boolean checkNumberDuplicate(int num1, int num2, int num3) {
        return num1 == num2 || num1 == num3 || num1 == num3 ? false : true;
    }
}
