package Main;

public class ShuffleAnArray {
    private int[] original;
    private int[] ans;

    public Solution(int[] nums) {
        this.original = nums;
        this.ans = nums.clone();
    }

    public int[] reset() {
        return this.original;
    }

    public int[] shuffle() {
        Random random = new Random();
        int n = ans.length;
        for(int i = 0; i< n-1 ;i++){
            int toSwap = random.nextInt(n-i)+i;
            int temp = ans[i];
            ans[i] = ans[toSwap];
            ans[toSwap] = temp;
        }

        return ans;
    }

}
