package LeetCode.HOT200;

/**
 * 验证回文串：只考虑数字和字母，不考虑空格、标点符号等
 */
public class HOT082_Valid_Palindrome {

    public boolean isPalindrome(String s) {
        if (s.length() < 2) return true;
        s = s.toLowerCase();
        for (int l = 0, r = s.length() - 1; l < r; l ++, r --) {
            while (l < r && isValidChar(s.charAt(l))) l ++;
            while (l < r && isValidChar(s.charAt(r))) r --;
            if (l < r && s.charAt(l) != s.charAt(r)) return false;
        }
        return true;
    }

    private boolean isValidChar(char c) {
        return (c < 'a' || c > 'z') && (c < '0' || c > '9');
    }

}
