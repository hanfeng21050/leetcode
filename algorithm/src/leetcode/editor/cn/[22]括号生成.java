package leetcode.editor.cn;
import leetcode.editor.node.*;

import java.util.ArrayList;
import java.util.List;

class question_22{
//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。 
//
// 
//
// 示例： 
//
// 输入：n = 3
//输出：[
//       "((()))",
//       "(()())",
//       "(())()",
//       "()(())",
//       "()()()"
//     ]
// 
// Related Topics 字符串 回溯算法 
// 👍 1320 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        generateParenthesisHelper(ans, "", 0, 0, n);

        return ans;
    }


    public void generateParenthesisHelper(List<String> ans, String s, int open, int close, int n) {
        if(s.length() == 2 * n) {
            ans.add(s);
        }

        if(open < n) {
            generateParenthesisHelper(ans, s+"(", open+1, close, n);
        }

        if(close < open) {
            generateParenthesisHelper(ans, s+")", open, close+1, n);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}