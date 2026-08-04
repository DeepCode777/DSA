public class LongestWord
{
    static class  Node{
        Node[] element;
        boolean eow;
        
        public Node(){
            element = new Node[26];
            for(int i=0; i<26; i++){
                element[i] = null;
            }
            eow = false;
        }
    } 
    
    static Node root = new Node();
    
    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            
            if(curr.element[idx] == null){
                curr.element[idx] =  new Node();
            }
            curr = curr.element[idx];
        }
        curr.eow = true;
    }
    
    // Final string (ans)
    public static String str = "";
    
    // Finding Longest Wor With UniqvSubstring
    public static void longestWord(Node root, StringBuilder tmp){
        if(root == null){
            return ;
        }
        // trevers on every element of every node
        for(int i=0; i<26; i++){
            // noth need true
            if(root.element[i] != null && root.element[i].eow == true){
                // add note into SB
                tmp.append((char) (i+'a'));
                if(tmp.length() > str.length()){    // SB > String
                    str = tmp.toString();    // String become SB
                }
                // recurtion call for next node
                longestWord(root.element[i], tmp);
                // backtrac for other same level node
                tmp.deleteCharAt(tmp.length()-1);
            }
        }
    }
    
    public static void main(String[] args) {
        String[] words = {"a", "ap", "app", "appl", "apple", "banana", "apply"};
        for(int i=0; i<words.length; i++){
                insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(str);
    }
}