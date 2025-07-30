class Solution {

    void getAllComb(int[] arr, int idx, int target, List<List<Integer>> ans, List<Integer> comb) {
        if (target == 0) {
            ans.add(new ArrayList<>(comb));
            return;
        }

        if (idx == arr.length || target < 0) {
            return;
        }

        // Include current element
        comb.add(arr[idx]);
        getAllComb(arr, idx, target - arr[idx], ans, comb);  // multiple include
        comb.remove(comb.size() - 1);  // backtrack

        // Exclude current element
        getAllComb(arr, idx + 1, target, ans, comb);
    }

    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        getAllComb(arr, 0, target, ans, comb);
        return ans;
    }
}
