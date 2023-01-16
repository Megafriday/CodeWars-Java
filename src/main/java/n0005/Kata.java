// https://www.codewars.com/kata/5259b20d6021e9e14c0010d4

package n0005;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public static void main(String[] args) {
        var result = reverseWords2("This is a pen.");
        System.out.println(result); // 目標:"sihT si a .nep"
    }

    public static String reverseWords1(String original) {
        var array = original.split(" ");
        if (array.length == 0) return original;

        var result = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            var reversed = new ArrayList<String>();
            for (int j = array[i].length() - 1; j >= 0; j--) {
                reversed.add(array[i].substring(j, j + 1));
            }
            result.add(reversed.stream().collect(Collectors.joining()));
        }
        return result.stream().collect(Collectors.joining(" "));
    }

    public static String reverseWords2(String original) {
        var array = original.split(" ");
        if (original.length() == 0) return original;

        for (int i = 0; i < array.length; i++) {
            array[i] = new StringBuffer(array[i]).reverse().toString();
        }

        return String.join(" ", array);
    }

    public static String reverseWords3(String original) {
        var array = original.split(" ");
        if (original.length() == 0) return original;

        return Arrays.stream(array)
                .map(s -> new StringBuffer(s).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
