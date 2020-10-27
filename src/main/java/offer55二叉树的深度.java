public class offer55二叉树的深度 {
    //递归写法
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int lh = maxDepth(root.left) + 1;
        int rh = maxDepth(root.right) + 1;
        return lh > rh ? lh : rh;
    }
}


