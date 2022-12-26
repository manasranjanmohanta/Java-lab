package assignment4;

import java.util.Scanner;

class MyExceptionTest extends Exception{
    MyExceptionTest(String s) throws Exception{
        super(s);
    }
}

interface Palindrome {
    public void isPalindromeDiv(int num) throws Exception;
}

public class Question3 implements Palindrome{

    @Override
    public void isPalindromeDiv(int num) throws Exception{
        int rev = 0, temp = num;
        while(temp > 0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        if(rev == num) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(num + " is a palindrome number and it is divisible by 3 and 5");
            } else {
                throw new MyException(num + " is a palindrome number but not divisible by 3 and 5");
            }
        } else {
            throw  new MyException(num + " is not a palindrome number");
        }
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        Question3 obj = new Question3();
        obj.isPalindromeDiv(n);


    }
}
