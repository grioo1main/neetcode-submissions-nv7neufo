class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }
    public int dfs(TreeNode root){
        if (root == null){
            return 0;
        }
        
        int leftVal = dfs(root.left);
        int left = Math.max(leftVal, 0);
        
        int rightVal = dfs(root.right);
        int right = Math.max(rightVal, 0);

        max = Math.max(max, (left + right + root.val));

        int result = Math.max(left, right) + root.val;
        
        return result;
    }
}