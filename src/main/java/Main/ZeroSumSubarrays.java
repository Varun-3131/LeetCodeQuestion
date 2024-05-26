package Main;

public class ZeroSumSubarrays {
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n)
    {
        HashMap<Integer, Integer> sumFreqMap = new HashMap<>();

        int count = 0;
        int sum = 0;


        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];


            if (sum == 0)
                count++;


            if (sumFreqMap.containsKey(sum))
                count += sumFreqMap.get(sum);

            sumFreqMap.put(sum, sumFreqMap.getOrDefault(sum, 0) + 1);
        }

        return count;

    }
}
