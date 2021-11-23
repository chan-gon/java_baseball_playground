import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class createNumTest {

    @DisplayName("중복되지 않는 1 ~ 9 범위의 세 자리 임의의 숫자를 잘 생성하는지 테스트")
    @Test
    void generateNumTest(){
        Random rd = new Random();
        int min = 1;
        int max = 9;

        Set<Integer> result = new TreeSet<>();
        while(result.size() != 3) {
            result.add(rd.nextInt(max - min + 1) + min);
        }
        for(int number : result) {
            System.out.println(number);
        }
    }
}
