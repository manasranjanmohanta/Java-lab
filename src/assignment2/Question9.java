//9. Write a program to find factorial of difference between greatest and smallest number among 3 numbers?

package assignment2;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3 ,greatest, smallest, fact1 = 1, fact2 = 1, diff;

//  Taking inputs three numbers
        System.out.println("Enter three numbers");
        System.out.println("Enter first number : ");
        num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        num2 = sc.nextInt();
        System.out.println("Enter third number : ");
        num3 = sc.nextInt();

//  Finding greatest among 3 numbers
        if(num1 > num2  && num1 > num3){
            greatest = num1;
        }else if(num2 > num1 && num2 > num3){
            greatest = num2;
        }else {
            greatest = num3;
        }

//  Finding smallest among 3 numbers
        if(num1 < num2  && num1 < num3){
            smallest = num1;
        }else if(num2 < num1 && num2 < num3){
            smallest = num2;
        }else {
            smallest = num3;
        }

//  Finding the factorial of greatest number
        int count1 = 0;
        for(int i = greatest; i > 0; i--){
            fact1 = fact1 * i;
        }
        int count2 = 0;
        for(int i = smallest; i > 0; i--){
            fact2 = fact2 * i;
        }

        diff = fact1 - fact2;

        System.out.println("The greatest numbers among " + num1 + ", " + num2 + " and " + num3 + " is : " + greatest);
        System.out.println("The smallest numbers among " + num1 + ", " + num2 + " and " + num3 + " is : " + smallest);
        System.out.println("The factorial of " + greatest + " is : " + fact1);
        System.out.println("The factorial of " + smallest + " is : " + fact2);
        System.out.println("The difference between the factorial of " + num1 + " and " + num2 + " is : " + diff);

    }
}
