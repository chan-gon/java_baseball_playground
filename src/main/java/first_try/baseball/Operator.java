package first_try.baseball;

import java.util.*;
import java.util.regex.Pattern;

public class Operator {
    private Pattern NUM_REGEX = Pattern.compile("^[1-9]*$");

    public Pattern getNUM_REGEX() {
        return NUM_REGEX;
    }

}
