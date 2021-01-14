package LeetCode.HOT200;

/**
 * 汉明距离
 * @Author cx
 * @Data 2021/1/14 14:15
 */
public class HOT158_Hamming_Distance {

    public int hammingDistance(int x, int y) {
        int t = x ^ y;
        int res = 0;
        while (t > 0) {
            res += t & 1;
            t >>= 1;
        }
        return res;
    }

}
