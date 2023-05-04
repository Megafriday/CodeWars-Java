package n0012;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {

    @Test
    void createPhoneNumber() {
        assertEquals("(123) 456-7890", Kata.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    void createPhoneNumber2() {
        assertEquals("(123) 456-7890", Kata.createPhoneNumber2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    void createPhoneNumber3() {
        assertEquals("(123) 456-7890", Kata.createPhoneNumber3(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    void createPhoneNumber4() {
        assertEquals("(123) 456-7890", Kata.createPhoneNumber3(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}