// プロになるJavaで出題
package n0015;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var str = List.of("apple", "banana", "orange", "pineapple");

        System.out.println(convertToUpperCase(str));
        System.out.println(sumLengthOfLongStrings(str));
        System.out.println(allStringsContainA(str));
        System.out.println(containsC(str));
    }

    // 6文字以上のものを、大文字にして返す
    public static List<String> convertToUpperCase(List<String> data) {
        return data.stream()
                .map(e -> e.length() >= 6 ? e.toUpperCase() : e)
                .collect(Collectors.toList());
    }

    // 6文字以上のものの文字数の合計を返す
    public static int sumLengthOfLongStrings(List<String> data) {
        return data.stream()
                .filter(e -> e.length() >= 6)
                .mapToInt(e -> e.length())
                .sum();
    }

    // すべての文字列が、"a" を含んでいるか判定
    public static boolean allStringsContainA(List<String> data) {
        return data.stream()
                .allMatch(e -> e.contains("a"));
    }

    // "c" を含んでいる文字列がひとつでもあるか判定
    public static boolean containsC(List<String> data) {
        return data.stream()
                .anyMatch(e -> e.contains("c"));
    }
}
