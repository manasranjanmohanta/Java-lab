/* Write a java program for temperature conversion */
package assignment1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius : ");
        float cel = sc.nextFloat();
        System.out.println("Enter temperature in fahrenheit : ");
        float fah = sc.nextFloat();

        float resFah, resCel;

        resFah = (cel * 9/5) + 32;
        resCel = (fah - 32) * 5/9;

        System.out.println("The temperature in celsius " + cel +  " equivalent to temperature in fahrenheit " + resFah);
        System.out.println("The temperature in Fahrenheit " + fah +  " equivalent to temperature in Celsius " + resCel);

    }
}
