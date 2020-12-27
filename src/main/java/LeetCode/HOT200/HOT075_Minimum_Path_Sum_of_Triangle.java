package LeetCode.HOT200;

import java.util.List;

/**
 * 三角形最小路径和：从顶->底的最小和
 *
 * dp从下往上考虑，不需要考虑边界
 *
 */
public class HOT075_Minimum_Path_Sum_of_Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; i --) {
            for (int j = 0; j <= i; j ++) {
                int t = triangle.get(i).get(j);
                int min = Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                triangle.get(i).set(j, t + min);
            }
        }
        return triangle.get(0).get(0);
    }

}
