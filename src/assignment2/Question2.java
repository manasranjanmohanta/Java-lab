//2. Write a java program to find sum of product of corresponding digits of two
// any digit number Such as n=1234 m=7896 output=6*4+9*3+8*2+7*1
package assignment2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, n1, m1, sum = 0;
        System.out.println("Enter two numbers : ");
        n = sc.nextInt();
        m = sc.nextInt();

        n1 = n;
        m1 = m;

        while(n > 0 || m > 0){
            int d1 = n % 10;
            int d2 = m % 10;
            sum += (d1 * d2);
            n = n / 10;
            m = m / 10;
        }
        System.out.println("The sum of product of corresponding digits of two number " + n1 + " and " + m1 + " is : " + sum);
    }
}
