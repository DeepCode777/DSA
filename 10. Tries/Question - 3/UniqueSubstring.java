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

    // Count Number Of Nodes
    public  static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int cout = 0;
        for(int i=0; i<26; i++){
            if(root.element[i] != null){
                cout += countNode(root.element[i]);
            }
        }
        return cout+1;
    }

    public static void main (String[] args) {
        String word = "apple";
        for(int i=0; i<word.length(); i++){
            String postfix = word.substring(i);
            inserts(postfix);
        }
        System.out.println("Uniqe Sub Strings in word are : " +countNode(root));
    }
}