//7. Write a java program to find factorial of a number using while loop, do while loop
// and for loop all in one program?[hint use switch block]?
package assignment2;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int choice, n1 = n, fact = 1;

        System.out.println("1. Using while loop.");
        System.out.println("2. Using do while loop.");
        System.out.println("3. For loop.");

        System.out.println("How you want to find factorial! Enter your choice : ");
        choice = sc.nextInt();

        switch(choice){
            case 1:
                while(n > 0){
                    fact = fact * n;
                    n--;
                }
                System.out.println("The factorial of " + n1 + " is : " + fact);
                break;
            case 2:
                do{
                    fact = fact * n;
                    n--;
                }while(n > 0);
                System.out.println("The factorial is " + n1 + " is : " + fact);
                break;
            case 3:
                for(int i = n; i > 0; i--){
                    fact = fact * i;
                }
                System.out.println("The factorial is : " + n1 + " is : " + fact);
                break;
        }
    }
}
