package Main;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;


        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        tail.next = head;

        k = k % len;
        int stepsToNewTail = len - k;

        ListNode newTail = tail;
        for (int i = 0; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;


        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        tail.next = head;

        k = k % len;
        int stepsToNewTail = len - k;

        ListNode newTail = tail;
        for (int i = 0; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
