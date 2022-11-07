//5. Write a java program compute following series and take a numbers num as
// input x-x3/3! + x5/5!-x7/7!+------+xn/n!where x=sum of all even digits except 2
// and 8 and n= sum of all odd digits except 1 and 3

package assignment2;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        int num, x = 0, n = 0, temp = 0;
        double result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        num = sc.nextInt();
        temp = num;
        while(temp != 0)
        {
            int flag = 0;
            flag = temp%10;
            if(flag % 2 == 0 && flag != 2 && flag != 8)
            {
                x = x + flag;
            } else {
                if(flag != 1 && flag != 3)
                {
                    n = n + flag;
                }
            }
            temp = temp / 10;
        }
        for(int i = 1; i <= n; i++)
        {
            int j = (2 * 1) - 1;
            int fact = 1;
            for(int k = 1; k <= j; k++)
            {
                fact = fact * k;
            }
            result = result + (Math.pow(-1, (i+1)) * (Math.pow(x, j)) / fact);
        }
        System.out.println(" R = "+ result);
    }
}
