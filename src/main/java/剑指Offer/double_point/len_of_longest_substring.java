package 剑指Offer.double_point;

import java.util.HashMap;

/**
 * 最长无重复子串的长度
 */
public class len_of_longest_substring {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> cnt = new HashMap<>();
        int res = 0;
        for (int l = 0, r = 0; r < s.length(); r ++) {
            char c = s.charAt(r);
            if (!cnt.containsKey(c) || cnt.get(c) < 1) {
                cnt.put(c, 1);
            } else {
                cnt.put(c, cnt.get(c) + 1);
            }
            if (cnt.get(c) > 1) {
                while (cnt.get(s.charAt(l)) == 1) {
                    cnt.put(s.charAt(l), cnt.get(s.charAt(l)) - 1);
                    l ++;
                }
                cnt.put(s.charAt(l), cnt.get(s.charAt(l)) - 1);
                l ++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

}
