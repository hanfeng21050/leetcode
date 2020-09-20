package leetcode.editor.cn;

/**
 * @Author CoolWind
 * @Date 2020/9/15 22:56
 */
public final class Test {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }


    public static int[] getNext(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int[] next = new int[len];
        next[0] = -1;
        int j = 0;
        int k = -1;

        while (j < len - 1) {
            if (k == -1 || chars[j] == chars[k]) {
                ++j;
                ++k;
                next[j] = k;
            } else {
                k = next[k];
            }
        }

        return next;
    }
}
