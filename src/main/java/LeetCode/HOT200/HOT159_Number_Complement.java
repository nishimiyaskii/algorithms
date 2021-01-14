package LeetCode.HOT200;

/**
 * 数字的补数
 *
 * 疑问：Integer.MAX_VALUE = 2^31-1
 *       为什么Integer.MIN_VALUE = -2^31?
 *
 * @Author cx
 * @Data 2021/1/14 14:18
 */
public class HOT159_Number_Complement {

    public int findComplement(int num) {
        if (num == 0) return 1;
        int cnt = 0;
        for (int x = num; x > 0; x >>= 1) cnt ++;
        // 如num=5,此时cnt=3,那么1<<cnt=8,(1<<cnt)-1是为了将后三位变成1,不考虑前导零
        return ~num & ((1 << cnt) - 1);
    }

}
