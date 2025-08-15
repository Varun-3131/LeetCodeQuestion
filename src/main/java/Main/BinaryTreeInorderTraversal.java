package Main;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        helper(res,root);
        return res;
    }

    void helper(List<Integer> res,TreeNode root){

        if(root==null) return;

        //LEFT--NODE--RIGHT

        helper(res,root.left);
        res.add(root.val);
        helper(res,root.right);

    }
}
