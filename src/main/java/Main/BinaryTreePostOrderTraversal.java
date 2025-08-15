package Main;

public class BinaryTreePostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();

        helper(res,root);
        return res;
    }
    void helper(List<Integer> res,TreeNode root){

        if(root==null) return;

        helper(res,root.left);
        helper(res,root.right);
        res.add(root.val);
    }
}
