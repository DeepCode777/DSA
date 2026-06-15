public ListNode getMiddle(ListNode head){

    ListNode fast = head;
    ListNode slow = head;

    while(fast.next != null && fast.next.next != null){
        fast = fast.next.next;
        slow = slow.next;
    }

    return slow;
}