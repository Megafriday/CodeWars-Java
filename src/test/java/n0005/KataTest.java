package n0005;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {

    @Test
    void reverseWords1のテスト() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", Kata.reverseWords1("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", Kata.reverseWords1("apple"));
        assertEquals("a b c d", Kata.reverseWords1("a b c d"));
        assertEquals("elbuod  decaps  sdrow", Kata.reverseWords1("double  spaced  words"));
    }

    @Test
    void reverseWords2のテスト() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", Kata.reverseWords1("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", Kata.reverseWords2("apple"));
        assertEquals("a b c d", Kata.reverseWords2("a b c d"));
        assertEquals("elbuod  decaps  sdrow", Kata.reverseWords2("double  spaced  words"));
    }

    @Test
    void reverseWords3のテスト() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", Kata.reverseWords1("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", Kata.reverseWords3("apple"));
        assertEquals("a b c d", Kata.reverseWords3("a b c d"));
        assertEquals("elbuod  decaps  sdrow", Kata.reverseWords3("double  spaced  words"));
    }

}

