package leetcode.editor.cn;
import leetcode.editor.node.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class question_290{
//给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。 
//
// 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。 
//
// 示例1: 
//
// 输入: pattern = "abba", str = "dog cat cat dog"
//输出: true 
//
// 示例 2: 
//
// 输入:pattern = "abba", str = "dog cat cat fish"
//输出: false 
//
// 示例 3: 
//
// 输入: pattern = "aaaa", str = "dog cat cat dog"
//输出: false 
//
// 示例 4: 
//
// 输入: pattern = "abba", str = "dog dog dog dog"
//输出: false 
//
// 说明: 
//你可以假设 pattern 只包含小写字母， str 包含了由单个空格分隔的小写字母。 
// Related Topics 哈希表 
// 👍 192 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        int len1 = pattern.length();
        String[] s1 = s.split(" ");
        int len2 = s1.length;
        if(len1 != len2) return false;
        Map<Character,Integer> map = new HashMap<>();
        int k = 1;
        int[] a = new int[len1];
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
        for (int i = 0; i < len1; i++) {
            if(map.containsKey(pattern.charAt(i))) {
                a[i] = map.get(pattern.charAt(i));
            }else {
                a[i] = k;
                map.put(pattern.charAt(i),k);
                k++;
            }
        }

        Map<String,Integer> map2 = new HashMap<>();
        int[] a2 = new int[len1];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = 0;
        }
        k = 1;
        for (int i = 0; i < len2; i++) {
            if(map2.containsKey(s1[i])) {
                a2[i] = map2.get(s1[i]);
            }else {
                a2[i] = k;
                map2.put(s1[i],k);
                k++;
            }
            if(a[i] != a2[i]) {
                return false;
            }
        }

        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}