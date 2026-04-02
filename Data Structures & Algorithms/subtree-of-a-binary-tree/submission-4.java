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
    boolean flag;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        search(root , subRoot);
        return flag;

    }
    public boolean dfs(TreeNode p, TreeNode q) {
        if (p==null && q== null) return true;
        if (p==null || q== null) return false;
        return (p.val == q.val) && dfs(p.left , q.left) && dfs(p.right , q.right);
    }
    public void search(TreeNode p , TreeNode q){
        if (p == null || flag) return;
        if (p.val == q.val){
            flag = dfs(p , q);
        }
        search(p.left , q);
        search(p.right, q);
    }
}
