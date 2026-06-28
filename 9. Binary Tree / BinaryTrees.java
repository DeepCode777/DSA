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
        
        // Pre-Order
        public void preOrder(Node root){
            if(root == null){
                return ;
            }
            // Root - Left - Right
            System.out.print(root.data +", ");
            preOrder(root.left);
            preOrder(root.right);
        }
        
        //In-Order
        public void inOrder(Node root){
            if(root == null){
                return ;
            }
            // Left - Root - Right
            inOrder(root.left);
            System.out.print(root.data + ", ");
            inOrder(root.right);
        }
        
        //Post - Order
        public void postOrder(Node root){
            if(root == null){
                return ;
            }
            // Left - Right - Root
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + ", ");
        }
        
        // Level Order Travel
        public void levelOrder(Node root){
            if(root == null){
                return ;
            }
            // Use Queue For Repeating Level Add
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);     // Add Null For Next Level
            while(!q.isEmpty()){
                Node curr = q.remove();
                if(curr == null){
                    System.out.println();     // New Line
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);     // For new Lone
                        }
                    }else{
                        System.out.print(curr.data + ", ");
                        if(curr.left != null){
                            q.add(curr.left);
                        }
                        if(curr.right != null){
                            q.add(curr.right);
                        }
                   }
              }
        }
        
        // Count Of Nodes
        public static int countOfNodes(Node root){
            if(root == null){
                return 0;
            }
            int leftNodes = countOfNodes(root.left);
            int rightNodes = countOfNodes(root.right);
            // +1 is root node
            return leftNodes + rightNodes + 1;
        }
        
        // Sum Of Nodes
        public int sumOfNodes(Node root){
            if(root == null){
                return 0;
            }
            System.out.print(root.data + " + ");     // Every Node Data
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);
            
            return leftSum + rightSum + root.data;
        }
        
        // Hight of A Tree
        public int treeHight(Node root){
            if(root == null){
                return 0;
            }
            int leftHight = treeHight(root.left);
            int rightHight = treeHight(root.right);
            
            return Math.max(leftHight, rightHight) + 1;
        }
        
        // Diameter Of Tree Aproch 1 - 0(2*n)
        public int diameter(Node root){
            if(root == null){
                return 0;
            }
            int diam = treeHight(root.left) + treeHight(root.right) + 1;
            int leftDiam = diameter(root.left);
            int rightDiam = diameter(root.right);
            
            return Math.max(diam, Math.max(leftDiam, rightDiam));
        }
        
        // Diameter Of Tree Aproch 2 - 0(n)
        static class TreeInfo{
            int height;
            int diam;
            TreeInfo(int ht, int dm){     // 2 return typ
                this.height = ht;
                this.diam = dm;
            }
        }
        
        public TreeInfo diameter2(Node root){
            if(root == null){
                return new TreeInfo(0,0);
            }
            TreeInfo leftTi = diameter2(root.left);
            TreeInfo rightTi = diameter2(root.right);
            
            int myHight = Math.max(leftTi.height, rightTi.height) + 1;
            
            int diam = leftTi.height + rightTi.height + 1;
            int diamL = leftTi.diam;
            int diamR = rightTi.diam;
            
            int myDiam = Math.max(diam, Math.max(diamL, diamR));
            return new TreeInfo(myHight, myDiam);
        }
        
    }
    
    
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BT tree = new BT();
        
        System.out.print("Insert Order : ");
        Node root = tree.buildTree(nodes);
        
        System.out.println();
        System.out.println(root.data + " -> Root Node");
        
        tree.preOrder(root);
        System.out.println(" -> Pre - Order");
        
        tree.inOrder(root);
        System.out.println(" -> In - Order");
        
        tree.postOrder(root);
        System.out.println(" -> Post - Order");
        
        System.out.println("Level - Order");
        tree.levelOrder(root);
        
        int totle = tree.countOfNodes(root);
        System.out.println("Totle Number Of Nodes : " + totle);
        
        System.out.println("Totle Sum Of Nodes Data : " + tree.sumOfNodes(root));
        
        System.out.println("Totle Heigh Of Tree : " + tree.treeHight(root));
        
        System.out.println("Diameter Of Tree Aproch 1 : " + tree.diameter(root));
        
        System.out.println("Diameter Of Tree Aproch 2 : " + tree.diameter2(root).diam);     // .diam - obj to pass
    }
}