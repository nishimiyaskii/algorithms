package LeetCode.HOT200;

/**
 * 平方根
 */
public class HOT044_Sqrt {

    public int mySqrt(int x) {
        int l = 0, r = x;
        while (l < r) {
            int mid = l + r + 1 >> 1;
            // mid * mid可能会溢出
            if (mid <= x / mid) l = mid;
            else r = mid - 1;
        }
        return l;
    }

}
