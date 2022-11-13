//4) Write a program to sort 10 numbers in descending order and average of
// 3rd largest and 4th smallest number in an array of 10 user defined numbers?

package assignment3.array;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers : ");
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("The array is : " + Arrays.toString(nums));
        // Sorting in descending order
        for (int i = 0; i < 10 - 1; i++) {
            for (int j = i + 1; j < 10; j++) {
                if(nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int thirdLargest = nums[2];
        int fourthSmallest = nums[10 - 4];
        float avg = (thirdLargest + fourthSmallest) / 2;
        System.out.println("After sorting the arrays is : " + Arrays.toString(nums));
        System.out.println("The average of 3rd largest and 4th smallest number is " + avg);
    }
}
