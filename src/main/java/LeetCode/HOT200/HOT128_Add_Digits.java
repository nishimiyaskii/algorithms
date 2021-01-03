package LeetCode.HOT200;

/**
 * 个位相加：数学归纳法证明
 * @Author aimerrhythms
 * @Date 2020/12/31 10:47
 */
public class HOT128_Add_Digits {

    public int addDigits(int num) {
        if (num == 0) return 0;
        num %= 9;
        return num > 0 ? num : 9;
    }

}
