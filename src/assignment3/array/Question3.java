//3) Write a program to sort 10 numbers in ascending order and find the sum of product
// of 2nd smallest and 3rd largest number?

package assignment3.array;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers : ");
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i]  = sc.nextInt();
        }

        System.out.println("The arrays is : " + Arrays.toString(nums));

        for (int i = 0; i < 10 - 1; i++) {
            for (int j = i+ 1; j < 10; j++) {
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int secondSmallest = nums[1];
        int thirdLargest = nums[nums.length - 3];

        System.out.println("After sorting the array is " + Arrays.toString(nums));
        int product = secondSmallest * thirdLargest;
        System.out.println("The second smallest number is : " + secondSmallest);
        System.out.println("The third largest number is : " + thirdLargest);
        System.out.println("The product of second smallest and third largest number is : " + product);
    }
}
