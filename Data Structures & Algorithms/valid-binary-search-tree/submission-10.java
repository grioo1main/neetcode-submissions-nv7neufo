/**
 * Definition for a binary tree root.
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
    public boolean isValidBST(TreeNode root) {
        return dfs(root , -1001 , 1001);
    }
    public boolean dfs(TreeNode root , int min , int max){
        if (root  == null) return true;
        return (root.val < max && root.val > min) && 
                dfs(root.left , min , root.val) &&
                dfs(root.right , root.val , max);

    }
}
