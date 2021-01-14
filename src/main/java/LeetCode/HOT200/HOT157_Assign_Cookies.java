package LeetCode.HOT200;

import java.util.Arrays;

/**
 * @Author cx
 * @Data 2021/1/14 14:06
 */
public class HOT157_Assign_Cookies {

    /*
        思路：
            1、首先猜测：要优先满足胃口小的朋友
            2、证明：假设集合A是所有可分配的方案的集合，
                     B是只满足胃口最小的若干小朋友的方案集合
                     假设最优方案k是满足了i,2,3,j,5,k,7,8这么几位小朋友
                     那么改方案一定可以修改成满足i,j,k,4,5,6,7,8这种方案
                     即所有方案都可以修改成B中的结果，
         所以，算法只需要考虑优先满足最小胃口的小朋友即可
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); Arrays.sort(s);
        int cnt = 0;
        // 代码未简化
//        for (int i = 0, j = 0; i < g.length && j < s.length; ) {
//            if (g[i] <= s[j]) {
//                cnt ++;
//                i ++;
//                j ++;
//            } else j ++;
//        }

        // 代码简化
        for (int i = 0, j = 0; i < g.length && j < s.length; j ++) {
            if (g[i] <= s[j]) {
                cnt++;
                i++;
            }
        }
        return cnt;
    }

}
