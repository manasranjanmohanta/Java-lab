package assignment3.class_and_object.Question2;

public class Palindrome {
    int n;
    Palindrome(int num){
        n = num;
    }
    public void isPalindrome(){
        int temp = n, rev = 0;
        while(temp > 0){
            int digit = temp % 10;
            rev  = rev * 10 + digit;
            temp = temp / 10;
        }
        if(n == rev){
            System.out.println(n + " is a palindrome number");
        } else {
            System.out.println(n + " is not a palindrome number");
        }
    }
}
