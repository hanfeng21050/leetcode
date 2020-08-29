package leetcode.editor.cn;
import leetcode.editor.node.*;
import javafx.util.Pair;

import java.util.LinkedList;

class question_111{
//给定一个二叉树，找出其最小深度。 
//
// 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例: 
//
// 给定二叉树 [3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回它的最小深度 2. 
// Related Topics 树 深度优先搜索 广度优先搜索


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
    public int minDepth(TreeNode root) {
        //递归
        /*if(root == null)
        {
            return 0;
        }
        if((root.left != null && root .right != null) || (root.left == null && root .right == null))
        {
            return Math.min(minDepth(root.left),minDepth(root.right)) + 1;
        }else {
            return Math.max(minDepth(root.left),minDepth(root.right)) + 1;
        }*/

        //BFS
        LinkedList<Pair<TreeNode, Integer>> stack = new LinkedList<>();
        if (root == null) {
            return 0;
        }else {
            stack.add(new Pair<>(root,1));
        }

        int current_depth = 0;
        while (!stack.isEmpty())
        {
            Pair<TreeNode, Integer> current = stack.poll();
            root = current.getKey();
            current_depth = current.getValue();

            if (root.left == null && root.right == null) {
                break;
            }

            if (root.left != null) {
                stack.add(new Pair<>(root.left,current_depth+1));
            }
            if(root.right != null)
            {
                stack.add(new Pair<>(root.right,current_depth+1));
            }
        }
        return current_depth;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}