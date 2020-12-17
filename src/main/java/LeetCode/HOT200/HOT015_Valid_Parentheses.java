package LeetCode.HOT200;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 有效的括号
 */
public class HOT015_Valid_Parentheses {

    public static void main(String[] args) {
        System.out.println(new HOT015_Valid_Parentheses().isValid(""));
    }

    public boolean isValid(String s) {
        if (s.length() < 2) return false;
        Deque<Character> stk = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            stk.push(c);
            if (!stk.isEmpty() && isRight(stk.peek())) {
                char ct = stk.pop();
                if (!stk.isEmpty() && isMatch(stk.peek(), ct)) stk.pop();
                else stk.push(ct);
            }
        }
        return stk.isEmpty();
    }

    private boolean isRight(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    boolean isMatch(char c1, char c2) {
        return c1 == '(' && c2 == ')' || c1 == '[' && c2 == ']' || c1 == '{' && c2 == '}';
    }

}
