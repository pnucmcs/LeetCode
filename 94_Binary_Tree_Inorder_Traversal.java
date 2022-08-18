import java.util.ArrayList;
import java.util.List;

class Solution {
    //Using Stack
    /*public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stacki = new Stack<>();
        List<Integer> output = new ArrayList<>();
        if(root == null){
            return output;
        }
        TreeNode current = root;
        while (current!= null || !stacki.isEmpty()){
            while (current != null){
                stacki.push(current);
                current = current.left;
            }
            current = stacki.pop();
            output.add(current.val);
            current = current.right;
        }
        return output;
    }*/
    //Using Recursive approach
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        traverse(root, output);
        return output;
    }
    public void traverse(TreeNode root, List<Integer> output){
        if(root != null){
            traverse(root.left, output);
            output.add(root.val);
            traverse(root.right,output);
        }
    }
}