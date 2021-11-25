package first_try.baseball;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Computer {

   private int min = 1;
   private int max = 9;

    public Set<Integer> computerGenerateDistinctNum(){
        Random rd = new Random();
        Set<Integer> numbers = new HashSet<>();

        while(numbers.size() < 3) {
            numbers.add(rd.nextInt(max) + min);
        }

        return numbers;
    }

}
