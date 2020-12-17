package LeetCode.HOT200;

public class HOT009_Longest_Common_Prefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) return "";
        return merge(strs, 0, strs.length - 1);
    }

    String merge(String[] strs, int l, int r) {
        if (l == r) return strs[l];
        int mid = l + r >> 1;
        String s1 = merge(strs, l, mid), s2 = merge(strs, mid + 1, r);
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length() && s1.charAt(i) == s2.charAt(j)) {
            i ++;
            j ++;
        }
        return s1.substring(0, i);
    }

}
