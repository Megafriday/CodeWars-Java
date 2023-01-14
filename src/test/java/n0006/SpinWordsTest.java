package n0006;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpinWordsTest {

    @Test
    void spinWordsのテスト() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));

    }

    @Test
    void spinWords1のテスト() {
        assertEquals("emocleW", new SpinWords().spinWords1("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords1("Hey fellow warriors"));

    }

    @Test
    void spinWords2のテスト() {
        assertEquals("emocleW", new SpinWords().spinWords2("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords2("Hey fellow warriors"));

    }
}