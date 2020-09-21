package leetcode.editor.cn;
import leetcode.editor.node.*;

import java.util.Arrays;

class question_268{
//给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。 
//
// 
//
// 示例 1: 
//
// 输入: [3,0,1]
//输出: 2
// 
//
// 示例 2: 
//
// 输入: [9,6,4,2,3,5,7,0,1]
//输出: 8
// 
//
// 
//
// 说明: 
//你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现? 
// Related Topics 位运算 数组 数学 
// 👍 310 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if(i != nums[i]) return i;
        }

        return i;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}