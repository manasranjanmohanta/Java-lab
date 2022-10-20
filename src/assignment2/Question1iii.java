//II. Sum of all odd digits of any number
package assignment2;

import java.util.Scanner;

public class Question1iii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n1, sum = 0;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        n1 = n;

        while(n != 0){
            int digit = n % 10;
            if(digit % 2 != 0){
                sum += digit;
            }
            n = n / 10;
        }

        System.out.println("The number is : " + n1);
        System.out.println("The sum of all digits of " + n1 + " is : " + sum);
    }
}
