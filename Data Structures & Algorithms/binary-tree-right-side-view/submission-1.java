class Solution {
    int max = 0;
    List<Integer> list = new ArrayList<>();
    
    public List<Integer> rightSideView(TreeNode root) {
        r(root, 0);
        return list;
    }

    public void r(TreeNode node, int x) {
        if (node == null){
            return;
        }
        System.out.println("node=" + node.val + " x=" + x + " max=" + max);
        
        x++;
        System.out.println("x now=" + x);

        if (node != null) {
            System.out.println("go right to=" + node.val);
            if (x > max) {
                System.out.println("add to list=" + node.val);
                list.add(node.val);
                max = x;
                System.out.println("list now=" + list);
            } else {
                System.out.println("skip add");
            }
            r(node.right, x);
        }
        
        if (node.left != null) {
            System.out.println("go left to=" + node.left.val);
            if (x > max) {
                System.out.println("add to list=" + node.val);
                list.add(node.val);
                max = x;
                System.out.println("list now=" + list);
            } else {
                System.out.println("skip add");
            }
            r(node.left, x);
        }
        
        System.out.println("done node=" + node.val + " list=" + list);
        return;
    }
}