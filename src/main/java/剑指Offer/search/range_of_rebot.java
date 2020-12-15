package 剑指Offer.search;

/**
 * 机器人的运动范围
 */
public class range_of_rebot {

    int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
    boolean[][] v = null;
    public int movingCount(int n, int m, int k) {
        v = new boolean[n][m];
        return dfs(n, m, 0, 0, k);
    }

    private int dfs(int n, int m, int x, int y, int k) {
        if (x < 0 || y < 0 || x >= n || y >= m || sum(x, y) > k || v[x][y]) return 0;
        v[x][y] = true;
        int cnt = 1;
        for (int i = 0; i < 4; i ++) {
            cnt += dfs(n, m, x + dx[i], y + dy[i], k);
        }
        return cnt;
    }

    private int sum(int x, int y) {
        int res = 0;
        while (x > 0) {
            res += x % 10;
            x /= 10;
        }
        while (y > 0) {
            res += y % 10;
            y /= 10;
        }
        return res;
    }

}
