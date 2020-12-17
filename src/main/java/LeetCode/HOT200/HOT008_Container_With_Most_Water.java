package LeetCode.HOT200;

/**
 * 盛水最多的容器
 */
public class HOT008_Container_With_Most_Water {

    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, res = 0;
        while (l < r) {
            res = Math.max(res, (r - l) * Math.min(height[l], height[r]));
            if (height[l] < height[r]) l ++;
            else r --;
        }
        return res;
    }

}
