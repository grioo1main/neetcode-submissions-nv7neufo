# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0
        m = 0
        def sol(root: Optional[TreeNode]) -> int:
            if root is None:
                return 0
            nonlocal m
            l = sol(root.left)
            r = sol(root.right)
            m = max(m , 1+ l + r)
            return max(l , r) + 1
        
        sol(root)
        return m-1


    