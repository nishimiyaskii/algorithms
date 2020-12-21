package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.List;

/**
 * 插入区间
 */
public class HOT039_Insert_Interval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length < 1) {
            int[][] res = new int[1][];
            res[0] = newInterval;
            return res;
        }
        List<int[]> list = new ArrayList<>();
        int k = 0;
        while (k < intervals.length && intervals[k][1] < newInterval[0]) list.add(intervals[k ++]);

        if (k < intervals.length) {
            newInterval[0] = Math.min(intervals[k][0], newInterval[0]);
            while (k < intervals.length && intervals[k][0] <= newInterval[1]) newInterval[1] = Math.max(newInterval[1], intervals[k ++][1]);
        }
        list.add(newInterval);

        while (k < intervals.length) {
            list.add(intervals[k ++]);
        }

        int[][] res = new int[list.size()][];
        for (int i = 0; i < list.size(); i ++) {
            res[i] = list.get(i);
        }
        return res;
    }

}
