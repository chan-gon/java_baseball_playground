package third_try.baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 사용자 숫자 입력 클래스
 * */
public class Player {

    public List<Integer> createInputNumbers() {
        System.out.printf("숫자를 입력해 주세요 :");
        Scanner scanner = new Scanner(System.in);
        String inputNumber = scanner.next();

        List<Integer> inputNumberList = new ArrayList<>();
        for (String number : inputNumber.split("")) {
            inputNumberList.add(Integer.valueOf(number));
        }
        if (!NumberValidator.inputNumberCheck(inputNumberList)) {
            throw new IllegalArgumentException();
        }
        return inputNumberList;
    }


}
