package baseball;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class ValidationNumber {

    public static final int MIN_NUM = 1;
    public static final int MAX_NUM = 9;

    public static boolean validNum(int num) {
        return MIN_NUM <= num && num <= MAX_NUM;
    }


    public static String checkThreeDigits() {
        List<Integer> set = new ArrayList<>();
        Random rd = new Random();

        while (set.size() < 3) {
            set.add(rd.nextInt(MAX_NUM) + MIN_NUM);
        }
        StringBuilder stringBuilder = new StringBuilder();
        set.forEach(stringBuilder::append);

        return stringBuilder.toString();
    }
}
