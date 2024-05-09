package Main;

public class MaximumGap {
    public int maximumGap(int[] nums) {
        if(nums.length==1)return 0;
        Arrays.sort(nums);
        int max=0;
        for( int i=0; i<nums.length-1; i++)
        {
            if(nums[i+1]-nums[i]>max)
            {
                max=nums[i+1]-nums[i];
            }
        }
        return max;
    }
}
