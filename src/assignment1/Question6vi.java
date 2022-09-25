//f) Difference between Sum of product of consecutive even digits except 2 and 6
// and Sum of product of consecutive odd digits except 3 and 7 of any 4 digit number
package assignment1;

import java.util.Scanner;

public class Question6vi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int digit1 = n / 1000;
        int digit2 = n / 100 % 10;
        int digit3 = n / 10 % 10;
        int digit4 = n % 10;

        int evenSum = 0, oddSum = 0;
        evenSum += ((digit1 % 2 == 0) && (digit2 % 2 == 0) && ((digit1 != 2) || (digit1 != 6)) && ((digit1 != 2) || (digit2 != 6)) ) ? (digit1 * digit2) : 0;
        evenSum += ((digit2 % 2 == 0) && (digit3 % 2 == 0) && ((digit2 != 2) || (digit2 != 6)) && ((digit3 != 2) || (digit3 != 6)) ) ? (digit2 * digit3) : 0;
        evenSum += ((digit3 % 2 == 0) && (digit4 % 2 == 0) && ((digit3 != 2) || (digit3 != 6)) && ((digit4 != 2) || (digit4 != 6)) ) ? (digit3 * digit4) : 0;

        oddSum += ((digit1 % 2 != 0) && (digit2 % 2 != 0) && ((digit1 != 3) || (digit1 != 7)) && ((digit1 != 3) || (digit2 != 7)) ) ? (digit1 * digit2) : 0;
        oddSum += ((digit2 % 2 != 0) && (digit3 % 2 != 0) && ((digit2 != 3) || (digit2 != 7)) && ((digit3 != 3) || (digit3 != 7)) ) ? (digit2 * digit3) : 0;
        oddSum += ((digit3 % 2 != 0) && (digit4 % 2 != 0) && ((digit3 != 3) || (digit3 != 7)) && ((digit4 != 3) || (digit4 != 7)) ) ? (digit3 * digit4) : 0;

        int diff = evenSum - oddSum;
        System.out.println("The number is : " + n);
        System.out.println(evenSum);
        System.out.println(oddSum);
        System.out.println("The diffrence is : " + diff);
    }
}
