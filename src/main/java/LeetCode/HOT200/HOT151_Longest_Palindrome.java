package LeetCode.HOT200;

import java.util.HashMap;

/**
 * 最长回文串
 *
 *  使用给定的字符串组成最长的回文串
 *
 * @Author cx
 * @Data 2021/1/13 15:22
 */
public class HOT151_Longest_Palindrome {

    public int longestPalindrome(String s) {
        int n = s.length();
        HashMap<Character, Integer> cnt = new HashMap<>();
        for (int i = 0; i < n; i ++) {
            char c = s.charAt(i);
            cnt.put(c, cnt.containsKey(c) ? cnt.get(c) + 1 : 1);
        }
        int res = 0;
        for (char key : cnt.keySet()) {
            res += cnt.get(key) / 2 * 2;
        }
        if (res < n) res ++;
        return res;
    }

}
