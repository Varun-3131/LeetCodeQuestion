package Main;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int number = nums.length;
        return nums[number/2];
    }
}
