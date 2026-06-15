public ListNode removeNthFromEnd(ListNode head, int n){
        if(head == nul || head.next == null){
            return null;
        }
        //Size
        int size = 0;
        ListNode tmp = head;
        
        while (tmp != null){
            tmp = tmp.next;
            size++;
        }
        
        // Remove Sizeth node from List i.e. head
        if(n == size){
            return head.next;
        }
        
        //Fond previous node
        int ptf = size - n // position to find
        ListNode prev = head; // previous node
        int cp = 1; // current position
        
        while (cp !=ptf){
            prev = prev.next;
            cp++;
        }
        
        prev.next = prev.next.next; // delete nth node
        return head;
    }