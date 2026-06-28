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