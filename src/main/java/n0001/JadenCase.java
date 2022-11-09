package n0001;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JadenCase {
    public static void main(String[] args) {
        String data = "abc def ghi";    // 目標："Abc Def Ghi"
        System.out.println(toJadenCase(data));
    }

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) return null;

        return Stream.of(phrase.split(" "))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.joining(" "));
    }
}
