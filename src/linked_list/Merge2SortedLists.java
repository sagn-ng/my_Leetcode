package linked_list;

public class Merge2SortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null) return list2;
        if (list2==null) return list1;
        if (list1.val<=list2.val){
            list1.next=mergeTwoLists(list1.next, list2);
            return list1;
        }
        else {
            list2.next=mergeTwoLists(list2.next, list1);
            return list2;
        }
    }
    public static void main(String[] args) {
        ListNode head1=new ListNode(1);
        ListNode second1=new ListNode(2);
        ListNode third1=new ListNode(4);
        head1.next=second1; second1.next=third1;

        ListNode head2=new ListNode(1);
        ListNode second2=new ListNode(3);
        ListNode third2=new ListNode(4);
        head2.next=second2; second2.next=third2;

        ListNode result=mergeTwoLists(head1, head2);
        while (result!=null){
            System.out.println(result.val+" ");
            result=result.next;
        }
    }
}