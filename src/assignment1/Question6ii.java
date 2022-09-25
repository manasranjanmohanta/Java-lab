//b) Sum of all odd digits of any 4 digit number
package assignment1;

import java.util.Scanner;

public class Question6ii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit number : ");
        int n = sc.nextInt();
        int sum = 0;

        int digit1 = n / 1000;
        int digit2 = n / 100 % 10;
        int digit3 = n / 10 % 10;
        int digit4 = n % 10;
        sum += (digit1 % 2 != 0) ? digit1 : 0;
        sum += (digit2 % 2 != 0) ? digit2 : 0;
        sum += (digit3 % 2 != 0) ? digit3 : 0;
        sum += (digit4 % 2 != 0) ? digit4 : 0;

        System.out.println("The number is : " + n);
        System.out.println("The Sum of all odd digits of number " + n + " is : " + sum);
    }
}

