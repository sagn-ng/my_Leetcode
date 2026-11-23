from TreeNode import TreeNode

def invertTree(self, root: TreeNode | None) -> TreeNode | None:
    if (not root): return None
        
    temp1, temp2=root.left, root.right

    root.left=self.invertTree(temp2)
    root.right=self.invertTree(temp1)

    return root