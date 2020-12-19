package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.List;

/**
 * 合法括号规则
 *
 * 1、任意前缀中，左括号数量>=右括号数量
 * 2、整个序列中，左括号数量=右括号数量
 */
public class HOT017_Generate_Parentheses {

    List<String> res = new ArrayList<>();
    public List<String> generateParentheses(int n) {
        if (n < 1) return res;
        dfs("", 0, 0, n);
        return res;
    }

    void dfs(String path, int lCnt, int rCnt, int n) {
        if (rCnt == n && lCnt == n) res.add(path);
        else {
            if (lCnt < n) dfs(path + "(", lCnt + 1, rCnt, n);
            if (rCnt < n && lCnt >  rCnt) dfs(path + ")", lCnt, rCnt + 1, n);
        }
    }

}
