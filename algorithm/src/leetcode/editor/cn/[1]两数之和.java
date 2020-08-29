package leetcode.editor.cn;
import leetcode.editor.node.*;

import java.util.HashMap;
import java.util.Map;

class question_1{
//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表


//leetcode submit region begin(Prohibit modification and deletion)
class  Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x) && map.get(x) != i) {
                return new int[]{i,map.get(x)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


/*
 解题思路
   1. 暴力法   时间复杂度:O(n^2)  空间复杂度:O(1)
    public int[] twoSum(int[] nums, int target) {
        int[] num = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                {
                    num[0] = i;
                    num[1] = j;
                    return num;
                }
            }
        }
        return null;
    }
   2. 两遍哈希表法  时间复杂度:O(n)  空间复杂度:O(n)
   思路是先将元素存进哈希表,然后查找
   public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x) && map.get(x) != i) {
                return new int[]{i,map.get(x)};
            }
        }

        return null;
    }

   3. 一遍哈希表法  时间复杂度:O(n)  空间复杂度:O(n)
   在两边哈希表的基础上进行优化,当我们在插入哈希表的时候先查询是否有满足条件的值,如果有,就结束程序了
   Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x) && map.get(x) != i) {
                return new int[]{i,map.get(x)};
            }
            map.put(nums[i], i);
        }
        return null;

 */

}