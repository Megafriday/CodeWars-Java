package n0003;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrollTest {

    @Test
    void disemvowel1() {
        assertEquals("Ths wbst s fr lsrs LL!", Troll.disemvowel1("This website is for losers LOL!"));
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", Troll.disemvowel1("No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals("Wht r y,  cmmnst?", Troll.disemvowel1("What are you, a communist?"));
    }

    @Test
    void disemvowel2() {
        assertEquals("Ths wbst s fr lsrs LL!", Troll.disemvowel2("This website is for losers LOL!"));
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", Troll.disemvowel2("No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals("Wht r y,  cmmnst?", Troll.disemvowel2("What are you, a communist?"));
    }

}