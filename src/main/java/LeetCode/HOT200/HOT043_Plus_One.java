package LeetCode.HOT200;

/**
 * 加一
 */
public class HOT043_Plus_One {

    public int[] plusOne(int[] digits) {
        int carry = 1;
        int n = digits.length;
        for (int i = n - 1; i >= 0; i --) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry <= 0) {
            return digits;
        }
        int[] res = new int[digits.length + 1];
        res[0] = carry;
        System.arraycopy(digits, 0, res, 1, n);
        return res;
    }

}
