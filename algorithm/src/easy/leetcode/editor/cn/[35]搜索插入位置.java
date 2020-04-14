package easy.leetcode.editor.cn;
import easy.leetcode.editor.node.*;
class question_35{
//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 
//
// 你可以假设数组中无重复元素。 
//
// 示例 1: 
//
// 输入: [1,3,5,6], 5
//输出: 2
// 
//
// 示例 2: 
//
// 输入: [1,3,5,6], 2
//输出: 1
// 
//
// 示例 3: 
//
// 输入: [1,3,5,6], 7
//输出: 4
// 
//
// 示例 4: 
//
// 输入: [1,3,5,6], 0
//输出: 0
// 
// Related Topics 数组 二分查找


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int searchInsert(int[] nums, int target) {
        //return search(nums,target,0,nums.length-1);
        return search(nums,target);
    }

    /**
     * 递归实现
     * @param nums 查找数组
     * @param k 待查找元素
     * @param low 数组起始下标
     * @param high 数组结束下标
     */
    public int search(int[] nums, int k , int low , int high)
    {
        if(low > high)
        {
            return low;
        }else
        {
            int mid = (low + high) / 2;
            if(nums[mid] == k)
            {
                return mid;
            }else if(nums[mid] > k){
               return search(nums,k,low,mid-1);
            }else
            {
               return search(nums,k,mid+1,high);
            }
        }
    }

    /**
     * 迭代实现
     * @param nums
     * @param k
     * @return
     */
    public int search(int[] nums, int k)
    {
        int low = 0, high = nums.length-1,mid;
        while (low <= high)
        {
            mid = (low + high) / 2;
            if(nums[mid] == k)
            {
                return mid;
            }
            if(k < nums[mid])
            {
                high = mid-1;
            }else
            {
                low = mid + 1;
            }
        }
        return low;
    }


}
//leetcode submit region end(Prohibit modification and deletion)
}