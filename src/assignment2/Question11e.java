//11. Write a program to perform following using the numbers in between 23 to 249?
//        e) find difference between average of palindrome and prime numbers?
package assignment2;

public class Question11e {
    public static void main(String[] args) {
        int countPalin = 0, countPrime = 0, palinSum = 0, primeSum = 0, palinAvg = 0, primeAvg = 0,diff;
        for (int n = 24; n < 249; n++) {

            // finding palindrome number
            int rev = 0, n1 = n;
            while (n1 > 0) {
                int digit = n1 % 10;
                rev = rev * 10 + digit;
                n1 = n1 / 10;
            }
            if (n == rev) {
                palinSum += n;
                countPalin++;
            }

            // finding prime number
            int temp = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    temp++;
                }

            }
            if (temp == 2) {
                primeSum += n;
                countPrime++;
            }
        }

        palinAvg = palinSum / countPalin;
        primeAvg = primeSum / countPrime;
        diff = palinAvg - primeAvg;

        System.out.println("The average of palindrome numbers : " + palinAvg);
        System.out.println("The average of prime numbers : " + primeAvg);
        System.out.println("The difference between average of palindrome and prime numbers are : " + diff);
    }
}
