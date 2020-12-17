package LeetCode.HOT200;

/**
 * 回文数：不要转成字符串做
 */
public class HOT007_Palindrome_Number {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        long t = reverse(x);
        if (t > Integer.MAX_VALUE) return false;
        return t == x;
    }

    private long reverse(int x) {
        long res = 0;
        while (x > 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res;
    }

}
