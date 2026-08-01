public class WordsBreak{
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

    public static boolean search(String word){
        Node curr = root;

        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a' ;     // index letter

            // letter (node) note exist
            if(curr.element[idx] == null){
                return false ;
            }

            // last letter but not EOF
            if(i == word.length()-1 && curr.element[idx].eow == false){
                return false ;
            }
            // update curr for next element
            curr = curr.element[idx]; 
        }
        return true ;        // everything Okey
    }
    
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=1; i<=key.length(); i++){
            String first = key.substring(0,i);
            String second = key.substring(i);
            
            if(search(first) && wordBreak(second)){
                return true;
            }
        }
        return false;
    }

    public static void main (String[] args) {
        String[] words = {"the", "a", "there", "their", "any", "i", "like", "sam", "samsung"};
        String key = "theathere";
        String key2 = "ilikeanysem" ;
        
        for(int i=0; i<words.length; i++){
            inserts(words[i]);
        }
        
        System.out.println(wordBreak(key));
        System.out.println(wordBreak(key2));
    }
}