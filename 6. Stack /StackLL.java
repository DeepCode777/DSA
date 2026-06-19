import java.util.LinkedList;

public class StackLL{
    // Implications Of Stack Using Linked List (Single)
    private static class Node{
        int data;
        Node next;
        
        Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    
    static class Stack{
        public Node head = null;
        
        public void push(int val){
            Node newNode = new Node(val);
            
            if(head == null){  // empty - extra
                head = newNode;
                return ;
            }
            
            newNode.next = head;
            head = newNode ;
        }
        
        public boolean isEmpty(){
            return head == null;  // true
        }
        
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            
            Node top = head;
            head = head.next;
            return top.data;
        }
        
        public int peek(){
            if(isEmpty()){
                return -1 ;
            }
            
            Node top = head;
            return top.data;
        }
    }
    
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        while(!stack.isEmpty()){
            System.out.print(stack.peek()+ "-> ");
            stack.pop();
        }
        System.out.println("null");
    }
}