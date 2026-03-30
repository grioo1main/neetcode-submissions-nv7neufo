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
    
    public int goodNodes(TreeNode node) {
        int record = node.val;    
        return dfs(node, record);
    }

    public int dfs(TreeNode node, int record){
        int temp =0;

        if (node == null){
            return 0;
        }
        if (node.val >= record){
            record = node.val;
            temp++;  
        }
        int left = dfs(node.left, record);
        int right = dfs(node.right, record);

        
        return left+right+temp;

    }



    
}
