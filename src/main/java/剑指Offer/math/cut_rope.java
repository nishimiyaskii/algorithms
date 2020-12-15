package 剑指Offer.math;

public class cut_rope {

    public int cuttingRope(int n) {
        // 注意特判
        if (n <= 3) return n - 1;
        if (n % 3 == 0) {
            return (int) Math.pow(3, n / 3);
        }
        if (n % 3 == 1) {
            // 1个多余的2
            return 2 * 2 * (int) Math.pow(3, (n - 4) / 3);
        }
        if (n % 3 == 2) {
            // 2个多余的2
            return 2 * (int) Math.pow(3, (n - 2) / 3);
        }
        return 1;
    }

}
