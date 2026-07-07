import java.util.*;
// Implications Of HashMap In Java

public class Hashmap{
    public class HashMap<K,V>{     // Generics
        public class Node{
            K key;
            V value;
            
            public Node(K key, V value){
                this.key = key;
                this.value = value;
                
            }
        }
        private int n;     // Nodes
        private int N;     // Array Elements
        private LinkedList<Node> array[];     // LL typs of Array
        
        public HashMap(int size){
            this.N = size;
            this.array = new LinkedList[size]; 
            
            // Empty LL Node On Every Elementss of array
            for(int i=0; i<size; i++){
                this.array[i] = new LinkedList<>();     // HashMap - st
            }
        }
        
        // Methods
        
    }
    public static void main(String[] args) {
        
    }
}