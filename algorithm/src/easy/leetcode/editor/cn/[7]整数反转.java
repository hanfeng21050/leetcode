package easy.leetcode.editor.cn;

class question_7{
//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。 
//
// 示例 1: 
//
// 输入: 123
//输出: 321
// 
//
// 示例 2: 
//
// 输入: -123
//输出: -321
// 
//
// 示例 3: 
//
// 输入: 120
//输出: 21
// 
//
// 注意: 
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。 
// Related Topics 数学



//easy.leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
        long res = 0;
        int a = 0;
        int MAX = (int) (Math.pow(2,31)-1);
        int MIN = (int) -Math.pow(2,31);
        while (x != 0)
        {
            if(res > MAX/10 || (res == MAX/10 && a > 7))
            {
                return 0;
            }
            if(res < MIN/10 || (res == MIN/10 && a<-8))
            {
                return 0;
            }

            a = x % 10;
            res = res*10 + a;
            x = x/10;
        }
        return (int) res;
    }
}
//easy.leetcode submit region end(Prohibit modification and deletion)
}