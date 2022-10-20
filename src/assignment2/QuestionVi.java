package assignment2;

import java.util.Scanner;

public class QuestionVi {
        public static void main(String[] args) {
            long num,rev=0,temp,backNum=0,frontNum=0,fntPos=0,backPos=0;
            int x,count=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number:");
            num=sc.nextLong();
            temp=num;
            System.out.println("Enter the position of number:");
            x=sc.nextInt();
            while(temp!=0)
            {
                count++;
                rev=(rev*10)+(temp%10);
                temp=temp/10;
            }
            int y=1;
            int z=(int) Math.pow(10, count-1);
            for(int i=0;i<x;i++)
            {
                backNum=num%10;
                backPos=(backNum*y);
                y=y*10;
                num=num/10;
                frontNum=rev%10;
                fntPos=(frontNum*z);
                z=z/10;
                rev=rev/10;
            }
            System.out.println(x+"th digit from front side of "+num+" is :"+frontNum);
            System.out.println("Position of "+x+"th digit from front side of "+num+" is: "+fntPos);
            System.out.println(x+"th digit from back side of "+num+" is :"+backNum);
            System.out.println("Position of "+x+"th digit from back side of "+num+" is: "+backPos);


        }

}
