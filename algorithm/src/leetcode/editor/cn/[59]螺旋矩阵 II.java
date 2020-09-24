package leetcode.editor.cn;
import leetcode.editor.node.*;
class question_59{
//给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。 
//
// 示例: 
//
// 输入: 3
//输出:
//[
// [ 1, 2, 3 ],
// [ 8, 9, 4 ],
// [ 7, 6, 5 ]
//] 
// Related Topics 数组 
// 👍 241 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] visited = new int[n][n];
        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] res = new int[n][n];
        int x = 0;
        int y = 0;
        int k = 0;

        for(int i = 0; i < n*n; i++) {
            res[x][y] = i+1;
            visited[x][y] = 1;

            int nextX = directions[k][0] + x;
            int nextY = directions[k][1] + y;

            if(nextX < 0 || nextX >=n || nextY < 0 || nextY >=n || visited[nextX][nextY] == 1) {
                k = (k + 1) % 4;
            }

            x += directions[k][0];
            y += directions[k][1];
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}