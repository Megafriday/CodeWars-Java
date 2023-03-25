// https://www.codewars.com/kata/52761ee4cffbc69732000738

package n0010;

import java.util.Arrays;

public class GoodVsEvil {
    final static String good = "Battle Result: Good triumphs over Evil";
    final static String evil = "Battle Result: Evil eradicates all trace of Good";
    final static String tie = "Battle Result: No victor on this battle field";

    public static void main(String[] args) {
        System.out.println(GoodVsEvil.battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"));
        System.out.println(GoodVsEvil.battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
        System.out.println(GoodVsEvil.battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
    }

    public static String battle(String goodAmounts, String evilAmounts) {
        int goodValue = Arrays.stream(goodAmounts.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .sum();
        int evilValue = Arrays.stream(evilAmounts.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .sum();

        if (goodValue > evilValue) return good;
        if (goodValue < evilValue) return evil;
        return tie;
    }

    public static String battle1(String goodAmounts, String evilAmounts) {
        int goodValue = Arrays.stream(goodAmounts.split(" "))
                .mapToInt(Integer::parseInt)
                .reduce(0, Integer::sum);
        int evilValue = Arrays.stream(evilAmounts.split(" "))
                .mapToInt(Integer::parseInt)
                .reduce(0, Integer::sum);

        if (goodValue > evilValue) return good;
        if (goodValue < evilValue) return evil;
        return tie;
    }
}
