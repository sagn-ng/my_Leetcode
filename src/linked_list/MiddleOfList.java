package linked_list;

public class MiddleOfList {
    public ListNode middleNode(ListNode head) {
        if (head.next==null) return head;
        ListNode fast=head, slow=head;
        while (fast!=null && fast.next!=null){
            fast=(fast.next).next;
            slow=slow.next;
        }
        return slow;
    }
}