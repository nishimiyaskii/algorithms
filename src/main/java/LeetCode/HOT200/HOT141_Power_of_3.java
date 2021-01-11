package LeetCode.HOT200;

/**
 * 3的幂
 * 即return n == 3^x
 *
 * @Author aimerrhythms
 * @Date 2021/1/4 10:46
 */
public class HOT141_Power_of_3 {

    public boolean isPowerOfThree(int n) {
        // % 1是因为double 0.0 == 0返回false
        return n > 0 && (Math.log10(n) / Math.log10(3) % 1 == 0) && (Math.pow(3, 19) % n == 0);
    }

}
