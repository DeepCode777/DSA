    // Delete Node From BST
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

    // Find Inorder Successor
    public static Node inOrderSucessor(Node root){
        // null Root never come in this function - already check
        while(root.left != null){
            root = root.left;
        }
        return root;
    }