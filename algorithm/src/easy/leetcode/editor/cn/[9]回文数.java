package easy.leetcode.editor.cn;

class question_9{
//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。 
//
// 示例 1: 
//
// 输入: 121
//输出: true
// 
//
// 示例 2: 
//
// 输入: -121
//输出: false
//解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3: 
//
// 输入: 10
//输出: false
//解释: 从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 进阶: 
//
// 你能不将整数转为字符串来解决这个问题吗？ 
// Related Topics 数学



//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
        //如果x为负数、0、一位正数，则x不是回文数
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int res = 0;
        int a = 0;
        /**
         * 如果输入数为奇数位，如果是回文数，则x = res/10,反之则不是，如12321，此时x = 12;res = 123,
         * 如果输入数为偶数位，如果是回文数，则x = res，反之则不是，如1221，此时 x=12;res = 12
         */
        while (x > res)
        {
            a = x % 10;
            res = res * 10 + a;
            x = x/10;
        }

        return x == res || x == res/10;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}