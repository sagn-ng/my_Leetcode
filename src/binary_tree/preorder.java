package binary_tree;

import java.util.ArrayList;
import java.util.List;

public class preorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode prev=null, cur=root;

        List<Integer> result=new ArrayList<>();
        if (root==null) return result;
        List<TreeNode> stack=new ArrayList<>();
        int last=-1;
        while (cur!=null || last!=-1){
            while (cur!=null){
                result.add(cur.val);
                stack.add(cur);
                cur=cur.left;
                last++;
            } //"cur" is now null

            prev=stack.remove(last);
            last--;
            cur=prev.right;
        }
        return result;
    }
}