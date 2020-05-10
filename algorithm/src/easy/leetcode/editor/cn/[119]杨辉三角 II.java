package easy.leetcode.editor.cn;
import easy.leetcode.editor.node.*;

import java.util.ArrayList;
import java.util.List;

class question_119{
//给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。 
//
// 
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。 
//
// 示例: 
//
// 输入: 3
//输出: [1,3,3,1]
// 
//
// 进阶： 
//
// 你可以优化你的算法到 O(k) 空间复杂度吗？ 
// Related Topics 数组


//leetcode submit region begin(Prohibit modification and deletion)
 class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>(34);
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = i; j >= 0; j--)
            {
                if(i==0 || j == i){
                    list.add(j,1);
                }
                else if( j == 0)
                {
                    list.set(j,1);
                }
                else
                {
                    list.set(j,list.get(j-1) + list.get(j));
                }
            }
        }
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}