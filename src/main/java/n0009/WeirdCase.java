package n0009;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WeirdCase {
    public static void main(String[] args) {
        System.out.println(toWeirdCase("String"));  //=> returns "StRiNg"
        System.out.println(toWeirdCase("Weird string case")); //=> returns "WeIrD StRiNg CaSe"
    }

    public static String toWeirdCase(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(str -> {

                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < str.length(); i++) {
                        if (i % 2 == 0) {
                            // sb.append(Character.toUpperCase(str.charAt(i)));
                            sb.append(str.toUpperCase().charAt(i));
                        } else {
                            // sb.append(Character.toLowerCase(str.charAt(i)));
                            sb.append(str.toLowerCase().charAt(i));
                        }
                    }
                    return sb.toString();
                })
                .collect(Collectors.joining(" "));
    }

    public static String toWeirdCase2(String sentence) {
        StringBuilder sb = new StringBuilder();
        boolean isUpperCase = true;

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (c == ' ') {
                sb.append(c);
                isUpperCase = true;
                continue;
            }

            if (isUpperCase) {
                sb.append(Character.toUpperCase(c));
                isUpperCase = false;
            } else {
                sb.append(Character.toLowerCase(c));
                isUpperCase = true;
            }
        }

        return sb.toString();
    }

}
