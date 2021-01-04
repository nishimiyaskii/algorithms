package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 超级丑数：
 * @Author aimerrhythms
 * @Date 2021/1/4 10:01
 */
public class HOT139_Super_Ugly_Number {

    public int nthSuperUglyNumber(int n, int[] primes) {
        if (n == 0) return 0;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int[] k = new int[primes.length];
        int[] t = new int[primes.length];
        while (-- n != 0) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < primes.length; i ++) {
                t[i] = list.get(k[i]) * primes[i];
                min = Math.min(min, t[i]);
            }
            list.add(min);
            for (int i = 0; i < primes.length; i ++) {
                if (min == t[i]) k[i] += 1;
            }
        }
        return list.get(list.size() - 1);
    }

    public int nthSuperUglyNumber2(int n, int[] primes) {
        if (n == 0) return 0;
        int k = primes.length;
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int x : primes) heap.offer(new int[]{x, 0});
        for (int i = 1; i < n; ) {
            int[] t = heap.poll();
            if (t[0] != list.get(i - 1)) {
                list.add(t[0]);
                i ++;
            }
            int index = t[1], prime = t[0] / list.get(index);
            heap.offer(new int[]{prime * list.get(index + 1), index + 1});
        }
        return list.get(n - 1);
    }

}
