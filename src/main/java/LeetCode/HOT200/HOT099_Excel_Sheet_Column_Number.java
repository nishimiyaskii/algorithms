package LeetCode.HOT200;

/**
 * Excel表列序号
 * @author aimerrhythms
 */
public class HOT099_Excel_Sheet_Column_Number {

    public int titleToNumber(String s) {
        final int P = 26;
        int res = 0;
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            res = res * P + (c - 'A' + 1);
        }
        return res;
    }

}
