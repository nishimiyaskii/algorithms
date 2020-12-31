package LeetCode.HOT200;

import java.util.LinkedList;

/**
 * 队列实现栈
 * @Author aimerrhythms
 * @Date 2020/12/31 9:05
 */
public class HOT117_Implement_Stack_using_Queue {

    class MyStack{
        LinkedList<Integer> q;

        public MyStack() {
            q = new LinkedList<>();
        }

        public void push(int x) {
            q.addLast(x);
        }

        public int pop() {
            int n = q.size();
            while (-- n > 0) {
                q.addLast(q.removeFirst());
            }
            return q.removeFirst();
        }

        public int top() {
            int n = q.size();
            while (-- n > 0) {
                q.addLast(q.removeFirst());
            }
            int t = q.removeFirst();
            q.addLast(t);
            return t;
        }

        public boolean empty() {
            return q.isEmpty();
        }

    }

}
