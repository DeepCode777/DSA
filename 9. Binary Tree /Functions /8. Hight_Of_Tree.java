        // Hight of A Tree
        public int treeHight(Node root){
            if(root == null){
                return 0;
            }
            int leftHight = treeHight(root.left);
            int rightHight = treeHight(root.right);

            return Math.max(leftHight, rightHight) + 1;
        }