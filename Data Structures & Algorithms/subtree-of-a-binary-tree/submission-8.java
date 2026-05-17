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
    boolean flag = false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (flag) {
            return flag;
        }
        if (root == null){
            return false;
        }
        if (root.val == subRoot.val){
            flag = dfs(root , subRoot);
        }
        
        isSubtree(root.left , subRoot);
        isSubtree(root.right , subRoot);
        if (flag) {
            return flag;
        }
        return false;

    }
    public boolean dfs(TreeNode p, TreeNode q) {
        boolean flag = false;
        if (p == null && q == null){
            return true;
        }
        if (p == null || q == null){
            return false;
        }
        return dfs(p.left , q.left) && dfs(q.right , p.right) &&
        p.val == q.val;
        
    }
}
