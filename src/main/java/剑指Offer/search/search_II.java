package 剑指Offer.search;

/**
 * 排序数组中查找1 ~ n-1中缺失的数字
 */
public class search_II {

    public static void main(String[] args) {
        // 长度为1，n=2，所以缺失1
        new search_II().missingNumber(new int[]{0});
    }

    public int missingNumber(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (arr[mid] == mid) l = l + 1;
            else r = mid;
        }
        // 如果全是蓝色的话
        if (arr[r] == r) r ++;
        return r;
    }

}
