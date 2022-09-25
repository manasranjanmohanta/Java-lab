//c) Difference between average of all even digits except divisible by 4
// and average of all odd digits except divisble by 3 of any 4 digit number
package assignment1;

import java.util.Scanner;

public class Question6iii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit number : ");
        int n = sc.nextInt();

        int digit1 = n / 1000;
        int digit2 = n / 100 % 10;
        int digit3 = n / 10 % 10;
        int digit4 = n % 10;

        int evenCount = 0, oddCount = 0, evenSum = 0, oddSum = 0;

        // finding number of even digit and sum of those even digit
        evenCount += ((digit1 % 2 == 0) && (digit1 % 4 != 0)) ? 1 : 0;
        evenSum += ((digit1 % 2 == 0) && (digit1 % 4 != 0)) ? digit1 : 0;
        evenCount += ((digit2 % 2 == 0) && (digit2 % 4 != 0)) ? 1 : 0;
        evenSum += ((digit2 % 2 == 0) && (digit2 % 4 != 0)) ? digit2 : 0;
        evenCount += ((digit3 % 2 == 0) && (digit3 % 4 != 0)) ? 1 : 0;
        evenSum += ((digit3 % 2 == 0) && (digit3 % 4 != 0)) ? digit3 : 0;
        evenCount += ((digit4 % 2 == 0) && (digit4 % 4 != 0)) ? 1 : 0;
        evenSum += ((digit4 % 2 == 0) && (digit4 % 4 != 0)) ? digit4 : 0;

        // finding number of odd digit and sum of those odd digit
        oddCount += ((digit1 % 2 != 0) && (digit1 % 3 != 0)) ? 1 : 0;
        oddSum += ((digit1 % 2 != 0) && (digit1 % 3 != 0)) ? digit1 : 0;
        oddCount += ((digit2 % 2 != 0) && (digit2 % 3 != 0)) ? 1 : 0;
        oddSum += ((digit2 % 2 != 0) && (digit2 % 3 != 0)) ? digit2 : 0;
        oddCount += ((digit3 % 2 != 0) && (digit3 % 3 != 0)) ? 1 : 0;
        oddSum += ((digit3 % 2 != 0) && (digit3 % 3 != 0)) ? digit3 : 0;
        oddCount += ((digit4 % 2 != 0) && (digit4 % 3 != 0)) ? 1 : 0;
        oddSum += ((digit4 % 2 != 0) && (digit4 % 3 != 0)) ? digit4 : 0;

        float avgEvenSum = evenSum / evenCount;
        float avgOddSum = oddSum / oddCount;

        float diff = avgEvenSum - avgOddSum;

        System.out.println("The number is : " + n);
        System.out.println("The difference is " + diff);
    }
}
