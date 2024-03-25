package Main;

public class JumpGame_II {
    public int jump(int[] nums) {
        int answer = 0;
        int end = 0;
        int farthest = 0;
        for (int i = 0; i < nums.length - 1; ++i) {
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest >= nums.length - 1) {
                ++answer;
                break;
            }
            if (i == end) {
                ++answer;
                end = farthest;
            }
        }

        return answer;
    }
}
