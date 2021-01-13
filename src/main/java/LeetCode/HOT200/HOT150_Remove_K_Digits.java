package LeetCode.HOT200;

/**
 * 移除k位数字：贪心
 * @Author cx
 * @Data 2021/1/13 13:58
 */
public class HOT150_Remove_K_Digits {

    public String removeKDigits(String s, int k) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i ++) {
            while (k > 0 && res.length() > 0 && res.charAt(res.length() - 1) > s.charAt(i)) {
                k --;
                res.deleteCharAt(res.length() - 1);
            }
            res.append(s.charAt(i));
        }
        while (k -- > 0) res.deleteCharAt(res.length() - 1);
        int u = 0;
        while (u < res.length() && res.charAt(u) == '0') u ++;
        if (u == res.length()) return "0";
        return res.substring(u);
    }

}
