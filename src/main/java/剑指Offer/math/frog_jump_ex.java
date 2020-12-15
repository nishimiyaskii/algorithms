package 剑指Offer.math;

/**
 * 青蛙跳台阶进阶版：一次可以跳1-n层
 */
public class frog_jump_ex {

    public int jump(int n) {
        if (n == 1) return 1;
        return jump(n - 1) * 2;
    }

}
