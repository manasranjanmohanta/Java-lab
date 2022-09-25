//II. find the face value and position value of any 4 digit number?
package assignment1;

import java.util.Scanner;

public class Question5ii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit number : ");
        int n = sc.nextInt();

        int digit1 = n / 1000;
        int digit2 = n / 100 % 10;
        int digit3 = n / 10 % 10;
        int digit4 = n / 1 % 10;

        System.out.println("Face value of digit1 is : " + digit1 + " and the position value is " + (digit1 * 1000));
        System.out.println("Face value of digit2 is : " + digit2 + " and the position value is " + (digit2 * 100));
        System.out.println("Face value of digit3 is : " + digit3 + " and the position value is " + (digit3 * 10));
        System.out.println("Face value of digit4 is : " + digit4 + " and the position value is " + (digit4 * 1));


    }
}
