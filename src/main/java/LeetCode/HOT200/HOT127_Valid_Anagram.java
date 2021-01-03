package LeetCode.HOT200;

import java.util.HashMap;

/**
 * 有效的字母异位词
 *
 *  1、两个map
 *  2、用数组模拟map：因为都是小写字母，所以需要26长度的数组
 * @Author aimerrhythms
 * @Date 2020/12/31 10:36
 */
public class HOT127_Valid_Anagram {

    HashMap<Character, Integer> a = new HashMap<>(), b = new HashMap<>();

    public boolean isAnagram(String s, String t) {
        int sn = s.length(), tn = t.length();
        if (sn != tn) {
            return false;
        }
        for (int i = 0; i < sn; i ++) {
            char c = s.charAt(i);
            if (a.containsKey(c)) {
                a.put(c, a.get(c) + 1);
            } else {
                a.put(c, 1);
            }
        }
        for (int i = 0; i < tn; i ++) {
            char c = t.charAt(i);
            if (b.containsKey(c)) {
                b.put(c, b.get(c) + 1);
            } else {
                b.put(c, 1);
            }
        }
//        System.out.println(a);
//        System.out.println(b);
        return a.equals(b);
    }

    public boolean isAnagram2(String s, String t) {
        int sn = s.length(), tn = t.length();
        if (sn != tn) return false;
        int[] cnt = new int[26];
        for (int i = 0; i < sn; i ++) {
            cnt[s.charAt(i) - 'a'] ++;
        }
        for (int i = 0; i < tn; i ++) {
            if (-- cnt[t.charAt(i) - 'a'] < 0) return false;
        }
        return true;
    }

}
