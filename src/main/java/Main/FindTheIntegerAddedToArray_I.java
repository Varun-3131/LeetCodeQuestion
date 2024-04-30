package Main;

public class FindTheIntegerAddedToArray_I {
    public int addedInteger(int[] nums1, int[] nums2) {
        int s1 = 0, sum2 = 0;
        for (int num : nums1) {
            s1 += num;
        }
        for (int num : nums2) {
            sum2 += num;
        }
        return (sum2 - s1) / nums1.length;
    }
}
