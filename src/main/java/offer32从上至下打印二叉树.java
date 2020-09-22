import java.util.*;

public class offer32从上至下打印二叉树 {
    public static void main(String[] args) {


    }
    public static int[] levelOrder(TreeNode root) {
       if (root == null){return new int[0];}
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList();
        ((LinkedList<TreeNode>) queue).add(root);
        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();
            list.add(poll.val);
            if (poll.left != null){
                ((LinkedList<TreeNode>) queue).add(poll.left);
            }
            if (poll.right != null){
                ((LinkedList<TreeNode>) queue).add(poll.right);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;

    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}

