//11. Write a program to perform following using the numbers in between 23 to 249?
//        c) find number of prime numbers
package assignment2;

public class Question11c {
    public static void main(String[] args) {
        int countPrime = 0;
        System.out.println("The prime numbers are : ");
        for (int n = 24; n < 249; n++) {
            int temp = 0;
           for(int i = 1; i <= n; i++){
               if(n % i == 0) {
                   temp++;
               }

            }
           if(temp == 2){
               System.out.print(" " + n);
               countPrime++;
           }
        }
        System.out.println("\nThe total even numbers are : " + countPrime);
    }
}
