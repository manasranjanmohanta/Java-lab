//XI. Difference between Sum of product of consecutive even digits except 2 and 6
// and Sum of product of consecutive odd digits except 3 and 7 of any digit number
package assignment2;

import java.util.Scanner;

public class Question1xi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n1, sumOfEven = 0, sumOfOdd = 0, diff;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        n1 = n;

        while(n != 0){
            int digit1 = n % 10;
            int digit2 = (n / 10) % 10;
            if(digit1 % 2 == 0 && digit2 % 2 == 0 && digit1 != 2 && digit2 != 6){
                sumOfEven = sumOfEven + (digit1 * digit2);
            }
            else if(digit1 % 2 != 0 && digit2 % 2 != 0 && digit1 != 3 && digit2 != 7){
                sumOfOdd = sumOfOdd + (digit1 * digit2);
            }
            n = n / 10;
        }
        diff  = sumOfEven - sumOfOdd;
        System.out.println("The number is : " + n1);
        System.out.println("Sum of even digits : " + sumOfEven);
        System.out.println("Sum of odd digits : " + sumOfOdd);
        System.out.println("Difference between Sum of product of consecutive even digits \n" +
                "except 2 and 6 and Sum of product of consecutive odd digits \n" +
                "except 3 and 7 of " + n1 + " is : " + diff);
    }
}
