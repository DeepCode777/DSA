public class StartWith{
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


    public static void inserts(String word){
        Node curr = root;

        // trevers on every letter of word
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';   // letter index

            if(curr.element[idx] == null){
                // add new node here
                curr.element[idx] = new Node();
            }

            if(i == word.length()-1){
                // mark last letter of word
                curr.element[idx].eow = true;
            }
            // update curr for next letter
            curr = curr.element[idx];
          }
    }

    public static boolean startWith(String prefix){
        Node curr = root;
        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            
            if(curr.element[idx] == null){
                return false ;    // character not exist
            }
            curr = curr.element[idx];
        }
        return true ;
    }

    public static void main (String[] args) {
        String[] words = {"the", "a", "there", "their", "any", "i", "like", "sam", "samsung"};

        String key = "the";
        String key2 = "im" ;

        for(int i=0; i<words.length; i++){
            inserts(words[i]);
        }

        System.out.println(startWith(key));    // true 
        System.out.println(startWith(key2));    // false
    }
}