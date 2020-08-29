package leetcode.editor.cn;
import leetcode.editor.node.*;
class question_125{
//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。 
//
// 说明：本题中，我们将空字符串定义为有效的回文串。 
//
// 示例 1: 
//
// 输入: "A man, a plan, a canal: Panama"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "race a car"
//输出: false
// 
// Related Topics 双指针 字符串


//leetcode submit region begin(Prohibit modification and deletion)
 class Solution {
    public boolean isPalindrome(String s) {
        if("".equals(s))
        {
            return true;
        }
        int begin = 0;
        int end = s.length()-1;
        while (begin < end)
        {
            char b = s.charAt(begin);
            char e = s.charAt(end);
            if (!((b>=48 && b<=57) || (b <= 90 && b >= 65) || (b>=97 && b<= 122)))
            {
                begin ++;
            } else if (!((e >= 48 && e <= 57) || (e <= 90 && e >= 65) || (e >= 97 && e <= 122))) {
                end --;
            }else {
                if(e == b || ((e+32 == b || e-32==b) && e> 57 && b>57))
                {
                    begin++;
                    end--;
                }else {
                    return false;
                }

            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}