//IV. Sum of product of consecutive digits of any 4 digit number? Supoose num=1234 then output= 4*3+3*2+2*1

package assignment1;

import java.util.Scanner;

public class Question5iv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a  4 digit number : ");
        int n = sc.nextInt();
        int sum = 0;

        int digit1 = n / 1000;
        int digit2 = n / 100 % 10;
        int digit3 = n / 10 % 10;
        int digit4 = n / 1 % 10;

        sum = (digit1 * digit2) + (digit2 * digit3) + (digit3 * digit4);
        System.out.println("Sum of product of consecutive digits is : " + sum);
    }
}
