package LeetCode.HOT200;

/**
 * 字符串相加
 * @Author cx
 * @Data 2021/1/13 15:51
 */
public class HOT152_Add_Strings {

    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int t = 0, i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j >= 0) {
            t += (i >= 0 ? num1.charAt(i --) - '0' : 0) + (j >= 0 ? num2.charAt(j --) - '0' : 0);
            res.append(t % 10);
            t /= 10;
        }
        if (t > 0) res.append(t);
        res.reverse();
        return res.toString();
    }

}
