package LeetCode.HOT200;

/**
 * 快乐数
 *      1、n最大为2^31-1,假设n=9*10^9，其实已经大于MAX_VALUE了
 *      2、此时n每一位的平方和是810
 *      3、由此可以判断出，每次求平方和的结果范围在[0, 810]之间
 *      4、即至多操作了812次必定会出现一个换（类似于环形链表）
 *      5、如果此时平方和=1的话，那1一定是环的入口，也是环的结束点，即环内只有1
 *      6、所以可以用环形链表寻找环入口的方法，判断环的入口是不是1
 *
 * @Author aimerrhythms
 * @Date 2020/12/29 8:19
 */
public class HOT109_Happy_Number {

    public boolean isHappy(int n) {
        int slow = n, fast = get(n);
        // 由于一定存在环
        while (slow != fast) {
            slow = get(slow);
            fast = get(get(fast));
        }
        return slow == 1;
    }

    int get(int n) {
        int res = 0;
        while (n > 0) {
            res += (n % 10) * (n % 10);
            n /= 10;
        }
        return res;
    }

}
