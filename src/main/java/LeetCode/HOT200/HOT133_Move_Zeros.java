package LeetCode.HOT200;

/**
 * 移动零：把数组中的所有 0 移动到数据末端，且非 0 数字顺序不变
 * 原地算法
 *
 * i指向**有效数组**的开头，j遍历数组
 * 当j遇到非0数字的时候，把nums[j]移动到i的位置，然后i++
 *
 * @Author aimerrhythms
 * @Date 2021/1/3 15:23
 */
public class HOT133_Move_Zeros {

    public void moveZeros(int[] nums) {
        int n = nums.length;
        if (n <= 1) return;
        for (int i = 0, j = 0; j < n; j ++) {
            if (nums[j] != 0) {
                int t = nums[i];
                nums[i ++] = nums[j];
                nums[j] = t;
            }
        }
    }

}
