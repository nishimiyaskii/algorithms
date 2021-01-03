package LeetCode.HOT200;

import java.util.LinkedList;

/**
 * 使用栈模拟队列
 *  类似题目：队列模拟战、最小栈、最大队列
 * @Author aimerrhythms
 * @Date 2020/12/31 9:50
 */
public class HOT121_Implement_Queue_using_Stack {

    class MyQueue {

        LinkedList<Integer> a, b;

        public MyQueue() {
            a = new LinkedList<>();
            b = new LinkedList<>();
        }

        public void push(int x) {
            a.addLast(x);
        }

        public int pop() {
            while (a.size() > 1) b.addLast(a.removeLast());
            int t = a.removeLast();
            while (b.size() > 0) a.addLast(b.removeLast());
            return t;
        }

        public int peek() {
            while (a.size() > 1) b.addLast(a.removeLast());
            int t = a.getLast();
            while (b.size() > 0) a.addLast(b.removeLast());
            return t;
        }

        public boolean empty() {
            return a.isEmpty();
        }
    }
}
