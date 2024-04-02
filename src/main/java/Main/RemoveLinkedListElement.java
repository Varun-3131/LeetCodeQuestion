package Main;

public class RemoveLinkedListElement {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0) , current = temp;
        temp.next = head;
        while(current.next != null ){
            if(current.next.val == val) current.next = current.next.next;
            else current = current.next;
        }
        return temp.next;
    }
}
