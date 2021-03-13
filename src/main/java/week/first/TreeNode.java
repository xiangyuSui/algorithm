package week.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description
 * @ClassName TreeNode
 * @Author Xander Sui
 * @Date 2021/3/13
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
