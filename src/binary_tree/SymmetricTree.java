package binary_tree;
import java.util.ArrayList;
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root){
        if (root.left==null) return (root.right==null);
        if (root.right==null) return (root.left==null);
        ArrayList<TreeNode> leftIterate=new ArrayList<>();
        ArrayList<TreeNode> rightIterate=new ArrayList<>();
        /*ArrayList is used to work like a queue;
        with leftIterate get elements in: -> direction, while rightIterate get its elements backwards: <-
        */
        leftIterate.add(root.left);
        rightIterate.add(root.right);
        while (!leftIterate.isEmpty() && !rightIterate.isEmpty()){
            TreeNode rmLeft=leftIterate.remove(0); //pop out the first element of the queue
            TreeNode rmRight=rightIterate.remove(0);

            if (rmLeft==null && rmRight==null) continue; //if both are null
            else if (rmLeft==null || rmRight==null) return false; //if only one of them is null
            else if (rmLeft.val!=rmRight.val) return false; //if both aren't null and the "val" don't match

            leftIterate.add(rmLeft.left); leftIterate.add(rmLeft.right); //add new elements to 2 queues
            rightIterate.add(rmRight.right); rightIterate.add(rmRight.left);
        }
        return true;
    }
}