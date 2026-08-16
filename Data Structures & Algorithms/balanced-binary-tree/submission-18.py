# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        b =True
        def sol(root) -> int:
            nonlocal b
            if root is None or not b:
                return 0
            l = sol(root.left)
            r = sol(root.right)
            if abs(l - r) > 1:
                b = False
            return max(l , r)+1
        sol(root)
        return b
