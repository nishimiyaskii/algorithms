package LeetCode.HOT200;

/**
 * 整数翻转
 */
public class HOT006_Reverse_Integer {

    public static void main(String[] args) {
        System.out.println(new HOT006_Reverse_Integer().reverse(-123));
    }

    public int reverse(int x) {
        if (x > -10 && x < 10) return x;
        int res = 0;
        // MIN <= res * 10 + x % 10 <= MAX
        while (x != 0) {
            // 也可以用互斥条件考虑
            // if (res > 0 && res > (Integer.MAX_VALUE - x % 10) / 10 || res < 0 && res < (Integer.MIN_VALUE - x % 10) / 10) return 0;
            if (res >= Integer.MIN_VALUE / 10 - x % 10 / 10 && res <= Integer.MAX_VALUE / 10 - x % 10 / 10) {
                res = res * 10 + x % 10;
            } else return 0;
            x /= 10;
        }
        return res;
    }

}
