class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        // Твои идеальные списки (они идут снизу-вверх: от узла до корня)
        ArrayList<TreeNode> listP = massRod(root, p);
        ArrayList<TreeNode> listQ = massRod(root, q);

        
        int i = listP.size() - 1;
        int j = listQ.size() - 1;

        TreeNode lca = null;

        
        while (i >= 0 && j >= 0 && listP.get(i).val == listQ.get(j).val) {
            lca = listP.get(i); 
            i--;
            j--;
        }

        return lca;
    }

    public ArrayList<TreeNode> massRod(TreeNode root, TreeNode x){
        if (root == null){
            return null;
        }

        if (root.val == x.val){
            return new ArrayList<TreeNode>(List.of(x));
        }
        ArrayList<TreeNode> m = massRod(root.right , x);
        ArrayList<TreeNode> m2 = massRod(root.left , x);

        if (m != null){
            m.add(root);
            return m;
        } else if (m2 != null){
            m2.add(root);
            return m2;
        }
        return null;
    }
}