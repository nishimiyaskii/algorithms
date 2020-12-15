package 剑指Offer.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 有重复的全排列
 */
public class permutation_string_having_repeated {

    public static void main(String[] args) {
//        List<String> res = Arrays.stream(new String[]{"1", "2", "3"})
//                .collect(Collectors.toList());
//        String[] strings = list.stream().toArray(String[]::new);
    }


    List<String> list = new ArrayList<>();
    StringBuilder path = new StringBuilder();
    boolean[] v = null;

    public String[] permutation(String s) {
        v = new boolean[s.length()];
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        dfs(charArr, 0);
        return list.stream().toArray(String[] :: new);
    }

    private void dfs(char[] arr, int u) {
        if (u == arr.length) {
            list.add(path.toString());
        } else {
            for (int i = 0; i < arr.length; i ++) {
                if (v[i] || i > 0 && arr[i] == arr[i - 1] && !v[i - 1]) continue;
                v[i] = true;
                path.append(arr[i]);
                dfs(arr, u + 1);
                v[i] = false;
                path.deleteCharAt(path.length() - 1);
            }
        }
    }

}
