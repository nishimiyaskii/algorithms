package 剑指Offer.others;

import java.util.ArrayList;
import java.util.List;

/**
 * 第n个丑数
 */
public class nth_ugly_num {

    public int nthUglyNumber(int n) {
        int i = 0, j = 0, k = 0;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        while (-- n != 0) {
            int x = list.get(i) * 2, y = list.get(j) * 3, z = list.get(k) * 5;
            int t = Math.min(x, Math.min(y, z));
            list.add(t);
            if (t == x) i ++;
            if (t == y) j ++;
            if (t == z) k ++;
        }
        return list.get(list.size() - 1);
    }

}
