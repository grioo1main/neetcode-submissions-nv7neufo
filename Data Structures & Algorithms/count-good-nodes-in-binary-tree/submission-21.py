# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        def sol(root , m):
            if root is None:
                return 0
            x = 0
            if root.val >= m:
                x=1
                m = root.val
            
            return sol(root.left, m) + x + sol(root.right, m)
        return sol(root, -10000000)

