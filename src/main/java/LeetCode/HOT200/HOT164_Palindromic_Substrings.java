package LeetCode.HOT200;

/**
 * @Author cx
 * @Data 2021/1/14 17:00
 */
public class HOT164_Palindromic_Substrings {

    int res = 0;

    public int countSubstrings(String s) {
        int n = s.length();
        for (int i = 0; i < n; i ++) {
            count(s, i, i);
            count(s, i, i + 1);
        }
        return res;
    }

    void count(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l --; r ++; res ++;
        }
    }

}
