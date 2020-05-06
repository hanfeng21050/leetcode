package easy.leetcode.editor.cn;
import easy.leetcode.editor.node.*;
class question_88{
//给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。 
//
// 
//
// 说明: 
//
// 
// 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。 
// 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。 
// 
//
// 
//
// 示例: 
//
// 输入:
//nums1 = [1,2,3,0,0,0], m = 3
//nums2 = [2,5,6],       n = 3
//
//输出: [1,2,2,3,5,6] 
// Related Topics 数组 双指针


//leetcode submit region begin(Prohibit modification and deletion)
 class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
        sort(nums1,0,m+n-1);
    }

    public void sort(int[] a, int lo, int hi) {
        //递归终止条件
        if (hi <= lo) return;
        //改进,在递归到小数组时,使用插入排序

        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    public int partition(int[] nums, int lo, int hi) {
        int i = lo, j = hi + 1;
        //将数组第一个数作为基准元素
        int v = nums[lo];
        while (true) {
            //从左往右扫描,当元素比基准元素大时,结束循环
            while (nums[++i] < v) {
                if (i == hi)
                    break;
            }
            //从右往左扫描,当元素比基准元素大时,结束循环
            while (v < nums[--j]) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            //交换当前i,j下标的元素
            int x = nums[i];
            nums[i] = nums[j];
            nums[j] = x;
        }
        //此时 i== j, 将基准元素和该下标的元素交换
        int x = nums[lo];
        nums[lo] = nums[j];
        nums[j] = x;
        return j;
    }
}

//leetcode submit region end(Prohibit modification and deletion)
}