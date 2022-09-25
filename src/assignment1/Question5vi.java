//VI. find bitwise and , or , and xor of 2nd and 4th digit of any 4 digit number?
package assignment1;

import java.util.Scanner;

public class Question5vi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit number : ");
        int n = sc.nextInt();

        int digit2 = n / 10 % 10;
        int digit4 = n / 1000;

//        int digit2 = n / 100 % 10;
//        int digit4 = n % 10;

        int ans1 = (digit2 & digit4);
        int ans2 = (digit2 | digit4);
        int ans3 = (digit2 ^ digit4);

        System.out.println("The number is : " + n);
        System.out.println("The Bitwise AND value of 2nd and 4th digit of number " + n + " is : " + ans1);
        System.out.println("The Bitwise OR value of 2nd and 4th digit of number " + n + " is : " + ans2);
        System.out.println("The Bitwise XOR value of 2nd and 4th digit of number " + n + " is : " + ans3);
    }
}
