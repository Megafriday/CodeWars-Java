// https://www.codewars.com/kata/545cedaa9943f7fe7b000048

package n0007;

public class PangramChecker {
    public boolean check(String sentence) {
        sentence = sentence.toLowerCase();
        String[] alpahbetList = "abcdefghijklmnopqrstuvwxyz".split("");
        for (String str : alpahbetList) {
            if (sentence.indexOf(str) == -1) return false;
        }
        return true;
    }

    public boolean check1(String sentence) {
        return sentence.chars()
                .filter(Character::isAlphabetic)
                .map(Character::toLowerCase)
                .distinct()
                .count() == 26;
    }
}
