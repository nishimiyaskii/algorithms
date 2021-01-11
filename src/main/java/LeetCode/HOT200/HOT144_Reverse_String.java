package LeetCode.HOT200;

/**
 * 翻转字符串
 * @Author aimerrhythms
 * @Date 2021/1/11 15:49
 */
public class HOT144_Reverse_String {

    public void reverseString(char[] s) {
        if (s.length < 2) return;
        for (int i = 0, j = s.length - 1; i < j; ) {
            swap(s, i ++, j --);
        }
    }

    void swap(char[] arr, int l, int r) {
        char t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }

}
