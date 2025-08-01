
public class _3SumCloset {
    public int threeSumClosest(int[] nums, int target) {
        int mindiff = Integer.MAX_VALUE;
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == target) return target;

                else {
                    int diff = Math.abs(target - sum);

                    if (diff < mindiff) {
                        mindiff = diff;
                        ans = sum;
                    }
                }

                if (sum < target) j++;
                else if (sum > target) k--;
            }

        }

    }
}
