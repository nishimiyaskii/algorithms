package template.pack;

import java.util.Scanner;

/**
 * 01背包
 *
 * 有N件物品和容量为 V 的背包，每件物品只能使用一次
 * 第i件物品的体积是 vi，价值是 wi
 * 要求分配方案体积不超过 V，且总价值最大
 *
 * @Author aimerrhythms
 * @Date 2021/1/3 14:20
 */
public class A_01Package {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        final int N = cin.nextInt(), V = cin.nextInt();
        int[] v = new int[N], w = new int[N];
        for (int i = 0; i < N; i ++) {
            v[i] = cin.nextInt();
            w[i] = cin.nextInt();
        }
        int[] dp = new int[V + 1];
        for (int i = 1; i <= N; i ++) {
            for (int j = V; j >= v[i - 1]; j --) {
                dp[j] = Math.max(dp[j], dp[j - v[i - 1]] + w[i - 1]);
            }
        }
        System.out.print(dp[V]);
    }

}
