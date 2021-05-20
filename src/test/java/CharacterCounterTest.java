import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterCounterTest {

    @Test
    void charCount1() {
        CharacterCounter characterCounter = new CharacterCounter();
        char[] test = {'a', 'b', 'a', 'c', 'd', 'a', 'e',
                'a', 'f', 'g', 'h', 'a', 'i', 'a'};
        char a = 'a';
        assertEquals(6, characterCounter.charCount(test, 0, a));


    }
    @Test
    void charCount2() {
        CharacterCounter characterCounter = new CharacterCounter();
        char[] test = {'a', 'b', 'a', 'c', 'd', 'a', 'e',
                'a', 'f', 'g', 'h', 'a', 'i', 'a'};
        char a = 'A';
        assertEquals(0, characterCounter.charCount(test, 0, a));

    }
}