package LeetCode.HOT200;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * 基本计算器II
 * @Author aimerrhythms
 * @Date 2020/12/31 9:12
 */
public class HOT119_Basic_Calculator_II {

    public static void main(String[] args) {
        System.out.println(new HOT119_Basic_Calculator_II().calculate(" 3/2 "));
    }

    LinkedList<Integer> numStk = new LinkedList<>();
    LinkedList<Character> opStk = new LinkedList<>();
    HashMap<Character, Integer> priority = new HashMap<Character, Integer>() {{
        put('+', 1);
        put('-', 1);
        put('/', 2);
        put('*', 2);
    }};

    public int calculate(String s) {
        int n = s.length();
        if (n < 0) return 0;
        for (int i = 0; i < n; ) {
            char c = s.charAt(i);
            if (c == ' ') {
                i ++;
                continue;
            }
            if (c >= '0' && c <= '9') {
                int j = i, num = 0;
                while (j < s.length() && (s.charAt(j) >= '0' && s.charAt(j) <= '9')) {
                    num = num * 10 + (s.charAt(j) - '0');
                    j ++;
                }
                i = j;
                numStk.addLast(num);
            } else {
                while (!opStk.isEmpty() && priority.get(c) <= priority.get(opStk.getLast())) eval();
                opStk.addLast(c);
                i ++;
            }
        }
        while (!opStk.isEmpty()) eval();
        return numStk.removeLast();
    }

    void eval() {
        int b = numStk.removeLast(), a = numStk.removeLast();
        char op = opStk.removeLast();
        switch(op) {
            case '+':
                numStk.addLast(a + b);
                break;
            case '-':
                numStk.addLast(a - b);
                break;
            case '*':
                numStk.addLast(a * b);
                break;
            case '/':
                numStk.addLast(a / b);
                break;
            default:
                break;
        }
    }

}
