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