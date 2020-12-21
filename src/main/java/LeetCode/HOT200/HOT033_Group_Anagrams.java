package LeetCode.HOT200;

import java.util.*;

/**
 * 字母异位词分组
 */
public class HOT033_Group_Anagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        if (strs.length < 1) return res;
        for (String str : strs) {
            String key = sort(str);
            if (map.containsKey(key)) {
                List<String> list = map.get(key);
                list.add(str);
            } else {
                map.put(key, new ArrayList<String>(){{add(str);}});
            }
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            res.add(map.get(key));
        }
        return res;
    }

    String sort(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        StringBuilder res = new StringBuilder();
        for (char c : charArr) {
            res.append(c);
        }
        return res.toString();
    }

}
