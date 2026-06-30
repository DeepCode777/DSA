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