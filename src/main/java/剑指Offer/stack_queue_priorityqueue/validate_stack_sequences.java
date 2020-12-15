package 剑指Offer.stack_queue_priorityqueue;

/**
 * 栈的压入、弹出顺序
 */
public class validate_stack_sequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length != popped.length) return false;
        int p1 = 0, p2 = 0;
        for (int t : pushed) {
            pushed[p1] = t;
            while (p1 >= 0 && pushed[p1] == popped[p2]) {
                p2 ++;
                p1 --;
            }
            p1 ++;
        }
        return p1 == 0;
    }

}
