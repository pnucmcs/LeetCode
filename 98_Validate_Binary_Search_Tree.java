

class Solution98 {
    //Using upper and lower pointers
    /*public boolean isValidBST(TreeNode root) {
        return subBST(root,null,null);
    }
    public static boolean subBST(TreeNode root,TreeNode left,TreeNode right) {
        if(root == null)
            return true;
        if(left != null && root.val <= left.val)
            return false;
        if(right != null && root.val >= right.val)
            return false;
        if(subBST(root.right,root,right) == false)
            return false;
        if(subBST(root.left,left,root) == false)
            return false;
        return true;
    }*/
    //Using Inordertraversal
    /*
    public boolean isValidBST(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        inorderTraversal(root, output);
        return IsSorted(output);
    }
    public void inorderTraversal(TreeNode root, List<Integer> output){
        if(root != null){
            inorderTraversal(root.left, output);
            output.add(root.val);
            inorderTraversal(root.right,output);
        }
    }
    public static boolean IsSorted(List<Integer> list){
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) <= list.get(i-1)){
                return false;
            }
        }
        return true;
    }
    */
    static TreeNode prev;
    public static Boolean isvalidBST(TreeNode root) {
        return isBSTUtil(root);
    }
    public static Boolean isBSTUtil(TreeNode root) {
        // traverse the tree in inorder fashion and
        // keep track of prev node
        if (root != null) {
            if (!isBSTUtil(root.left))
                return false;
            // Allows only distinct valued nodes
            if (prev != null && root.val <= prev.val)
                return false;
            prev = root;
            return isBSTUtil(root.right);
        }
        return true;
    }
}