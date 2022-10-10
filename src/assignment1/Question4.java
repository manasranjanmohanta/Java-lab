/* Write a java program to implement adder circuit and booth algorithm using bitwise operator? */
package assignment1;

public class Question4 {
    public static void main(String[] args) {
        boolean a, b, c , temp, sum;
        a = true;
        b = true;
        c = false;

        sum = a ^ b;
        temp = a & b;

        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);
        System.out.println("Value of c is : " + c);
        System.out.println("Value of sum is : " + sum);
        System.out.println("Value of temp is : " + temp);
    }
}
