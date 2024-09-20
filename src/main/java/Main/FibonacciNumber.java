package Main;

public class FibonacciNumber {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int[] v = new int[n + 1];
        v[1] = 1;
        for (int i = 2; i <= n; i++) {
            v[i] = v[i - 1] + v[i - 2];
        }
        return v[n];
    }
}
