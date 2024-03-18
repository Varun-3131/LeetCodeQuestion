package Main;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        backtrack(l, new ArrayList<>(), nums);
        return l;
    }

    private void backtrack(List<List<Integer>> l, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            l.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                backtrack(l, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
