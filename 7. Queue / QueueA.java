public class QueueA{
    // Implemention Of Queue DS Using Array
    static class Queue{
        int arr[];
        int size;
        int rear;
        
        Queue(int size){
            this.size = size;
            arr = new int[size];
            rear = -1;
        }
        
        public boolean isEmpty(){
            return rear == -1;
        }
        
        public boolean isFull(){
            return rear == size-1;
        }
        
        public void add(int val){
            if(isFull()){
                System.out.println("OverFlow,");
                return ;
            }
            arr[++rear] = val;
        }
        
        public int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue,");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        
        public int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }
    
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        
        System.out.println(q.remove()); // 1
        System.out.println(q.peek()); // 2
        
        
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.print(q.peek()+ ", "); // 2,3,4,5
            q.remove();
        }
    }
}