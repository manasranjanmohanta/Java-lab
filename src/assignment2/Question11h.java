//11. Write a program to perform following using the numbers in between 23 to 249?
//       h) Check whether the difference between largest even number and smallest odd
//number is palindrome or not?
package assignment2;

public class Question11h {
    public static void main(String[] args) {
        int largest = 0, smallest = 0, diff;
        for (int i = 24; i < 249; i++) {
            if(i % 2 == 0){
                if(largest < i){
                    largest = i;
                }

            }else {
                if(smallest < i){
                    smallest = i;
                }
            }
        }

        diff = largest - smallest;
        int num = diff, rev = 0;
        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println("The largest even number : " + largest);
        System.out.println("The smallest odd number : " + smallest);
        System.out.println("The difference between largest and smallest number is : " + diff);
        if(rev == diff){
            System.out.println(diff + " is palindrome number.");
        }
        else {
            System.out.println(diff + " is not palindrome number.");
        }
    }
}
