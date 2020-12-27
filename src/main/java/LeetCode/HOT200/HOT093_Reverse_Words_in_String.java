package LeetCode.HOT200;

/**
 * 翻转字符串的单词
 * @author aimerrhythms
 */
public class HOT093_Reverse_Words_in_String {

    public String reverseWords(String _s) {
        StringBuilder s = new StringBuilder(_s.trim());
        s.reverse();
        final char SPACE = ' ';
        for (int l = 0, r = 0; r < s.length(); ) {
            while (r < s.length() && s.charAt(r) != SPACE) {
                r ++;
            }
            for (int i = l, j = r - 1; i < j; i ++, j --) {
                char c = s.charAt(i);
                s.setCharAt(i, s.charAt(j));
                s.setCharAt(j, c);
            }
            int j = r;
            while (j < s.length() && s.charAt(j) == SPACE) {
                j ++;
            }
            if (j - r > 1) {
                for (int i = r + 1; i < j; i ++) {
                    // 注意这个地方，每次删除后其实下标都改变了，所以应该删除r+1的位置
                    s.deleteCharAt(r + 1);
                }
            }
            l = ++ r;
        }
        return s.toString();
    }

}
