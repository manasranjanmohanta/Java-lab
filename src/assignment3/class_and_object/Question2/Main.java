//2) Write a program to give information about any number such as whether it is even odd, prime or
// not prime, or positive or negative, palindrome or not using class and object?
package assignment3.class_and_object.Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        Even e = new Even(num);
        e.isEven();
        Odd o = new Odd(num);
        o.isOdd();
        Prime p = new Prime(num);
        p.isPrime();
        PositiveOrNegative pon = new PositiveOrNegative(num);
        pon.isPositive();
        Palindrome palin = new Palindrome(num);
        palin.isPalindrome();
    }
}
