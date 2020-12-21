package LeetCode.HOT200;

/**
 * 外观数组
 */
public class HOT028_Count_and_Say {

    public String countAndSay(int n) {
        if (n < 2) return "1";
        String temp = countAndSay(n - 1);
        String res = "";
        for (int i = 0; i < temp.length(); ) {
            int j = i + 1;
            while (j < temp.length() && temp.charAt(i) == temp.charAt(j)) j ++;
            res += String.valueOf(j - i) + temp.charAt(i);
            i = j;
        }
        return res;
    }

}