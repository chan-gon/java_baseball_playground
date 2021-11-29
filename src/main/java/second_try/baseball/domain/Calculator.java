package second_try.baseball.domain;

public class Calculator {
    public final static int SHARE_BIRTHDAY = 0504; // 상수, 클래스 변수이면서 변하지 않는 값
    public static int result = 0; // 클래스 변수

    public int result2 = 0; // 인스턴스 변수

    public Calculator() {
    }

    public int add(int num1, int num2) {
        result = num1 + num2;
        return result;
    }
}
