package Main;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        int res=0;
        HashMap<Integer, Integer>Hmap=new HashMap<>();
        for(int num:nums)
        {
            Hmap.put(num, Hmap.getOrDefault(num, 0)+1);
        }
        for(int key:Hmap.keySet())
        {
            if(Hmap.containsKey(key+1))
            {
                res=Math.max(res, Hmap.get(key)+Hmap.get(key+1));
            }
        }
        return res;
    }
}
