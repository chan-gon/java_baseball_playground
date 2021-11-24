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

    public Set<Integer> computerGenerateDistinctNum(){
        Random rd = new Random();
        Set<Integer> numbers = new HashSet<>();
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

            Set<Integer> numByComputer = computerGenerateDistinctNum();
            List<Integer> list = new ArrayList<>(numByComputer);

            int strikeCnt = 0;
            int ballCnt = 0;

            for(int i = 0; i < inputNumArr.length; i++) {
                for(int j = 0; j < list.size(); j++) {
                    if(inputNumArr[i].equals(list.get(j).toString()) && i == j) {
                        System.out.println("사용자 : " + Arrays.toString(inputNumArr));
                        System.out.println("컴퓨터 : " + list);

                        strikeCnt++;
                        System.out.println(strikeCnt + " 스트라이크");
                        playerInputDistinctNum();
                    }
                    if(inputNumArr[i].equals(list.get(j).toString())) {
                        System.out.println("사용자 : " + Arrays.toString(inputNumArr));
                        System.out.println("컴퓨터 : " + list);

                        ballCnt++;
                        System.out.println(ballCnt + " 볼");
                        playerInputDistinctNum();
                    }
                    if(inputNumArr[i].equals(list.get(j).toString())) {
                        System.out.println("사용자 : " + Arrays.toString(inputNumArr));
                        System.out.println("컴퓨터 : " + list);
                        System.out.println("낫싱");
                        playerInputDistinctNum();
                    }
                }
            }
        }
    }

    public void showResult() {

    }
}
