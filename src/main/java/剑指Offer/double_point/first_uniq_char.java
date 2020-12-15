package 剑指Offer.double_point;

/**
 * 第一个只出现一次的字符
 */
public class first_uniq_char {

    public char firstUniqChar(String s) {
        if ("".equals(s)) return ' ';
        int k = s.length();
        for (char c = 'a'; c <= 'z'; c ++) {
            int i = s.indexOf(c);
            if (i >= 0 && i == s.lastIndexOf(c) && k > i) k = i;
        }
        return k == s.length() ? ' ' : s.charAt(k);
    }

}
