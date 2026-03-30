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
    public boolean isBalanced(TreeNode root) {
        /** Проверить для каждого узла сбадансирован ли он
        тоесть если дерево перегруженно вернуть false как узнать что оно перегруженно ?
        если слева 2+ элемента а справа 0 и наоборот справа 2+ слева 0, 
        можэет надо проверять каждый узел если один из детей налл
         проверяем сразу правый на 2 элемента но как это в цикл запихнуть что должно возвращатся
         тогда число слева и число справа узлов 
        **/ 
        return dfs(root) != -2;
    }

    private int dfs(TreeNode node){

        if (node == null){
            return 0;
        }
        int left = dfs(node.left);
        int right = dfs(node.right);
        if (left == -2 || right == -2){
            return -2;
        }

    if (Math.abs(left - right) >= 2){
        return -2;
    }

        return  Math.max(left, right)+1;
    }
}
