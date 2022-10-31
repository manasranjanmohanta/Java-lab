//11. Write a program to perform following using the numbers in between 23 to 249?
//        a) find number of even numbers that ends with 0 and 4?
package assignment2;

public class Question11a {
    public static void main(String[] args) {
        int evenCount = 0;
        System.out.println("The even numbers taht ends with 0 and 4 are : ");
        for (int i = 24; i < 249; i++) {
            if(i % 2 == 0){
                if(i % 10 == 0 || i % 10 == 4){
                    evenCount++;
                    System.out.print(" " + i);
                }
            }
        }
        System.out.println("\nThe total even numbers are : " + evenCount);
    }
}
