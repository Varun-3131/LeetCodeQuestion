package Main;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        return rotateRightUsingCloseRing(head, k);
    }

    private ListNode rotateRightUsingCloseRing(ListNode head, int k) {

        if (head == null) {
            return head;
        }
        int numberOfNodes = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            numberOfNodes++;
        }
        k = k % numberOfNodes;
        tail.next = head;

        for (int i = 0; i < numberOfNodes - k; i++) {
            tail = tail.next;
            head = head.next;
        }
        tail.next = null;

        return head;
    }

    private ListNode rotateRightUsingReverse(ListNode head, int k) {
        int numberOfNodes = countNodes(head);

        if (numberOfNodes == 0) {
            return head;
        }
        ListNode reversedHead = reverse(head);
        ListNode reversedTail = head;

        k = k % numberOfNodes;

        while (k > 0) {
            ListNode toBeRotatedNode = reversedHead;
            reversedHead = reversedHead.next;
            toBeRotatedNode.next = null;

            reversedTail.next = toBeRotatedNode;
            reversedTail = toBeRotatedNode;

            k--;
        }
        return reverse(reversedHead);
    }

    private ListNode reverse(ListNode node) {
        ListNode nodeNext = null;
        ListNode prev = null;

        while (node != null) {
            nodeNext = node.next;
            node.next = prev;
            prev = node;
            node = nodeNext;
        }
        return prev;
    }

    private int countNodes(ListNode head) {

        if (head == null) {
            return 0;
        }
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
