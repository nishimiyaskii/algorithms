package LeetCode.HOT200;

import java.util.HashSet;

/**
 * @Author cx
 * @Data 2021/1/14 15:46
 */
public class HOT161_Distribute_Candies {

    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : candyType) set.add(x);
        return Math.min(candyType.length / 2, set.size());
    }

}
