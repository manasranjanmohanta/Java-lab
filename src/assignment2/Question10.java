//10. Write a program to generate Fibonacci series up to n terms? Value of n will be accepted from user?
package assignment2;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , fib, fib1 = 0, fib2 = 1;
        System.out.println("How many terms upto you want to find the fibonacci series?");
        n = sc.nextInt();
        System.out.println("The fibonacci series is : ");
        System.out.print(fib1 + " ");
        System.out.print(fib2);
        for(int i = 2; i < n; i++ ){
            fib = fib1 + fib2;
            System.out.print(" " + fib);
            fib1 = fib2;
            fib2 = fib;
        }
    }
}
