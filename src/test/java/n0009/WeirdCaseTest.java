package n0009;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeirdCaseTest {

    @Test
    public void testToWeirdCase() {
        assertEquals("HeLlO", WeirdCase.toWeirdCase("hello"));
        assertEquals("WeIrD StRiNg CaSe", WeirdCase.toWeirdCase("Weird string case"));
        assertEquals("ThIs Is A TeSt", WeirdCase.toWeirdCase("this is a test"));
        assertEquals("", WeirdCase.toWeirdCase(""));
        assertEquals("A", WeirdCase.toWeirdCase("a"));
    }

    @Test
    public void testToWeirdCase2() {
        assertEquals("HeLlO", WeirdCase.toWeirdCase2("hello"));
        assertEquals("WeIrD StRiNg CaSe", WeirdCase.toWeirdCase2("Weird string case"));
        assertEquals("ThIs Is A TeSt", WeirdCase.toWeirdCase2("this is a test"));
        assertEquals("", WeirdCase.toWeirdCase2(""));
        assertEquals("A", WeirdCase.toWeirdCase2("a"));
    }

}