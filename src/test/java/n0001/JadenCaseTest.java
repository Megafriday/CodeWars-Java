package n0001;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class JadenCaseTest {

    @Test
    void toJadenCase1() {
        assertEquals("Abc Def Ghi", JadenCase.toJadenCase1("abc def ghi"));
        assertNull(JadenCase.toJadenCase1(""));
    }

    @Test
    void toJadenCase2() {
        assertEquals("Abc Def Ghi", JadenCase.toJadenCase2("abc def ghi"));
        assertNull(JadenCase.toJadenCase2(""));
    }

}