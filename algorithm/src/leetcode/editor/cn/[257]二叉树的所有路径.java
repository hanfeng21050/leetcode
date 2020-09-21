package leetcode.editor.cn;
import leetcode.editor.node.*;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class question_257{
//给定一个二叉树，返回所有从根节点到叶子节点的路径。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例: 
//
// 输入:
//
//   1
// /   \
//2     3
// \
//  5
//
//输出: ["1->2->5", "1->3"]
//
//解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3 
// Related Topics 树 深度优先搜索 
// 👍 364 👎 0


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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        binaryTreePathsHelper(root, "", paths);
        return paths;
    }

    public void binaryTreePathsHelper(TreeNode node, String path,  List<String> paths) {
        if(node != null) {
            StringBuilder sb = new StringBuilder(path);
            sb.append(node.val);

            if(node.left == null && node.right == null) {
                paths.add(sb.toString());
            }else {
                sb.append("->");
                binaryTreePathsHelper(node.left, sb.toString(), paths);
                binaryTreePathsHelper(node.right, sb.toString(), paths);
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}