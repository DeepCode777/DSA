import java.util.*;

// Implementation Of HashMap In Java

public class Hashmap {

    public static class HashMaps<K, V> {     // Generics

        public class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;     // Nodes
        private int N;     // Array Elements
        private LinkedList<Node> array[];     // LinkedList type Array

        @SuppressWarnings("unchecked")
        public HashMaps(int size) {
            this.N = size;
            this.array = new LinkedList[size];

            // Empty LinkedList Node on every element of array
            for (int i = 0; i < size; i++) {
                this.array[i] = new LinkedList<>();
            }
        }

        // Methods

        // Finding Array Index
        public int hashFunction(K key) {
            int ai = key.hashCode();
            return Math.abs(ai) % N;
        }

        // Finding LinkedList Index
        public int searchLL(K key, int ai) {
            LinkedList<Node> ll = array[ai];

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i; // li
                }
            }
            return -1;
        }

        // Rehashing - Double Size Array for more Data
        @SuppressWarnings("unchecked")
        public void rehash() {
            LinkedList<Node> oldarray[] = array;

            array = new LinkedList[N * 2];
            N = N * 2;

            // Add LinkedList on every element of new array
            for (int i = 0; i < array.length; i++) {
                array[i] = new LinkedList<>();
            }

            // Transfer old array to new array
            for (int i = 0; i < oldarray.length; i++) {
                LinkedList<Node> list = oldarray[i];

                for (int j = 0; j < list.size(); j++) {
                    Node node = list.get(j);
                    put(node.key, node.value);
                }
            }
        }

        // Add Pair In HashMap
        public void put(K key, V value) {
            int ai = hashFunction(key);
            int li = searchLL(key, ai);

            if (li == -1) {
                array[ai].add(new Node(key, value)); // Add new node
                n++;
            } else {
                Node node = array[ai].get(li);
                node.value = value; // Update existing node value
            }

            double lemda = (double) n / N;

            if (lemda > 2.0) {
                rehash(); // Need new Bigger HashMap
            }
        }

        // Get value using key
        public K getKey(K key) {
            int ai = hashFunction(key);
            int li = searchLL(key, ai);

            if (li == -1) {
                return null; // Key not exist
            } else {
                Node node = array[ai].get(li);
                return node.key;
            }
        }

        // Take set of keys
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            // Traverse array
            for (int i = 0; i < array.length; i++) {

                // Traverse LinkedList
                LinkedList<Node> ll = array[i];

                for (int j = 0; j < ll.size(); j++) {

                    // Get node access for keys
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }

            return keys;
        }

        public V remove(K key) {
            int ai = hashFunction(key);
            int li = searchLL(key, ai);

            if (li == -1) {
                return null;
            } else {
                Node node = array[ai].remove(li);
                n--;
                return node.value;
            }
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public boolean containsKey(K key) {
            int ai = hashFunction(key);
            int li = searchLL(key, ai);

            if (li == -1) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static void main(String[] args) {

        HashMaps<String, Integer> map = new HashMaps<>(4);

        map.put("India", 190);
        map.put("China", 200);
        map.put("USA", 70);
        map.put("UK", 50);

        System.out.println(map.remove("China"));
    }
}