package easy.leetcode.editor.cn;
import easy.leetcode.editor.node.*;

import java.util.Stack;

class question_20{
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 注意空字符串可被认为是有效字符串。 
//
// 示例 1: 
//
// 输入: "()"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "()[]{}"
//输出: true
// 
//
// 示例 3: 
//
// 输入: "(]"
//输出: false
// 
//
// 示例 4: 
//
// 输入: "([)]"
//输出: false
// 
//
// 示例 5: 
//
// 输入: "{[]}"
//输出: true 
// Related Topics 栈 字符串


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        //如果长度为奇数,直接返回false
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if(stack.empty())
            {
                stack.push(s.charAt(i));
            }else
            {
                char ch = (char) stack.lastElement();
                if (')' == s.charAt(i) && '(' == ch) {
                    stack.pop();
                } else if (']' == s.charAt(i) && '[' == ch) {
                    stack.pop();
                }else if ('}' == s.charAt(i) && '{' == ch) {
                    stack.pop();
                }else
                {
                    stack.push(s.charAt(i));
                }

            }
        }
        return stack.empty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}