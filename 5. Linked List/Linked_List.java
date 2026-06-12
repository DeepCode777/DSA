public class Linked_List{
    Node head;
    private int size;
    LL(){
        size = 0;
    }
    
    public class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    
    //Add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    //Add to Last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return ;
        }
        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    
    //Print List
    public void printList(){
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data +", ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    
    //Remov First
    public void removeFirst(){
        if(head == null){
            System.out.println("List Is Empty, No data to Delete.");
            return ;
        }
        head = this.head.next;
        size--;
    }
    
    //Remov Last Node
    public void removeLast(){
        if(head == null){
            System.out.println("List Is Empty, No Data To Delet.");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        
        while(lastNode.next != null){
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }
    
    //Get List Size
    public int getSize(){
        return size;
    }
    
    public void addInMiddle(int idx, String data){
        if(idx > size || idx < 0){
            System.out.println("Invalid Index.");
            return ;
        }
        
        size++;
        Node newNode = new Node(data);
        if(head == null || idx == 0){
            newNode.next = head;
            head = newNode;
            return ;
        }
        Node currNode = head;
        for(int i=1; i<size; i++){
            if(i == idx){
                Node nextNode = currNode.next;
                currNode.next = newNode ;
                newNode.next = nextNode;
                break ; 
            }
            currNode = currNode.next;
        }
    }
    
    //Revers LinkedList
    public void reversList(){
        if(head == null || head.next == null){
            return ;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    
    public static void main(String[] args) {
        LL list = new LL();
        
        list.addLast("a");
        list.addLast("list");
        list.printList();
        
        list.addFirst("This");
        list.printList();
        
        list.addInMiddle(1, "is");
        list.printList();
        
        list.reversList();
        list.printList();
        
        System.out.println(list.getSize());
        
        list.removeFirst();
        list.printList();
        
        list.removeLast();
        list.printList();
        
    }
}