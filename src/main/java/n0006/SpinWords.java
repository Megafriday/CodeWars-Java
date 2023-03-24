// https://www.codewars.com/kata/5264d2b162488dc400000001

package n0006;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    public static void main(String[] args) {
        var spinWords = new SpinWords();
		// 目標 "Hey wollef sroirraw"（5 文字以上の単語はすべて逆にします）
        System.out.println(spinWords.spinWords("Hey fellow warriors"));
    }

    public String spinWords(String sentence) {
        var words = sentence.split(" ");
        var result = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < 5) {
                result.add(words[i]);
            } else {
                result.add(new StringBuilder(words[i]).reverse().toString());
            }
        }
        return result.stream().collect(Collectors.joining(" "));
    }

    public String spinWords1(String sentence) {
        var words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }

    public String spinWords2(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(word -> word.length() >= 5 ? new StringBuilder(word).reverse().toString() : word)
                .collect(Collectors.joining(" "));
    }

}
