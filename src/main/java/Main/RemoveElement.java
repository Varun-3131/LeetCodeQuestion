package Main;

public class RemoveElement {
    class Solution {
        // Function to remove all occurrences of a specified value from an array
        public int removeElement(int[] nums, int val) {
            // Initialize two pointers, one at the beginning and one at the end of the array
            int k = 0;  // Pointer to track the length of the modified array
            int j = nums.length - 1;  // Pointer to the end of the original array

            // Iterate through the array elements
            for (int i = 0; i <= j; i++) {
                // If the current element is equal to the specified value
                if (nums[i] == val) {
                    // Replace the current element with the element at the end of the array
                    nums[i] = nums[j];
                    // Move the end pointer towards the beginning
                    j--;
                    // Decrement i to recheck the current position with the swapped element
                    i--;
                } else {
                    // If the current element is not equal to the specified value, increment the length pointer
                    k++;
                }
            }

            // Return the length of the modified array
            return k;
        }
    }
}
