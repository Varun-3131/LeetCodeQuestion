package Main;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode s = head;
        ListNode f = head;

        while (f.next != null && f.next.next != null) {
            f = f.next.next;
            s = s.next;

            if (s== f) {
                return true;
            }
        }

        return false;
    }

}
