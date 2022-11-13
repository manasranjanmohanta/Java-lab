//5) Write a program to find summation, subtraction and multiplication of two 3X4 matrices?

package assignment3.array;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a two 3X4 matrix : ");
        int[][] A = new int[3][4];
        int[][] B = new int[3][4];
        System.out.println("Enter element into first matrix : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter element into second matrix : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Summation
        int[][] C = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Subtraction
        int[][] D = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        // Display
        System.out.println("The first matrix is : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The first matrix is : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The multiplication of two 3x4 matrix is not possible.");
    }
}
