package Main;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        //sort on basis of first index of all arrays
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        //New List created to store the result...
        List<int[]> result=new ArrayList<>();
        int[] newInterval=intervals[0];
        //Add the first intervals...
        result.add(newInterval);

        for(int[] interval:intervals){
            //2<3
            if(interval[0]<=newInterval[1]){
                newInterval[1]=Math.max(newInterval[1],interval[1]);
            }
            else{
                newInterval=interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);

    }
}
