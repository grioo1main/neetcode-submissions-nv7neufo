class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        PriorityQueue<Integer> priority = new PriorityQueue<>(); 

        q.add(root);

        while (!q.isEmpty()){
            TreeNode node = q.poll();
            priority.add(node.val);

            if (node.left != null){
                q.add(node.left);
            }if (node.right != null){
                q.add(node.right);
            }
        }

        int result = 0;
        for (int i = 0; i < k; i++){
            result = priority.poll();
        }
        return result;
    }
}