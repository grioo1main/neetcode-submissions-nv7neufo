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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean flag = false;
        if (p == null && q == null){
            return true;
        }
        if (p == null || q == null){
            return false;
        }
        return isSameTree(p.left , q.left) && isSameTree(q.right , p.right) &&
        p.val == q.val;
        
    }
}
