// https://www.codewars.com/kata/5390bac347d09b7da40006f6

package n0001;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JadenCase {
    public static void main(String[] args) {
        String data = "abc def ghi";    // 目標："Abc Def Ghi"
        System.out.println(toJadenCase1(data));
    }

    public static String toJadenCase1(String phrase) {
        if (phrase == null || phrase.equals("")) return null;

        return Stream.of(phrase.split(" "))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.joining(" "));
    }

    public static String toJadenCase2(String phrase) {
        if (phrase == null || phrase.equals("")) return null;

        var pattern = Pattern.compile("(^|\\s)[a-z]");
        var match = pattern.matcher(phrase);
        return match.replaceAll(s -> s.group().toUpperCase());
    }
}
