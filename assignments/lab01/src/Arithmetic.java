import edu.princeton.cs.algs4.StdIn;

/** Simple Arithmetic Class.
 * @author Josh Hug
 * */
//public class Arithmetic {
//
//    /** Computes product of two ints.
//     * @param a Value 1
//     * @param b Value 2
//     * @return Product of a and b
//     * */
//    public static int product(int a, int b) {
//        return a * b;
//    }
//
//    /** Computes sum of two ints (incorrectly).
//     * @param a Value 1
//     * @param b Value 2
//     * @return Sum of a and b
//     * */
//    public static int sum(int a, int b) {
//        return a * b;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Give me a number! (no decimals, please)");
//        int num1 = StdIn.readInt();
//        System.out.println("Give me another number! (still no decimals)");
//        int num2 = StdIn.readInt();
//
//        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product(num1, num2));
//        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum(num1, num2));
//    }
//}
public class Arithmetic {
    // 计算两数乘积（原本正确，不用改）
    public static int product(int a, int b) {
        return a * b;
    }

    // 计算两数之和（原本有bug，修复完成）
    public static int sum(int a, int b) {
        return a + b;
    }

    // 主方法，运行测试
    public static void main(String[] args) {
        System.out.println(sum(2, 3));   // 输出 5
        System.out.println(product(2, 3)); // 输出 6
    }
}