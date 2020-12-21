package LeetCode.HOT200;

/**
 * 快速幂
 */
public class HOT034_Fast_Pow {

    public double myPow(double x, int n) {
        double res = 1.0;
        if (n == 0) return res;
        boolean v = n < 0;
        for (long k = Math.abs((long) n); k > 0; k >>>= 1) {
            if ((k & 1) == 1) res *= x;
            x *= x;
        }
        return v ? 1 / res : res;
    }

}
