//V. find sum of product of corresponding digits of two any 4 digit number
// Such as n=1234 m=7896 output=6*4+9*3+8*2+7*1

package assignment1;

import java.util.Scanner;

public class Question5v {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first 4 digit number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter second 4 digit number :  ");
        int n2 = sc.nextInt();
        int sum = 0;

        int fd1 = n1 / 1 % 10;
        int fd2 = n1 / 10 % 10;
        int fd3 = n1 / 100 % 10;
        int fd4 = n1 / 1000;

        int sd1 = n2 / 1 % 10;
        int sd2 = n2 / 10 % 10;
        int sd3 = n2 / 100 % 10;
        int sd4 = n2 / 1000;

        sum = (fd1 * sd1) + (fd2 * sd2) + (fd3 * sd3) + (fd4 * sd4);
        System.out.println("Sum of product of corresponding digits of  two 4 digit number is : " + sum);
    }
}
