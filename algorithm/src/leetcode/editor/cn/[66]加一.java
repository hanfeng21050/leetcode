package leetcode.editor.cn;

import leetcode.editor.node.*;

class question_66 {
//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 示例 1: 
//
// 输入: [1,2,3]
//输出: [1,2,4]
//解释: 输入数组表示数字 123。
// 
//
// 示例 2: 
//
// 输入: [4,3,2,1]
//输出: [4,3,2,2]
//解释: 输入数组表示数字 4321。
// 
// Related Topics 数组


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int x = n;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            }
            if (i != 0) {
                digits[i] = 0;
            } else {
                x++;
                digits[i]++;
            }
        }
        int first = digits[0];
        String s = String.valueOf(first);
        if(s.length() == 2)
        {
            int[] newArr = new int[n + 1];
            newArr[0] = 1;
            return newArr;
        }else
        {
            return digits;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}