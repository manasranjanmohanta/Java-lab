//1. Write a java program to find following using looping and decision making without function
//        I. Sum of all digits of any numbers

package assignment2;

import java.util.Scanner;

public class Question1i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n1, sum = 0;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        n1 = n;
        while(n != 0){
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }

        System.out.println("The number is : " + n1);
        System.out.println("The sum of digits of number " + n1 + " is : " + sum);
    }
}
