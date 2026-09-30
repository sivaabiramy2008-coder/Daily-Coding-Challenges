import java.util.ArrayList;
import java.util.List;

class Solution {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        getLeaves(root1, list1);
        getLeaves(root2, list2);

        return list1.equals(list2);
    }

    public void getLeaves(TreeNode root, List<Integer> list) {

        if (root == null) {
            return;
        }

        // Check whether the current node is a leaf
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }

        // Visit left subtree
        getLeaves(root.left, list);

        // Visit right subtree
        getLeaves(root.right, list);
    }
}
