package n0001;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class JadenCaseTest {

    @Test
    void toJadenCase() {
        assertEquals("Abc Def Ghi", JadenCase.toJadenCase("abc def ghi"));
        assertNull(JadenCase.toJadenCase(""));
    }
}