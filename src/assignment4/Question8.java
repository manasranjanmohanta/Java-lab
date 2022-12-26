package assignment4;

import java.util.Scanner;

public class Question8 extends Thread{
    int num;
    Question8(int num){
        this.num = num;
    }
    public synchronized void run(){
        printPyramid();
    }
    public  void printPyramid(){
        for (int i = 0; i < 4; i++) {
            for (int j = 4 - i; j > 1 ; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(num + " ");
                num = num + 2;
            }
            System.out.println();
        }
        notify();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Question8 obj1 = new Question8(1);
        Thread t1 = new Thread(obj1);
        t1.start();

        synchronized (t1){
            try {
                t1.wait();
            }   catch(Exception e){
                e.printStackTrace();
            }
        }
        Question8 obj2 = new Question8(2);
        Thread t2 = new Thread(obj2);
        t2.start();
    }
}
