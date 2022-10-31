//12. Write a java program to find following of 10 numbers using command line arguments? Do not use array?
//b) find difference between average of all odd numbers and even numbers
package assignment2;

public class Question12b {
    public static void main(String[] args) {
        int countEven = 0, countOdd = 0, evenSum = 0, oddSum = 0;
        float evenAvg, oddAvg, diff;

        for (int i = 0; i < 10; i++) {
            if(Integer.parseInt(args[i]) % 2 == 0){
                evenSum += Integer.parseInt(args[i]);
                countEven++;
            }else {
                oddSum += Integer.parseInt(args[i]);
                countOdd++;
            }
        }

        evenAvg = evenSum / countEven;
        oddAvg = oddSum / countOdd;

        diff = evenAvg - oddAvg;

        System.out.print("The numbers are :");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + args[i]);
        }
        System.out.println("\nSum of even numbers : " + evenSum);
        System.out.println("Sum of odd numbers : " + oddSum);
        System.out.println("The average of even numbers : " + evenAvg);
        System.out.println("The average of odd numbers : " + oddAvg);
        System.out.println("The difference between average of even numbers and odd numbers is : " + diff);

    }
}
