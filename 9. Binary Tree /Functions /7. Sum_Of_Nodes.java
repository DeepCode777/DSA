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