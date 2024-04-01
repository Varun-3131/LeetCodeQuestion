package Main;

public class IntersectionOfTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ArrayList<ListNode> array1 = new ArrayList<>();
        ArrayList<ListNode> array2 = new ArrayList<>();
        while (headA != null) {
            array1.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            array2.add(headB);
            headB = headB.next;
        }
        for (int i = 0; i < Math.min(array1.size(), array2.size()); i++) {
            if (array1.size() > array2.size()) {
                if (array1.contains(array2.get(i))) {
                    return array2.get(i);
                }
            } else {
                if (array2.contains(array1.get(i))) {
                    return array1.get(i);
                }
            }
        }
        return null;
    }
}
