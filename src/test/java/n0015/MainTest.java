package n0015;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testConvertToUpperCase() {
        List<String> data = List.of("apple", "banana", "orange", "pineapple");
        List<String> expected = List.of("apple", "BANANA", "ORANGE", "PINEAPPLE");
        assertEquals(expected, Main.convertToUpperCase(data));
    }

    @Test
    public void testSumLengthOfLongStrings() {
        List<String> data = List.of("apple", "banana", "orange", "pineapple");
        int expected = 21;
        assertEquals(expected, Main.sumLengthOfLongStrings(data));
    }

    @Test
    public void testAllStringsContainA() {
        List<String> data = List.of("apple", "banana", "orange", "pineapple");
        assertTrue(Main.allStringsContainA(data));
    }

    @Test
    public void testContainsC() {
        List<String> data = List.of("apple", "banana", "orange", "pineapple");
        assertFalse(Main.containsC(data));
    }
}
