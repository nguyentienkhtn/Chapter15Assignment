public class RecursiveMultiplication {
    /**
     The multiply method uses recursion to multiply
     x by y. The multiplication is performed
     as repetitive addition.
     @param x A number to multiply.
     @param y Another number to multiply.
     @return The product of x times y.
     */
    public long recurivelyMultiply(int x, int y)
    {
        if(y < 1)
            throw new IllegalArgumentException("y is less than 1");
        else if(y == 1)
            return x;
        else
            return x + recurivelyMultiply(x, y - 1);
    }
}
