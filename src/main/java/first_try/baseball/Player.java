package first_try.baseball;

import java.util.*;

public class Player {

    Operator operator = new Operator();
    Computer computer = new Computer();

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
            if(!inputNum.matches(operator.getNUM_REGEX().toString())) {
                System.out.println("1 - 9 까지의 숫자만 입력 가능합니다.");
                continue;
            }

            Set<Integer> numByComputer = computer.computerGenerateDistinctNum();
            List<Integer> list = new ArrayList<>(numByComputer);

            int strikeCnt = 0;
            int ballCnt = 0;

            for(int i = 0; i < inputNumArr.length; i++) {
                for(int j = 0; j < list.size(); j++) {
                    if(inputNumArr[i].equals(list.get(j).toString()) && i == j) {
                        System.out.println("사용자 : " + Arrays.toString(inputNumArr));
                        System.out.println("컴퓨터 : " + list);

                        strikeCnt++;
                        playerInputDistinctNum();
                    }
                    if(inputNumArr[i].equals(list.get(j).toString())) {
                        System.out.println("사용자 : " + Arrays.toString(inputNumArr));
                        System.out.println("컴퓨터 : " + list);

                        ballCnt++;
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
}
