package 剑指Offer.bit;

/**
 * 快速幂
 */
public class fast_pow {

    public double myPow(double x, int n) {
        double res = 1.0;
        if (n == 0) return res;
        boolean neg = n < 0;
        for (long k = Math.abs((long) n); k > 0; k >>>= 1) {
            if ((k & 1) == 1) res *= x;
            x *= x;
        }
        return neg ? 1 / res : res;
    }

}
