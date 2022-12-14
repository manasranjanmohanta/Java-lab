//7) Write a program to find transpose of a 3X4 matrics?

package assignment3.array;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] original = new int[3][4];

        System.out.println("Enter the elements into matrix : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                original[i][j] = sc.nextInt();
            }
        }
        int[][] transpose = new int[4][3];
        // finding the transpose of matrix
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = original[j][i];
            }
        }
        System.out.println("The original matrix is : ");
        display(original, 3, 4);

        System.out.println("The transpose of a matrix is : ");
        display(transpose, 4, 3);


    }

    public static void display(int[][] mat, int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
