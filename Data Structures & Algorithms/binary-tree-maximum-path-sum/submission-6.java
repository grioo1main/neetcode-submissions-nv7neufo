class Solution {
    int max = Integer.MIN_VALUE;
    int counter = 0;
    public int maxPathSum(TreeNode root) {
        int x = dfs(root);
        return Math.max(max , x);
    }
    public int dfs(TreeNode root){
        int temp = ++counter;
        System.out.println("temp: " + temp) ;
        
        if (root == null){
            System.out.println("Node is null. Return 0.");
            return 0;
        }
        
        System.out.println("Node for temp : (" +temp +")" + root.val);
        
                int leftVal = dfs(root.left);
int left = Math.max(leftVal, 0); // Если сумма ветки отрицательная, берем 0 (игнорируем ветку)

        System.out.println("Left for temp : (" +temp +")"+ left);
        

int rightVal = dfs(root.right);
int right = Math.max(rightVal, 0);
        System.out.println("Right for temp : (" +temp +")" + right);

        max = Math.max(root.val ,Math.max(max , (left + right + root.val)));
        System.out.println("left + right + node = " + left + " + " + right + " + " + root.val + " = " + (left + right + root.val));
        System.out.println("max is still: " + max);

        int result = Math.max(left, right) + root.val;
        System.out.println("Returnfor temp : (" +temp +")"+ "max(" + left + ", " + right + ") + " + root.val + " = " + result);
        
        return result;
    }
}