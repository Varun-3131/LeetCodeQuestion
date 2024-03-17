package Main;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resultt = new ArrayList<List<Integer>>();
        List<Integer>ds = new ArrayList<>();
        int n = candidates.length;
        int startIndex = 0;
        recurCombinationSum(startIndex , candidates , target , n ,ds,resultt );

        return resultt;

    }

    private void recurCombinationSum(int startIndex, int[] candidates, int target, int n, List<Integer> ds, List<List<Integer>> resultt) {
        if (startIndex == n) {
            if(target == 0){
                resultt.add(new ArrayList<>(ds));
                return;
            }
            return;
        }
        ds.add(candidates[startIndex]);
        if(candidates[startIndex] <= target)
            recurCombinationSum(startIndex , candidates, target -candidates[startIndex], n ,ds,resultt);
        ds.remove(ds.size() - 1);
        recurCombinationSum(startIndex +1  , candidates, target,n,ds,resultt);
    }
}
