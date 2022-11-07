//6. Write a java program to check weather the given number is palindrome and prime or not?
package assignment2;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int n1 = n, rev = 0, count = 0;

        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        for(int i = 1; i <= n1; i++){
            if(n1 % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println(n1 + " is a prime number");
        }
        else {
            System.out.println(n1 + " is not a prime number");
        }
        if(rev == n1) {
            System.out.println(n1 + " is a palindrome number");
        }
        else {
            System.out.println(n1 + " is not a palindrome number");
        }

    }
}
