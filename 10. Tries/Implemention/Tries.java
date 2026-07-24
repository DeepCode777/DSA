public class Tries{
    static class Node{
        Node[] element;
        boolean eow;
    
        public Node(){
            element = new Node[26]; // a - z
            for(int i=0; i<26; i++ ){ // element.length()
              element[i] = null;
            }
            eow = false;
        }
    }
    static Node root = new Node();
    
    
    
    public static void main (String[] args) {
        String[] words = {"the", "a", "there", "their", "any"};
        
    }
}