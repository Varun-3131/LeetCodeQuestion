package Main;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ll= new ArrayList<>();
        sub(nums,ll,new ArrayList<>(),0);
        return ll;
    }
    public static void sub(int[] nums,List<List<Integer>> ll,List<Integer> result,int idx){
        ll.add(new ArrayList<>(result));
        for(int i=idx;i<nums.length;i++){
            result.add(nums[i]);
            sub(nums,ll,result,i+1);
            result.remove(result.size()-1);
        }

    }
}
