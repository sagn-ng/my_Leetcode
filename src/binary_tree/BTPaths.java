package binary_tree;
import java.util.List;
import java.util.ArrayList;
public class BTPaths {
    private void helper(TreeNode root, StringBuilder sb, List<String> pathList){
        if (root==null) return;
        int n=sb.length();
        sb.append(root.val);

        if (root.left==null && root.right==null){
            pathList.add(sb.toString());
        } //if "root" is a leaf
        else{
            sb.append("->"); //indicates that there is a path down left/right;
            helper(root.left, sb, pathList);
            helper(root.right, sb, pathList);
        }
        sb.setLength(n);
        /*initializing the length before appending, then resizing makes "sb" back to
        the father node (backtracking) after adding all paths of its children*/
    }
    public List<String> binaryTreePaths(TreeNode root){
        List<String> pathList=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        helper(root, sb, pathList);
        return pathList;
    }
}