package n0002;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StringSplit {
    public static void main(String[] args) {
        String data = "abc";     // 目標：["ab", "c_"]
        String data2 = "abcdef"; // 目標：["ab", "cd", "ef"]

        Stream.of(solution(data)).forEach(System.out::println);
    }

    public static String[] solution(String str) {
        if (str.length() % 2 == 1) str += "_";
        var result = new ArrayList<String>();

        for (int i = 0; i < str.length(); i += 2) {
            result.add(String.valueOf(str.charAt(i)) + str.charAt(i + 1));
        }

        return result.toArray(new String[0]);   // ArrayList から Arrayに変換
    }
}
