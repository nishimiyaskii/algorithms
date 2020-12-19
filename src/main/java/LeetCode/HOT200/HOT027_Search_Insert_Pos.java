package LeetCode.HOT200;

/**
 * 搜索插入位置
 */
public class HOT027_Search_Insert_Pos {

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,6};
        System.out.println(new HOT027_Search_Insert_Pos().searchInsert(arr, 2));
    }

    /**
     * 1 3 4 6 插入2
     * 1 2 3 4 6
     *  实际上，就是从左逼近虚拟2
     */
    public int searchInsert(int[] arr, int t) {
        if (arr[0] >= t) return 0;
        if (arr[arr.length - 1] < t) return arr.length;
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (arr[mid] < t) l = mid + 1;
            else r = mid;
        }
        return l;
    }

}
