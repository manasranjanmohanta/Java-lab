//III. Find the value available at position required by user it may be 10,100 or 1000?
package assignment1;

import java.util.Scanner;

public class Question5iii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int digit1 = n / 10 % 10;
        int digit2 = n / 100 % 10;
        int digit3 = n / 1000;

        System.out.println("The value at position 10 is " + digit1);
        System.out.println("The value at position 100 is " + digit2);
        System.out.println("The value at position 1000 is " + digit3);

    }
}
