class Solution {
    private TreeNode prev;
    private TreeNode first;
    private TreeNode last;
    private TreeNode middle;
    public void recoverTree(TreeNode root) {
        first = middle = last = null;
        prev = new TreeNode(Integer.MIN_VALUE);
        BSTutil(root);
        if(first != null && last != null){
            first.val = first.val -last.val;
            last.val = first.val + last.val;
            first.val = last.val- first.val;
        } else if(first != null && middle != null) {
            first.val = first.val -middle.val;
            middle.val = first.val + middle.val;
            first.val = middle.val- first.val;
        }
    }
    public void BSTutil(TreeNode root){
        if(root== null)
            return;
        BSTutil(root.left);
        if((prev != null) && (prev.val > root.val)){
            if(first == null) {
                first = prev;
                middle = root;
            }else{
                last = root;
            }
        }
        prev = root;
        BSTutil(root.right);
    }
}