package Main;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();

        helper(res,root);
        return res;
    }
    void helper(List<Integer> res,TreeNode root){

        if(root==null) return;

        res.add(root.val);
        helper(res,root.left);
        helper(res,root.right);
    }
}
