package 剑指Offer.math;

public class last_no_circle {

    /**
     * old：m    m+1 m+2 ....    m-2
     * new：0    1   2   ....    n-2
     *
     * => f(n, m) = (f(n-1, m) + m) % n
     */
    public int lastRemaining(int n, int m) {
        if (n == 1) return 0;
        return (lastRemaining(n - 1, m) + m) % n;
    }

}
