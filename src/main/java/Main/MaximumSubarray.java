package Main;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int a=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>a){
                a=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return a;
    }
}
