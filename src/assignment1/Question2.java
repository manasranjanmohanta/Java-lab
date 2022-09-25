/* Write a java program to find simple interest */
package assignment1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        float p = sc.nextLong();
        System.out.println("Enter the rate of interest:");
        float r = sc.nextFloat();
        System.out.println("Enter the time(in years):");
        float t = sc.nextInt();

        float si = p * t * r / 100;
        System.out.println("Simple Interest is : " + si);
    }
}
