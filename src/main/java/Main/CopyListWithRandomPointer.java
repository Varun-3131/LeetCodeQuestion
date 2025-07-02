package Main;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        //Naya node banao
        Node curr = head;
        while (curr != null) {
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }

        //Copy Random Pointer

        curr = head;

        while (curr != null && curr.next != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        //Seperate new List

        curr = head;
        Node newHead = head.next;
        Node newCurr = newHead;

        while (curr != null) {
            curr.next = newCurr.next;
            curr = curr.next;
            if (curr != null) {
                newCurr.next = curr.next;
                newCurr = newCurr.next;
            }
        }

        return newHead;
    }
}
