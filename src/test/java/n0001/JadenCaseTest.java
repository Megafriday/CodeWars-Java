package n0001;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JadenCaseTest {

    @Test
    void toJadenCase() {
        Assertions.assertEquals("Abc Def Ghi", JadenCase.toJadenCase("abc def ghi"));
        Assertions.assertNull(JadenCase.toJadenCase(""));
    }
}