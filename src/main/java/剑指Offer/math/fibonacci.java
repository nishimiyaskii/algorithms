package 剑指Offer.math;

// 青蛙跳台阶（1层或2层）、矩形填充的本质都是fibonacci
public class fibonacci {

    /*
        F(0) = 0; F(1) = 1
     */
    public int fib(int n) {
        if (n < 2) return n;
        int prev = 0, curr = 1;
        for (int i = 2; i <= n; i ++) {
            int t = (prev + curr) % 1000000007;
            prev = curr;
            curr = t;
        }
        return curr;
    }

}
