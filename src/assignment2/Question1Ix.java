//IX. Sum of product of consecutive odd digits of any digit number
package assignment2;

import java.util.Scanner;

public class Question1Ix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n1, sum = 0;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        n1 = n;
        while(n != 0){
            int digit1 = n % 10;
            int digit2 = (n / 10) % 10;
            if(digit1 % 2 != 0 && digit2 % 2 != 0){
                sum = sum + (digit1 * digit2);
            }
            n = n / 10;
        }

        System.out.println("The number is : " + n1);
        System.out.println("The sum of product of consecutive odd digits of " + n1 + " is : " + sum);
    }
}
