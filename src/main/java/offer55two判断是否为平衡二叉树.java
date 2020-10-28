public class offer55two判断是否为平衡二叉树 {
    //方法作用：以node为节点的树是否平衡
    public boolean isBalanced(TreeNode node) {
        if(node == null) return true;//如果节点为空返回true
        if(!isBalanced(node.left)){//如果左子树不平衡返回false
            return false;
        }
        if(!isBalanced(node.right)){//如果右子树不平衡返回false
            return false;
        }
        //左右都为平衡
        int l = getDepth(node.left);
        int r = getDepth(node.right);
        if(Math.abs(r - l) > 1){//如果左右子树的深度相差超过一返回false
            return false;
        }
        return true;
    }
    //获取以node为根的子树深度
    public int getDepth(TreeNode node) {
        if(node == null){
            return 0;
        }
        int l = getDepth(node.left) + 1;
        int r = getDepth(node.right) + 1;
        return r>l?r:l;
    }
}
