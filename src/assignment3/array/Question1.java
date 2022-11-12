//1) Write a program to find average and also find total no. of odd, even, prime and
// palindrome number available in an array of 30 user defined numbers?

package assignment3.array;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfOdd = 0, noOfEven = 0, noOfPrime = 0, noOfPalin = 0, totalOfOdd = 0, totalOfEven = 0, totalOfPrime = 0, totalOfPalin = 0;
        float avgOfOdd, avgOfEven, avgOfPrime, avgOfPalin;

        System.out.println("Enter 30 Numbers : ");
        int[] nums = new int[30];

        for (int i = 0; i < 30; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < 30; i++) {

            // Finding even numbers
            if(nums[i] % 2 == 0){
                noOfEven++;
                totalOfEven += nums[i];
            }

            // Finding odd numbers
            else {
                noOfOdd++;
                totalOfOdd += nums[i];
            }

            // Finding prime number
            int temp = 0;
            for (int j = 1; j <= nums[i]; j++) {
                if(nums[i] % j == 0){
                    temp++;
                }
            }
            if(temp == 2){
                noOfPrime++;
                totalOfPrime += nums[i];
            }

            // Finding palindrome number
            int rev = 0;
            int n = nums[i];
            while(n > 0){
                int digit = n % 10;
                rev = rev * 10 + digit;
                n = n / 10;
            }
            if(nums[i] == rev){
                noOfPalin++;
                totalOfPalin += nums[i];
            }
        }
        // Finding averages
        avgOfOdd = totalOfOdd / noOfOdd;
        avgOfEven = totalOfEven / noOfEven;
        avgOfPrime = totalOfPrime / noOfPrime;
        avgOfPalin = totalOfPalin / noOfPalin;

        // Display
        System.out.println("The total no. of odd numbers : " + noOfOdd);
        System.out.println("The total no. of even numbers : " + noOfEven);
        System.out.println("The total no. of prime numbers : " + noOfPrime);
        System.out.println("The total no. of palindrome numbers : " + noOfPalin);

        System.out.println("\n\nThe average of odd numbers : " + avgOfOdd);
        System.out.println("The average of even numbers : " + avgOfEven);
        System.out.println("The average of prime numbers : " + avgOfPrime);
        System.out.println("The average of palindrome numbers : " + avgOfPalin);

    }
}
