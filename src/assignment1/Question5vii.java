//VII. Find left shit, right shift and zero fill of summation of all digits
// of any 4 digit number and it will be shifted by 3rd digit of any 4 digitnumber?
package assignment1;

import java.util.Scanner;

public class Question5vii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit number : ");
        int n = sc.nextInt();
        int sum = 0;

        int digit1 = n / 1000;
        int digit2 = n / 100 % 10;
        int digit3 = n / 10 % 10;
        int digit4 = n % 10;

        sum = digit1 + digit2 + digit3 + digit4;

        System.out.println("The number is : " + n);
        System.out.println("The sum of digits is : " + sum);
        System.out.println("Left shift value is : " + (sum << digit3));
        System.out.println("Right shift value is : " + (sum >> digit3));
        System.out.println("Right shift and zero fill is "  + (sum >>> digit3));

    }
}
