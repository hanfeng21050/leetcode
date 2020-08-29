package leetcode.editor.cn;

import java.util.List;

/**
 * KMP算法,
 * 输入两个字符串s1和s2, s1.length > s2.length,判断s2是否是s1的字串,
 * 如果是,返回匹配第一个位置的下标,如果不是,返回-1
 *
 * @Author CoolWind
 * @Date 2020/8/29 21:40
 */

public class KMP {
    public static int subStringMatch(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        int[] next = getNextArray(arr2);
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (j == -1 || arr1[i] == arr2[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }

        if (j == s2.length()) {
            return i - j;
        } else {
            return -1;
        }
    }

    public static int[] getNextArray(char[] t) {
        int[] next = new int[t.length];
        next[0] = -1;
        next[1] = 0;
        int k = 0;

        for (int i = 2; i < t.length; i++) {
            k = next[i - 1];
            while (k != -1) {
                if (t[i - 1] == t[k]) {
                    next[i] = k + 1;
                    break;
                }else {
                    k = next[k];
                }

                next[i] = 0;
            }
        }

        return next;
    }


    public static void main(String[] args) {
        System.out.println(subStringMatch("abcabaabaabcacb", "abaabcac"));
    }
}
