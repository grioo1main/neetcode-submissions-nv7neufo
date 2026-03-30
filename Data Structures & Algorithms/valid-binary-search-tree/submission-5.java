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
    
    public boolean isValidBST(TreeNode root) {
        

        return dfs(root.left , -1001 , root.val) && dfs(root.right , root.val , 1001);
        

    }public boolean dfs(TreeNode root, int min , int max) {
        boolean flag = false;
        if (root == null){
            return true;
        }
        if (root.val > min && root.val < max){
            flag = true;
        }
        return flag && dfs(root.left , min , root.val) && dfs(root.right , root.val , max);


    
    }
}
