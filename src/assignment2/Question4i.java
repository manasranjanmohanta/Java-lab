//4. Write a java program to compute following series and take input x and n
//        I. 1-x2/2! + x3/3!-x4/4!+------+xn/n!
package assignment2;

import java.util.Scanner;

public class Question4i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, n , evenSum = 0, oddSum = 0,evenPow = 1, oddPow = 1, fact = 1;
        float result = 0;

        System.out.println("Enter the value of x : ");
        x = sc.nextInt();
        System.out.println("Enter the value of n : ");
        n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            int i1 = i;
            if(i1 % 2 == 0){
                while(i1 > 0){
                    evenPow = evenPow * x;
                    fact = fact * i1;
                    i1--;
                }
                evenSum = evenSum + (evenPow / fact);
                evenPow = 1;
                fact = 1;
            }
            else {
                while(i1 > 0){
                    oddPow = oddPow * x;
                    fact = fact * i1;
                    i1--;
                }
                oddSum = oddSum + (oddPow / fact);
                oddPow = 1;
                fact = 1;
            }

            result = 1 + oddSum - evenSum;
        }
        System.out.println("The result of the above series is : " + result);
    }
}
