package linked_list;
public class LkdListCycle {
    public static boolean hasCycle(ListNode head) {
        ListNode move1=head, move2=head;
        while (move2!=null && move2.next!=null){
            move2=(move2.next).next;
            move1=move1.next;
            if (move2==move1) return true;
        }
        return false;
    }
    /*
    This algorithm is like "The race of Tortoise and Hare" (floyd algorithm)
    - set "move1" and "move2" both point to the first element
    - we make the "distance" between "move1" and "move2" increase by one for each iteration of the loop
    - so there is a cycle in the linked list if and only if "move1" and "move2" meet (again) at somewhere
    (i.e they point to the same element)
    */
}
