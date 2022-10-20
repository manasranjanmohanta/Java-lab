//V. Sum of all prime digits
package assignment2;


import java.util.Scanner;

public class Question1iv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n1, sum = 0;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        n1 = n;
        while(n != 0){
            int isPrime = 0;
            int digit = n % 10;
            if(digit == 0 || digit == 1){
                isPrime = 0;
            }
            else {
                for (int i = 2; i < digit; i++) {
                    if (digit % i == 0) {
                        isPrime = 1;
                        break;
                    }
                }
            }
            if(isPrime == 0){
                    sum += digit;
                }
            n = n / 10;

        }

        System.out.println("The number is : " + n1);
        System.out.println("The sum of all prime digits of  " + n1 + " is : " + sum);

    }
}
