package 剑指Offer.arr_matrix;

/**
 * 构建乘积数组
 */
public class construct_multiply_arr {

    public int[] constructArr(int[] a) {
        if (a.length < 1) return new int[]{};
        int[] b = new int[a.length];
        for (int i = 0, p = 1; i < a.length; i ++) {
            b[i] = p;
            p *= a[i];
        }

        for (int i = a.length - 1, p = 1; i >= 0; i --) {
            b[i] *= p;
            p *= a[i];
        }
        return b;
    }

}
