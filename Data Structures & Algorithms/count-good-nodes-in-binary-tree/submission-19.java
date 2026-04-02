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
    int count = 1;
    public int goodNodes(TreeNode node) {
        dfs(node.left , node.val);
        dfs(node.right, node.val);
        return count;
    }
    public void dfs(TreeNode node , int x){
        if (node == null) return;
        if (node.val >= x){
            count++;
        }
        dfs(node.left , Math.max(x , node.val));
        dfs(node.right, Math.max(x , node.val));

    }
}
