package linked_list;
public class RevLList {
    public static ListNode reverseList(ListNode head){
        if (head==null || head.next==null) return head;
        ListNode prev=new ListNode(head.val);
        ListNode u=null;
        head=head.next;
        while (head!=null) {
            u=new ListNode(head.val, prev);
            prev=u;
            head=head.next;
        }
        return u;
    }
    /*the list can also be reversed recursively:
    public static ListNode reverseList(ListNode head){
        if (head==null || head.next==null) return head;
        ListNode newHead=reverseList(head.next);
        head.next=null;
        ListNode result=newHead;
        while (newHead.next!=null) newHead=newHead.next;
        newHead.next=head;
        return result;
    }
    */
}
