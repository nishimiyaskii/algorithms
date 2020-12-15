package 剑指Offer.search;

/**
 * 二维平面搜索单词
 */
public class search_word_in_2D_board {

    int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
    public boolean exist(char[][] board, String word) {
        if ("".equals(word)) return false;
        for (int x = 0; x < board.length; x ++) {
            for (int y = 0; y < board[0].length; y ++) {
                if (dfs(board, x, y, word, 0)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int x, int y, String word, int k) {
        char c = board[x][y];
        if (c != word.charAt(k)) return false;
        if (k + 1 == word.length()) return true;
        board[x][y] = '*';
        for (int i = 0; i < 4; i ++) {
            int nx = x + dx[i], ny = y + dy[i];
            if (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length && board[nx][ny] != '*') {
                if (dfs(board, nx, ny, word, k + 1)) return true;
            }
        }
        board[x][y] = c;
        return false;
    }

}
