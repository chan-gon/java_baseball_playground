package third_try.baseball;

import java.util.*;

/*
 * 컴퓨터가 세자리 숫자를 생성하는 클래스
 * */
public class Computer {

    public List<Integer> generateNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();

        while (numbers.size() < 3) {
            numbers.add(random.nextInt(NumberValidator.MAX_NUM) + NumberValidator.MIN_NUM);
        }
        return new ArrayList<>(numbers);
    }
}
