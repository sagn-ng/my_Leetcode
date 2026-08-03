package linked_list;
public class PalindrLinkedList {
    private ListNode reverse(ListNode head){
        if (head==null) return null;
        ListNode prev=null, curr=head;
        while (curr!=null){
            ListNode temp=new ListNode(curr.val, prev);
            prev=temp;
            curr=curr.next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head){
        if (head.next==null) return true;
        ListNode fast=head, slow=head;
        while (fast!=null && fast.next!=null){
            fast=(fast.next).next;
            slow=slow.next;
        } //find the "middle" element (slow)

        ListNode revRight=reverse(slow);
        slow=null; //done "flipping" the right half of the initial list
        
        while (head!=null && revRight!=null){
            if (head.val!=revRight.val) return false;
            head=head.next; revRight=revRight.next;
        }
        return true;
    }
}