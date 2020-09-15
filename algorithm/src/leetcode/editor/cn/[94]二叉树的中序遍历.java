package leetcode.editor.cn;
import leetcode.editor.node.*;
import sun.reflect.generics.tree.Tree;

import java.util.*;

class question_94{
//给定一个二叉树，返回它的中序 遍历。 
//
// 示例: 
//
// 输入: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//输出: [1,3,2] 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 哈希表 
// 👍 705 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreePrint2(root, list);
        return list;
    }

    /**
     * 递归
     * @param node
     * @param list
     */
    public void TreePrint(TreeNode node, List<Integer> list) {
        if(node == null) return;

        TreePrint(node.left,list);
        list.add(node.val);
        TreePrint(node.right,list);
    }

    /**
     * 迭代
     * @param root
     */
    public void TreePrint2(TreeNode root, List<Integer> list) {
        Deque<TreeNode> stk = new LinkedList<>();

        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }

            root = stk.pop();
            list.add(root.val);
            root = root.right;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}