package assignment4;

import java.util.Scanner;

interface Fibonacci{
    public void findFib(int r1, int r2);
    public void isPrimeFib(int num);
}
public class Question1 implements Fibonacci {
    @Override
    public void findFib(int default_range, int user_defined_range) {
        int ans = 0;
        int fib1 = 0, fib2 = 1;
        int i = 0;
        for (i = 1; i < default_range; i++) {
            ans = fib1 + fib2;
            fib1 = fib2;
            fib2 = ans;
        }
        for (; i < user_defined_range; i++) {
            isPrimeFib(ans);
            ans = fib1 + fib2;
            fib1 = fib2;
            fib2 = ans;
        }
    }

    @Override
    public void isPrimeFib(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int default_range = 10;
        System.out.println("Enter the range you want to find but it must be greater than 10 : ");
        int user_defined_range = sc.nextInt();

        Question1 obj = new Question1();
        System.out.println("The fibonacci number which are prime : ");
        obj.findFib(default_range, user_defined_range);
    }
}
