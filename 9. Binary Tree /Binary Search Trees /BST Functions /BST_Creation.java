public class BST
{ 
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root ;
        }
        if(root.data > val){
            // Left Subtree - root left
            root.left = insert(root.left, val);
        }else{
             // right Subtree - root right
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inOrder(Node root){
        if(root == null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data + ", ");
        inOrder(root.right);
    }

    public static void main(String[] args){
        Node root = null;
        // Binary Search Yree Using Array
        int value[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        for(int i=0; i<value.length; i++){
            root = insert(root, value[i]);
        }

         inOrder(root);    // Fore Print BST (Sorted Order)
    }
}