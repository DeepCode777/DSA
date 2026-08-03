public class UniqeSubstring{
    static class Node{
        Node[] element;
        boolean eow;    // End of word

        public Node(){
            element = new Node[26]; // a - z
            for(int i=0; i<26; i++ ){ // element.length()
              element[i] = null;   // every new element node is null
            }
            eow = false;
        }
    }
    static Node root = new Node(); // root empty - Never change

    public static void main (String[] args) {
        String word = "apple";
    }
}