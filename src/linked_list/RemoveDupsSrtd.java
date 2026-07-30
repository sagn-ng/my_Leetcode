package linked_list;
public class RemoveDupsSrtd {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null) return null;
        ListNode result=head;
        while (result!=null && result.next!=null){
            if (result.val == (result.next).val){
                result.next = (result.next).next;
            }
            else result=result.next;
        }
        return head;
    }
    /*
    - When we assign (Object type) A = B, we actually make the variable A point to the same
    object in memory as B. So the changes A make are also B's.
    - In the method above, every time we re-assign "result", or "result.next"
    (i.e elements in a list whose first element is pointed to by "head"), we actually make them
    point to new, or other objects in memory.
    - When "result" points to null, it means that we have made "head" point to the first element
    of a "new" list that satisfies the problem, so we must return "head".
    ------------
    We need to make a list for at least an example, which is quite long =)) so i won't code the "main"
    block this time =))
    */
}