public class DoublyLL
{
    Node head;
    Node tail;
    private int size;
    
    DoublyLL(){
        size = 0;
    }
    public class Node{
        int data;
        Node next;
        Node prev;
        
        Node(int val){
            this.data = val;
            this.next = null;
            this.prev = null;
            size++;
        }
    }
    
    public void add(int val){
        // Add Node On Head

        Node newNode = new Node(val);
        if(head == null){
            head = tail = newNode;
            return ;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode ;
    }
    
    public void display(){
        if(head == null){
            System.out.println("List Is Empty.");
            return ;
        }
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.data + ", ");
            tmp = tmp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        
        list.add(4);
        list.add(2);
        list.add(1);
        
        list.display();
        System.out.println(list.size);
    }
}