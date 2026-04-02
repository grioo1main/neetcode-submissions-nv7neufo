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
    int count = 0;
    int max;
    int result;
    public int kthSmallest(TreeNode root, int k) {
        max = k;
        dfs(root);
        return result;
    }
    public boolean dfs(TreeNode node){
        if (node == null) return true;
        boolean left = dfs(node.left);
        if (!left) return false;
        
        count++;
        if (count == max){
            result = node.val;
            return false;
        }
        return dfs(node.right);

    }
}
