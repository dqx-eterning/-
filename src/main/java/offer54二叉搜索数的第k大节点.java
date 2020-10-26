import java.util.ArrayList;
import java.util.List;

public class offer54二叉搜索数的第k大节点 {
    //假设，你花了点时间，练习了二叉树的三种遍历方式： a. 前序遍历 b. 中序遍历 c. 后续遍历
    //你也学习了二叉搜索树，深入研究了二叉树搜索树的特性，
    // 并且深刻知道二叉搜索树的一个特性：通过中序遍历所得到的序列，就是有序的。
    public int kthLargest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        helper(root,list);
        return list.get(list.size()-k);
    }
    //中序遍历
    private void helper(TreeNode root, List<Integer> list) {
        if (root == null) return;
        if (root.left != null) helper(root.left, list);
        list.add(root.val);
        if (root.right != null) helper(root.right, list);
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
