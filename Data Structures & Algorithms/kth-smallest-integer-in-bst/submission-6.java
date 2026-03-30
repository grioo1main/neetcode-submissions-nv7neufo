class Solution {
    int count = 0;
    int result = -1;

    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return result;
    }

    private void dfs(TreeNode node, int k) {
         if (result != -1) return;
        if (node == null) return;

        dfs(node.left, k);
        
        count++;
        if (count == k) {
            result = node.val;
            count++;
            return; 
        }
        dfs(node.right, k);
    }

}