package 剑指Offer.others;

public class reverse_words {

    public static void main(String[] args) {
        reverse_words t = new reverse_words();
        System.out.println(t.reverseWords("a good   example"));
    }

    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder(s.trim());
        if (res.length() < 1) return "";
        res.reverse();
        for (int l = 0, r = 0; r < res.length();) {
            while (r < res.length() && res.charAt(r) != ' ') r ++;
            for (int i = l, j = r - 1; i < j; ) swap(res, i ++, j --);
            int j = r;
            while (j < res.length() && res.charAt(j) == ' ') j ++;
            if (j != r + 1) {
                // 多个空格，只留1个
                for (int i = r; i < j - 1; i ++) res.deleteCharAt(i);
            }
            l = ++ r;
        }
        return res.toString();
    }

    void swap(StringBuilder sb, int l, int r) {
        char c = sb.charAt(l);
        sb.setCharAt(l, sb.charAt(r));
        sb.setCharAt(r, c);
    }

}