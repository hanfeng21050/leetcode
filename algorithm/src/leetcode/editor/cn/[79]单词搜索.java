package leetcode.editor.cn;

class question_79{
//给定一个二维网格和一个单词，找出该单词是否存在于网格中。 
//
// 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。 
//
// 
//
// 示例: 
//
// board =
//[
//  ['A','B','C','E'],
//  ['S','F','C','S'],
//  ['A','D','E','E']
//]
//
//给定 word = "ABCCED", 返回 true
//给定 word = "SEE", 返回 true
//给定 word = "ABCB", 返回 false 
//
// 
//
// 提示： 
//
// 
// board 和 word 中只包含大写和小写英文字母。 
// 1 <= board.length <= 200 
// 1 <= board[i].length <= 200 
// 1 <= word.length <= 10^3 
// 
// Related Topics 数组 回溯算法 
// 👍 592 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean exist(char[][] board, String word) {

        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = check(board, visited, i, j, word, 0);
                if(flag){
                    return true;
                }
            }
        }

        return false;
    }


    public boolean check(char[][] board, boolean[][] visited, int i, int j, String word, int k) {
        if (board[i][j] != word.charAt(k)) {
            return false;
        }else if(k == word.length() -1) {
            return true;
        }

        visited[i][j] = true;
        int [][] directions = {{0,1},{0,-1},{1,0},{-1,0}};

        boolean result = false;
        for (int[] direction : directions) {
            int newi = i + direction[0];
            int newj = j + direction[1];

            if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length) {
                if(!visited[newi][newj]) {
                    boolean flag = check(board, visited, newi, newj, word, k+1);
                    if (flag) {
                        result = true;
                        break;
                    }
                }
            }
        }

        visited[i][j] = false;
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}