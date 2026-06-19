public class CQueueA
{
    // Circuler Queue Implemention Using Array
    static class Queue{
        int arr[];
        int size;
        int front = -1;
        int rear = -1;
        
        Queue(int size){
            this.size = size;
            arr = new int[size];
        }
        
        public boolean isEmpty(){
            return rear == -1 && front == -1;  //true
        }
        
        public boolean isFull(){
            return (rear+1) % size == front; // true
        }
        
        //Enqueue
        public void add(int val){
            if(isFull()){
                System.out.println("Over-Flow");
                return ;
            }
            
            // Add if its 1st Element
            if(front == -1){
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = val;
        }
        
        //Dequeue
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue Is Empty");
                return -1;
            }
            int res = arr[front];
            if(front == rear){
                front = rear = -1;
            }else{
                front = (front+1) % size;
            }
            return res;
        }
        
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue Is Empty");
                return -1;
            }
            return arr[front];
        }
        
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove()+ " -> Removed");    //1
        q.add(6);
        System.out.println(q.remove()+ "-> Removed");    //2
        q.add(7);
        
        while(!q.isEmpty()){
            System.out.print(q.peek()+ ", ");    //3.4.5.6.7
            q.remove();
        }
        // array Like [6, 7, 3, 4, 5] ;
        // front = 3
        // rear = 7
    }
}