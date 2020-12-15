package 剑指Offer.math;

/**
 * 数组的众数
 */
public class majority_element {

    /*
        众数一定存在的情况下，摩尔投票法
     */
    public int majorityElement(int[] arr) {
        int votes = 0, n = 0;
        for (int a : arr) {
            if (votes == 0) {
                votes ++;
                n = a;
            } else {
                votes += n == a ? 1 : -1;
            }
        }
        return n;
    }

}
