package binary_tree;
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null) return (q==null);
        if (q==null) return (p==null);
        if (p.val == q.val)
            return (isSameTree(p.right, q.right) && isSameTree(p.left, q.left));
        else return false;
    }
}