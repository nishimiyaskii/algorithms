package LeetCode.HOT200;

/**
 * 在排序数组中找出指定元素的起始和终止位置
 */
public class HOT026_Find_1st_and_Last_Pos_of_Element_in_Sorted_Array {

    public int[] searchRange(int[] arr, int t) {
        if (arr.length < 1) return new int[]{-1, -1};
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (arr[mid] < t) l = mid + 1;
            else r = mid;
        }
        if (arr[l] != t) return new int[]{-1, -1};
        int[] res = new int[2];
        res[0] = l;
        l = 0; r = arr.length - 1;
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (arr[mid] > t) r = mid - 1;
            else l = mid;
        }
        res[1] = l;
        return res;
    }

}
