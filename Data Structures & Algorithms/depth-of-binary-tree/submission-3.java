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
    private static int max;
    
    public int maxDepth(TreeNode root) {
           max = 0;
           max(root , max+1);
           return max;
        
        
    }
    public void max(TreeNode root , int l){
        if (root == null){
            return;
        }
        max = Math.max(max , l);
        max(root.left , l+1);
        max(root.right , l+1);

    }
}
