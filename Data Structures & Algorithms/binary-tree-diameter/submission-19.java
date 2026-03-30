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
    int maxD = 0;
    public int diameterOfBinaryTree(TreeNode root) {

        // bfs спустится найдя самый нижний этаж и вычесть 1

        

        if (root == null){
            return 0;
        }
        dfs(root);
        return maxD;

        
    }

    public int dfs(TreeNode node){
        if (node == null){
            return 0;
        }

        int left = dfs(node.left);
        int right = dfs(node.right);
        int sum = left+right;

        maxD = Math.max(sum , maxD);
        
        return Math.max(left, right)+1;
    }
}
