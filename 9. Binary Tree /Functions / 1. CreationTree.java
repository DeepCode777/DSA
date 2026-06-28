import java.util.*;

public class BinaryTrees{
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    static class BT{
    
        // Craetion Of Tree Given Array
        static int idx = -1;
        
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            
            Node newNode = new Node(nodes[idx]);
            
            System.out.print(newNode.data + ", ");     // Data of every new node
            // Insert
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    
    
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BT tree = new BT();
        
        System.out.print("Insert Order : ");
        Node root = tree.buildTree(nodes);
    }
}