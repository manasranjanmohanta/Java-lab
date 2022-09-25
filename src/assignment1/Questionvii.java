//g) Write a java program to find sum of product of corresponding even digits of first any digit number
// and corresponding odd digit of any 4 digit number Such as n=1234 m=4567 output=4*7+2*5
package assignment1;

import java.util.Scanner;

public class Questionvii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first 4 digit number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter a second  4 digit number : ");
        int n2 = sc.nextInt();

        int fd1 = n1 / 1000;
        int fd2 = n1 / 100 % 10;
        int fd3 = n1 / 10 % 10;
        int fd4 = n1 % 10;

        int sd1 = n2 / 1000;
        int sd2 = n2 / 100 % 10;
        int sd3 = n2 / 10 % 10;
        int sd4 = n2 % 10;

        int sum = 0;
        sum += ((fd1 % 2 == 0) && (sd1 % 2 != 0)) && (fd1 % sd1 != 0) ? (fd1 * sd1) : 0;
        sum += ((fd2 % 2 == 0) && (sd2 % 2 != 0)) && (fd2 % sd2 != 0) ? (fd2 * sd2) : 0;
        sum += ((fd3 % 2 == 0) && (sd3 % 2 != 0)) && (fd3 % sd3 != 0) ? (fd3 * sd3) : 0;
        sum += ((fd4 % 2 == 0) && (sd4 % 2 != 0)) && (fd4 % sd4 != 0) ? (fd4 * sd4) : 0;

        System.out.println("The first number is : " + n1);
        System.out.println("The second number is : " + n2);
        System.out.println("The sum is : " + sum);
    }
}
