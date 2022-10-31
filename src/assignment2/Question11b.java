//11. Write a program to perform following using the numbers in between 23 to 249?
//b) find number of odd numbers that ends with 5 and 7?
package assignment2;

public class Question11b {
    public static void main(String[] args) {
        int oddCount = 0;
        System.out.println("The even numbers taht ends with 5 and 7 are : ");
        for (int i = 24; i < 249; i++) {
            if(i % 2 != 0){
                if(i % 10 == 5 || i % 10 == 7){
                    oddCount++;
                    System.out.print(" " + i);
                }
            }
        }
        System.out.println("\nThe total even numbers are : " + oddCount);
    }
}
