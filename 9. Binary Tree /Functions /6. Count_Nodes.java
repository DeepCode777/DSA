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