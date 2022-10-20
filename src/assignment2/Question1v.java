//V. Difference between average of all even digits except divisible
//// by 4 and average of all odd digits except divisible by 3
package assignment2;

import java.util.Scanner;

public class Question1v {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n1, sumOfEven = 0,sumOfOdd = 0, avgOfEven = 0, avgOfOdd = 0,countEven = 0, countOdd = 0, diff;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        n1 = n;
        while(n != 0){
            int digit = n % 10;
            if(digit % 2 == 0 && digit % 4 != 0){
                sumOfEven += digit;
                countEven++;
            }
            else if(digit % 3 != 0){
                sumOfOdd += digit;
                countOdd++;
            }
            n = n / 10;
        }
        avgOfEven = sumOfEven / countEven;
        avgOfOdd = sumOfOdd / countOdd;
        diff = avgOfEven - avgOfOdd;

        System.out.println("The number is : " + n1);
        System.out.println("The average of even digits except divisible by 4 is : " + avgOfEven);
        System.out.println("The average of odd digits except divisible by 3 is : " + avgOfOdd);
        System.out.println("Difference between average of all even digits except divisible by\n" +
                "4 and average of all odd digits except divisible by 3 is :  " + diff);



    }
}
