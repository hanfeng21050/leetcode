package easy.leetcode.editor.cn;
import easy.leetcode.editor.node.*;
import sun.reflect.generics.tree.Tree;

class question_110{
//给定一个二叉树，判断它是否是高度平衡的二叉树。 
//
// 本题中，一棵高度平衡二叉树定义为： 
//
// 
// 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。 
// 
//
// 示例 1: 
//
// 给定二叉树 [3,9,20,null,null,15,7] 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回 true 。 
// 
//示例 2: 
//
// 给定二叉树 [1,2,2,3,3,null,null,4,4] 
//
//        1
//      / \
//     2   2
//    / \
//   3   3
//  / \
// 4   4
// 
//
// 返回 false 。 
//
// 
// Related Topics 树 深度优先搜索


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
    public boolean isBalanced(TreeNode root) {
       if(root == null)
        {
            return true;
        }
         /*return Math.abs(altitudeIntercept(root.left) - altitudeIntercept(root.right)) < 2
                && isBalanced(root.left)
                && isBalanced(root.right);*/
        return altitudeIntercept2(root) >=0;
    }

    /**
     * 自顶向下
     * @param root
     * @return
     */
    public int altitudeIntercept(TreeNode root) {
        if(root == null)
        {
            return -1;
        }

        return Math.max(altitudeIntercept(root.left),altitudeIntercept(root.right)) + 1;
    }

    /**
     * 自底向上
     * @param root
     * @return
     */
    public int altitudeIntercept2(TreeNode root)
    {
        if(root == null){
            return 0;
        }
        int l = altitudeIntercept2(root.left);
        int r = altitudeIntercept2(root.right);
        if (l == -1 || r == -1 || Math.abs(l - r) > 1) {
            return -1;
        }
        return Math.max(l,r)+1;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
}