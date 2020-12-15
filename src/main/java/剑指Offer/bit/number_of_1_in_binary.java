package 剑指Offer.bit;

public class number_of_1_in_binary {

    public int hammingWeight(int n) {
        // Integer.bitCount(n);
        int res = 0;
        while (n != 0) {
            res += (n & 1);
            n >>>= 1;
        }
        return res;
    }

}
