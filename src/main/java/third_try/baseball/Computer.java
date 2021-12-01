package third_try.baseball;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
 * 컴퓨터가 세자리 숫자를 생성하는 클래스
 * */
public class Computer {
    private static int MIN_NUM = 1;
    private static int MAX_NUM = 9;

    public Set<Integer> generateNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();

        while (numbers.size() < 3) {
            numbers.add(random.nextInt(MAX_NUM) + MIN_NUM);
        }
        return numbers;
    }
}
