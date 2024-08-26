package Main;

public class SplitTheArray {
    public boolean isPossibleToSplit(int[] nums) {
        int[] cnt = new int[101];  // make array variable as a cnt for storing frequency of every element.
        for(int i=0;i<nums.length;i++){   // iterate over the array and add frequency in the cnt array variable & check if frequency is more than 2 then return false.
            cnt[nums[i]-1]++;
            if(cnt[nums[i]-1]>2){
                return false;
            }
        }
        return true;   // if loop is finished & no one element has a frequency more than 2 then return true.
    }
}
