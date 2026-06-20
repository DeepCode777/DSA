import java.util.*;

public class QueueCF
{
    // Implementing Queue Using Java Collections Framwork
    // Queue Is Interface
    // Two Implements Classese Of Queue : 
    //     1. Linked Lust
    //     2. ArrayDeque
    
    public static void main(String[] args) {
    
        // Queue Using Linked List
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        
        System.out.println("Queue Using Linked List ");
        while(!q.isEmpty()){
            System.out.print(q.peek()+ "-> ");
            q.remove();
        }
        System.out.println("null ");
    
        // Queue using Array (Double Ended)
        Queue<Integer> r = new ArrayDeque<>();
        r.add(1);
        r.add(2);
        r.add(3);
        r.add(4);
        
        System.out.println("Queue Using Double Ended Array");
        while(!r.isEmpty()){
            System.out.print(r.peek()+ ", ");
            r.remove();
        }
    }
}