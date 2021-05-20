import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursivePowerTest {

    @Test
    void pow1() {
        RecursivePower recursivePower = new RecursivePower();
        double x = 2.0, y = 10.0;
        assertEquals(Math.pow(x, y), recursivePower.pow(x, y));
    }
}