package leetcode.editor.cn;
import leetcode.editor.node.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class question_345{
//编写一个函数，以字符串作为输入，反转该字符串中的元音字母。 
//
// 
//
// 示例 1： 
//
// 输入："hello"
//输出："holle"
// 
//
// 示例 2： 
//
// 输入："leetcode"
//输出："leotcede" 
//
// 
//
// 提示： 
//
// 
// 元音字母不包含字母 "y" 。 
// 
// Related Topics 双指针 字符串 
// 👍 116 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('u');
        set.add('o');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        int i = 0;
        int j = s.length() -1;
        char[] chars = s.toCharArray();

        while (i < j) {
            while (i < j && !set.contains(chars[i])) {
                ++i;
            }
            while (i < j && !set.contains(chars[j])) {
                --j;
            }

            if(i < j) {
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;

                ++i;
                --j;
            }
        }

        return String.valueOf(chars);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}