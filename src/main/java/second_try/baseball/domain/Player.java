package second_try.baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    public List<Integer> playGame() {
        System.out.print("숫자를 입력해 주세요 : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        List<Integer> numbers = new ArrayList<>();
        for (String number : input.split("")) {
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }
}
