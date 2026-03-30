class Solution {
    int count = 0;
    int result = -1;

    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return result;
    }

    public boolean dfs(TreeNode node, int k) {
    if (node == null) return false;

    if (dfs(node.left, k)) return true;

    count++;
    if (count == k) {
        result = node.val;
        return true;
    }

    return dfs(node.right, k);
}

}