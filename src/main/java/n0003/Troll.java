// https://www.codewars.com/kata/52fba66badcd10859f00097e

package n0003;

import java.util.regex.Pattern;

public class Troll {
    public static void main(String[] args) {
        String str = "This website is for losers LOL!";
        System.out.println(disemvowel1(str));
    }

    public static String disemvowel1(String str) {
        var pattern = Pattern.compile("[aiueo]", Pattern.CASE_INSENSITIVE);
        var match = pattern.matcher(str);
        return match.replaceAll("");
    }

    public static String disemvowel2(String str) {
        return str.replaceAll("(?i)[aeiou]", ""); // 大文字小文字を区別しない101
        // return str.replaceAll("[aiueo]", "");  // 大文字小文字は区別される
    }

}
