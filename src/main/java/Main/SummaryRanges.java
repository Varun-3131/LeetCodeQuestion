package Main;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        if (nums.length == 0) {
            return list;
        }
        int i = nums[0];

        for( int j=1; j<nums.length; j++) {
            if (nums[j-1]+1!=nums[j])  {
                if (i== nums[j-1]) {
                    list.add(Integer.toString(i));
                }
                else{
                    list.add(i+"->"+nums[j-1]);
                }
                i=nums[j];
            }
        }
        if (i!= nums[nums.length-1]) {
            list.add(i+"->"+nums[nums.length-1]);
        }
        else {
            list.add(Integer.toString(i));
        }
        return list;

    }
}
