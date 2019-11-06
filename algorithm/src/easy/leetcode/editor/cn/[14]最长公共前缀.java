package easy.leetcode.editor.cn;
import easy.leetcode.editor.node.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class question_14{
//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串



//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        //解法1
        /*
        执行耗时:1 ms,击败了95.19% 的Java用户
		内存消耗:37.6 MB,击败了74.06% 的Java用户
        */
        /*
        String res = ""; //公共前缀
        String minStr = "";
        int minLength = 9999;
        boolean flag = true;//该布尔值为真表示数组的串在同一个位置的char相同
        //1.找到数组中的最小长度串
        for (String str : strs) {
            if(str.length() < minLength)
            {
                minLength = str.length();
                minStr = str;
            }
        }
        if(strs.length == 0 || minLength == 0)
        {
            return minStr;
        }
        //2.以这个最小串为标准，让其他串以此来对比
        int i = 0;
        for (i = 0; i < minLength; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != minStr.charAt(i)) {
                    flag = false;
                }
            }
            //说明数组中的字符串在第i个字符不相同，跳出循环
            if (!flag)
            {
                break;
            }
        }
        return minStr.substring(0,i);*/

        //解法2
        /*
        执行耗时:1 ms,击败了95.19% 的Java用户
		内存消耗:37.1 MB,击败了81.23% 的Java用户
        */
        /*算法要依次遍历字符串,当遍历到第 i 个字符串的时候，
        找到最长公共前缀是一个空串的时候，算法就结束了。
        否则，在执行了 nn 次遍历之后，算法就会返回最终答案 */
        if(strs.length == 0)return "";
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(res) != 0)
            {
                res = res.substring(0,res.length()-1);
                if(res.isEmpty())
                {
                    return "";
                }
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
/*public static void main(String[] args) {
    Solution solution = new Solution();
    String[] ss = {"fllex","fllower","fllsssssss"};
    System.out.println(solution.longestCommonPrefix(ss));
}*/
}