package Main;

public class FlattenAMultiLevelDoublyLinkedList {
    public Node flatten(Node head) {
        if(head==null) return head;

        Node curr=head;
        while(curr!=null){
            if(curr.child!=null){
                //flatten child nodes
                Node next=curr.next;
                curr.next=flatten(curr.child);
                curr.next.prev=curr;
                curr.child=null;
                //find tail
                while(curr.next!=null){
                    curr=curr.next;
                }

                //Attach the tail
                if(next!=null){
                    curr.next=next;
                    next.prev=curr;
                }

            }
            curr=curr.next;
        }
        return head;
    }
}
