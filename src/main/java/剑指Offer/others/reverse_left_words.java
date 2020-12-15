package 剑指Offer.others;

/**
 * 左旋转字符串
 */
public class reverse_left_words {

    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

}
