class Solution {
    int count = 0;
    int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return result;
    }

    private int dfs(TreeNode node, int k) {
        if (node == null) return 0;

        
        int left = dfs(node.left, k);
        if (left == -1){
            return -1;
        }

        
        count++;
        if (count == k) {
            result = node.val;
            return -1; 
        }
        
        int right = dfs(node.right, k);
        if (right == -1){
            return -1;
        }
        return 0;
        
    }

}