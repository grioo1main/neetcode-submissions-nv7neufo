class Solution {
    int max = 0;
    List<Integer> list = new ArrayList<>();
    
    public List<Integer> rightSideView(TreeNode root) {
        r(root, 0);
        return list;
    }

    public void r(TreeNode node, int x) {
        if (node == null) return;
        
        x++;

        if (x > max) {
            list.add(node.val);
            max = x;
        }
        
        r(node.right, x);
        r(node.left, x);
    }
}