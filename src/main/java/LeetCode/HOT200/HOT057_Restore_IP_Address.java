package LeetCode.HOT200;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 复原IP地址
 */
public class HOT057_Restore_IP_Address {

    List<String> res = new ArrayList<>();
    LinkedList<String> path = new LinkedList<>();

    public List<String> restoreIpAddresses(String s) {
        if (s.length() < 1) return res;
        dfs(s, 0, 0);
        return res;
    }

    void dfs(String s, int u, int k) {
        if (k == 4) {
            if (u == s.length()) {
                StringBuilder ip = new StringBuilder();
                for (int i = 0; i < 4; i ++) {
                    ip.append(path.get(i));
                    if (i < 3) ip.append(".");
                }
                res.add(ip.toString());
            }
        } else {
            for (int i = 1; i <= 3; i ++) {
                if (u + i > s.length()) break;
                String numStr = s.substring(u, u + i);
                if (numStr.charAt(0) == '0' && numStr.length() > 1 || Integer.parseInt(numStr) > 255) break;
                path.addLast(numStr);
                dfs(s, u + i, k + 1);
                path.removeLast();
            }
        }
    }

}
