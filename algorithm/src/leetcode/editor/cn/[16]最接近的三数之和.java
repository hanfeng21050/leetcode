package leetcode.editor.cn;
import leetcode.editor.node.*;

import java.util.Arrays;

class question_16{
//给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和
//。假定每组输入只存在唯一答案。 
//
// 
//
// 示例： 
//
// 输入：nums = [-1,2,1,-4], target = 1
//输出：2
//解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
// 
//
// 
//
// 提示： 
//
// 
// 3 <= nums.length <= 10^3 
// -10^3 <= nums[i] <= 10^3 
// -10^4 <= target <= 10^4 
// 
// Related Topics 数组 双指针 
// 👍 576 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length;i++) {
            int l = i+1, r = nums.length - 1;
            while(l < r) {
                int sum = nums[l] + nums[r] + nums[i];
                if(Math.abs(target - sum) < Math.abs(target - ans))
                    ans = sum;
                if(sum > target){
                    while (l < r && nums[r-1] ==nums[r]) r--;
                    r--;
                }
                else if(sum < target) {
                    while (l < r && nums[l+1] ==nums[l]) l++;
                    l++;
                }
                else
                    return ans;
            }
        }
        return ans;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
}