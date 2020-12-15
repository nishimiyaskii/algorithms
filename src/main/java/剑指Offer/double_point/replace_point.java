package 剑指Offer.double_point;

/**
 * 替换空格：双指针算法
 */
public class replace_point {

    public String replaceSpaces(StringBuffer s) {
        if (s.length() < 1) {
            return s.toString();
        }
        int l = s.length() - 1;
        for (int i = 0; i <= l; i ++) {
            if (s.charAt(i) == ' ') {
                s.append("  ");
            }
        }
        int r = s.length() - 1;
        while (l >= 0) {
            char ct = s.charAt(l --);
            if (ct == ' ') {
                s.setCharAt(r --, '0');
                s.setCharAt(r --, '2');
                s.setCharAt(r --, '%');
            } else {
                s.setCharAt(r --, ct);
            }
        }
        return s.toString();
    }

}
