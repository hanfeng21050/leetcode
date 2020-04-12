package easy.leetcode.editor.cn;
import easy.leetcode.editor.node.*;
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
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int ans = 0;
        while (x > ans)
        {
            ans = ans * 10 + (x % 10);
            x = x/ 10;
        }
        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
       return ans == x || ans / 10 ==x;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    /*
    1.反转数字,然后和测试用例比较
    public boolean isPalindrome(int x) {
        if(x < 0)
        {
            return false;
        }
        int t= x;
        int ans = 0;
        while (t != 0)
        {
            ans = ans * 10 + (t % 10);
            t = t/ 10;
        }
        if(ans == x)
        {
            return true;
        }
        return false;
    }


    2. 因为是回文数,那么我们可以之比较一半的数字
    public boolean isPalindrome(int x) {
            // 特殊情况：
            // 如上所述，当 x < 0 时，x 不是回文数。
            // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
            // 则其第一位数字也应该是 0
            // 只有 0 满足这一属性
            if(x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }
            int ans = 0;
            while (x > ans)
            {
                ans = ans * 10 + (x % 10);
                x = x/ 10;
            }
            // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
            // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
            // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
           return ans == x || ans / 10 ==x;
        }
     */
}