package Main;

public class NextGreaterElement_1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> m = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        int n = nums2.length;

        for (int i = n - 1; i >= 0; i--) {
            // Pop all smaller elements
            while (!s.isEmpty() && s.peek() <= nums2[i]) {
                s.pop();
            }
            // Set -1 if stack empty
            if (s.isEmpty()) {
                m.put(nums2[i], -1);
            } else {
                m.put(nums2[i], s.peek());
            }
            s.push(nums2[i]);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = m.get(nums1[i]);
        }

        return ans;
    }
}
