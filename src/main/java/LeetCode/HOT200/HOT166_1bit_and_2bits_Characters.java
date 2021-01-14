package LeetCode.HOT200;

/**
 * @Author cx
 * @Data 2021/1/14 17:27
 */
public class HOT166_1bit_and_2bits_Characters {

    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        if (n == 1) return true;
        for (int i = 0; i < n; ) {
            if (i + 2 > n) {
                return i == n - 1;
            } else {
                if (bits[i] == 1) i += 2;
                else i ++;
            }
        }
        return false;
    }

}
