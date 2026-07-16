import java.util.*;
// Implications Of HashMap In Java

public class Hashmap{
    public static class HashMap<K,V>{     // Generics
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
        
        //Finding Array Index
        public int hashFunction(K key){
          int ai = key.hashCode();
          return Math.abs(ai) % N;
        }
        
        // Finding LinkedList index
        public int searchLL(K key, int ai){
            LinkedList<Node> ll = array[ai];
            
            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key.equals(key)){
                    return i; // li
                }
            }
            return -1;
        }
        
        // Rehashing - Double Size Array For more Data
        public void rehash(){
            LinkedList<Node> oldarray = array;
            LinkedList<Node>[] array = new LinkedList[N*2];    // New size
            // add LL on every ele of new array
            for(int i=0; i<N*2; i++){
                array[i] = new LinkedList<>();
            }
            
            // Tranfer Oldarray to new array
            for(int i=0; i<oldarray.length; i++){
                LinkedList<Node> list = oldarray[i];
                for(int j=0; j<list.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        
        // Add Pair In HashMap
        public void put(K key, V value){
          int ai = hashFunction(key);
          int li = searchLL(key, ai);
          
          if(li == -1){
            array[ai].add(new Node(key, value);// add neew node
            n++;
          }else{
            Node node = array[ai].get(li);
            node.value = value; // update exiting node value
          }
          double lemda = (double)n/N;
          if(lemda > 2.0){
            rehash();   //Need new Bigger HashMap
          }
        }
        
        // get key(position) of LL node
        public K getKey(K key){
            int ai = hashFunction(key);
            int li = searchLL(key, ai);
            
            if(li == -1){
                return null;    // key not exist
            }else{    // key exist
                Node node = array[ai].get(li);
                return node.key;
            }
        }
        
        // take Set of keys
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();    // new arrayList
            
            // treves on array
            for(int i=0; i<array.length; i++){
                // treves on LinkedList
                LinkedList<Node> ll = array[i];
                for(int j=0; j<ll.size(); j++){
                    // get node access for key's
                    Node node = ll.get(j);
                    keys.add(node.key);    // add keys in ArrayList
                }
            }
            return keys;
        }

      public V remove(K key){
            int ai = hashFunction(key);
            int li = searchLL(key, ai);
                if(li == -1){
                    return null;
                }else{
                    Node node = array[ai].remove(li);
                    n--;
                    return node.value;
                }
        }
      
      

    }
    public static void main(String[] args) {

    }
}