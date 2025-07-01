package Main;

public class PalindromeLinkedList {
    ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Find middle (slow will be at mid for odd, mid-end for even)
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // For odd length, skip the middle node
        if (fast != null) {
            slow = slow.next;
        }

        // Reverse second half
        ListNode secondHalf = reverse(slow);

        // Compare
        ListNode firstHalf = head;
        ListNode secondHalfCopy = secondHalf; // for restoring later if needed
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                // Restore and return
                reverse(secondHalfCopy);
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Restore the list (optional)
        reverse(secondHalfCopy);

        return true;
    }

}
