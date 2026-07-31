package binary_tree;
/*a node "x" in a binary tree is called a "dominant" node if it equals the the maximum value
among all nodes in the subtree rooted at "x"*/
public class DominantNodes {
    private int count=0;
    private int dfs_maxNode(TreeNode root){
        if (root!=null){
            int lnode=dfs_maxNode(root.left);
            int rnode=dfs_maxNode(root.right);
            if (root.val>=lnode && root.val>=rnode){
                count++;
                return root.val;
            }
            else return Math.max(lnode, rnode);
        }
        else return 0;
    } //this is called the postorder traversal: dfs through the left subtree, then the right subtree
    public int countDominantNodes(TreeNode root) {
        dfs_maxNode(root);
        return count;
    }
}