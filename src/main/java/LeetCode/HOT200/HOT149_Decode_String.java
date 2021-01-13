package LeetCode.HOT200;

/**
 * 字符串解码
 * @Author cx
 * @Data 2021/1/13 13:14
 */
public class HOT149_Decode_String {

    int u = 0;

    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        while (u < s.length() && s.charAt(u) != ']') {
            if (Character.isAlphabetic(s.charAt(u))) res.append(s.charAt(u ++));
            else if (Character.isDigit(s.charAt(u))) {
                int k = u, x = 0;
                while (k < s.length() && Character.isDigit(s.charAt(k))) {
                    x = x * 10 + (s.charAt(k ++) - '0');
                }
                u = k + 1;
                String t = decodeString(s);
                u ++;
                while (x -- > 0) {
                    res.append(t);
                }
            }
        }
        return res.toString();
    }

}
