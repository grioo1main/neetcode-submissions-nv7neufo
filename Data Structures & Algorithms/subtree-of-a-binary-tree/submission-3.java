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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        boolean result = false;


if (root == null && subRoot == null) return true;
    // Если один из них null — не равны
    if (root == null || subRoot == null) return false; 
    
    Queue<TreeNode> q1 = new ArrayDeque<>();
    q1.add(root);



    while (!q1.isEmpty()){
        TreeNode node = q1.poll();

        if (node.val == subRoot.val){
            result = areEqual(node , subRoot);
        }
        if (result){
            return true;
        }
        if (node.left != null){
        q1.add(node.left);
        }
        if (node.right != null){
        q1.add(node.right);
        }

        }
        return false;
    }
    


public boolean areEqual(TreeNode p, TreeNode q) {
    // Если оба узла null — они равны
    if (p == null && q == null) return true;
    // Если один из них null — не равны
    if (p == null || q == null) return false;
    // Сравниваем значение и рекурсивно поддеревья
    return p.val == q.val 
        && areEqual(p.left, q.left) 
        && areEqual(p.right, q.right);
}   
}


 

