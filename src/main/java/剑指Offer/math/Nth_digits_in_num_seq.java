package 剑指Offer.math;

/**
 * 数字序列中的第n位（从0开始）
 */
public class Nth_digits_in_num_seq {

    public static void main(String[] args) {
        Nth_digits_in_num_seq t = new Nth_digits_in_num_seq();
        System.out.println(t.digitAtIndex(13));
    }

    /**
        1、确定第n位所处的数字是几位数
        2、确定该数字是几位数的第几个数
        3、确定第n位处于该数字的第几位
     */
    public int digitAtIndex(int n) {
        /*
         * base表示e位数的开始的数，1位数从1开始，2位数从10开始...
         * e表示e位数
         * s表示e位数共有多少个，1位数有9个（先不考虑0），2位数有90个，3位数有900个...
         */
        long base = 1, e = 1, s = 9;
        while (n > s * e) {
            n -= s * e;
            s *= 10;
            e ++;
            base *= 10;
        }
        System.out.println("此时的n表示e位数序列的第n位数字是多少，n = " + n);
        /*
            num表示n位数字是属于哪个数的
            n / e向上取整可以写成：(n + e - 1) / e
            - 1是因为4位数的第372个数 = 1000 + 94 - 1
         */
        long num = base + (n + e - 1) / e - 1;
        System.out.println("num = " + num);
        long k = n % e == 0 ? e : n % e;
        System.out.println("k = " + k);
        for (int i = 0; i < e - k; i ++) num /= 10;
        return (int) (num % 10);
    }
}
