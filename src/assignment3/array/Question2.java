//2) Write a program to find average of the numbers available in left and right side of the number
// required by user if available in an array of 10 user defined number otherwise replace the item
// of the array placed in middle position with the number required by user and calculate output?

package assignment3.array;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers : ");
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to find : ");
        int required = sc.nextInt();
        int mid, flag = 0;
        for (int i = 0; i < 10; i++) {
            if(nums[i] == required){
                System.out.println("Your required element is found!");
                mid = i;
                flag = 0;
                break;
            }else {
                flag = 1;
            }
        }
        if(flag == 1){
            System.out.println("Your required element is not found!");
            mid = (0 + nums.length - 1) / 2;
            nums[mid] = required;
            System.out.println("After adding the required element, the new array is : ");
            for (int i = 0; i < 10; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
