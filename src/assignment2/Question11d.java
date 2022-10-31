//11. Write a program to perform following using the numbers in between 23 to 249
//d) find number of palindrome numbers
package assignment2;

public class Question11d {
    public static void main(String[] args) {
        int countPalin = 0;
        System.out.println("The palindrome numbers are : ");
        for (int n = 24; n < 249; n++) {
            int rev = 0, n1 = n;
            while(n1 > 0){
                int digit = n1 % 10;
                rev = rev * 10 + digit;
                n1 = n1 / 10;
            }
            if(n == rev){
                System.out.print(" " + n);
                countPalin++;
            }
        }
        System.out.println("\nThe total even numbers are : " + countPalin);
    }
}
