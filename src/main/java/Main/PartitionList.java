package Main;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode head1 = new ListNode();
        ListNode head2 = new ListNode();

        ListNode tail1 = head1, tail2 = head2, curr = head;

        while (curr != null) {
            if (curr.val < x) {
                tail1.next = curr;
                tail1 = tail1.next;
            } else {
                tail2.next = curr;
                tail2 = tail2.next;
            }
            curr = curr.next;
        }
        tail1.next = head2.next;
        tail2.next = null;
        return head1.next;
    }
}
