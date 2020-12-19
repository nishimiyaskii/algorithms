package LeetCode.HOT200;

import java.util.Arrays;

/**
 * 下一个排列
 * 思路：
 *  1、如果数组整个是降序的，则直接全部翻转就行了
 *  2、求的是下一个排列，且字典序最小的那个，字典序最小也就是数值尽可能的小
 *      所以尽可能只移动后面的，不变前面的
 *  3、从后往前考虑时，如果arr[i]以i++后面的序列是降序，则i及以后的数都不用考虑了，因为降序的话，数值已经是最大了，不可能变得更大了
 *  4、所以必须找到最后一个降序点的前一个点，及最大降序点需要是一个拐点。
 *  5、之后需要的操作就是拐点的左边只要修改成大一、、的数，然后把拐点及以后的序列修改成降序的即可
 */
public class HOT024_Next_Permutation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 1};
        new HOT024_Next_Permutation().nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void nextPermutation(int[] arr) {
        if (arr.length < 2) return;
        int k = arr.length - 2;
        while (k >= 0 && arr[k] >= arr[k + 1]) k --;
        if (k < 0) {
            reverse(arr, 0, arr.length - 1);
            return;
        }
        int m = k + 1;
        while (m < arr.length && arr[m] > arr[k]) m ++;
        swap(arr, k, m - 1);
        reverse(arr, k + 1, arr.length - 1);
    }

    private void reverse(int[] arr, int l, int r) {
        while (l < r) swap(arr, l ++, r --);
    }

    void swap(int[] arr, int l, int r) {
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }

}
