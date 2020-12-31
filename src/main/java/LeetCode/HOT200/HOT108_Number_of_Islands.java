package LeetCode.HOT200;

/**
 * 岛屿数量
 * @Author aimerrhythms
 * @Date 2020/12/29 8:11
 */
public class HOT108_Number_of_Islands {

    int res = 0, m = 0, n = 0;

    int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};

    public int numIslands(char[][] grid) {
        n = grid.length; m = grid[0].length;
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j ++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    res ++;
                }
            }
        }
        return res;
    }

    void dfs(char[][] grid, int x, int y) {
        if (grid[x][y] == '0') return;
        grid[x][y] = '0';
        for (int i = 0; i < 4; i ++) {
            int nx = x + dx[i], ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < n && ny < m && grid[nx][ny] == '1') dfs(grid, nx, ny);
        }
    }

}
