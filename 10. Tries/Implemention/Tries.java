public class Tries{
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
    static Node root = new Node(); // root empty
    
    public static void inserts(String word){
        // trevers on every letter of word
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';   // letter index
        
            if(root.element[idx] == null){
                // add new node here
                root.element[idx] = new Node();
            }
        
            if(i == word.length()-1){
                // mark last letter of word
                root.element[idx].eow = true;
            }
            // update root for next letter
            root = root.element[idx];
          }
    }
    
    public static void main (String[] args) {
        String[] words = {"the", "a", "there", "their", "any"};
        for(int i=0; i<words.length; i++){
            inserts(words[i]);
        }
    }
}