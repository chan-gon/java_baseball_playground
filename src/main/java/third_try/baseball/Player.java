package third_try.baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    public List<Integer> createInputNumbers() {
        System.out.printf("숫자를 입력해 주세요 :");
        Scanner scanner = new Scanner(System.in);
        String inputNumber = "123";
        List<Integer> inputNumberList = new ArrayList<>();
        for (String number : inputNumber.split("")) {
            inputNumberList.add(Integer.valueOf(number));
        }
        return inputNumberList;
    }
}