package easy.leetcode.editor.cn;
import easy.leetcode.editor.node.*;
class question_53{
//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 
//
// 示例: 
//
// 输入: [-2,1,-3,4,-1,2,1,-5,4],
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
// 
//
// 进阶: 
//
// 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。 
// Related Topics 数组 分治算法 动态规划


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int maxSubArray(int[] nums) {
        return greedy(nums);
    }

    /**
     * 贪心算法,每次遍历都选择最优,结果一定是最优
     * 时间复杂度 O(n) 只便利了一遍数组
     * 空间复杂度 O(1)
     * @param nums
     * @return
     */
    public int greedy(int[] nums)
    {
        int n = nums.length;
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < n; i++) {
            currSum = Math.max(nums[i],currSum+nums[i]);
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }

    /**
     * 动态规划
     * @param nums
     * @return
     */
    public int DP(int[] nums) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}