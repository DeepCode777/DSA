public ListNode getMiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow ;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public boolean isPalindrom(ListNode head){
        if(head == null || head.next == null){
            return true;
        }
        ListNode fHE = getMiddle(head); // First Half End
        ListNode sHS =  reverse(fHE.next); // Second Half Start
        ListNode fHS = head; // First Half Start
        
        while(sHS != null){
            if(sHS.val != fHS.val){
                return false;
            }
            sHS = sHS.next;
            fHS = fHS.next;
        }
        return true;
    }