package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 电话号码的字母
 */
public class HOT012_Letter_Combinations_of_a_Phone_Number {

    List<String> res = new ArrayList<>();
    StringBuilder path = new StringBuilder();

    Map<Character, String> map = new HashMap<Character, String>(){{
        put('2', "abc"); put('3', "def");
        put('4', "ghi"); put('5', "jkl"); put('6', "mno");
        put('7', "pqrs"); put('8', "tuv"); put('9', "wxyz");
    }};

    public List<String> letterCombinations(String digits) {
        if ("".equals(digits)) return res;
        backTracking(digits, 0);
        return res;
    }

    private void backTracking(String digits, int u) {
        if (u == digits.length()) {
            res.add(path.toString());
        } else {
            String letters = map.get(digits.charAt(u));
            for (int i = 0; i < letters.length(); i ++) {
                path.append(letters.charAt(i));
                backTracking(digits, u + 1);
                path.deleteCharAt(path.length() - 1);
            }
        }
    }

}
