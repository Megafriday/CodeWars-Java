package n0011;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SecureTesterTest {

    @Test
    @DisplayName("alphanumericのテスト")
    void alphanumeric() {
        assertTrue(SecureTester.alphanumeric("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
        assertFalse(SecureTester.alphanumeric("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_"));
    }

    @Test
    @DisplayName("alphanumeric2のテスト")
    void alphanumeric2() {
        assertTrue(SecureTester.alphanumeric2("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
        assertFalse(SecureTester.alphanumeric2("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_"));
    }
}