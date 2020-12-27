package LeetCode.HOT200;

import java.util.LinkedList;
import java.util.List;

/**
 * 最小栈
 * @author aimerrhythms
 */
public class HOT095_Min_Stack {

    public static void main(String[] args) {
        MonotonicStack stk = new HOT095_Min_Stack().new MonotonicStack();
        System.out.println(stk.monotonicStack(new int[]{10, 3, 7, 4, 12}));
        /*
        Scanner cin = new Scanner(System.in);
        int i = 1;
        while (i == 1) {
            String[] s = cin.nextLine().split(" ");
            switch(s[0]) {
                case "push":
                    stk.push(Integer.parseInt(s[1]));
                    break;
                case "pop":
                    stk.pop();
                    break;
                case "top":
                    System.out.println(stk.top());
                    break;
                case "min":
                    System.out.println(stk.min);
                    break;
                default:
                    i = 0;
            }
        }
        */
    }

    /**
     * 最小栈：考虑不用额外空间的做法（也存在优化常数空间的算法）
     *      动态维护一个数组f，f[i]表示加入第i个数后，前i个数的最小值
     *      当来了第i+1个数的时候，f[i+1] = Math.min(f[i], nums[i])
     *
     * 在考虑O(1)空间的时候，注意爆int
     */
    class MinStack {

        LinkedList<Long> stk;
        long min;


        public MinStack() {
            stk = new LinkedList<>();
            min = 0L;
        }

        public void push(int x) {
            if (stk.isEmpty()) {
                min = x;
                stk.addLast(x - min);
            } else {
                long diff = x - min;
                stk.addLast(diff);
                min = diff > 0 ? min : x;
            }
        }

        public void pop() {
            long diff = stk.removeLast();
            if (diff < 0) {
                min -= diff;
            }
        }

        public int top() {
            long diff = stk.getLast();
            if (diff <= 0) return (int) min;
            else return (int) (min + diff);
        }

        public int getMin() {
            return (int) min;
        }
    }

    /**
     * 单调栈只适用于一种问题：求每个数左/右边第一个比它小/大的数，不存在输出-1
     */
    class MonotonicStack {
        public List<Integer> monotonicStack(int[] arr) {
            return null;
        }
    }

}
