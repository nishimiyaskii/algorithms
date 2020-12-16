package 剑指Offer.math;

/**
 * 语法题做累加
 */
public class add_using_grammar {

    public int addNums(int n) {
        int res = n;
        boolean flag = n > 0 && (res += addNums(n - 1)) > 0;
        return res;
    }

}
