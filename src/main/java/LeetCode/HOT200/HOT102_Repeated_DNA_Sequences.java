package LeetCode.HOT200;

import java.util.*;

/**
 * 重复的DNA序列
 * @author aimerrhythms
 */
public class HOT102_Repeated_DNA_Sequences {

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() < 10) return res;
        HashMap<String, Integer> cnt = new HashMap<>();
        for (int i = 0; i + 10 <= s.length(); i ++) {
            String dna = s.substring(i, i + 10);
            if (cnt.containsKey(dna)) {
                int n = cnt.get(dna);
                cnt.put(dna, ++ n);
            } else {
                cnt.put(dna, 1);
            }
        }
        cnt.forEach((key, value) -> {
            if (value > 1) res.add(key);
        });
        return res;
    }

}
