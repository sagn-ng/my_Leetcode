from binary_tree.ListNode import ListNode

def swapPairs(head: ListNode | None) -> ListNode | None:
    if (head==None): return None

    if (head.next==None): return head

    res=head.next

    tail=swapPairs(res.next)
    head.next=tail
    res.next=head

    return res