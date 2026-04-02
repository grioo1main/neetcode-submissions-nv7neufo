/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int max = 0;
    public int maxDepth(TreeNode root) {
        dfs ( root , 0);
        return max;
    }

    public void dfs(TreeNode root, int g){
        if (root == null) return;
        int temp = ++g;
        max = Math.max(max , temp);
        dfs(root.left , temp);
        dfs(root.right , temp);

    }
}
