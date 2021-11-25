package first_try.baseball;

import java.util.*;
import java.util.regex.Pattern;

public class NumberPattern {
    private java.util.regex.Pattern NUM_REGEX = java.util.regex.Pattern.compile("^[1-9]*$");

    public java.util.regex.Pattern getNUM_REGEX() {
        return NUM_REGEX;
    }

}
