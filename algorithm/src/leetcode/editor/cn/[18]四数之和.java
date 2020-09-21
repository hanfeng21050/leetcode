package leetcode.editor.cn;

import leetcode.editor.node.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class question_18 {
//给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c +
// d 的值与 target 相等？找出所有满足条件且不重复的四元组。 
//
// 注意： 
//
// 答案中不可以包含重复的四元组。 
//
// 示例： 
//
// 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
//
//满足要求的四元组集合为：
//[
//  [-1,  0, 0, 1],
//  [-2, -1, 1, 2],
//  [-2,  0, 0, 2]
//]
// 
// Related Topics 数组 哈希表 双指针 
// 👍 569 👎 0


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            List<List<Integer>> result = new ArrayList<>();
            int len = nums.length;
            for (int i = 0; i < len - 3; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                for (int j = i + 1; j < len-2; j++) {
                    if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                    int c = j + 1;
                    int d = len - 1;

                    while (c < d) {
                        int sum = nums[i] + nums[j] + nums[c] + nums[d];
                        if (sum > target) {
                            d--;
                        } else if (sum < target) {
                            c++;
                        } else {
                            result.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[c], nums[d])));
                            while (c < d && nums[d-1] == nums[d]) d--;
                            while (c < d && nums[c+1] == nums[c]) c++;
                            c++;
                            d--;
                        }
                    }
                }
            }

            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}