package LeetCode.HOT200;

/**
 * 单词搜索
 */
public class HOT049_Word_Search {

    int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < board[0].length; j ++) {
                if (backtracking(board, i, j, word, 0)) return true;
            }
        }
        return false;
    }

    boolean backtracking(char[][] board, int x, int y, String word, int u) {
        char c = board[x][y];
        // 搜到当前位置，如果字母不匹配，直接返回false;否则如果当前是单词的最后一个字母，则说明搜索成功
        if (c != word.charAt(u)) return false;
        if (u == word.length() - 1) return true;
        board[x][y] = '*';
        for (int i = 0; i < 4; i ++) {
            int nx = x + dx[i], ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < board.length && ny < board[0].length && board[nx][ny] != '*' && backtracking(board, nx, ny, word, u + 1)) return true;
        }
        board[x][y] = c;
        return false;
    }

}
