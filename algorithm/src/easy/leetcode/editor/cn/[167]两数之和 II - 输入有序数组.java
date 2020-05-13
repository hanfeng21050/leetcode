package easy.leetcode.editor.cn;
import easy.leetcode.editor.node.*;
class question_167{
//给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。 
//
// 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。 
//
// 说明: 
//
// 
// 返回的下标值（index1 和 index2）不是从零开始的。 
// 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。 
// 
//
// 示例: 
//
// 输入: numbers = [2, 7, 11, 15], target = 9
//输出: [1,2]
//解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。 
// Related Topics 数组 双指针 二分查找


//leetcode submit region begin(Prohibit modification and deletion)
 class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right = numbers.length-1;
        int left = 0;
        while (left <right)
        {
            if(numbers[left] + numbers[right] > target)
            {
                right --;
            }else if(numbers[left] + numbers[right] < target)
            {
                left ++;
            }else
            {
                break;
            }
        }
        return new int[]{left+1,right+1};
        /*int length = numbers.length-1;
        int i = 0;
        int rth = -1;
        for (i = 0; i < numbers.length-1; i++) {
            int x = numbers[i];
            int y = target - x;
            rth = binarySearch(numbers,y,i+1,length);
            if(rth != -1)
            {
                break;
            }
        }
        return new int[]{i+1,rth+1};*/
    }
    /*public int binarySearch(int[] numbers,int target,int left,int right)
    {
        while (left <= right)
        {
            int mid = (left + right) / 2;
            if(numbers[mid] == target)
            {
                return mid;
            }
            else if(numbers[mid] < target)
            {
                left = mid + 1;
            }else
            {
                right = mid - 1;
            }
        }
        return -1;
    }*/
}
//leetcode submit region end(Prohibit modification and deletion)
}