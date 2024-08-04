package Main;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        int sum =0;
        Queue<Pair<TreeNode,Boolean>> queue = new LinkedList<>();
        queue.offer(new Pair<>(root,false));

        while(!queue.isEmpty()){
            Pair<TreeNode,Boolean> pair = queue.poll();
            TreeNode node = pair.getKey();
            boolean left = pair.getValue();
            if(left && node.left== null && node.right == null) sum+=node.val;
            if(node.left != null){
                queue.offer(new Pair<>(node.left,true));
            }
            if(node.right != null){
                queue.offer(new Pair<>(node.right,false));
            }
        }
        return sum;
    }
}
