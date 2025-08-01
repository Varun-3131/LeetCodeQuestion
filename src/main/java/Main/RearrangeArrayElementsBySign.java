package Main;

public class RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        int[] ans= new int[nums.length];
        int posIdx=0,negIdx=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]< 0 ){  //Neagtive
                ans[negIdx]=nums[i];
                negIdx+=2;
            }
            else{
                ans[posIdx]=nums[i];
                posIdx+=2;
            }
        }
        return ans;
    }
}
