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