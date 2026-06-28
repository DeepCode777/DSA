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