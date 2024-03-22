package Main;

public class RemoveDuplicateFromSortedArray_II {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int index = 1; index < nums.length; index++) {
            if (j == 1 || nums[index] != nums[j - 2]) {
                nums[j++] = nums[index];
            }
        }
        return j;
    }
}
