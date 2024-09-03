package Main;

public class DegreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        int degree = 0;
        int[] totalNumber = new int[50000];
        int[] firstIndex = new int[50000];
        int shortestLength = Integer.MAX_VALUE;

        for(int i=0; i<firstIndex.length; i++){
            firstIndex[i] = -1;
        }

        for(int index = 0; index < nums.length; index++){
            int num = nums[index];
            totalNumber[num]++;
            if(firstIndex[num] == -1) firstIndex[num] = index;
            int length = index - firstIndex[num] + 1;
            if(degree < totalNumber[num]){
                degree = totalNumber[num];
                shortestLength = length;
            }else if(totalNumber[num] == degree && shortestLength > length){
                shortestLength = length;
            }

        }

        return shortestLength;
    }
}
