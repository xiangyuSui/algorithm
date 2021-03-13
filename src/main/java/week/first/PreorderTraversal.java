package week.first;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @ClassName TreeNode2
 * @Author Xander Sui
 * @Date 2021/3/13
 */
public class PreorderTraversal {
    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<Integer>();
            preorder(root, res);
            return res;
        }

        public void preorder(TreeNode root, List<Integer> res) {
            if (root == null) {
                return;
            }
            res.add(root.val);
            preorder(root.left, res);
            preorder(root.right, res);
        }
    }
}
