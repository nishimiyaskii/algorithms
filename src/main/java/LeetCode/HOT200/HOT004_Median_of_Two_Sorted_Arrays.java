package LeetCode.HOT200;

/**
 * 俩个有序数组的中位数
 *
 * nums1：|_________k/2___________|   len = n
 * nums2：|____________k/2_______________|   len = m
 *
 * 1、如果nums1[k/2] > nums2[k/2]的话，说明nums2[k/2]及前面的数可以插在nums1[k/2]之前
 *      即第k个数不可能出现在nums2[k/2]及其之前的，所以可以删除这部分
 * 2、如果nums1[k/2] < nums2[k/2]，同理可得，能够删除nums1中前k/2个数
 * 3、如果nums1[k/2] == nums2[k/2]，说明它们就是第k个数
 *
 * 边界情况：1、如果k==1，说明只需要取两个数组的开头最小的那一个
 *          2、由于k=(n+m)/2，如果递归过程中，某个数组有效长度较短，即k/2>=n，
 *             那么只需要从另一个数组中找到第k个元素即可
 *             为了方便，总将第一个数组设置成长度较短的那个（两个数组不可能同时越界，只可能是较短的那个先越界）
 *
 *
 */
public class HOT004_Median_of_Two_Sorted_Arrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int tot = nums1.length + nums2.length;
        if ((tot & 1) == 1) return (double) find(nums1, 0, nums2, 0, tot / 2 + 1);
        else return (find(nums1, 0, nums2, 0, tot / 2) + find(nums1, 0, nums2, 0, tot / 2 + 1)) / 2.0;
    }

    int find(int[] nums1, int i, int[] nums2, int j, int k) {
        if (nums1.length - i > nums2.length - j) return find(nums2, j, nums1, i, k);
        if (k == 1) {
            if (i == nums1.length) return nums2[j];
            else return Math.min(nums1[i], nums2[j]);
        }
        if (i == nums1.length) {
            return nums2[j + k - 1];
        }
        int si = Math.min(nums1.length - 1, i + k / 2 - 1), sj = j + k / 2 - 1;
        if (nums1[si] > nums2[sj]) {
            return find(nums1, i, nums2, sj + 1, k - (sj - j + 1));
        } else {
            return find(nums1, si + 1, nums2, j, k - (si - i + 1));
        }
    }
}

