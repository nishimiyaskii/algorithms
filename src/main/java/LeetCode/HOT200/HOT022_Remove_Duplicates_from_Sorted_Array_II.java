package LeetCode.HOT200;

/**
 * 排序数组删除重复元素：最多重复两次
 */
public class HOT022_Remove_Duplicates_from_Sorted_Array_II {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int n = new HOT022_Remove_Duplicates_from_Sorted_Array_II().removeDuplicates(arr);
        System.out.println(n);
        for (int i = 0; i < n; i ++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public int removeDuplicates(int[] arr) {
        if (arr.length < 3) return arr.length;
        int k = 1;
        for (int i = 2; i < arr.length; i ++) {
            if (arr[i] != arr[k - 1]) {
                arr[++ k] = arr[i];
            }
        }
        return k + 1;
    }

}
