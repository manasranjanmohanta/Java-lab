//4. Write a java program to compute following series and take input x and n
//        II. x-x3/3! + x5/5!-x7/7!+------+xn/n!
package assignment2;

import java.util.Scanner;

public class Question4iii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, n;
        double result = 0;

        System.out.println("Enter the value of x : ");
        x = sc.nextInt();
        System.out.println("Enter the value of n : ");
        n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            if(i % 2 == 0){
                int i1 = i;
                int fact = 1;
                while(i1 > 0){
                    fact = fact * i1;
                    i1--;
                }
                result = result + Math.pow(x, i) / fact;
            }
        }


        System.out.println("The result of the above series is : " + result);
    }
}
