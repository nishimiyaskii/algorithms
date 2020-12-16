package LeetCode.HOT200;

/**
 * 最长回文串
 */
public class HOT005_Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        if ("".equals(s)) return s;
        String res = "";
        for (int i = 0; i < s.length(); i ++) {
            int l = i - 1, r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                l --;
                r ++;
            }
            res = res.length() < r - l - 1 ? s.substring(l + 1, r) : res;
        }
        for (int i = 0; i < s.length(); i ++) {
            int l = i, r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                l --;
                r ++;
            }
            res = res.length() < r - l - 1 ? s.substring(l + 1, r) : res;
        }
        return res;
    }
}
