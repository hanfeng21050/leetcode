package leetcode.editor.cn;
import leetcode.editor.node.*;
class question_258{
//给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。 
//
// 示例: 
//
// 输入: 38
//输出: 2 
//解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
// 
//
// 进阶: 
//你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？ 
// Related Topics 数学 
// 👍 280 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int addDigits(int num) {
        if(num < 10) {
            return num;
        }

        return addDigitsHelper(String.valueOf(num));
    }

    private int addDigitsHelper(String num) {
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += num.charAt(i) - '0';
        }

        if(sum / 10 == 0) {
            return sum;
        }

        return addDigitsHelper(String.valueOf(sum));

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}