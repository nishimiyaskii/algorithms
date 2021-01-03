package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.List;

/**
 * 丑数II：求第n个丑数
 * @Author aimerrhythms
 * @Date 2020/12/31 10:57
 */
public class HOT130_Ugly_Number_II {

    public int nthUglyNumber(int n) {
        List<Integer> uglySeq = new ArrayList<>();
        uglySeq.add(1);
        int i = 1, j = 1, k = 1;
        while (-- n > 0) {
            int a = uglySeq.get(i) * 2, b = uglySeq.get(j) * 3, c = uglySeq.get(k) * 5;
            int t = Math.min(a, Math.min(b, c));
            uglySeq.add(t);
            if (t == a) i ++;
            if (t == b) j ++;
            if (t == c) k ++;
        }
        return uglySeq.get(uglySeq.size() - 1);
    }

}
