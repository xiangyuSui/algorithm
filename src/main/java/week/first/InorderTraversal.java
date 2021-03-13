package week.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description
 * @ClassName InorderTraversal
 * @Author Xander Sui
 * @Date 2021/3/13
 */
public class InorderTraversal {
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<Integer>();
            if (root == null) {
                return res;
            }
            TreeNode cur = root;
            Stack<TreeNode> stack = new Stack<TreeNode>();
            while (!stack.isEmpty() || cur != null) {
                while (cur != null) {
                    stack.push(cur);
                    cur = cur.left;
                }
                TreeNode node = stack.pop();
                res.add(node.val);
                if (node.right != null) {
                    cur = node.right;
                }
            }
            return res;
        }
    }
}
