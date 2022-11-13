//6) Write a program to determinant and inverse of a 3X3 matrics?

package assignment3.array;

import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of 3x3 matrix : ");

        double matrix[][]= new double[3][3];
        System.out.println("Enter the elements of matrix: ");
        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++)
                matrix[i][j] = sc.nextDouble();

        double d[][] = invert(matrix);

        System.out.println("The inverse is: ");
        for (int i=0; i<3; ++i)
        {
            for (int j=0; j<3; ++j)
            {
                System.out.print(d[i][j]+"  ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static double[][] invert(double a[][])
    {
        int n = a.length;
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i=0; i<n; ++i)
            b[i][i] = 1;

        TransformOfMatrix(a, index);

        for (int i=0; i<n-1; ++i)
            for (int j=i+1; j<n; ++j)
                for (int k=0; k<n; ++k)
                    b[index[j]][k] -= a[index[j]][i] * b[index[i]][k];

        for (int i = 0; i < n; ++i)
        {
            x[n-1][i] = b[index[n-1]][i] / a[index[n-1]][n-1];
            for (int j = n-2; j >= 0; --j)
            {
                x[j][i] = b[index[j]][i];
                for (int k = j+1; k < n; ++k)
                {
                    x[j][i] -= a[index[j]][k] * x[k][i];
                }
                x[j][i] /= a[index[j]][j];
            }
        }
        return x;
    }


    public static void TransformOfMatrix(double a[][], int index[])
    {
        int n = index.length;
        double c[] = new double[n];

        for (int i = 0; i < n; ++i) {
            index[i] = i;
        }

        for (int i = 0; i < n; ++i) {
            double c1 = 0;
            for (int j = 0; j < n; ++j) {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) {
                    c1 = c0;
                }
            }
            c[i] = c1;
        }

        int k = 0;
        for (int j = 0; j < n-1; ++j) {
            double pi1 = 0;
            for (int i = j; i < n; ++i) {
                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) {
                    pi1 = pi0;
                    k = i;
                }
            }

            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i = j+1; i < n; ++i) {
                double pj = a[index[i]][j] / a[index[j]][j];

                a[index[i]][j] = pj;

                for (int l = j+1; l < n; ++l)
                    a[index[i]][l] -= pj * a[index[j]][l];
            }
        }
    }
}