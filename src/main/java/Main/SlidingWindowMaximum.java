package Main;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];
        int idx = 0;

        // Process first window
        for (int i = 0; i < k; i++) {
            // Remove smaller elements from back
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }

        // First window ka maximum
        result[idx++] = nums[deque.peekFirst()];

        // Process remaining elements
        for (int i = k; i < nums.length; i++) {
            // Remove elements not part of current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }

            // Remove smaller elements from back
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.removeLast();
            }

            // Add current element
            deque.addLast(i);

            // Current window ka maximum
            result[idx++] = nums[deque.peekFirst()];
        }

        return result;
    }
}
