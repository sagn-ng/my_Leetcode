package linked_list;
public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head==null) return null;
        ListNode newHead=null;
        ListNode tail=null;
        boolean flag=false;
        while (head!=null){
            if (head.val!=val){
                if (!flag){
                    flag=true;
                    newHead=head; //to find the new "head" of the resulted linked list
                    tail=head;
                }
                else{
                    tail.next=head;
                    tail=head;
                }
            }
            head=head.next;
        }
        if (tail!=null){
            tail.next=null;
        } /*to make sure that all consecutive "val"s at the last get removed and
        to deal with the case all elements are deleted*/
        return newHead;
    }
}
