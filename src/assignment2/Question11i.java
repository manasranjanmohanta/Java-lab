//11. Write a program to perform following using the numbers in between 23 to 249?
//i) find first five largest even number and smallest odd number?
package assignment2;

public class Question11i {
    public static void main(String[] args) {

        int countEven = 0, countOdd = 0;
        System.out.print("The even numbers are : ");
        for (int i = 248; i > 24; i--) {
            if (i % 2 == 0) {
                countEven++;
                if (countEven <= 5) {
                    System.out.print(" " + i);
                }
            }
        }

        System.out.print("\nThe odd numbers are : ");
        for (int i = 248; i > 24; i++) {
            if(i % 2 != 0){
                countOdd++;
                if(countOdd <= 5){
                    System.out.print(" " + i);
                }
            }
        }

    }
}
