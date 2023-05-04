// https://www.codewars.com/kata/525f50e3b73515a6db000b83

package n0012;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {

    public static String createPhoneNumber(int[] numbers) {
        String result =
                "(" + numbers[0] + numbers[1] + numbers[2] + ")" +
                        " " +
                        numbers[3] + numbers[4] + numbers[5] +
                        "-" +
                        numbers[6] + numbers[7] + numbers[8] + numbers[9];

        return result;
    }

    public static String createPhoneNumber2(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d"
                , numbers[0], numbers[1], numbers[2], numbers[3], numbers[4]
                , numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }

    public static String createPhoneNumber3(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d"
                , IntStream.of(numbers).boxed().toArray());
    }

    public static String createPhoneNumber4(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d"
                , Arrays.stream(numbers).boxed().toArray(Integer[]::new));
    }

}