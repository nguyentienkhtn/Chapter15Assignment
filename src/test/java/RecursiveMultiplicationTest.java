import org.junit.jupiter.api.Test;

import javax.management.BadAttributeValueExpException;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveMultiplicationTest {

    @Test
    void recurivelyMultiply1() {
        RecursiveMultiplication recursiveMultiplication = new RecursiveMultiplication();
        int x = 10;
        int y = 100;
        assertEquals(x*y, recursiveMultiplication.recurivelyMultiply(x, y));
        x = 1000;
        y = 1000;
        assertEquals(x*y, recursiveMultiplication.recurivelyMultiply(x, y));

    }
    @Test
    void recurivelyMultiply2() {
        RecursiveMultiplication recursiveMultiplication = new RecursiveMultiplication();
        int x = 1000;
        int y = 1000;
        assertEquals(x*y, recursiveMultiplication.recurivelyMultiply(x, y));

    }
}