package Main;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l = findLength(head);
        int i = 0, traverseTill = l - n - 1;
        if (traverseTill == -1) return head.next;
        ListNode curr = head;
        while (i < traverseTill) {
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
        return head;
    }

    public int findLength(ListNode head) {
        int count = 0;
        if (head == null) return count;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }
}
