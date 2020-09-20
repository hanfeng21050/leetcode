package leetcode.editor.cn;
import leetcode.editor.node.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class question_15{
//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复
//的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例： 
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
// Related Topics 数组 双指针 
// 👍 2589 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        if (nums == null || nums.length < 3) {
            return ans;
        }

        int len  = nums.length;

        //排序
        Arrays.sort(nums);

        if(nums[0] > 0 || nums[len-1] < 0) {
            return ans;
        }

        for (int i = 0; i < len; i++) {
            if(nums[i] > 0) {
                break;
            }

            //去重
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int l = i+1;
            int r = len-1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l+1]) l++;
                    while (l < r && nums[r] == nums[r-1]) r--;
                    l++;
                    r--;
                }
                else if(sum < 0) l++;
                else if(sum > 0) r--;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}