package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角I：返回n层的杨辉三角
 */
public class HOT073_Pascals_Triangle {


    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> generate(int n) {
        if (n < 1) return res;
        res.add(new ArrayList<Integer>() {{add(1);}});
        for (int i = 2; i <= n; i ++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 1; j < i - 1; j ++) {
                int num = res.get(i - 2).get(j - 1) + res.get(i - 2).get(j);
                list.add(num);
            }
            list.add(1);
            res.add(list);
        }
        return res;
    }

}
