//        Write a java program to find following without using looping and decision making
//        I. Sum of all digits of any 4 digit
package assignment1;
import java.util.Scanner;

public class Question5i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit numbers : ");
        int n = sc.nextInt();
       int sum = 0;
       int digit1 = n % 10;
       n = n / 10;
       int digit2 = n % 10;
       n = n / 10;
       int digit3 = n % 10;
       n = n / 10;
       int digit4 = n % 10;
       sum = digit1  + digit2 + digit3 + digit4;
       System.out.println("The sum of digits is : " + sum);

    }
}
