//e) Sum of product of consecutive odd digits of any 4 digit number? Supoose num=1356 then output= 5*3+ 3*1

package assignment1;

import java.util.Scanner;

public class Question6v {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int digit1 = n / 1000;
        int digit2 = n / 100 % 10;
        int digit3 = n / 10 % 10;
        int digit4 = n % 10;

        int sum = 0;
        sum += ((digit1 % 2 != 0) && (digit2 % 2 != 0)) ? (digit1 * digit2) : 0;
        sum += ((digit2 % 2 != 0) && (digit3 % 2 != 0)) ? (digit2 * digit3) : 0;
        sum += ((digit3 % 2 != 0) && (digit4 % 2 != 0)) ? (digit3 * digit4) : 0;

        System.out.println("The number is : " + n);
        System.out.println("Sum of product of consecutive odd digits : " + sum);
    }
}
