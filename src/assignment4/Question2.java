package assignment4;

import java.util.Scanner;

class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}
interface Armstrong {
    public void isArmstrong(int num) throws MyException;
}
public class Question2 implements Armstrong{

    @Override
    public void isArmstrong(int num) throws MyException {
        int temp1 = num, temp2 = num;
        int ans = 0;
        int count = 0;
        while(temp1 > 0){
            count++;
            int digit1 = temp1 % 10;
            temp1 = temp1 / 10;
        }
        while(temp2 > 0){
            int digit2 = temp2 % 10;
            ans += (int) Math.pow(digit2, count);
            temp2 = temp2 / 10;
        }

        if(num == ans){
            System.out.println(num + " is armstrong number");
        }else{
            throw new MyException(num + " is not an armstrong number");
        }
    }

    public static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        Question2 obj = new Question2();
        obj.isArmstrong(n);

    }
}
