import java.util.ArrayList;

public class StackAL{
    // Implications Of Stack Using ArrayList
    static class Stack{
        ArrayList<Integer> list = new ArrayList<>();

        // Add Element In List
        public void push(int data){
            list.add(data);
        }
        
        public boolean isEmpty(){
            return list.size() == 0; // true
        }

        // Remove Elements from List
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.remove(list.size()-1);
            return top; 
        }

        // retriev the value of Top element
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
        
    } 
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}