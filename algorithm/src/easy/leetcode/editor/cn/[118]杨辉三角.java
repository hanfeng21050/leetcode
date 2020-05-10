package easy.leetcode.editor.cn;
import easy.leetcode.editor.node.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class question_118{
//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。 
//
// 
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。 
//
// 示例: 
//
// 输入: 5
//输出:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//] 
// Related Topics 数组


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows == 0)
        {
            return list;
        }
        for(int i=0;i<numRows;i++){
            List<Integer> list1 = new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j == i){
                    list1.add(1);
                } else {
                    list1.add(list.get(i-1).get(j) + list.get(i-1).get(j-1));
                }
            }
            list.add(list1);
        }
        return list;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}