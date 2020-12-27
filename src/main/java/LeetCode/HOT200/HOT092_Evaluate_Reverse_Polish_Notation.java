package LeetCode.HOT200;

import java.util.ArrayDeque;

/**
 * 逆波兰表达式求值
 *
 * @author aimerrhythms
 */
public class HOT092_Evaluate_Reverse_Polish_Notation {

    public int evalRPN(String[] tokens) {
        if (tokens.length < 1) {
            return 0;
        }
        ArrayDeque<String> stk = new ArrayDeque<>();
        for (String s : tokens) {
            if (!"+".equals(s) && !"-".equals(s) && !"*".equals(s) && !"/".equals(s)) {
                stk.addLast(s);
            } else {
                int b = Integer.parseInt(stk.removeLast());
                int a = Integer.parseInt(stk.removeLast());
                switch (s) {
                    case "+":
                        stk.addLast(a + b + "");
                        break;
                    case "-":
                        stk.addLast(a - b + "");
                        break;
                    case "*":
                        stk.addLast(a * b + "");
                        break;
                    case "/":
                        stk.addLast(a / b + "");
                        break;
                    default:
                        break;
                }
            }
        }
        return Integer.parseInt(stk.removeLast());
    }

}