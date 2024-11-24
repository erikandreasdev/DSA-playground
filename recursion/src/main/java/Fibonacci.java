public class Fibonacci {

    public int calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        } else {
            if (n == 0 || n == 1) {
                return n;
            }
            return calculate(n - 1) + calculate(n - 2);
        }
    }
}
