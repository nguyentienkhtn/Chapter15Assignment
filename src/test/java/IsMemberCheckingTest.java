import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsMemberCheckingTest {

    @Test
    void isMember1() {
        IsMemberChecking isMemberChecking = new IsMemberChecking();
        int[] a = {2, 4, 6, 8, 10, 12, 14, 16 ,18, 20 };
        int value = 12;
        assertEquals(true, isMemberChecking.isMember(a, value, a.length));

    }
    @Test
    void isMember2() {
        IsMemberChecking isMemberChecking = new IsMemberChecking();
        int[] a = {2, 4, 6, 8, 10, 12, 14, 16 ,18, 20 };
        int value = 120;
        assertEquals(false, isMemberChecking.isMember(a, value, a.length));

    }
}