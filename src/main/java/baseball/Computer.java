package baseball;

import java.util.HashMap;
import java.util.Map;

public class Computer {

    public static Map<String, Integer> generateNum() {
        Map<String, Integer> comNumber = new HashMap<>();
        comNumber.put("comPosition", 1);
        comNumber.put("comNumber", 2);
        return comNumber;
    }


}
