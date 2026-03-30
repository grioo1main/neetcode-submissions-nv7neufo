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
    // Если оба узла null — они равны
    if (p == null && q == null) return true;
    // Если один из них null — не равны
    if (p == null || q == null) return false;
    // Сравниваем значение и рекурсивно поддеревья
    return p.val == q.val 
        && isSameTree(p.left, q.left) 
        && isSameTree(p.right, q.right);
}

}
