import java.util.HashSet;
import java.util.Iterator;

public class Hashset
{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        // Add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        
        // Getting size
        System.out.println("Size Of Set is : " + set.size());
        
        // search
        if(set.contains(1)){
            System.out.println("Present");
        }
        if(set.contains(6)){
            System.out.println("Absent");
        }
        
        // Delete Element
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Absent");
        }
        
        // Print All Element
        System.out.println(set);
        
        set.add(0);
        
        // Iterator - Because HashSet Dosen't have Iterator
        Iterator it = set.iterator();

        // Print one by one
        while(it.hasNext()){
            System.out.println(it.next() + ", ");
        }
        
        //  Is Empty
        if(!set.isEmpty()){ 
            System.out.println("HashSet is not empty");
        }
        
        set.remove(2);
        set.remove(3);
        set.remove(4);
        set.remove(0);
        
        if(set.isEmpty()){ //true
            System.out.println("HashSet is empty");
        }else{
            System.out.println("Set is not empty");
        }
    }
}