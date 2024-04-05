package Main;

public class MovesZeroes {
    public void moveZeroes(int[] nums) {
        int l = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[l];
                nums[l] = temp;
                l++;
            }
        }
    }
}
