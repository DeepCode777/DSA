// Collection Framework Library (Linked List)

import java.util.LinkedList;
import java.util.Collections;

public class CFLinkedList{
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        
        // add  front of LL
        list.add(1);
        list.add(2);
        list.addFirst(0);
        System.out.println(list);

        // Add at last In LL
        list.addLast(5);
        System.out.println(list);

        // remove from Link list 
        list.removeLast();
        System.out.println(list);

        // remove from first
        list.removeFirst();
        System.out.println(list);

        // revers
        Collections.reverse(list);
        System.out.println(list);
    }
}