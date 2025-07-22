package Main;

public class CountGoodNumber {
    static final int MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;  // Even indices
        long oddCount = n / 2;         // Odd indices

        long pow5 = power(5, evenCount);
        long pow4 = power(4, oddCount);

        return (int)((pow5 * pow4) % MOD);
    }

    private long power(long x, long n) {
        long result = 1;
        x %= MOD;

        while (n > 0) {
            if ((n & 1) == 1) {
                result = (result * x) % MOD;
            }
            x = (x * x) % MOD;
            n >>= 1;
        }
        return result;
    }
}
