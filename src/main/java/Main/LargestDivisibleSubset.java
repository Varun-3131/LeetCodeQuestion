package Main;

public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            List<Integer> singleElementList = new ArrayList<>();
            for (int num : nums) {
                singleElementList.add(num);
            }
            return singleElementList;
        }

        Arrays.sort(nums);
        int[] dp = new int[n];
        int[] prev = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);
        int maxIndex = 0;

        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }

            if (dp[i] > dp[maxIndex]) {
                maxIndex = i;
            }
        }

        List<Integer> result = new ArrayList<>();
        while (maxIndex != -1) {
            result.add(nums[maxIndex]);
            maxIndex = prev[maxIndex];
        }

        java.util.Collections.reverse(result);
        return result;
    }
}
