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
    int max = 0;
    List<Integer>  result = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return result;
    }
    public void dfs(TreeNode node , int x){
        int temp = ++x;
        if (node == null) return;
        if (temp>max){
            result.add(node.val);
            max = temp;
        }
        dfs(node.right, temp);
        dfs(node.left , temp);
    }
}
