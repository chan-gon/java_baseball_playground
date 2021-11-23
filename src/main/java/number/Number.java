package number;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Number {
    private Pattern NUM_REGEX = Pattern.compile("^[1-9]*$");
    private int min = 1;
    private int max = 9;

    public Pattern getNUM_REGEX() {
        return NUM_REGEX;
    }

    /*
    * 중복되지 않는 1 ~ 9 범위의 세 자리 임의의 숫자를 생성하는 메소드
    * */
    public Set<Integer> computerGenerateDistinctNum(){
        Random rd = new Random();
        Set<Integer> numbers = new TreeSet<>();
        while(numbers.size() != 3) {
            numbers.add(rd.nextInt(max - min + 1) + min);
        }
        if(NUM_REGEX.matcher(numbers.toString()).find()) throw new IllegalArgumentException();

        return numbers;
    }

    public void playerInputDistinctNum() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while(flag) {
            System.out.print("숫자를 입력해 주세요 : ");
            String inputNum = scanner.nextLine();

            String[] inputNumArr = inputNum.split("");
            if(Arrays.stream(inputNumArr).distinct().count() != 3) {
                System.out.println("중복값은 입력할 수 없습니다.");
                continue;
            }
            if(inputNum.length() > 3 || inputNum.length() < 3) {
                System.out.println("3자리 숫자만 입력 가능합니다.");
                continue;
            }
            if(!inputNum.matches(NUM_REGEX.toString())) {
                System.out.println("1 - 9 까지의 숫자만 입력 가능합니다.");
                continue;
            }
        }
    }
}
