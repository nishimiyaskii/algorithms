package LeetCode.HOT200;

import java.util.HashMap;

/**
 * 最长无重复字符子串
 */
public class HOT003_Longest_Substring_Without_Repeating_Characters {

    public int lengthOfLongestSubstring(String s) {
        /*
        // key：字符串 value：字符出现的次数
        HashMap<Character, Integer> cnt = new HashMap<>();
        int res = 0;
        for (int l = 0, r = 0; r < s.length(); ) {
            char cr = s.charAt(r ++);
            cnt.put(cr, cnt.containsKey(cr) ? cnt.get(cr) + 1 : 1);
            if (cnt.get(cr) > 1) {
                while (l < r && cnt.get(s.charAt(l)) == 1) {
                    cnt.put(s.charAt(l), cnt.get(s.charAt(l++)) - 1);
                }
                cnt.put(s.charAt(l), cnt.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(r - l, res);
        }
        return res;
        */
        // key：字符 value：不重复子串的起始位置
        int res = 0;
        if ("".equals(s)) return res;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int l = 0, r = 0; r < s.length(); r ++) {
            char cr = s.charAt(r);
            if (map.containsKey(cr)) {
                l = Math.max(l, map.get(cr) + 1);
            }
            map.put(cr, r);
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

}
