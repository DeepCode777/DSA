import java.util.*;

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
    
    // Search
    public static boolean search(Node root, int num){
        if(root == null){
            return false;
        }
        if(root.data == num){
            return true ;
        }         // root > num => exist in left subtree
        else if (root.data > num){
            return search(root.left, num);
        }else{
             // root < num => exist in right subtree 
            return search(root.right, num);
        }
    }
        
    public static Node delete(Node root, int val){
        // Search process
        if(root == null){
            return null;
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }
        else{     // root,data == vall
            // Leaf Node - Case : 1
            if(root.left == null && root.right == null){
                return null;
            }
            // Singel child of root node - Case : 2
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }
            // Case : 3 - two child of root node
            else{
                Node IS = inOrderSucessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            }
        }
        return root;
    }
        
    public static Node inOrderSucessor(Node root){
        // Root never null come in this function - already check
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    
    // Print In Range
    public static void printInRange(Node root, int x, int y){
        if(root == null){
            return ;
        }
        if(root.data >= x && root.data <= y){
            printInRange(root.left, x, y);
            System.out.print(root.data + ", ");
            printInRange(root.right, x, y);
        }
        else if(root.data > x){
            printInRange(root.left, x, y);
        }else{
            printInRange(root.right, x, y);
        }
    }
        
        // Print Paths
        public static void displayPath(ArrayList<Integer> path){
            for(int i=0; i<path.size(); i++){
                System.out.print(path.get(i) + ", ");
            }
            System.out.println();
        }
        
        // Root to Leaf Path
        public static void RootToPath(Node root, ArrayList<Integer> path){
            if(root == null){
                return ;
            }
            
            path.add(root.data);
            // Leaf node
            if(root.left == null && root.right == null){
                displayPath(path); 
            }else{
                // Non leaf nodes
                RootToPath(root.left, path);
                RootToPath(root.right, path);
            }
            path.remove(path.size()-1);     // backtrack
        }
    
    public static void main(String[] args){
        Node root = null;
        // Binary Search Yree Using Array
        int value[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        
        for(int i=0; i<value.length; i++){
            root = insert(root, value[i]);
        }
        
         inOrder(root);
        System.out.println();
        
        if(search(root, 6)){
            System.out.println("Found");
        }else{
            System.out.println("Not-Found");
        }

        root = delete(root, 5);
        inOrder(root);
        System.out.println();
        
        System.out.println("Print In Range Order");
        printInRange(root, 3, 11);
        System.out.println();
        
        System.out.println("Root To Leaf Path");
        RootToPath(root, new ArrayList<>());
    }
}