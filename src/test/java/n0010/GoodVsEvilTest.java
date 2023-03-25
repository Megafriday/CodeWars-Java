package n0010;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GoodVsEvilTest {

    @Test
    public void battleのテスト() {
        assertEquals("Battle Result: Evil eradicates all trace of Good",
                GoodVsEvil.battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"));

        assertEquals("Battle Result: Good triumphs over Evil",
                GoodVsEvil.battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));

        assertEquals("Battle Result: No victor on this battle field",
                GoodVsEvil.battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
    }

    @Test
    public void battle1のテスト() {
        assertEquals("Battle Result: Evil eradicates all trace of Good",
                GoodVsEvil.battle1("1 1 1 1 1 1", "1 1 1 1 1 1 1"));

        assertEquals("Battle Result: Good triumphs over Evil",
                GoodVsEvil.battle1("0 0 0 0 0 10", "0 1 1 1 1 0 0"));

        assertEquals("Battle Result: No victor on this battle field",
                GoodVsEvil.battle1("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
    }

}