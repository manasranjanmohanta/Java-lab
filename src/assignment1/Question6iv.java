//d) Sum of product of consecutive even digits of any 4 digit number? Supoose num=1624 then output= 4*2+2*6

package assignment1;

import java.util.Scanner;

public class Question6iv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit number : ");
        int n = sc.nextInt();

        int digit1 = n / 1000;
        int digit2 = n / 100 % 10;
        int digit3 = n / 10 % 10;
        int digit4 = n % 10;

        int sum = 0;
        sum += ((digit1 % 2 == 0) && (digit2 % 2 == 0)) ? (digit1 * digit2) : 0;
        sum += ((digit2 % 2 == 0) && (digit3 % 2 == 0)) ? (digit2 * digit3) : 0;
        sum += ((digit3 % 2 == 0) && (digit4 % 2 == 0)) ? (digit3 * digit4) : 0;

        System.out.println("The number is : " + n);
        System.out.println("Sum of product of consecutive even digits : " + sum);

    }
}
