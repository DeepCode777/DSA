import java.util.LinkedList;
import java.util.Collections;

public class CFLinkedList{
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        
        list.add(1);
        list.add(2);
        list.addFirst(0);
        System.out.println(list);

        list.addLast(5);
        System.out.println(list);
        
        list.removeLast();
        System.out.println(list);
        
        list.removeFirst();
        System.out.println(list);
        
        Collections.reverse(list);
        System.out.println(list);
    }
}