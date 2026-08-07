package binary_tree;
public class BalancedTree {
    private int dfs(TreeNode root){
        if (root==null) return 0;
        int depthL=dfs(root.left), depthR=dfs(root.right);
        if (depthL==-1 || depthR==-1) return -1;

        int diff=Math.abs(depthL-depthR);
        return (diff>1) ? -1 : 1+Math.max(depthL, depthR);
    } //dfs in BT is just preorder traversal
    public boolean isBalanced(TreeNode root){
        return (dfs(root)==-1);
    }
}