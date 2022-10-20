//Find kth digit from front side or back side of any digits number and find its positional value
package assignment2;

import java.util.Scanner;

public class Question1vi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n1, k, rev = 0, frontSidePos = 0, backSidePos = 0, count = 0, frontSideNum = 0, backSideNum = 0;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        n1 = n;
        System.out.println("Enter the value which positional value you want to find : ");
        k = sc.nextInt();
        int temp = n;
        while(temp != 0){
            count++;
            int digit = temp % 10;
            rev = (rev * 10) + digit;
            temp = temp / 10;
        }
        int x = 1;
        int y = (int) Math.pow(10, count - 1);
        for(int i = 0; i < k; i++){
            backSideNum = n % 10;
            backSidePos = backSideNum * x;
            x = x * 10;
            n = n / 10;
            frontSideNum = rev % 10;
            frontSidePos = frontSideNum * y;
            y = y / 10;
            rev = rev / 10;
        }
        System.out.println(k +"th digit from front side of "+ n1 +" is :"+frontSideNum );
        System.out.println("Position of "+ k +"th digit from front side of "+ n1 +" is: "+frontSidePos);
        System.out.println(x+"th digit from back side of "+ n1 +" is :"+ backSideNum);
        System.out.println("Position of "+ k +"th digit from back side of "+ n1 +" is: "+ backSidePos);
    }
}
