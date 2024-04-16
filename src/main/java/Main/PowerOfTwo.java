package Main;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        for (int index = 0; index < 31; index++) {
            int ans = (int) Math.pow(2, index);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }
}
