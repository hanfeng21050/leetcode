package leetcode.editor.cn;
import leetcode.editor.node.*;

import java.util.Arrays;

class question_204{
//统计所有小于非负整数 n 的质数的数量。 
//
// 示例: 
//
// 输入: 10
//输出: 4
//解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
// 
// Related Topics 哈希表 数学 
// 👍 432 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countPrimes(int n) {
        int count = 0;
        if(n < 2) {
            return count;
        }

        boolean[] isPrim = new boolean[n];
        Arrays.fill(isPrim,true);
        isPrim[0] = false;
        isPrim[1] = false;
        for (int i = 2; i*i < n; i++) {
            if(isPrime(i)) {
                for (int j = i*i; j < n; j+=i) {
                    isPrim[j] = false;
                }
            }
        }

        for (boolean b : isPrim) {
            if (b) count ++;
        }
        return count;
    }

    public boolean isPrime(int num) {
        if (num <= 3) {
            return num > 1;
        }
        // 不在6的倍数两侧的一定不是质数
        if (num % 6 != 1 && num % 6 != 5) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 5; i <= sqrt; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    }
//leetcode submit region end(Prohibit modification and deletion)

}