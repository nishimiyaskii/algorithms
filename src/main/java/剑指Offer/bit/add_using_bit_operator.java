package 剑指Offer.bit;

public class add_using_bit_operator {

    public static void main(String[] args) {
        System.out.println(new add_using_bit_operator().add(13, 9));
    }

    public int add(int a, int b) {
        int sum = a ^ b;
        int carry = (a & b) << 1;
        if (carry == 0) return sum;
        else return add(sum, carry);
    }

}
