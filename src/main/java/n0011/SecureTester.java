// https://www.codewars.com/kata/526dbd6c8c0eb53254000110

package n0011;

import java.util.regex.Pattern;

public class SecureTester {
    public static boolean alphanumeric(String phrase) {
        var regexp = "[a-zA-Z0-9]+";
        return Pattern.matches(regexp, phrase);
    }

    public static boolean alphanumeric2(String phrase) {
        return phrase.matches("[a-zA-Z0-9]+");
    }
}
