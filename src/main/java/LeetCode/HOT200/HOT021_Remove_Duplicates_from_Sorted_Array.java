package LeetCode.HOT200;

/**
 * 删除排序数组的重复项：每个元素只留一个，并且原地算法，最后返回新的长度
 */
public class HOT021_Remove_Duplicates_from_Sorted_Array {

    /**
     * 总的思路就是：两个指针，k是新数组的指针，i是老数组的指针
     */
    public int removeDuplicates(int[] arr) {
        if (arr.length < 1) return 0;
        int k = 0;
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] != arr[k]) arr[++ k] = arr[i];
        }
        return k + 1;
    }


}
