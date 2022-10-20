//X. Sum of product of consecutive prime digits of any digit number
package assignment2;

import java.util.Scanner;

public class Question1x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n1, sum = 0;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        n1 = n;
        while(n != 0){
            int isPrime = 0;
            int digit1 = n % 10;
            int digit2 = (n / 10) % 10;
            if(digit1 == 0 || digit1 == 1 || digit2 == 0 || digit2 == 1){
                isPrime = 0;
            }
            else {
                for (int i = 2; i < digit1; i++) {
                    if (digit1 % i == 0) {
                        isPrime = 1;
                        break;
                    }
                }
                for (int i = 2; i < digit2; i++) {
                    if(digit2 % i == 0){
                        isPrime = 1;
                        break;
                    }
                }
            }
            if(isPrime == 0){
                sum = sum + (digit1 * digit2);
            }
            n = n / 10;
        }
        System.out.println("The number is : " + n1);
        System.out.println("The sum of product of consecutive digits of " + n1 + " is " + sum);
    }
}
