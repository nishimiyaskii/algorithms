package LeetCode.HOT200;

/**
 * 阶乘后的0
 *
 * 假设n!=k，求k的末尾有几个0，即求k可以分解出来多少个10，而10=2*5
 * 所以k可以分解成：k = 2^a * 5^b * 其他
 * 所以k的末尾就有min(a,b)个0
 * 而从k的角度统计，复杂度较高。所以先考虑这样一个问题：n!中有多少个质因子p
 *
 * n! = 1 * 2 * 3 * ... * n
 *      1、1~n中p的倍数：p,2p,3p,4p,...；即共 n/p[下取整] 个
 *      2、1~n中p^2的倍数：p^2,2p^2,3p^2,4p^2,...；即共 n/p^2[下取整] 个
 *      ...
 *      k、1~n中p^k的倍数：p^k,2p^k,3p^k,4p^k,...；即共 n/p^k[下取整] 个
 * 最终n!中质因子p个数为上面结果的和
 *
 * 验证正确性：
 * 假设1~n中存在x=p^k * 其他因子，那么p^k次方会在p中算一次，p^2中算一次，...，p^k中也算一次，共算了k次
 *
 * @author aimerrhythms
 */
public class HOT100_Factorial_Trailing_Zeroes {

    public int trailingZeroes(int n) {
        int res = 0;
        while (n > 4) {
            res += n / 5;
            n /= 5;
        }
        return res;
    }

}
