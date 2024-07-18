package Main;

public class CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;

        for(int currSum = 1; currSum < dp.length; currSum++){
            for(int no : nums){
                if(currSum - no >= 0){
                    dp[currSum] += dp[currSum - no];
                }
            }
        }
        return dp[target];
    }

}
