public class RecursivePower {
    /**
     The pow method raises a number to a power.
     @param x The number to raise.
     @param y The power to raise x to.
     @return The value of x raised to the power of y.
     */

    public double pow(double x, double y)
    {
        if (y > 0)
            return x * pow(x, y-1);
        else
            return 1;
    }
}
