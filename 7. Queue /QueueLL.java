public class QueueLL
{
    // Implementation of Queue Using Linked List
    static class Node{
        int data;
        Node next;
        Node(int val){
            this.data = val;
            next = null;
        }
    }
    
    static class Queue{
        Node head = null;
        Node tail = null;
        
        public boolean isEmpty(){
            return head == null && tail == null;    // true
        }
        
        // Enqueue
        public void add(int val){
            Node newNode = new Node(val);
            if(isEmpty()){
                tail = head = newNode;
            }else{
                tail.next = newNode;
                tail = newNode ;
            }
        }
        
        // Dequeue
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue Is Empty, ");
                return -1;
            }
            int front = head.data;
            // Single Node
            if(head == tail){
                tail = null;
            }
            head = head.next;
            return front;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue Is Empty");
                return -1;
            }
            return head.data;
        }
    }
    
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()){
            System.out.print(q.peek()+ "-> ");
            q.remove();
        }
    }
}