package Main;

public class FindIndicesWithIndexAndValueDifference_I {
    public int[] findIndices(int[] arr, int idxDiff, int diff) {
        int num = arr.length;

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                if(Math.abs(i-j)>=idxDiff && Math.abs(arr[i]-arr[j])>=diff) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
